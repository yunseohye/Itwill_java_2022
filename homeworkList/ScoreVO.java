package com.homeworkList;

public class ScoreVO {

	private String ID;
	private String name;
	private int PT;
	
	public String getID() {
		return ID;
	}
	
	public void setID(String ID) {
		this.ID = ID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPT() {
		return PT;
	}
	public void setPT(int PT) {
		this.PT = PT;
	}
	
	@Override
	public String toString() { 

		if(ID==null||ID.equals("")) {
			return null;
		}
		
		String str = String.format("회원번호: %2s 이름: %2s PT횟수: %2d", ID,name,PT);
		
		return str;
	}
	
	
}
