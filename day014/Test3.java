package com.day014;

import java.util.Vector;

class Test{ //클래스는 데이터를 담는 저장소, 자료형이다.
	
	String name;
	int age;
	
}

public class Test3 {

	public static void main(String[] args) {

		Vector<Test> v = new Vector<>(); //Vector에는 클래스를 담을수도 있다. String클래스도 담았음.
		
		Test ob = new Test();
		
		ob.name = "배수지";
		ob.age = 27;
		v.add(ob);
		
		ob = new Test(); //두번째 객체 생성
		ob.name = "유인나";
		ob.age = 42;
		v.add(ob);
		
		for(Test t : v) {
			System.out.println(t.name + ":" + t.age);
		}
		//데이터를 넣고 싶으면 데이터의 수 만큼 객체를 새로 생성해줘야 값이 제대로 나옴
		//데이터수 만큼 객체를 넣지 않으면 값이 마지막 값으로만 출력이 된다.
				
	}

}
