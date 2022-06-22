package com.day018;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class Test4 {

	public static void main(String[] args) throws Exception {

		int data;
		
		System.out.print("문자열 입력?");
		Reader rd = new InputStreamReader(System.in); 
		//System.in 파일, 외부컴퓨터에서 보내는 값, 키보드에서 입력하는 값 모두 담아낼 수 있음.
		
		Writer wr = new OutputStreamWriter(System.out);
		
		while((data=rd.read())!=-1) { //값을 읽어서
			
			wr.write(data); //내보낸다.
			wr.flush(); //flush를 사용해줘야 콘솔창에서 입력한 값이 출력됨.
			
		}
		
	}

}
