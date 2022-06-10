package com.day009;

public class Test4 {
	
	int a = 5; //instance 변수 (사용자가 new쓸때까지 기다려)
	
	//초기화 블럭 (사용자가 new쓸때까지 기다려)
	//메소드처럼 이름이 없기때문에 실행 명령어가 없다.
	///메모리상에 올라간 후 자동으로 실행함. 이름이 없기 때문에 재호출 불가능
	//new를 두 번 쓰면 두 번 출력이 가능
	{
		System.out.println("초기화 블럭a :" + a);
		a=10;
		System.out.println("초기화 블럭a :" + a);
	}

	static int b;
	static { 
		//메소드는 호출해서 사용할 수 있지만 이 값은 한번만 사용 가능
		//static이기 때문에 어차피 한번만 출력함.
		//new를 써도 static이기 때문에 재출력이 불가능 함.
		
		b = 10;
		System.out.println("초기화 블럭b :" + b);
		//static 블럭이기 때문에 여기에 instance변수를 a는 입력하면 컴파일 오류
		
	}
	
	final int C; //(사용자가 new쓸때까지 기다려)
	/*
	상수(항상 똑같은 수)
	만들자 마자 바로 초기화를 해야하며 
	한 번 초기화를 하면 값을 절대 바꿀수 없다.
	상수는 일반적으로 알아보기 쉽게 대문자를 사용한다.
	*/
	
	public Test4() { //생성자 (생성자가 호출될 때까지 기다려)
		System.out.println("\n생성자 영역");
		C = 100;
		System.out.println("C : " + C);
	}
	
	public static void main(String[] args) {

		Test4 ob1 = new Test4();
		//복사해서(new) 메모리상에 올려야하기 때문에 new와 뒤에 값은 항상 세트로 따라다님
		System.out.println("=====================");
		Test4 ob2 = new Test4(); 
		
	}

}

/*
 Static -> new (instance변수, 메소드) -> 생성자
1. 가장 빨리 실행 : static
2. 중간 : new(instance변수, 메소드)
3. 가장 늦게 실행 : 생성자
 */