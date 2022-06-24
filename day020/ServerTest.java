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
public class ServerTest extends Frame implements ActionListener,Runnable {
	
	private static final long serialVersionUID = 1L;

	private TextArea ta = new TextArea();
	private TextField tf = new TextField();
	
	private ServerSocket ss = null;
	private Socket sc = null;
	//클라이언트의 소켓의 내용이 들어오기만 하면 되기 때문에 객체생성 필요X
	//new이용해 객체생성하면 오류남. 소켓만 넣어주면 된다.
	
	public ServerTest() {
		
		add(ta,BorderLayout.CENTER);
		add(tf,BorderLayout.SOUTH);
		
		tf.addActionListener(this);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		setTitle("채팅 서버");
		setSize(300,400);
		setVisible(true);
		
	}
	
	@Override
	public void run() {
		//메세지 받기
		
		String msg;
		String ip;
		
		try {
		
			if(sc==null) {
				return;
			}
			
			InputStream is = sc.getInputStream(); 
			//소켓에 있는 인풋스트림을 통해 메세지를 받아낸다.
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			//상대편이 보낸 데이터를 is를 통해 받아낼 준비를 하고 버퍼드를 통해 받음
			
			ip = sc.getInetAddress().getHostAddress();
			//소켓의 ip(클라이언트)를 읽어내는 코드
			
			ta.append("\r\n["+ip+"] 접속!!");
			
			while((msg=br.readLine())!=null) {
				ta.append("\r\n"+msg);
			}
			
		} catch (Exception e) {
			ta.append("\r\n"+"클라이언트 연결 종료...");
			sc = null;
			ss = null;
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
			
			pw.println("서버] "+msg);  
			//print로 하면 엔터기능이 없어서 출력이 안됨.
			//클라이언트에게 msg를 전송
			
			ta.append("\r\n서버] " + msg); //내 창에 msg를 보이게 하는 것.
			
			tf.setText(""); //텍스트 필드 초기화
			tf.requestFocus(); //텍스트필드에 커서를 가져다 주어라
			
		} catch (Exception e2) {
			ta.append("\r\n 클라이언트와 연결이 끊겼습니다...");
			sc = null;
		}
	}

	
	public void serverStart() {
		
		try {
		
			ss = new ServerSocket(7777);
			ta.setText("서버 시작!!!");
			
			//CPU가 블럭상태로 대기중임.
			sc = ss.accept();
			//클라이언트가 접속을 하는 순간 이 코드가 실행이 되고 밑에 스레드가 가동됨.
			
			Thread th = new Thread(this);
			//상대방이 나한테 보내는 데이터를 받아내기 위해
			//서버가 시작하자마자 스레드를 가동시킴
			th.start();
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	
	public static void main(String[] args) {

		new ServerTest().serverStart();
		
	}

}
