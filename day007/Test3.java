package com.day007;

import java.util.Scanner;

class Hap{
	//선언
	int su, sum; //0으로 초기화가 자동으로 되어있음.

	//입력
	public void input() {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 입력하시오.");
		su = sc.nextInt();

	}

	public int cnt() {
		//int sum = 0; 지역변수로 만들어줘도 된다. 반환값이 있기 때문에.

		for(int i=1;i<=su;i++) {

			sum = sum + i; //sum+=i;

		}

		return sum;
		//반환값이 필요가 없으면 void
		//int 사용해서 반환값이 필요한 형태 -> return을 써야한다.

	}
	//출력
	public void print(int result) {
		System.out.println("1부터 " + su + "까지의 합 : " + result);
	}

}

public class Test3 {

	public static void main(String[] args) {

		Hap h = new Hap();

		h.input();
		int sum = h.cnt();
		h.print(sum);

	}

}


















