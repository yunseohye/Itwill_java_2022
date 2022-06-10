package com.day009;


class Test {

	public int x = 10;

	public void sub(int a) {
		x += a; // x = x + a;
	}
}

public class Test6 {


	public static void main(String[] args) {

		Test ob = new Test();
		
		System.out.println("[Call By Value]");
		int a = 20;
		
		System.out.println("sub()메소드를 실행하기 전에 X값은? " + ob.x); //10
		ob.sub(a);
		System.out.println("sub()메소드를 실행한 후 X값은? " + ob.x); //30

		System.out.println("\n[Call By Reference]");
		Test ob1; //null
		ob1 = ob;
		
		System.out.println("ob.x의 값은? " + ob.x); //30
		System.out.println("ob1.x의 값은? " + ob1.x); //30
		
		ob1.x = 100;
		System.out.println("ob.x의 값은? " + ob.x); //100
		System.out.println("ob1.x의 값은? " + ob1.x); //100
	}

}
/*
Call By Value
: stack영역의 value가 heap영역으로 넘어감

Call By Reference(어려움)
: heap영역의 주소가 stack영역으로 넘어감

velog참고하여 공부하기
 */
