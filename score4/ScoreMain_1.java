package com.score4;

public class ScoreMain_1 {

	public static void main(String[] args) {

		
		ScoreVO vo = new ScoreVO(); //기본생성자로 객체를 생성

		//vo.set("111", "배수지", 60, 70, 80); //데이터가 만들어짐

		vo.setHak("a123"); //setHak을 통해 학번만 초기화
		vo.setName("배수지");
		vo.setKor(90);
		vo.setEng(80);
		vo.setMat(70);
		
		String str = vo.toString();

		System.out.println(str);
		
		System.out.println(vo.getHak());
		System.out.println(vo.getKor());
		
		
		/*
		이렇게 여러개의 데이터를 가지고 생성자에 객체생성을 하는 경우는 드물다.
		보통은 한개 많아봐야 2개임
		ScoreVO vo1 = new ScoreVO("222", "강아랑", 80, 90, 70);
		//객체 생성과 동시에 초기화가 됨.(ScoreVo의 값을 통해)

		str = vo1.toString();

		System.out.println(str);
		*/
	}

}
