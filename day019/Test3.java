package com.day019;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Test3 extends Frame{

	public Test3() {
		
		setTitle("윈도우");
		setSize(200,300);
		
		//종료버튼을 실행하는 코딩.
		//Test2에서는 class를 객체로 생성하여 상속받은 WindowAdapter를 사용한것
		//여기서는 하나로 합쳐서 WindowAdapter를 바로 생성한 것임.
		addWindowListener(new WindowAdapter() {
		
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		
		});//무명의 클래스
		
		setVisible(true);
		
	}

	
	
	public static void main(String[] args) {

		new Test3();
		
	}

}
