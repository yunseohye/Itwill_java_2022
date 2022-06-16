package com.day013;

//3. 내부 클래스(중첩) -> static에서 outer의 객체를 생성해준다.

class Outer3 {
	
	static int a = 10;
	int b = 20; 
	//outer3의 new를 만나야 public void write()에서 값이 출력됨.
	
	public static class Inner3 {
		
		int c = 30;
		
		public void write() {
			
			System.out.println(a);
			//System.out.println(b);
			System.out.println(c);
			
			Outer3 ob = new Outer3();
			System.out.println(ob.b);
		}
		
	}
	
}

public class Test6 {

	public static void main(String[] args) {

		Outer3 out = new Outer3(); //생략 가능
		
		Outer3.Inner3 inner = new Outer3.Inner3();
		inner.write();
		
		
		
	}

}
