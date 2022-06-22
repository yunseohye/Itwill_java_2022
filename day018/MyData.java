package com.day018;

import java.io.Serializable;

public class MyData implements Serializable{
	//내가 만드는 vo에는 무조건 implements Serializabl 해줘야한다.
	//implements Serializable이 가지고 있는 메소드가 없기 때문에 오버라이드 X

	private String name;
	private int score;
	
	public MyData(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public String toString() {
		return name + ":" + score;
	}
}
