package com.day013;
/*
만들일은 없으나 이런 구조로 만들어져있는 클래스를 사용할 것임.
구조는 많이 사용하니 원리 파악하고 지나가기!

1. 내부클래스(Inner)
 -> 클래스 안에 클래스를 만들 수 있음(Nested)
 -> 메소드 안에도 클래스를 만들 수 있다.
*/

class Outer1{
	
	static int a = 10;
	int b = 20;
	
	public class Inner1 { //클래스 안에 클래스 생성(Nested class) 
		
		//클래스이기 때문에 변수와 메소드를 생성해준다.
		int c = 30;
		
		public void write() {
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		}
		
	}
	
	public void print() {
		System.out.println("print method이다.");
		
		Inner1 ob = new Inner1();
		//메소드를 통해 내부 클래스 생성
		ob.write();
	}
}

public class Test4 {
	
	public static void main(String[] args) {

		/*
		외부클래스가 객체 생성이 되어야 
		내부클래스(Inner)의 객체를 생성할 수 있고,
		외부클래스가 객체 생성이 됬다고해서 
		자동으로 내부 클래스의 객체가 생성되는 것은 아니다.
		내부객체를 사용하려면 반드시 외부객체 먼저 불러와야 한다.
		*/
			
		Outer1 out = new Outer1();
		out.print();
		
		System.out.println();
			
		Outer1.Inner1 inner = out.new Inner1();
		inner.write();
		//외부클래스의 이름으로 내부클래스를 생성할 수 있다.
		
		}
	}


