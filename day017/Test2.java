package com.day017;

//Runnable
//getName은 thread만 가지고 있음, Runnable에는 없기 때문에 사용할 수 없다.
//thread에서 만들었을 때는 sleep(); 사용. 
//Runnable로 만들었을 때는 Thread.sleep(); 사용.
class MyThread2 implements Runnable {
	
	private int num;
	private String name;
	
	public MyThread2(int num, String name) {
		
		this.num = num;
		this.name = name;
		
		
	}
	
	@Override //생략가능하지만 오타가 생길까봐 하는 것.
	public void run() {

		int i = 0;
		while(i<num) {
			
			System.out.println(name + i);
		
			i++;
		
			try {
			
				Thread.sleep(100);
				//Runnable로 만들었을 때는 Thread.sleep(); 사용.
				
			} catch (Exception e) {

			}
			
		}
	
	}
	
}

public class Test2 {
	
	public static void main(String[] args) {
		//main이 종료되어도 thread가 남아 있기 때문에 thread는 계속해서 실행이 된다.
		//main절을 다 입력시킨 후 마지막에 남은 thread가 실행이 되는 것임.
		//그래서 다른 class와는 다르게 main종료가 thread값보다 먼저 나온다.

		System.out.println("main 시작...");
		
		Thread t1 = new Thread(new MyThread2(100, "첫번째: "));
		Thread t2 = new Thread(new MyThread2(200, "두번째: "));
		
		t1.start();
		t2.start();
		//VM에게 명령을 주는 것 뿐임. 메인절은 이 작업의 실행여부에 관심 X

		
		System.out.println("main 종료...");
	}

	
}
