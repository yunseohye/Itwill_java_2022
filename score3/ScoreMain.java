package com.score3;

public class ScoreMain {

	public static void main(String[] args) {

		Score ob  = new ScoreImpl();
		//인터페이스가 가진 메소드로만 사용했을 때 이런 형태의 객체가 생성 가능
		//부모로 upcast했기 때문에 자식의 것을 사용할 수 없다.
		
		ob.set();
		ob.input();
		ob.print();
		
		
	}

}
