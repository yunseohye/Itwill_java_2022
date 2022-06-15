package com.day012;

/*
 final을 사용하는 경우
 1. 변수에 final을 붙일 때 : 단 한 번만 초기화가 가능하다. (제일 많이 사용)
 2. 메소드에 final을 붙일 때 : Override가 불가능하다. 상속은 가능함.
 3. 클래스에 final을 붙일 때 : 상속이 불가능하다.(사용빈도 적음)
 */

//final class Super { 클래스에 final을 붙이면 상속이 불가능한다.

class Super {
	
	public static final double PI;
	//한 번만 만들 수 있고 초기화도 한 번만 가능하다.-> 값이 고정

	static { //static블록 무조건 실행이 된다.
		PI = 3.14; //double형태이기 때문에 밑에 r에 굳이 double을 붙이지 않아도 됨
	} 

	public double area;

	public final void write(String title) {
		//final로 선언한 메소드는 Override가 불가능하다.
		//Override가 불가능하기 때문에 무조건 부모의 write만 사용이 가능하다.	


		System.out.println(title + ":" + area);
	}

}

public class Test6 extends Super {

	//	@Override
	//	public void write(String title) {
	//		super.write(title);
	//	} 사용이 불가능함. 메소드에 final을 붙였기 때문에

	public void circleArea(int r) {
		area = (double)r*r*PI;
		//(double)r*r*PI; 값 중 double 바로 뒤에 값만 double이 되는 것이다.
		//전체 다 double로 만들어주고 싶으면 (double)(r*r*PI); 로 묶어줌
		//이 계산기에서는 PI자체가 double이기 때문에 굳이 double을 붙이지 않아도 된다.
	}

	public static void main(String[] args) {

		Test6 ob = new Test6();

		ob.circleArea(10);
		ob.write("원");

	}

}
