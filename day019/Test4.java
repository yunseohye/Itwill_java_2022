package com.day019;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


//ActionListener: 프레임안에 들어가있는 각각의 객체를 감시함.
public class Test4 extends Frame implements ActionListener{

	private static final long serialVersionUID = 1L;

	//첫글자가 대문자 - 클래스 : 사용하려면 객체를 생성해야한다.
	private TextField tf;
	private TextArea ta;
	private Button btn;
	
	public Test4() {
		
		tf = new TextField();
		ta = new TextArea();
		btn = new Button("click");
		
		//객체를 프레임 위에 올려놓는 것
		add(tf, BorderLayout.NORTH);
		add(ta, BorderLayout.CENTER);
		add(btn, BorderLayout.SOUTH);
		
		tf.addActionListener(this);
		btn.addActionListener(this);
	
		setTitle("윈도우");
		setSize(200,300);
		
		addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		setVisible(true);
	
	}
	
	public static void main(String[] args) {
		
		new Test4();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object ob = e.getSource(); //tf or btn 둘 중에 하나 
		//알맹이는 tf, btn이지만 겉은 object로 감싸줌
		
		if(ob instanceof TextField || ob instanceof Button) {
			//TextField에서 발생하는 이벤트 : enter
			//Button에서 발생하는 이벤트 : 클릭
			
			String str = tf.getText();
			
			if(!str.equals("")) {
				//사용자가 입력한 값이 null이 아닐때만 실행한다.
				
				ta.append(str + "\r\n");
				//append:누적
				
			}
			
			tf.setText(""); //이벤트가 발생하면 text를 null로 만들고
			tf.requestFocusInWindow(); //커서를 가져다 놓아라
		}
		
	}

}
