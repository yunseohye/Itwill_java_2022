package com.score1;

public class ScoreMain {

	public static void main(String[] args) {

		Score ob = new Score();
		
		ob.set();
		//ob.inwon = 4; 입력하면 값이 오류가 남
		//외부에서 건드리면 안되기 때문에 score에서 private을 준다.
		ob.input();
		//ob.ranking(); private로 설정했기 때문에 사용X
		ob.print();
		
		
	}

}
