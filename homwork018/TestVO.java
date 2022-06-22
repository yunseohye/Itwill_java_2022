package com.homwork018;

public class TestVO  {

	private String name, birth;
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

	@Override
	public String toString() {
		
		if(name==null||name.equals("")) {
			return null;
		}
		
		String str = String.format("이름: %4s 생년월일: %4s 점수: %2d"
				,name,birth,score);
		
		return str;
	}
	
}
