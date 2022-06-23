package com.day018;

import java.io.InputStreamReader;
import java.io.Reader;

/*
InputStreamReader
: 1byte의 stream을 2byte의 stream으로 변환시켜주는 것
: char타입을 stream으로 바꿔준다고 하기도 함.
: Bridge Stream이라고도 말함. 다리의 역할을 하기 때문
(즉, 자기가 데이터를 가지고 있을수는 없다.)
*/
public class Test3 {

	public static void main(String[] args) throws Exception {

		int data;
		System.out.print("문자열 입력?");
		
		Reader rd = new InputStreamReader(System.in);
		//사용자가 입력한 값을 읽어서 가지고 있는 것.
		//누군가에게 전달을 해주어야 InputStreamReader를 통해 읽어낼 수 있음.
		 
		//reader의 짝 = writer
		
		while((data=rd.read()) != -1) {
			char ch = (char)data;
			//데이터에는 정수가 들어 있기 때문에 char로 형변환 해준 후 출력한다.
			//int로 읽는다는건 문자가 아니라 아스키코드로 받는것이다.
			System.out.print(ch);
		} //while문 구조 잘 기억하기, 파일 복사할 때 자주 사용
	}

}
