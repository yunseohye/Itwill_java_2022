package com.day016;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.zip.InflaterInputStream;

//에러가 나지 않았지만 임의로 내가 원하는 value값이 나오지 않았을때 에러를 발생시킴
//사용자 정의 에러는 반드시 try catch문으로 묶어준 후 throw new Exception 처리 해주어야한다.


public class Test2 {

	public static String getOper() throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String oper = "";
		
		try { //잘 모르겠다 싶으면 맨 위부터 입력해두어도 됨. 에러를 잡기위해 무조건 묶어주는 것이다. 
			
			System.out.print("연산자?");
			oper = br.readLine();
			
			if(!oper.equals("+")&& !oper.equals("-") && 
					!oper.equals("*") && !oper.equals("/"))  { //양쪽이 부정이면 &&
				//사용자 정의 에러, try catch안에 코딩한다.
				//throws Exception처리를 해주어야한다.
				throw new Exception("연산자 입력 오류!!");
				//Exception생성자를 오버로딩한 것.
				//Exception은 클래스의 형태이지만 값을 넣은 메소드가 없기 때문에 객체를 만들어 값을 넣어줌
			}
			
		} catch (IOException e) { 
			
			System.out.println("입력 에러!!");
			//실행될 일은 없음.
		}

		return oper;
		
	}

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		
		int num1, num2, result;
		String oper;

		try {
			
			System.out.print("첫 번째 수?");
			num1 = Integer.parseInt(br.readLine());
			
			System.out.print("두 번째 수?");
			num2 = Integer.parseInt(br.readLine());
			
			//연산자 값을 두번 입력하지 않아도 되게끔 static처리해둠
			//클래스명.getOper();로 입력
			//연산자만 에러처리를 하겠다는 뜻. 값이 정상적으로 나오면 위에서 return oper값을 만듦
			oper = Test2.getOper(); //에러를 일부러 발생시킨 부분.
			//oper에서 난 에러메시지는 밑의 catch로가서 출력됨.
			
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
			
		} catch (Exception e) { //이곳에 와서 출력된다.

			System.out.println(e.toString());
		
		}
		
	}
	
}
