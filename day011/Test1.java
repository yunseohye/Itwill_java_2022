package com.day011;

//Object : 모든 클래스의 최상위 부모
class Test extends Object {
	private int a = 10;
	
	public void write() {
		System.out.println("a: " + a);
	}
	
}


public class Test1 {

	public static void main(String[] args) {

		Test ob1 = new Test();
		Test ob2 = new Test();
		
		System.out.println("ob1==ob2: "+ (ob1==ob2)); 
		//false, ob1과 ob2의 주소를 비교하는 것임.
		//주소값은 각 객체마다 때문에 값이 false가 나온다.
		
		System.out.println("ob1.equals(ob2):" + ob1.equals(ob2));
		//false, equals는 최상위 부모인 object의 값이기 때문에 false
		
		
		//해쉬코드[클래스이름@해쉬코드]
		System.out.println("ob1: " + ob1);
		System.out.println("ob2: " + ob2);
		
		System.out.println("ob1.toString(): " + ob1.toString());
		//object의 toString이다.
		//object의 toString은 해쉬코드값을 출력함.
	}

}
