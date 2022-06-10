package com.day009;

/*
 Overload, Overloading했다.
 메소드 중복 정의 : 하나의 클래스에서 메소드의 이름은 동일하지만 
 매개변수의 갯수가 다르거나 자료형이 다르면 다른 메소드로 인식한다.
 */


class Rect{
	
	private int w,h;
	
	public Rect() {
		//숨겨진 생성자
	}
	
	public void set(int w, int h /*인수*/) {
		this.w = w;
		this.h = h;
		//instance변수와 인수가 혼동되지 않도록 this를 붙여준다.
	}
	
	public int area() {
		return w*h;
	}
	
	public int length() {
		return (w+h)*2;
	}
	
	public void print(int a, int l) { //매개변수가 2개
		
		System.out.println("가로: " + w);
		System.out.println("세로: " + h);
		System.out.println("넓이: " + a);
		System.out.println("둘레: " + l);
		
	}
	
	public void print() { //매개변수가 없다.
		
		System.out.println("가로: " + w);
		System.out.println("세로: " + h);

	}
	
	public void print(int a) { //매개변수가 한개
		
		System.out.println("가로: " + w);
		System.out.println("세로: " + h);
		System.out.println("넓이: " + a);
		
	}
	
	public void print(double l) { 
		/* 매개변수의 자료형(int)이나 갯수(1개)가 달라야하는데 위의 매개변수와 
		자료형과 갯수가 동일하여 print사용하면 오류가 난다.
		오류가 나지 않고 print를 사용하고 싶다면 자료형을 
		double형태로 바꿔주면 오류가 나지 않는다. */
		
		System.out.println("가로: " + w);
		System.out.println("세로: " + h);
		System.out.println("둘레: " + l);
		
	}
	
}

public class Test1 {

	public static void main(String[] args) {

		Rect ob = new Rect();
		
		ob.set(10, 20);
		
		int area = ob.area();
		int length = ob.length();
	
		System.out.println("[가로, 세로의 값만 추출]");
		ob.print();
		System.out.println("\n[가로, 세로, 넓이, 둘레의 값 추출]");
		ob.print(area, length);
		System.out.println("\n[가로, 세로, 넓이의 값만 추출]");
		ob.print(area);
		System.out.println("\n[가로, 세로, 둘레의 값만 추출]");
		ob.print((double)length);
		
		
	}

}

