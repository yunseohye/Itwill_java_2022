package com.day017;

//스레드 - 멀티태스킹하는 것

class MyThread1 extends Thread{

	private int num;
	private String name;
	
	public MyThread1 (int num, String name) { //생성자를 통해 초기화
		this.num = num;
		this.name = name;
	}
	
	@Override
	public void run() {
		//super.run(); 생략가능 삭제하면 나의 run();을 만들어 실행시킴
		
		int i = 0;
		while(i<num) {
			System.out.println(this.getName() + ":" + name + i);
			//this.getName() : 스레드의 이름
			
			i++;
		
			try { 
			//try catch문으로 묶어주어야 번갈아가면서 출력이 된다.
			//묶어주지 않으면 값이 랜덤으로 출력된다.
				
				sleep(100); 
				//100: 0.1초, 1000: 1초, 인터벌이라고 함.
				//숫자를 몇을 넣느냐에 따라 출력 속도가 다르다.
				
			} catch (Exception e) {

			}
			
		}
		
	}
	
}

public class Test1 {

	public static void main(String[] args) {
		//main도 하나의 스레드이기 때문에 출력할 값을 다 출력한 후
		//위로 값을 올린 t1, t2의 값을 나중에 출력한다.

		System.out.println("main 시작..");
		
		MyThread1 t1 = new MyThread1(100, "첫번째: ");
		MyThread1 t2 = new MyThread1(200, "두번째: ");
		
		t1.start(); //VM이 run()메소드를 자동으로 실행  
		t2.start(); //객체를 생성한 스레드의 값을 받으로 위로 간다.
		
		System.out.println("main 종료.."); //main스레드는 바로 종료
	}

}
