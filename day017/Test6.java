package com.day017;

//스레드 생명주기

class MyThread6 extends Thread {

	@Override
	public void run() {
		
		try {
			
			System.out.println("스레드 시작..");
			
			System.out.println("우선순위: "+ getPriority());
			System.out.println("스레드 이름: " + getName()); 
			//새로 만들면 첫 번째 값은 0으로 출력이 됨. 
			
			//0.5초
			sleep(500);
		
			//우선순위
			setPriority(2); //1~10사이 숫자 출력 가능
			System.out.println("변경된 우선순위: " + getPriority());
			
			System.out.println("스레드 종료...");
			
		} catch (Exception e) {

		}		
		
	}
}


public class Test6 {

	public static void main(String[] args) {
		
		Thread t1 = Thread.currentThread(); //현재 스레드를 읽어와라 : main
		Thread t2 = new MyThread6(); 
		//가지고 있는 메소드는 없지만 상속 받았기 때문에 부모가 가진 run을 호출
		//부모의 것이지만 내가 가지고 있기 때문에 내가 가지고 있는 값 출력.
		//자식으로 부모의 객체를 생성할 수 있다.
		
		System.out.println("메인 스레드 우선순위: " + t1.getPriority()); //5
		//default 값 : 5, 기본적으로 출력됨.
		System.out.println("메인 스레드 이름: " + t1.getName()); //main
		//이 시점까지는 t1만 출력이 된 것임.
		
		System.out.println("t2.start메소드 호출 전 isAlive: " + t2.isAlive());
		//아직 t2가 실행이 되지 않았기 때문에 isAlive가 나옴.
		
		t2.start();
		
		//t2의 우선순위 확인
		System.out.println("t2의 우선순위: " + t2.getPriority()); //5
		
		t2.setPriority(1); //t2의 우선순위를 1로 변경
		
		try {

			Thread.sleep(100); //main 0.1초 쉬어
			
			System.out.println("t2 살아있냐?: " + t2.isAlive());
			
			Thread.sleep(1000); //main 1초 쉬어
			
			System.out.println("1초 쉬었는데 t2 살아있냐?: " + t2.isAlive());

			t2.join(); 
			//t2가 끝날 때 까지 main절 끝나지 마라!
			//데몬 스레드에서 사용하는 명령어임.
			
			System.out.println("t2 아직도 살아있냐?: " + t2.isAlive());			
			
		} catch (Exception e) {
		
		}
		
		System.out.println("main 종료");
		//t2의 스레드값을 출력하러가는 동안 main thread는 종료가 됨.
	}

}
