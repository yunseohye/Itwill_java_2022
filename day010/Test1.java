package com.day010;

/*
[상속(부모가 자식한테 주는 것)]
특징
1. 부모꺼는 내꺼다.
2. private로 선언한 것은 상속이 안된다.
(자식이 가져다 쓸 수 없음)
3. protected로 선언한 것은 상속이 가능하다.
(같은 패키기 안에 있는 모든 클래스, 가족 뿐 아니라 친인척까지도 가능)
4. 내꺼는 내꺼다.(자식꺼는 부모가 가져다 쓸 수 없다.)
5. 부모와 같은 객체를 가지고 있다면 내꺼(자식)를 쓴다.
(부모의 것을 쓸 수는 있지만 같은 것을 가지고 있기 때문에 굳이 쓰지 않는다.)
*/

class SuperC {
	
	private String title;
	private int area;
	
	public void set(String title, int area) {
		this.title = title;
		this.area = area;
	}
	//메소드를 통해 입력을 받음
	
	public void print() {
		System.out.println(title + ":" + area);
	}
	//출력은 있는데 연산이 없음
}

class Rect extends SuperC {
	//extends를 통해 전략적인 협약을 통해 부모와 자식 관계가 이루어짐
	//자식 extends 부모의 형태를 가지게 된다.
	
	private int w,h;
	
	//기본생성자가 생략되어있음
	
	public Rect(int w, int h) { //오버로딩 된 생성자를 생성
		
		this.w = w;
		this.h = h;
		
	}
	
	public void rectArea() {
		
		int a = w*h;
		set("사각형", a);
		
	}
	//메소드와 연산은 있는데 출력이 없다.
}

public class Test1 {

	public static void main(String[] args) {

		Rect ob = new Rect(10,20);
		//기본생성자가 생략되어있기 때문에 기본생성자인 Rect();를 쓰면 컴파일 에러
		//오버로딩 된 생성자 안에는 인수가 들어있기 때문에 무조건 인수를 작성해야함
		
		ob.rectArea();
		
		ob.print(); //자식은 연산자 밖에 없었는데 부모의 능력인 print를 갖게됨.
		/*
		자식 클래스를 찾아봤더니 print가 없네? 
		다시 위로 올라가서 부모의 클래스를 보니 프린트라는 메소드가 있다!
		부모의 것은 내꺼이기 때문에 부모의 print();를 출력할 수 있게 됨.
		*/
	}

}
//기본적으로 클래스끼리는 아무 관계가 없다.
