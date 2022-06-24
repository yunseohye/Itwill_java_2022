package com.day020;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

//그룹채팅
//D class : 224.0.0.0 ~ 239.255.255.255
//내부에서만 돌아가는 프로그램을 만들때는 사용할 수 있다.
//외부에서 들어오지 못하기 때문에 보안이 유지된다.
//국제기구에서 D class는 인터넷을 막아뒀기 때문에 회사 내부에서만 사용함. 

public class ChatCS extends Frame implements ActionListener, Runnable{

	private MulticastSocket ms = null;
	private InetAddress xGroup = null;

	private String host = "230.1.1.1";
	private int port = 7777;
	private String userName = "sh";

	private TextArea ta = new TextArea();
	private TextField tf = new TextField();

	//DatagramSocket: UDP로 데이터를 전송하거나 수신할 때 사용
	//DatagramPacket: UDP를 이용하여 전송될 수 있는 데이터
	//MulticastSocket: 다수의 클라이언트한테 DatagramPacket을 전송함.

	public ChatCS() {

		ta.setEditable(false); //TestArea에 작성 못하게 할 것임. 보기만 가능
		add(ta,BorderLayout.CENTER);

		add(tf,BorderLayout.SOUTH);
		tf.addActionListener(this);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		setTitle("그룹채팅 [" + host + "]");
		setSize(400,400);
		setVisible(true);
		tf.requestFocus();

	}

	public void setup() {

		try {

			xGroup = InetAddress.getByName(host);
			ms = new MulticastSocket(port);

			ms.joinGroup(xGroup);

			Thread th = new Thread(this);
			th.start();

		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

	public void disconnect() { //연결을 끊을 때

		try {

			ms.leaveGroup(xGroup);
			ms.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

	@Override
	public void run() {
			
		try {
		
			while(true) {
				
				byte[] buffer = new byte[512];
				
				DatagramPacket dp = new DatagramPacket(buffer, buffer.length);
				
				ms.receive(dp);
				
				String msg = new String(dp.getData()).trim();
				
				ta.append(msg + "\r\n");
				
			}
			
		} catch (Exception e) {

			System.out.println(e.toString());
			disconnect();
			
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String msg = tf.getText().trim();

		if(msg.equals(""))
			return;

		byte[] buffer = (userName + "]" + msg).getBytes(); 
		//String의 메소드 : getBytes() 

		try {

			DatagramPacket dp = 
					new DatagramPacket(buffer, buffer.length, xGroup, port);

			ms.send(dp);

			tf.setText("");
			tf.requestFocus();

		} catch (Exception e1) {
			System.out.println(e1.toString());
		}

	}

	public static void main(String[] args) {

		new ChatCS().setup();

	}

}
