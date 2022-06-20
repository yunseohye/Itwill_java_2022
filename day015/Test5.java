package com.day015;

class Box2<T> {
	
	private T t;
	
	public void set(T t) {
		this.t = t;
	}
	
	public T get() {
		return t;
	}
	
	public <U> void print(U u) { 
		// U는 메소드에도 어떤 데이터를 넣느냐에 따라 자료형을 정해줄 수 있다.
		
		System.out.println(u);
		System.out.println("t 클래스: " + t.getClass().getName());
		System.out.println("u 메소드: " + u.getClass().getName());
		
	}
}

public class Test5 {

	public static void main(String[] args) {
		
		Box2<Integer> b = new Box2<Integer>(); //클래스(T)의 자료형은 Integer가 됨
		
		b.set(30);
		
		b.print("test");
		b.print(50);
		b.print('a');
		

	}

}
