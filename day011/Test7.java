package com.day011;

/*
Wrapper 클래스
기본 자료형을 객체로 사용할 수 있게 해준다.

자료형
-> boolean, byte, char, short, int, long, float, double
 
reference(class) 자료형
-> Boolean, Byte, Character, Short, Integer, Float, Double

자료형의 더블은 d라는 공간에 값만 넣을수 있다. 
자료형은 명령어가 없다. 명령어가 있는 것은 메소드이다.
명령어를 넣어 값을 바꾸고 싶을때 메소드를 가져야하고 
메소드를 가지기 위해 class형태를 사용하는 것이다.
*/ 

/*
Auto-Boxing : (stack -> heap)
스택영역에 있는 자료형이 힙 영역의 클래스로 넘어가 저장되는 것
Auto-UnBoxing : (heap -> stack)
힙 영역에 있는 데이터가 스택으로 넘어와 연산을 할 수 있게 하는 것
값을 복사하는 개념이라고 생각하면 된다. 이동 X
*/
public class Test7 {

	public static void main(String[] args) {

		int a = 24;
		
		System.out.println(a); //24
		System.out.println(a + 10); //34, 24라는 숫자와 10이 더해짐
		System.out.println(Integer.toString(a)); //24
		System.out.println(Integer.toString(a)+10); //2410, 문자와 문자가 더해짐
		System.out.println(Integer.toString(a,2)); 
		//object의 toSrtring을 오버라이드 한 것. 이진수의 값으로 출력
		System.out.println(Integer.toString(a,16));
	
		int n1 = 10;
		int n2;
		//자료형의 초기값은 쓰레기 값이다.
		Integer num1;
		//class이기 때문에 초기값이 null
		Integer num2 = new Integer(20);
		
		num1 = n1; //Auto-Boxing
		n2 = num2; //Auto-UnBoxing
		
		System.out.println(n1 + ":" + num1);
		System.out.println(n2 + ":" + num2);
		
	
	}

}
/*
 int a = 10;
 float b;
 
 형변환 : 정수가 자동으로 실수로 바뀜
 b = a; 		--> 암시적 형변환 (10.0) -- o
 b = (float)a;  --> 명시적 형변환 (10.0) -- o
 : 작은값을 큰 값에 넣을 때는 명시적, 암시적 형변환이 모두 가능하다.

 a = b; 		--> 컴파일 에러			 -- X
 a = (int)b;	--> 명시적 형변환		 -- o
 : 큰 값을 작은 값에 넣을때는 반드시 명시적 형변환을 해주어야한다.
 
 --------------------------------------------------------------------
 
 B(부모) - A(자식) 상속 관계의 형변환[UPCAST, DOWNCAST]
 
 부모가 더 큰 값을 가진 개념임.
 [B안에 A를 넣을수 있는가? Yes]
 자료형은 형변환이라는 명칭을 사용하지만 Class는 UPCAST, DOWNCAST라는 명칭 사용
 B = A; 	--> UPCAST 		  -- o
 B = (B)a;  --> 명시적 UPCAST -- o
 
 A = B; 	--> 에러  		  -- X
 A = (A)B	--> 명시적 DOWNCAST -- o
 

*/
