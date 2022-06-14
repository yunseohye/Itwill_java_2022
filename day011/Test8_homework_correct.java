package com.day011;
//강사님 풀이
import java.util.Scanner;

class Sum2{

	//변수
	protected int num1, num2, result;
	protected String oper;

	//출력기(연산)
	public void write() {

		System.out.printf("%d %s %d = %d", num1, oper, num2, result);

	}

}

class Calc2 extends Sum2 {

	public void input() {

		Scanner sc = new Scanner(System.in);
		System.out.print("두개의 수(10,20)?");
		String su = sc.next();
		
		System.out.print("연산자?");
		oper = sc.next();
		
		su = su.replaceAll(" ", "");
		String[] s = su.split(",");
		
		num1 = Integer.parseInt(s[0]);
		num2 = Integer.parseInt(s[1]);
	}

	public void calc2() {
		
		if(oper.equals("+")) 
			result = num1 + num2;
		else if (oper.equals("-"))
			result = num1 - num2;
		else if (oper.equals("*"))
			result = num1 * num2;
		else if (oper.equals("/"))
			result = num1 / num2;
				
		
		
	}
	
}	

	public class Test8_homework_correct {

		public static void main(String[] args) {

			Calc2 ob = new Calc2();
			ob.input();
			ob.calc2();
			ob.write();
			


		}

	}

