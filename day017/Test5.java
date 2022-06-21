package com.day017;

/*
Demon thread (사용빈도 높은편)
다른 thread에 도움을 주는 스레드임.
다른 스레드가(주로 main)  종료되면 데몬스레드가 
종료되지 않아도 자동으로 종료된다.
main thread가 끝나면 자기도 끝남 
<-> main thread가 끝나지 않으면 Demon thread도 계속 실행한다.
*/

class MyThread5 implements Runnable {

	@Override
	public void run() {
	
		for(int i=1;i<=20;i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace(); //에러나면 메시지를 출력
			}
		}
	
	}
	
}

public class Test5 {

	public static void main(String[] args) {

		System.out.println("main 시작");
		
		Thread t1 = new Thread(new MyThread5());
		Thread t2 = new Thread(new MyThread5());
		Thread t3 = new Thread(new MyThread5());
		
		//데몬스레드
		t1.setDaemon(true);
		t2.setDaemon(true);
		t3.setDaemon(true);
		
		//메인이 끝나도 계속 출력이 됨.
		t1.start();
		t2.start();
		t3.start();
		
		try {

			//main에게 1초 쉬라고 명령을 하는 것.
			//main이 잠깐 쉬는 동안에 데몬스레드는 출력이 되다가
			//main이 끝나면 데몬스레드도 종료가 된다. 그 사이에는 값이 출력됨.

			Thread.sleep(1000); 

		} catch (Exception e) {

		}
		
		try {
			//main이 데몬 스레드 t1, t2,t3 작업이 끝날때까지 기다려줌.
			t1.join();
			t2.join();
			t3.join();
			
		} catch (Exception e) {

		}
		
		System.out.println("main 종료");
	}

}
