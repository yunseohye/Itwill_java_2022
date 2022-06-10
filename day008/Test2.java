package com.day008;

/*static
객체를 생성하지 않아도 알아서 메모리에 올라감(메모리 할당을 받음)
new를 이용해 객체를 생성하지 않아도 값이 출력이 된다.
객체를 1000번 생성해도 메모리 공간은 1개
메모리상에 먼저 올라가있어 언제든 사용될 준비가 되어있음.
*/

public class Test2 {
	
	public static int a = 10; //class변수
	/*
	 클래스변수 또는 클래스메소드 클래스가 로딩되는 순간 
	 메모리 할당이 이루어지며 [클래스이름.객체]를 통해서 접근 가능하다.
	 즉, new를 통해서 메모리 할당을 받지 않아도 사용이 가능하다.
	 로딩 : 컴파일 한 파일을 실행하는 것
	 */
	
	public int b = 20; //instance변수
	/*
	 인스턴스변수는 new를 통해서 메모리 할당을 받아야만
	 사용이 가능하고 클래스 메소드에서는 접근이 불가능하다.
	 */
	
	public void write() { //instance 메소드
		System.out.println("class변수: "+ a);
		System.out.println("instance변수: "+ b);
	}
	
	public static void print() { //class 메소드
		System.out.println("class변수: "+ a);
		
		//System.out.println("instance변수: "+ b);
		//class메소드에서 instance변수의 접근은 불가능하다.
		
	}
	
	public static void main(String[] args) {
		//main절에서는 VM이 자동으로 값을 실행시킨다.
		
		System.out.println("class변수: " + a);
		System.out.println("class변수: " + Test2.a); 
		//변수 앞에 class명을 붙여주기 때문에 class변수라고 한다.
		
		//System.out.println("instance변수: " + b);
		//객체는 밑에 생성되어있기 때문에 컴파일 에러
		
		//write(); 인스턴스 변수이기 때문에 new라는 객체를 생성해야 한다.
		print(); //이미 static으로 호출이 되어있기 때문에 실행이 된다.		
		Test2.print(); 
		//앞부분에 class를 붙여 print를 호출하기 때문에 class메소드라고 한다.
		 

		Test2 ob = new Test2();
		//자기 자신이 자신의 객체를 생성할 수 있는가? Yes
		
		System.out.println(ob.a);
		/*
		 혼자 올라가있을 때는 class명을 입력했지만 객체를 생성했기 때문에 
		 ob.a도 실행이 된다. 그렇지만 자주 사용하진 않음
		 */
		System.out.println(Test2.a);
		ob.write();
		ob.print(); 
		//값은 출력되지만 static의 값이기 때문에 이렇게 출력할 필요가없다는 노란줄을 띈다.
		Test2.print();
	
		System.out.println(ob.a); //10
		System.out.println(ob.b); //20
		System.out.println("-----------------");
		Test2 ob1 = new Test2();
		
		ob1.a = 100;
		ob1.b = 200;
		System.out.println(ob1.a); //100
		System.out.println(ob1.b); //200
		
		System.out.println("-----------------");
		
		Test2 ob2 = new Test2();
		System.out.println(ob2.a); //100
		System.out.println(ob2.b); //20
		
		System.out.println("-----------------");
		
		Test2 ob3 = new Test2();
		System.out.println(ob3.a); //100
		System.out.println(ob3.b); //20
		//static a는 같은 공간을 가지기 때문에 a의 값이 동일하다.
		//static a의 메모리 공간은 1개임(때문에 모든 a의 값이 같음)
		//새로운 객체를 생성했기 때문에b는 원래 자신이 가지고 있는 값으로 돌아간다.
		//로딩과 객체생성은 별개의 문제이다.(로딩>객체
	
	}

}
