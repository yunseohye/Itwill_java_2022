package com.score4;
//이전에 배웠던 것 처럼 한 생성자 안에 모든 값을 넣지는 않는다.
//생성자로 객체를 생성할때는 1~2개 정도만 생성한다.
//메소드로 한번에 초기화 할 수는 있지만 각각 데이터를 초기화 한다.
//각각의 메소드를 만들어 Getter, Setter의 값을 만든다.

public class ScoreVO { //Value object

	//데이터 저장
	//외부에서 정보에 접근하지 않도록 변수를 기본적으로는 private로 설정

	private String hak;
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int tot; 
	//총점은 setter가 필요 없음 getter만 가지고 값을 꺼내기만 하면된다.
	
	
	/* 메소드 하나에 모든 값을 다 넣는것은 이제 하지 않는다.
	public void set (String hak, String name, int kor, int eng, int mat) {
		
		this.hak = hak;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;

	} */
	
	/*우회도로 데이터를 나누어 메소드를 각각 만들어지게 함.(5개)
	hak이라는 변수 하나에 메소드 값이 2개가 생김 
	getter method : get(값을 받는것)
	setter method : set(값을 넣는것)
	*/
	
	
	
	public String getHak() {
		return hak;
	}


	public void setHak(String hak) {
		this.hak = hak;
	}


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
		//print를 직접 만들어도 되지만 부모가 가진 toString을 오버라이드해서 사용
		if(hak==null||hak.equals("")) {
			return null;
		}
		
		String str = String.format("%5s %6s %4d %4d %4d %4d %4.1f", 
				hak,name,kor,eng,mat,getTot(),getTot()/3.0);
		
		return str;
	}
	
}
