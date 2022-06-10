package com.day007;


public class Test1 {

	public static void main(String[] args) {
		System.out.println("[Class]\n");
		
		Rect ob1 = new Rect();
		
		ob1.input();
		int a = ob1.area();
		int l = ob1.length();
		ob1.print(a, l); 
		//변수의 이름은 Rect에 있는 변수와 꼭 똑같이 맞추지 않아도 값은 출력된다.
		//값이 중요한거지 변수명이 중요한 것이 아니다.
		//변수명은 달라도 되지만 자료형은 꼭 맞춰주어야한다.
		System.out.println();
		
		Rect ob2 = new Rect();
		
		ob2.input();
		a = ob2.area();
		l = ob2.length();
		ob2.print(a, l);
				
	}

}
// new가 나오면 복사의 의미를 가짐
// 원본 Rect를 두번 new 했기 때문에 두 번 복사했다는 뜻이다.
// 복사의 갯수는 정해져 있지 않고 원하는만큼 생성할 수 있다.