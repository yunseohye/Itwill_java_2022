package com.day018;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

//파일은 파일을 만들 수 없다.

public class Test8 {

	public boolean filecopy(String str1, String str2) {

		//이부분은 꼭 기억해두기!
		File f = new File(str1);
		if(!f.exists()) {
			return false;
		}
		//기억해두기~~~
		
		try {
			
			FileInputStream fis = new FileInputStream(str1); 
			//str1자리에 f를 줘도 같은 값이 출력된다.
			FileOutputStream fos = new FileOutputStream(str2);

			int data;
			byte[] buffer = new byte[1024];

			while((data=fis.read(buffer, 0, 1024)) !=-1) {

				fos.write(buffer, 0, data);

			}

			fos.close();
			fis.close();

		} catch (Exception e) {
			System.out.println(e.toString());
			return false;
		}

		return true;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Test8 ob = new Test8();
		String str1, str2;

		System.out.print("원본파일? ");
		str1 = sc.next();
		
		System.out.print("대상파일? ");
		str2 = sc.next();

		if(ob.filecopy(str1, str2)) {
			System.out.println("파일복사 성공!!");
		} else {
			System.out.println("파일복사 실패!!");
		}

	}

}
