package com.day012;

class Test {
	
	protected int a=10, b=20;
	
	public void write() {
		System.out.println("부모 클래스 write()...");
		System.out.println("a: " + a + ", b: " + b);
	}
	
}

class Demo extends Test {
	
	protected int b=30, c=40;
	
	@Override
	public void write() {
		System.out.println("자식 클래스 write()...");
		System.out.println("a: " + a + ", b: " + b + ", c: " + c);
		System.out.println("super.b: " + super.b);
		//super는 자식클래스의 메소드 안에서만 사용이 가능하다.
	}

	public void print1() {
		System.out.println("자식 클래스 print1()...");
		write();
	} //메소드는 오버라이드 했으면 무조건 자식의 값이 출력된다.
	public void print2() {
		System.out.println("자식 클래스 print2()...");
		super.write();
		//super는 무조건 부모의 값을 출력함.
	}
}

public class Test4 {

	public static void main(String[] args) {

		Demo ob = new Demo();
		ob.write();
		ob.print1();
		ob.print2();
		
		System.out.println(ob.b); //30
		//System.out.println(super.b);
		//super는 상속관계가 이어진 메소드 안에서만 사용이 된다. 
		//이 클래스는 부모랑 상관이 없는 관계이기 때문에 컴파일 오류가 남
		
		System.out.println(((Test)ob).b); //20
		//자식을 부모로 바꿈.UPCAST (Test)ob가 부모가 됨. 부모의b를 찍어라
		
		((Test)ob).write();
		//변수는 오버라이드 개념이 없음. write는 오버라이드가 된다.
		//변수는 부모꺼인데 write는 내꺼를 사용한 이유?
		//변수를 아무리 형변환을 해도 메소드는 내 것을 사용한다(예외 X)
		//자식을 부모로 형변환을 해도 메소드의 값은 내 것을 출력함.
		//write가 자체적인 출력기이기 때문에 그냥 출력해도 된다.
	}

}
//오버라이드는 메소드만 할 수 있다. 변수는 오버라이드 X
/*
 메소드는 동시에 실행할 수 있는 방법이 없기 때문에 
 heap에 따로 영역을 설정해 저장
 메소드 영역이 별도로 존재한다. -> 한개로 여러번 돌려쓰기 때문에 보안이 강함.
*/