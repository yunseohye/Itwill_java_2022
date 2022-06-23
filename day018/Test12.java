package com.day018;

import java.io.File;
import java.io.FileOutputStream;

public class Test12 {

	public static void main(String[] args) {

		String str1 = "c:\\doc\\temp\\java\\test1.txt";

		/*
		방법1 temp폴더 만들기 (사용빈도 낮음)
		String path = str1.substring(0,str1.lastIndexOf("\\"));
		//System.out.println(path); 변수 값 검증

		File f = new File(path);

		실제로는 이 부분만 많이 사용한다.
		if(!f.exists()) {
			f.mkdirs();
		}
		mkdirs로 사용해야함. mkdir쓰지않게 유의할 것
		 */

		//방법2
		File f = new File(str1);

		if(!f.getParentFile().exists()) {
			f.getParentFile().mkdirs();
		}

		try {
			
				FileOutputStream fos = new FileOutputStream(str1);

				System.out.println("문자열?");

				int data;

				while((data=System.in.read())!=-1) {
					fos.write(data);
					fos.flush();
				}

			fos.close();
			
		} catch (Exception e) {

		}

	}

}
