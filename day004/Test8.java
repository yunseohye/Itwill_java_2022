package com.day004;

import java.io.IOException;
import java.util.Scanner;

public class Test8 {
	//Test8 ex의 코딩 값을 더 짧게 줄이는 방법

	public static void main(String[] args) throws IOException {
		System.out.println("[switch문 예제]");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		char oper; //연산자를 char 형태로 저장하기 위한 변수 지정
		
		System.out.print("첫 번째 수를 입력하세요.");
		num1 = sc.nextInt();
		
		System.out.print("두 번째 수를 입력하세요.");
		num2 = sc.nextInt();
		
		System.out.print("연산자[+,-,*,/]를 입력하세요.");
		oper = (char)System.in.read();
		
		int result=0;
		//변수를 지정한 후 연산자를 넣은 다음에 printf값을
		//마지막에 한 줄만 넣으면 코드가 훨씬 간결해질 수 있다.
		
		switch (oper) {
		case '+':
			result = num1+num2;
			break;
		case '-':
			result = num1-num2;
			break;
		case '*':
			result = num1*num2;
			break;
		case '/':
			result = num1/num2;
			break;

		default:
			System.out.println("올바른 연산자를 입력하시오.");
			break;
		}
		System.out.printf("%d %c %d = %d", num1, oper, num2, result);
	}
	
}

//oper의 자료형이 char이기 때문에 case뒤에는 큰 따옴표가 아닌 작은 따옴표