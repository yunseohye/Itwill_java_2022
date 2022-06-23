package com.day018;

import java.io.Serializable;

public class MyData implements Serializable{
	//내가 만드는 vo(클래스)에는 무조건 implements Serializabl 해줘야한다.
	//implements Serializable이 가지고 있는 메소드가 없기 때문에 오버라이드 X
	//게터세터를 만들면 메인에서 이름이뭐냐~ 점수가 뭐냐~ 물어봐야함.
	private String name;
	private int score;
	
	public MyData(String name, int score) { 
		//기본생성자를 만들면 메인에서 이름이뭐냐~ 하나하나 물어보지 않아도 출력이 됨.
		//생성자로 객체를 생성함.
		this.name = name;
		this.score = score;
	}
	
	public String toString() {
		return name + ":" + score;
	}
}
