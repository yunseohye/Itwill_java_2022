package com.day015;
//< >:Generic의 내부구조

class Box<T> { 
	
	private T t; // 아무것도 넣지 않으면 값이 object, String을 넣으면 문자열 등등
	
	public void set(T t) {
		this.t = t;
	}
	
	public T get() {
		return t;
	}
}


public class Test4 {

	public static void main(String[] args) {

		Box b1 = new Box();
		//값을 넣지 않아 Object의 형태임.
		//자료형을 정해주지 않으면 무조건 값은 Object로 받는다.
		
		b1.set(30); //Integer, upcast
		
		Integer i = (Integer) b1.get(); //downcast
		System.out.println(i);
		
		Box<Integer> b2 = new Box<>(); //new Box 뒤에 <>는 생략가능
		b2.set(20);
		i = b2.get();
		System.out.println(i);
		
		Box<String> b3 = new Box<String>();
		b3.set("서울");
		String s = b3.get();
		System.out.println(s);
		
	}

}
