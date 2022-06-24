package com.day020;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

//클래스는 단일상속밖에 안되기 때문에 임플리먼트를 통해 ActionListener 구현함
//인터페이스는 다중상속이 가능하기 때문에 두개를 구현함.
public class ClientTest extends Frame implements ActionListener,Runnable {
	
	private static final long serialVersionUID = 1L;

	private TextArea ta = new TextArea();
	private TextField tf = new TextField();
	
	private Socket sc = null;
	private int port = 7777;
	private String host = "192.168.16.0"; 
	//localhost 혹은 (127.0.0.1)라고 입력해도 된다.[자기자신을 지칭]
	
	public ClientTest() {
		
		add(ta,BorderLayout.CENTER);
		add(tf,BorderLayout.SOUTH);
		
		tf.addActionListener(this);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		setTitle("채팅 클라이언트");
		setSize(300,400);
		setVisible(true);
		
	}
	
	@Override
	public void run() {
		//메세지 받기
		
		String msg;
		
		try {
		
			if(sc==null) {
				return;
			}
			
			InputStream is = sc.getInputStream(); 
			BufferedReader br = new BufferedReader(new InputStreamReader(is));

			while((msg=br.readLine())!=null) { //서버가 받아내는 메시지
				ta.append("\r\n"+msg);
			}
			
		} catch (Exception e) {
			ta.append("\r\n"+"서버 연결 종료...");
			sc = null;
		}
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//메세지 보내기
		
		String msg = tf.getText();
		
		if(msg.trim().equals("")) { //공백 제외, 아무것도 작성하지 않고 엔터를 쳤냐?
			return;
		}
		
		if(sc==null) {
			return;
		}
		
		try {
		
			OutputStream os = sc.getOutputStream();
			PrintWriter pw = new PrintWriter(os,true);
			//true : PrintWriter의 flush역할 마지막 버퍼가 용량을 채우지 않아도 출력해라
			//PrintWriter pw = new PrintWriter(sc.getOutputStream());
			
			pw.println("sh] "+msg);  
			//print로 하면 엔터기능이 없어서 출력이 안됨.
			//서버에게 msg를 전송
			
			ta.append("\r\n sh] " + msg); //내 창에 msg를 보이게 하는 것.
			
			tf.setText(""); //텍스트 필드 초기화
			tf.requestFocus(); //텍스트필드에 커서를 가져다 주어라
			
		} catch (Exception e2) {
			ta.append("\r\n 서버와 연결이 끊겼습니다...");
			sc = null;
		}
	}

	
	public void connect() {
		
		try {
		
			//서버한테 보낼 소켓을 생성
			sc = new Socket(host, port); //ip, port번호
			
			
			Thread th = new Thread(this);
			//상대방이 나한테 보내는 데이터를 받아내기 위해
			//서버가 시작하자마자 스레드를 가동시킴
			th.start();
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	

	public static void main(String[] args) {

		new ClientTest().connect();
		
	}

}
//ip찾는방법 : 검색 창 - 커맨드 - ipconfig 검색 후 IPv4주소
