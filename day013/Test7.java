package com.day013;

/*
4. 내부 클래스(무명의, 익명의, Annonymous클래스)
-> 반드시 하나의 메소드만 출력된다. 그래야 값이 자동으로 바로 출력 되기 때문에.
무명이기 때문에 클래스 파일을 찾아보면 $뒤에 1이 붙어있다.
반드시 메소드 하나를 오버라이드 한다.
무명을 사용하는 이유? 속도가 빠르기 때문에. 
메모리에 올림과 동시에 호출할 필요 없이 바로 값을 출력
*/
public class Test7 {
	
	public Object getTitle() {//근처에 Object가 있으면 무조건 UPCAST
		
		//String str = "무명의 클래스";
		
		return new Object() {
			//반환값을 받아야하는데 반환값자체가 클래스나 인터페이스가 들어옴.
			//결과값을 받아야하는 시점에서 new로 값을 만든다.
			//메모리상에 올림과 동시에 코딩값을 실행하여 반환값을 올린다.
			//class와 interface 둘 중 하나가 온다.
			
			@Override
			public String toString() {
				return "무명의 클래스";
			}
		};
		
	}

	public static void main(String[] args) {

		Test7 ob = new Test7();
		
		System.out.println(ob.getTitle());
		
	}

}
