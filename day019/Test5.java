package com.day019;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Test5 extends Frame implements ActionListener{

	private static final long serialVersionUID = 1L;

	private TextField[] tf = new TextField[4];

	private Label result = new Label("", Label.LEFT);

	private Button btn1, btn2;

	public Test5() {

		String[] title = {"name","Kor","Eng","Math","Total"};

		setTitle("성적처리");

		setLayout(null); //수동으로 좌표를 넣을때 반드시 필요함 (0,0)

		for(int i=0;i<5;i++) {

			Label lbl = new Label();

			lbl.setText(title[i]);

			lbl.setBounds(10, (i+1)*30, 50, 20);

			add(lbl);

			if(i != 4) {
				//텍스트필드가 클래스이기 때문에 객체를 생성해줌
				tf[i] = new TextField();

				tf[i].setBounds(80,(i+1)*30,70,20);

				//텍스트 i번째에다가 내가 만든 클래스를 지켜보는 리스너가 4개 생성
				tf[i].addKeyListener(new KeyHandler());

				add(tf[i]);
			}
			else {
				result.setBounds(80, (i+1)*30, 70, 20);

				add(result);
			}

		}

		//결과버튼
		btn1 = new Button("Result");
		btn1.setBounds(180, 30, 60, 20);
		add(btn1);
		btn1.addActionListener(this);
		btn1.addKeyListener(new KeyHandler());


		//종료버튼
		btn2 = new Button("Exit");
		btn2.setBounds(180, 60, 60, 20);
		add(btn2);
		btn2.addActionListener(this);



		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		setSize(260,180);
		setResizable(false); //비활성화
		setVisible(true);

	}

	public static void main(String[] args) {
		new Test5();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		Object ob = e.getSource();

		if(ob instanceof Button) {

			Button b = (Button)ob;

			if(b==btn1) {
				//연산
				execute();

			} else if(b==btn2) {
				//종료
				System.exit(0);


			}

		}

	}

	private void execute() { 
		//연산값이 변경되면 안되기 때문에 private
		//연산값을 위에 btn if문과 밑에 keypressed에서 또 연산을 하기 때문에
		//하나의 메소드로 만들어준다.

		int tot = 0;

		try {
			for(int i = 1; i<=3; i++) {
				tot += Integer.parseInt(tf[i].getText());
			}
			result.setText(Integer.toString(tot));
			//result.setText(" " + tot); null+정수 = String
		} catch (Exception e2) {
			result.setText("Error!!");
		}

	}

	//두군데서 사용하기 때문에 직접 오버라이딩 하는 Test3방법은 번거로워짐
	//Test2와 같은 형태로 만들어준다~~
	class KeyHandler extends KeyAdapter {

		@Override
		public void keyPressed(KeyEvent e) {//키보드의 값 아무거나 눌러도 반응함

			Object ob = e.getSource();

			//키보드의 값 중 엔터에만 반응을 보여라
			if(e.getKeyCode() != KeyEvent.VK_ENTER) {
				return;
			}

			//엔터를 눌렀다~
			//결과에서 엔터값 입력
			if(ob instanceof Button) {

				Button b = (Button)ob;

				if(b==btn1) {
					//연산
					execute();

				}
				return; 
				//return을 사용하지 않으면 그 밑으로 계속 데이터값이 입력됨.
				//실행종료를 위한 return 
				//이미 연산이되고 모든 엔터가 종료된다는 뜻
			}

			//TextField에서 엔터값 입력
			if(ob instanceof TextField) {

				TextField t = (TextField)ob;

				for(int i=0; i<tf.length; i++) {

					if(i!=3&tf[i]==t) {
						tf[i+1].requestFocus();
						return;
					}else if(tf[3]==t) {
						//배열의 3번째 엔터를 치면 결과로 넘어가야하기 때문에
						//마지막 엔터값은 따로 처리해주는 것이다.
						btn1.requestFocus();
						return;
					}
				}
			}
		}
	}
}
