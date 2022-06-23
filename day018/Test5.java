package com.day018;

import java.io.FileInputStream;

/*
파일 입출력
FileInputStream(사용빈도 높음)
FileOutourStrem
*/

//파일의 값을 불러와 읽어 내는 것
public class Test5 {

	public static void main(String[] args) {

		try {
		
			FileInputStream fis = new FileInputStream("c:\\doc\\test.txt");
			
			int data;
			
			while((data=fis.read()) !=-1) {
				//반환값이 int인경우 무조건 아스키값으로 읽어와야함.
				
				//System.out.print((char)data); 파일은 바이트로 읽어내면 값이 깨짐
				System.out.write(data); //엔터가 없는 마지막줄은 출력이 되지 않음.
				System.out.flush();//마지막에 엔터가 없는 줄 까지 출력해줘
			}
			
			fis.close();
			
		} catch (Exception e) {

		}
		
	}

}
