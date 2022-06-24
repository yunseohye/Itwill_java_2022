package com.day020;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ServerTest2 {

	private ArrayList<Socket>clients = new ArrayList<>();

	public void serverStart() {

		try {

			ServerSocket ss = new ServerSocket(7777);
			System.out.println("서버 시작...");

			while(true) {

				Socket sc = ss.accept();

				WorkerThread th = new WorkerThread(sc);
				th.start(); //스레드 안의 run이 실행됨.
			}

		} catch (Exception e) {

		}

	}
	//스레드를 전문적으로 처리하는 작업
	//스레드는 소켓이 필수요소임.

	class WorkerThread extends Thread{

		private Socket sc;

		public WorkerThread(Socket sc) {
			//기본생성자 생략, 생성자 오버로딩
			this.sc = sc; 
		}

		@Override
		public void run() {

			String ip = null;
			String msg = null;

			try {

				BufferedReader br = new BufferedReader
						(new InputStreamReader(sc.getInputStream()));

				ip = sc.getInetAddress().getHostAddress();

				clients.add(sc);
				//사용자마다 스레드가 만들어지면서 list에 ip가 들어간다.

				msg = ip + "] 가 입장 했습니다.";
				//다른 클라이언트에게 누가 접속했는지 접속사실을 알림.
				//단, 나를 제외한 다른사람이여야한다.

				for(Socket s : clients) {

					if(s==sc) {
						continue; //이번만 패스
					}

					PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
					pw.println(msg); // ln 필수					
				}
				System.out.println(msg); //서버에 대화 보임
				
				//나를 제외한 사람들에게 메시지를 전송
				while((msg=br.readLine())!=null) {
					
					for(Socket s : clients) {

						if(s==sc) {
							continue; //이번만 패스
						}

						PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
						pw.println(msg); // ln 필수					
					}
					System.out.println(msg);
					
				}

			} catch (Exception e) {

				msg = ip+"] 가 퇴장했습니다.";

				try {

					for(Socket s : clients) {

						if(s==sc) {
							continue; //이번만 패스
						}

						PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
						pw.println(msg); // ln 필수					
					}
					System.out.println(msg);
					//서버에 대화 보임
					sc=null;

				} catch (Exception e2) {

				}

			}

		}
	}


	public static void main(String[] args) {
		new ServerTest2().serverStart();
	}
}

