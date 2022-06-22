package com.day018;

import java.io.InputStreamReader;
import java.io.Reader;

/*
InputStreamReader
: 1byte의 stream을 2byte의 stream으로 변환시켜주는 것
: Bridge Stream이라고도 말함. 다리의 역할을 하기 때문
(즉, 자기가 데이터를 가지고 있을수는 없다.)
*/
public class Test3 {

	public static void main(String[] args) throws Exception {

		int data;
		System.out.print("문자열 입력?");
		
		Reader rd = new InputStreamReader(System.in);
		//사용자가 입력한 값을 읽어서 가지고 있는 것.
		
		//reader의 짝 = writer
		
		while((data=rd.read()) != -1) {
			char ch = (char)data;
			System.out.print(ch);
		} //while문 구조 잘 기억하기, 파일 복사할 때 자주 사용
	}

}
