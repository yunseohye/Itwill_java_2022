package com.day016;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 Exception 클래스(예외처리)
 - 에러가 났을 때를 대비하는 클래스
 - 내가 만든 클래스를 다른 사람들이 쓸 수 있도록 만들어주는 것
 */

public class Test1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num1, num2, result;
		String oper;

		//try catch문 : 에러를 정갈하게 정리할 수 있음. 습관적으로 사용
		//try catch문 실행시켜 놓고 안에 원하는 코드를 넣는다.
		//try catch문을 사용하지 않으면 빨간줄이 나오는 경우도 있다.
		try {
			//실행하다가 에러가 생기면

			System.out.print("2개의 수를 입력하시오."); //20 40
			num1 = sc.nextInt();
			num2 = sc.nextInt();

			System.out.print("연산자를 입력하시오."); //+
			oper = sc.next();

			result = 0;
			if(oper.equals("+"))
				result = num1 + num2;
			else if(oper.equals("-"))
				result = num1 - num2;
			else if(oper.equals("*"))
				result = num1 * num2;
			else if(oper.equals("/"))
				result = num1 / num2;

			System.out.printf("%d %s %d = %d\n", num1, oper, num2, result);	

		} 

		catch(InputMismatchException e) { //실제 사용빈도는 적음
			System.out.println(e.toString());
			System.out.println("정수를 입력하세요.");

		} catch(ArithmeticException e) { //실제 사용빈도는 적음

			System.out.println("0으로 나눌 수 없습니다.");

		} catch (Exception e) { //Exception은 항상 맨 끝에 위치해야한다.
			//이 부분에서 값을 넣어 캐치한 후 Exception에 넘겨 처리작업을 함

			//e.printStackTrace(); 자바 빨간줄 나오는 코드
			
			System.out.println("그 밖의 에러!!"); //사용자정의 에러메시지

		} finally {
			System.out.println("난 항상 보인다.");
		}

	}

}
