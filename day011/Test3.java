package com.day011;

/*
 StringBuffer
 : 속도가 상대적으로 Builder에 비해 느림
 : 동기화 작업을 지원 함 -> 느려지게 됨
 : 동기화 관련 프로그램을 짤 때 사용
 StringBuilder 
 : 속도가 상대적으로 Buffer에 비해 빠름
 : 동기화 작업을 지원 안함 -> 빠름
 : 동기화 작업이 필요 없고 그냥 빨리 출력이 되길 원할 때 사용.
 
 이 두개는 Scanner와 다르게 import가 되지 않는다. 이미 lang안에 있기 때문
 자바에서는 하는 일이 비슷한 클래스를 짝으로 두개씩 만드는 경우가 많다.
 (보통 동기화 작업을 지원하는 것과 안하는 것 이렇게 두개씩 만들어져있음)
 */

public class Test3 {

	public void stringTime() {

		System.out.println("String...");

		//long start = System.currentTimeMillis();
		long start = System.nanoTime();

		String str = "A";
		for(int i=1;i<50000;i++) {
			str += "A";
		}

		long end = System.nanoTime();

		System.out.println("실행시간: "+ (end-start) + "ms");

	}

	public void stringBufferTime() {

		System.out.println("StringBuffer...");

		long start = System.nanoTime();

		StringBuffer str = new StringBuffer("A");
		for(int i=1;i<50000;i++) {
			str.append("A");
			//append = 문자열을 누적하는 코드이다.
		}

		long end = System.nanoTime();

		System.out.println("실행시간: "+ (end-start) + "ms");

	}
	public void stringBuilderTime() {

		System.out.println("StringBuilder...");

		long start = System.nanoTime();

		StringBuilder str = new StringBuilder("A");
		for(int i=1;i<50000;i++) {
			str.append("A");
	
		}

		long end = System.nanoTime();

		System.out.println("실행시간: "+ (end-start) + "ms");

	}

	public static void main(String[] args) {

		Test3 ob = new Test3();

		ob.stringTime();
		ob.stringBufferTime();
		ob.stringBuilderTime();

	}

}
