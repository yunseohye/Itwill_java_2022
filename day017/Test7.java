package com.day017;

/*
인터럽트 : 우선 순위가 높은 프로그램을 먼저 실행시키고 
다시 원래 상태로 돌아와서 값을 실행시키는 것.
 */

class MyThread7 extends Thread {//스레드

	private Thread next; //스레드 속의 스레드

	public void setNext(Thread next) {//초기화메소드
		this.next = next;
	}

	@Override
	public void run() {

		for(int i=1;i<20;i++) {
			try {
				sleep(2000);
			} catch (Exception e) {

			}
			System.out.println(getName()+ ":" + i);

			//스레드의 실행 순서를 만들어주는 것.
			if(next.isAlive()) {
				next.interrupt();
				//스레드가 살아있으면 그 스레드를 멈추어라 
				//->앞의 스레드가 멈추면 다음 스레드가 자동으로 실행
			}

		}

	}
}

public class Test7 {

	public static void main(String[] args) {

		MyThread7 t1 = new MyThread7(); 
		MyThread7 t2 = new MyThread7();
		MyThread7 t3 = new MyThread7();
		
		//interrupt
		t1.setNext(t2); //t1멈추면 t2실행
		t2.setNext(t3);	//t2멈추면 t3실행
		t3.setNext(t1); //t3멈추면 t1실행
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.interrupt();
		// 시작점인 t1을 멈추게 하는 것.
		// thread는 살아있는데 run을 멈추게 함.
		
		try {
			
			t1.join();
			t2.join();
			t3.join();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println("main 종료");
		
	}

}
