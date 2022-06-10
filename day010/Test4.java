package com.day010;

class Super {
	
	private String title;
	protected double area;
	
	public Super() {} //기본생성자(Recta)눈에 보이도록 타이핑, 생략하면 안됨
	
	public Super(String title) { //오버로딩 생성자(Circle)
		
		this.title = title;
	}
	
	public void write() { //부모가 가진 출력 메소드
		System.out.println(title + ":" + area);
	}
	
}

class Circle extends Super {
	
	private int r;
	protected static final double PI = 3.14;
	//final은 상수를 변수로 받는 변수이기 때문에
	//한 번 값을 넣으면 바꿀수 없다.
	
	public Circle(int r) {
		
		super("원"); //부모의 오버로딩 생성자를 찾아가라
		
		this.r = r;
	}
	
	public void circleArea() {
		area = r*r*PI;
		//PI는 static이기 때문에 값을 변경X
		//값을 초기화하려면 컴파일 에러가 난다.
	}
	//생성자를 이용해 초기화
}


class Recta extends Super {
	
	private int w,h;
	
	public void rectArea(int w, int h) {
		this.w = w;
		this.h = h;
		
		area = w*h;
	}
	//메소드를 이용해 초기화 했기 때문에 굳이 instance변수를 입력안해도 된다.

	@Override
	public void write() {
		
		System.out.println("가로: " + w);
		System.out.println("세로: " + h);
		System.out.println("넓이: " + area);
		
	}
	//@Override 어노테이션(annotation) - 부모와 같은 출력 메소드라면 이름이다를때 오타를 찾아줌
	/*
	override
	: 부모와 자식관계에서 역할이 똑같은 메소드 이름을 가지는 것
	: 상위 클래스에 정의 되어 있는 메소드를 재정의한다. (클래스의 다형성)
	: 부모와 자식의 영역이 다르기 때문에 이름이 같아도 문제가 없다.
	(부모의 write메소드가 맘에 안들어서 출력메소드 print를 새로 만든 것.
	부모랑 자식 둘 다 같은 출력 메소드이기 때문에 이름이 똑같아도 되기 때문에 write로 변경) 
	*/
	
}


public class Test4 {

	public static void main(String[] args) {

		Circle c = new Circle(10);
		c.circleArea();
		c.write();
		
		System.out.println("------------------");
		
		Recta r = new Recta();
		r.rectArea(10, 20);
		r.write(); 
		
	}

}

