package com.day017;

import java.util.Calendar;

class TClock implements Runnable {

	@Override
	public void run() {

		while(true) {

			try {
				Calendar now = Calendar.getInstance();
				//캘린더 타입의 변수, 객체생성 X

				System.out.printf("%1$tF, %1$tT\n",now);

				//객체를 생성하지 않고 단축해서 입력할 수 있음.
				//System.out.printf("%1$tF, %1$tT\n", Calendar.getInstance(););

				Thread.sleep(1000); 		

			} catch (Exception e) {

			}
		}

	}

}


public class Test3 {

	public static void main(String[] args) {

		Thread ob = new Thread(new TClock());

		ob.start();

	}

}
