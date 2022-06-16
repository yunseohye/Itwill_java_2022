package com.day013;

//2.내부 클래스(Local) -> 메소드 안에 클래스를 만드는 것

class Outer2 {
	
	static int a = 10;
	int b = 20;
	
	public void write() {
		
		int c = 30;
		final int d = 40;
		
		class Inner2 { //Local class
			
			public void print() {
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);
				System.out.println(d);
			}
			
		}
		System.out.println("write의 값이다.");
		Inner2 ob = new Inner2();
		ob.print();
		//메소드 안에 클래스를 만든 후 메소드에 객체를 
		//생성 해주어야 값이 출력된다.
	}
	
}



public class Test5 {

	public static void main(String[] args) {

		Outer2 out = new Outer2();
		out.write();
		//outer를 만들었다고 해서 inner의 객체가 생성된 것이 아님.
		//여기까지만 코드를 입력하면 아무 값도 출력되지 않는다.
		
	}

}
