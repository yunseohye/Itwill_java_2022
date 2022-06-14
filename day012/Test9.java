package com.day012;


class TestA{
	public void print() {
		System.out.println("TestA 클래스");
	}
}

class TestB extends TestA{
	public void print() {
		System.out.println("TestB 클래스");
	}
}



public class Test9 {

	public static void main(String[] args) {

		TestA a = new TestA();
		TestB b;

		//b = a; - 컴파일 오류
		//b = (TestB)a; - 컴파일 오류
		//클래스는 뭐다? 자료형이다.
		//TestA의 자료형은 TestA, TestB의 자료형은 TestB이다. 자료형이 다름.
		//a와 b는 데이터 타입이 다르다. 자료형 끼리의 관계도 전혀 상관이 없다.



		b = (TestB)a;
		//상속으로 연결했기 때문에 값이 성립이 된다.
		//상속으로 인해 UPCAST가 가능해짐. 상속이 없어지면 컴파일 오류가 실행됨.
	}

}
