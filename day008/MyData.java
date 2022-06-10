package com.day008;

public class MyData {

	static String name = "배수지";
	static int age = 27;
	//instance변수, 값 초기화 함
	//static을 붙여주지 않으면 밑에서 출력하는 곳에 변수를 넣었을 때 오류가 남
	//static이 아닌 instance앞에 static을 붙여주면 static변수로 바꿔준다.
	
	public static void getInstance() {
		System.out.println(name + "의 나이는 " + age + "살 입니다.");
	}

}
