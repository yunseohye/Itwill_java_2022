package com.homeworkMap;

public class ScoreVO {

	private String name;
	private String ID;
	private int PT;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getID() {
		return ID;
	}
	public void setID(String ID) {
		this.ID = ID;
	}
	public int getPT() {
		return PT;
	}
	public void setPT(int PT) {
		this.PT = PT;
	}
	
	@Override
	public String toString() {
		
		String str = String.format("%4s %4d",name,PT);
		
		return str;
	}
	
}
