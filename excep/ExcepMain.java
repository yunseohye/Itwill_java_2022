package com.excep;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExcepMain {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str;
		double num1, num2, result;
		
		OperationAuthenticator auth = new OperationAuthenticator();
		
		try {
		
			System.out.print("[a,b]형식을 이용해 두 개의 수를 입력하시오."); //10,20
			str = br.readLine();
			
			auth.inputFormat(str); //예외처리
			
			String[] temp = str.split(",");
			
			auth.number(temp[0]); //예외처리
			num1 = Double.parseDouble(temp[0]);
			
			auth.number(temp[1]); //예외처리
			num2 = Double.parseDouble(temp[1]);
			
			System.out.print("연산자를 입력하시오.");
			str = br.readLine();
			
			auth.operator(str.charAt(0)); //예외처리
			
			char ch = str.charAt(0);
			
			result = 0;
			if(ch == '+')
				result = num1 + num2;
			else if(ch == '-')
				result = num1 - num2;
			else if(ch == '*')
				result = num1 * num2;
			else if(ch == '/')
				result = num1 / num2;

			System.out.printf("%g %c %g = %g\n", num1, ch, num2, result);	
			
			
		} catch (Exception e) {

			System.out.println(e.toString());
			
		}

	}

}
