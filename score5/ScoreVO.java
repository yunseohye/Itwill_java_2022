package com.score5;

public class ScoreVO {
	//key는 value로 만들 것이기 때문에 따로 지정해줄것임.
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int tot; // 이 변수에는 데이터를 저장하지 않기 때문에 필요하진 않음.
	//출력만 하기 때문에 tot는 사실 없어도 된다.
	//그럼에도 써놓은 이유는 getter꺼내오는게 편하기도 하고 tot가 있다는 것을 확인하는 개념
	
	//변수 설정한 후 source - get,set가서 selectall - tot의 set만 빼고 만들기
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public int getTot() {
		return kor+eng+mat;
	}
	
	
	@Override
	public String toString() {
		
		String str = String.format("%6s %4d %4d %4d %4d %4.1f" , 
				name, kor, eng, mat, getTot(), getTot()/3.0);
		
		return str;
	}

}
