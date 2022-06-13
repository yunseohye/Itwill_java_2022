package com.day011;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test6 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader
				(new InputStreamReader(System.in));
		
		System.out.println("수와 연산자가 들어간 수식을 입력하시오."); 
		String str =  br.readLine();
		
		str = str.replaceAll("\\s", ""); //i=i+1과 비슷한 개념이다.
		//모든 공백을 찾아 null로 바꾸어라.(공백값을 없애라)
		
		//String[] op = {"+","-","*","/"};
		
		//for(String o : op) {
		for(String op : new String[ ] {"+","-","*","/"}) {	
			//012345
			//123+56의 연산자의 index값을 찾는 수식
			int pos = str.indexOf(op);
			
			if(pos>-1) {
				
				int num1 = Integer.parseInt(str.substring(0, pos));//123
				int num2 = Integer.parseInt(str.substring(pos+1));//56
				
				int result = 0;
				char oper = str.charAt(pos); //+
				
				switch(oper) {
				
				case '+' :
					result = num1 + num2; break;
				case '-' :
					result = num1 - num2; break;
				case '*' :
					result = num1 * num2; break;
				case '/' :
					result = num1 / num2; break;
				}

				//System.out.printf("%d %c %d = %d",num1,oper,num2,result);
				String s = String.format("%d %c %d = %d",num1,oper,num2,result);
				
				System.out.println(s);
				
				
			}
		
		}
				
	}

}
/*
 printf와 String.format의 차이점
: 사용방법은 동일하지만 printf는 그자리에서 출력하지만
String.format은 값을 담아 놓은 후에 내가 원하는 곳에 값을 출력한다.
String.format은 class.method : class메소드, static으로 만들어 진 것임.
*/
