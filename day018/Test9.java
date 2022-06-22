package com.day018;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Test9 {

	public static void main(String[] args) {

		try {
			
			FileInputStream fis = new FileInputStream("c:\\doc\\test.txt");
			
			BufferedReader br = new BufferedReader(
					new InputStreamReader(fis));
			
			String str;
			//string은 초기값이 null이기 때문에 null사용
			while((str=br.readLine())!=null) {
				System.out.println(str);
			}
			
			fis.close();
			
		} catch (Exception e) {

		}
		
		
		
		
		
		
		
		
	}

}
