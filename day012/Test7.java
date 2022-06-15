package com.day012;

/*
추상클래스(abstract)
1. 메모리의 낭비 없이 클래스를 미리 설계하는 것이다.
2. 메소드를 재정의(Override)를 해서 사용한다.
3. 추상 클래스 안에는 반드시 추상메소드가 한 개 이상 존재해야 한다.
4. 추상 클래스 안에 일반적인 메소드도 존재할 수 있다.
5. 추상클래스를 상속받은 경우 무조건 추상메소드를 override해야함.
   -> 상속받는 모든 클래스에 전부 다 적용됨. 10개면 10개 다 오버라이드
 */

abstract class ShapeClass {//추상클래스

	public abstract void draw(); 
	//추상메소드 - 처음에 내용을 정의하지않고 오버라이드 한 곳에서 입력
	//추상메소드를 private로 정립하면 상속,오버라이드가 불가능하기 때문에 기본이 protected
	//public을 생략하면 protected가 자동으로 적용된다.
}

class Cir extends ShapeClass{ 
	//추상클래스를 상속받은 경우 무조건 추상메소드를 override해야함.

	@Override
	public void draw() {

		System.out.println("원을 그리다...");

	} 

}

class Rect extends ShapeClass {

	@Override
	public void draw() {

		System.out.println("사각형을 그리다...");
	}

}

class Tri extends ShapeClass {

	@Override
	public void draw() {

		System.out.println("삼각형을 그리다...");

	}

}


public class Test7 {

	public static void main(String[] args) {

		Cir c = new Cir();
		Rect r = new Rect();
		Tri t = new Tri();

		c.draw();
		r.draw();
		t.draw();

	}

}
//public을 생략하면 protected가 자동으로 적용된다.