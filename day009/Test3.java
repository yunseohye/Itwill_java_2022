package com.day009;

class RectA{ 
	//클래스명은 같은 패키지 안에 있으면 안되기 때문에 이름을 다르게 주어야 한다.
	//같은 패키지의 Test1에 Rect가 있어서 이 클래스에서는 이름을 다르게 준 것임.
	
	private int w,h;
	
	public RectA() {} //기본생성자로 객체 생성
	
	public RectA(int w, int h) { //오버로딩 된 생성자 (생성자로 값 초기화)
		this.w = w;
		this.h = h;
	}
	
	public void set(int w, int h) { 
		//기본생성자에 값을 넣어주기 위해 변수를 초기화 하는 메소드 생성
		//초기화 메소드라고 부름
		this.w = w;
		this.h = h;
	}
	
	public int area() {
		return w*h;
	}
	
	public int length() {
		return (w+h)*2;
	}
	
	public void print(int a) { //매개변수 갯수가 1개
		System.out.println("가로: " + w + ", 세로: " + h);
		System.out.println("넓이: " + a);
	}
	
	//메소드 오버로딩 
	public void print(int a, int l) { //매개변수 갯수가 2개
		System.out.println("가로: " + w + ", 세로: " + h);
		System.out.println("넓이: " + a);
		System.out.println("둘레: " + l);
	}
}


public class Test3 {

	public static void main(String[] args) {
		System.out.println("\n[기본생성자로 객체 출력]");
		
		RectA ob1 = new RectA();
		ob1.set(10, 20);
		int a = ob1.area();
		int l = ob1.length();
		ob1.print(a);
		ob1.print(a, l);
		
		System.out.println("\n[오버로딩 된 생성자로 객체 출력]");
		
		RectA ob2 = new RectA(100,200);
		a = ob2.area();
		l = ob2.length();
		ob2.print(a);
		ob2.print(a, l);
		
	}

}
/*
 기본생성자의 객체 생성
 RectA ob1 = new RectA();
 ob1.set(10, 20);
 
 오버로딩 생성자로 객체 생성
 RectA ob2 = new RectA(100,200);
 */

