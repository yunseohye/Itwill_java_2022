package com.day018;

import java.io.FileOutputStream;

//파일로 값을 내보내는 것.

public class Test6 {

	public static void main(String[] args) {

		try {

			FileOutputStream fos = new FileOutputStream("c:\\doc\\out.txt");

			int data;

			System.out.print("문자열 입력?");

			while((data=System.in.read())!=-1) { //사용자가 키보드로 입력한 값을 1바이트로 저장해서

				fos.write(data); //값을 1바이트씩 출력한다.
				fos.flush(); //무조건 엔터 쳐줘야 값이 끝까지 출력이 된다.
			}
			
			fos.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
