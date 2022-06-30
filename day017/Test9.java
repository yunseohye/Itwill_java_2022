package com.day017;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

//정해진 시간마다 특정 작업을 수행하고 싶을 때(일종의 알람)
//TimerTask작업을 timer를 통해서 만들어둔 것.


public class Test9 extends Thread{

	private int num = 0;
	
	public Test9() { //기본생성자에 코딩값을 넣을 것임.
		
		TimerTask task = new TimerTask() {
			
			@Override
			public void run() { //반복 실행 할 작업
				
				num = 0; //num을 반복해서 0으로 초기화
				
			}
		};
		
		Timer t = new Timer(); //타이머를 통해 위에 task작업을 실행해줌
		
		Calendar now = Calendar.getInstance();
		
		/*
		내일 0시 0분 0초부터 하루에 한 번씩 반복
		now.add(Calendar.DATE, 1);
		now.set(Calendar.HOUR, 0); //오후 1시는 13으로 표기
		now.set(Calendar.MINUTE, 0);
		now.set(Calendar.SECOND, 0);
		now.set(Calendar.MILLISECOND, 0);
		t.schedule(task, now.getTime(), 1000*60*60*24); 밀리세컨,초,분,시(24시간마다 실행)
		*/
		
		t.schedule(task, now.getTime(), 5000); 
		//실행하는 현재시점부터 5초마다 num을 0으로 초기화 하는 작업을 실행
	}
	
	@Override
	public void run() {

		while(true ) {
			
			System.out.println(num++);
			
			try {
			
				sleep(1000);
				
			} catch (Exception e) {

			}
			
		}
		
	}
	
	
	public static void main(String[] args) {
		
		//Test9 ob = new Test9();
		//ob.start();

		new Test9().start();
		//객체생성과 메소드 실행을 동시에 함
		//한 번 값을 올리면 자기가 값을 알아서 실행한 뒤 종료한다.
	}

}
