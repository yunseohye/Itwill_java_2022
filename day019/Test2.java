package com.day019;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Test2 extends Frame{

	public Test2() {
		
		setTitle("윈도우");
		setSize(200,300);
		
		addWindowListener(new MyWindowAdapter());
		//Test1과는 다르게 임플리먼트된 인터페이스가 없기 때문에
		//MyWindowAdapter를 사용해야하는데 쟤가 클래스야 -> 새로이 객체를 생성해줘야함
		//밑에 내부클래스를 객체 생성해서 MyWindowAdapter 값을 실행해주는 것이다.
		
		setVisible(true);
		
	}

	//인터페이스를 구현하면 필요없는 메소드들도 오버라이딩 해야하기 때문에
	//코드를 간단하게 줄이기 위해 클래스를 생성한다.
	//내부클래스
	class MyWindowAdapter extends WindowAdapter{
		//WindowAdapter에서 내가 필요한 것만 골라서 사용할거야
		//원하는 것만 선택해서 오버라이드가 가능하다.
		//안에 오버라이드 된 값이 하나이기 때문에 자동으로 저 값이 실행됨.
		
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}	
		
	}
	
	public static void main(String[] args) {

		new Test2();
		
	}

}
