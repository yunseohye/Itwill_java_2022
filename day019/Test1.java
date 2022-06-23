package com.day019;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//모든 웹은 이벤트 단위로 움직인다.
//이벤트 단위가 어떻게 움직이는지 개념을 원리하는 것.
//AWT (Abstract Window ToolKit) 제일 기본적! -> Swing -> FX(거의 사용X)

//Listener : 많이 사용되는 용어. 감시자 역할을 함.
//WindowListener : 감시도구를 가지고 있는 인터페이스
public class Test1 extends Frame implements WindowListener{ //윈도우에 대한 모든것을 가지고 있음
	 
	private static final long serialVersionUID = 1L;

	public Test1() {//window에서는 form java에서는 frame이라고 부름.
		
		setTitle("자바 윈도우"); //frame 클래스의 메소드
		setSize(200, 300);
		setBackground(new Color(255, 255, 0));
		//모니터에서 색깔을 표시하는 것 - 무조건 RGB컬러임
		//Red Green Blue의 줄임말
		
		addWindowListener(this); //test1(나)에다가 감시카메라를 달아줌.
		//임플리먼트가 되어있기 때문에 값을 this로 주면 알아서 값을 찾아감.
		
		setVisible(true); //작업 처리해주면 창이 안보임.
		
	}//한번 메모리에 올라가면 스스로 움직인다.
	

	public static void main(String[] args) {

		new Test1();
		
	}

	//인터페이스를 구현하면 가지고 있는 메소드를 전부 오버라이드 해야하기 때문에
	//사용하지 않는 메소드들도 다 코딩정렬이 되어있는 것임.
	@Override
	public void windowActivated(WindowEvent e) {
	}


	@Override
	public void windowClosed(WindowEvent e) {
	}


	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
		//addWindowListener가 없으면 감시자가 없기 때문에 사용자의 커서 위치를
		//몰라서 X버튼을 눌러도 창이 안닫혀진다.
	}


	@Override
	public void windowDeactivated(WindowEvent e) {
	}


	@Override
	public void windowDeiconified(WindowEvent e) {
	}


	@Override
	public void windowIconified(WindowEvent e) {
	}


	@Override
	public void windowOpened(WindowEvent e) {
	}

}
