package com.day007;

import java.util.Scanner;

public class Rect {

	int w,h; //전역변수, instance변수

	public void input(/*매개변수가 들어간다.*/) {//가로와 세로의 값을 할당함.

		Scanner sc = new Scanner(System.in);
		//int w, h; //지역변수, 로컬변수 but 아래 코드에서도 사용하기 위해 전역변수로 자리를 옮겨 놓는다.

		System.out.print("가로의 값을 입력하시오."); //10
		w = sc.nextInt();

		System.out.print("세로의 값을 입력하시오."); //20
		h = sc.nextInt();

		//return; void에는 return의 값을 생략한다.

	}

	//넓이 구하기, 나갈 때 int 값을 준다.
	public int area() {

		int result; //result라는 지역변수를 만듦, 여기에 담아서 내보낸다.

		result = w*h;

		return result;
		//메소드 안에서 어떤 과정을 거쳐서 새로운 값이 나오면 return을 사용한다.

	}

	//둘레 구하기
	public int length() {

		return(w+h)*2; //넓이구하기의 3줄로 친 값을 한 줄로 줄여버린것임.

	}

	//출력
	public void print(int a, int l) {
		
		System.out.println("가로: "+ w);
		System.out.println("세로: "+ h);
		System.out.println("넓이: "+ a);
		System.out.println("둘레: "+ l);
	}

}
