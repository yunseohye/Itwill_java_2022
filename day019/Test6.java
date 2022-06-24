package com.day019;
//마우스 이벤트
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Test6 extends Frame{
	
	private int x,y;
	
	private Label lbl = new Label("",Label.CENTER);
	
	public Test6() {
		
		add(lbl,BorderLayout.SOUTH);
		
		addMouseListener(new MouseHandler()); 
		//클래스를 불러왔기 때문에 객체생성
		//MouseHandler()를 실행하라는 뜻
		addMouseMotionListener(new MouseMotionHandler());
		
		setBackground(new Color(150,150,150));
		setForeground(new Color(0, 0, 255));
		
		addWindowListener(new WindowAdapter() {
		
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		setTitle("좌표 출력");
		setSize(400,400);
		setVisible(true);
		
	}

	
	
	@Override
	public void paint(Graphics g) {
		String str;
		str = "(" + x + "," + y + ")"; // (x,y)
		g.drawString(str, x, y);
	}



	@Override
	public void update(Graphics g) {

		paint(g);
	
	}

	class MouseHandler extends MouseAdapter {

		@Override
		public void mousePressed(MouseEvent e) { //마우스를 누르는 순간

			x = e.getX();
			y = e.getY();
			
			repaint();
			
		}

		@Override
		public void mouseReleased(MouseEvent e) { //마우스를 떼는 순간

		}
		
	}

	class MouseMotionHandler extends MouseMotionAdapter {

		@Override
		public void mouseDragged(MouseEvent e) {
			
			x = e.getX();
			y = e.getY();
			
			repaint(); //계속 그려라

		}

		@Override
		public void mouseMoved(MouseEvent e) {

			String str = String.format("(%d,%d)",e.getX(),e.getY());
			
			lbl.setText(str); //좌표를 맨 아래 출력해라
			
		}
		
	}

	public static void main(String[] args) {

		new Test6();
		
	}

}
