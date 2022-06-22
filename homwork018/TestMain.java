package com.homwork018;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		Score ob = new TestImpl();

		int ch;

		while(true) {

			do {
				System.out.println("학사 정보 입력");
				System.out.print("1.입력 2.출력 3.종료 => ");
				ch = sc.nextInt();
			}while(ch<1);

			switch(ch) {
			case 1 :
				ob.input(); break;
			case 2 :
				ob.print(); break;
			default:
				System.out.println("학사정보 시스템을 종료합니다.");
				FileOutputStream fos = new FileOutputStream("c:\\doc\\score.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos);	
				System.exit(0);

			}
		} 

	}
}
