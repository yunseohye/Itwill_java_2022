package com.day018;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Test10 {

	public static void main(String[] args) {

		try {
		
			FileOutputStream fos = new FileOutputStream("c:\\do c\\out2.txt");
			PrintStream ps = new PrintStream(fos);
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			String str;
			
			System.out.print("문자열을 입력하세요.");
			
			while((str=br.readLine())!=null) {
				ps.println(str);
			}
			
			ps.close();
			fos.close();
			
		} catch (Exception e) {

		}
		
		
		
		
		
		
		
	}

}
