package com.day018;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/*
File
파일 및 폴더를 관리할 수 있는 기능을 제공하는 클래스
파일 내용을 입출력하기위한 메소드는 존재하지 않는다.
내용이 아닌 겉모습만 컨트롤할 수 있음.
파일의 사이즈, 저장하려는 폴더의 존재 유무를 관리 할 수 있는 클래스
*/

public class Test11 {

	public static void main(String[] args) throws IOException {

		File f = new File("c:\\doc\\test.txt");
		//파일의 경로까지만 만들 수 있다.
		//파일을 만드는 것은 FileOutputStream
		
		System.out.println("파일명: "+ f.getName());
		System.out.println("파일 사이즈: " + f.length());
		System.out.println("파일경로: "+ f.getAbsolutePath());
		System.out.println("파일 표준경로: " + f.getCanonicalPath());
		//표준경로는 예외처리를 해줘야 함.throws IOException
		System.out.println("만든날: " + new Date(f.lastModified()));
		System.out.println("폴더경로: " + f.getParent());
		System.out.println("읽기속성: " + f.canRead());
		System.out.println("쓰기속성: " + f.canWrite());
		
	}

}
