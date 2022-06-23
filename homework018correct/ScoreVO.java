package com.homework018correct;

import java.io.Serializable;

public class ScoreVO implements Serializable { //직렬화가되어 데이터가 저장될 것이다.
	
	private static final long serialVersionUID = 1L;
	
	private String name;
	private String birth;
	private int score;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	public String toString() {
		return String.format("%6s %10s %4d", name, birth, score);
	}
}
