package com.day007;

import java.io.IOException;

class Ascii{
	char ch, result;
	
	public void input() throws IOException {
		
		System.out.print("한 개의 문자를 입력하시오.");
		ch = (char) System.in.read();
		
	}
	public void cnt() {
		
		result = ch >= 65 && ch <= 90?(char)(ch+32):(ch>='a' && ch <= 'z'?(char)(ch-32):ch);
		
		System.out.println(ch + " : " + result);
		
	}
	
}


public class Homework5 {

	public static void main(String[] args) throws IOException {

		Ascii a = new Ascii();
		a.input();
		a.cnt();
	}

}
