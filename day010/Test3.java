package com.day010;

class SuperD {
	
	private String title;
	protected int area;
	
	//기본생성자 생략
	
	public SuperD(String title) { //오버로딩된 생성자
		this.title = title;
	}
	
	public void print() {
		System.out.println(title + ":" + area);
	}
}

class RectD extends SuperD { //부모와 자식관계
	
	private int w,h;
	
	public RectD(int w, int h) { 
		
		super("사각형"); 
		// 선두에 한번만 사용한다. 아버지가 두명일 수는 없음.(다중상속은 X)
		// 위치 중요 밑에 있으면 에러가 남 무조건 맨 위에 있어야한다.
		// 부모가 제일 먼저 위치해 있기 때문에 자식보다 밑에 있을수가 없다.
		
		this.w = w;
		this.h = h;
		
	}
	
	public void rectArea() {
		area = w*h;
	}
	
}


public class Test3 { // 상속과는 상관 없는 같은 공간의 다른 클래스일 뿐이다.

	public static void main(String[] args) {

		RectD ob = new RectD(10, 20);
		
		ob.rectArea();
		ob.print();
		
		
		
	}

}
//예제를 만들려 하지 말고 이해하려고 하기!


//생성자 안에는 무조건 super가 생략되어있다.

/*
오버로딩 된 생성자에서 기본생성자를 호출할 때 - this.()
오버로딩된 생성자에서 기본생성자를 줄 때 - this(매개변수)

부모의 생성자를 호출할 때 - super();
*/

/*
super(); 
부모의 생성자를 호출
컴파일 오류가 난 경우
오버로딩된 생성자는 있는데 기본생성자가 생략이 되어있는 경우
: 기본생성자는 생략이 가능하지만 오버로딩된 생성자가 있는 경우 기본 생성자를
명시하지 않았을 때는 기본 생성자를 아예 사용하지 않는다는 개발자의 의도이기 
때문에 오류가 난다.

super("a");
부모의 오버로딩 생성자를 호출한다는 뜻
*/