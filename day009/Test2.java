package com.day009;

import java.util.Scanner;

/*
[생성자를 사용하는 이유]
1. 메모리를 할당한다.(객체를 생성하기 위해서) -> 기본값임
2. 변수 초기화를 할 수 있다.
-> 일반적인 변수는 초기화 하지 않는다. 
-> 보통 클래스 변수를 초기화 할 때 사용한다.

[생성자의 특징]
1. 기본생성자 or 인수가 없는 생성자라고 부른다.
2. 기본 생성자는 숨겨져있다. -> 눈에 보이도록 타이핑할 수 있음
3사용 빈도수는 낮음(기본생성자 안에 초기화 값을 넣으면 값이 중복됨) 
4. 기본 생성자는 원래 인수가 없다.
5. 클래스의 이름과 생성자의 이름이 동일하다.
6. 생성자는 리턴값이 없기 때문에 property가 없다.
7. 생성자 또한 메소드와 같이 중복정의가 가능하다. 
(단, 매개변수와 데이터 타입을 다르게 한다면)
8. 생성자에서 다른 생성자를 호출 할 수 있다.
(단, 메소드의 맨 선두에서 한 번만 호출이 가능하다.
한 클래스에서 한번만 가능함)
 */

public class Test2 { //main class도 private을 생성할 수 있다.

	private int x;

	public Test2() {} //기본생성자 : 명시적으로 꺼내두어야 한다.
	
	/* 기본생성자에 값을 넣을 것이 아니기 때문에 생략한다.
	public Test2() { //특징 1.기본생성자
	 

	this(30); //특징 6. 생성자에서 다른 생성자를 호출(선두에서 한 번만)


		System.out.println("기본 생성자이다.");
		x = 10; //변수의 초기화가 가능하다.
		System.out.println("x의 값은 :" + x);
	    but, 이 방법을 잘 사용하지는 않는다. 
	    한번 값을 넣어두면 값이 고정되어 바꿀 수 없기 때문에 효율적이지 못함. 
	}
	*/

	public Test2(int x) {//특징 5. 생성자를 중복정의(오버로딩)한 것임

		//this(); 특징 6.

		//System.out.println("오버로딩이 된 생성자이다.");

		this.x = x;
		
		//System.out.println("x의 값은 :" + x);

	}

	public void setData(int x) {
		this.x = x;
	}

	public static void main(String[] args) {

		Test2 ob1 = new Test2(); 
		//객체를 생성함과 동시에 원하는 값으로 변수를 초기화


		System.out.println(ob1.x); //0

		ob1.setData(100);

		System.out.println(ob1.x); //100

		//--------------------------------

		Test2 ob2 = new Test2(20);
		System.out.println(ob2.x);
		
		ob2.setData(4); 
		//객체를 유지하면서 값을 바꾸고 싶을때 우회도로 메소드를 만들어 값을 바꿔줌.
		System.out.println(ob2.x);
		//객체를 생성함과 동시에 변수를 초기화를 한 것이기 때문에 
		//값을 따로 넣지 않고 출력이 가능하다.

		Test2 ob3 = new Test2(); //1. 이유 메모리할당
		Test2 ob4 = new Test2(60); // 메모리를 할당함과 동시에 값을 초기화
		//기본생성자도 만들어놨고 오버로딩 생성자도 만들어둠

	}

}
