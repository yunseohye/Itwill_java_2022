package com.day011;

import java.util.Scanner;

class Sum{

	//변수
	protected int num1, num2, result;
	protected String oper;

	//출력기(연산)
	public void write() {

		System.out.printf("%d %s %d = %d", num1, oper, num2, result);

	}

}

class Calc extends Sum {

	String str;

	public void input() {

		Scanner sc = new Scanner(System.in);
		System.out.println("수와 연산자가 들어간 수식을 입력하시오.");
		str = sc.nextLine();
		str = str.replaceAll("\\s", "");

	}

	public void operator() {

		String[] op = {"+","-","*","/"};

		//for each문 사용
		for(String o : op) {

			int pos = str.indexOf(o);

			if(pos>-1) {

				num1 = Integer.parseInt(str.substring(0, pos));//123
				num2 = Integer.parseInt(str.substring(pos+1));//56
				
				oper = str.substring(pos,pos+1); 

				switch(oper) {

				case "+" :
					result = num1 + num2; break;
				case "-" :
					result = num1 - num2; break;
				case "*" :
					result = num1 * num2; break;
				case "/" :
					result = num1 / num2; break;
				}

			}
		}
	}
}	

	public class Test8_homework {

		public static void main(String[] args) {

			Calc ob = new Calc();
			ob.input();
			ob.operator();
			ob.write();
			


		}

	}

