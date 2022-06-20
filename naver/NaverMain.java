package com.naver;

import java.util.Scanner;

public class NaverMain {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);

		Naver ob = new NaverImpl();

		int ch;

		while(true) {

			do {
				System.out.println("네이버 회원가입");
				System.out.print("1.회원가입 \n2.정보출력 \n3.회원전체출력 \n4.아이디검색 \n5.종료");
				System.out.print("\n--------------------------------------------------\n");
				System.out.print(":");
				ch = sc.nextInt();
			} while(ch<1);

			try {
				switch(ch) {
				case 1:
					ob.input(); break;
				case 2:
					ob.print(); break;
				case 3:
					ob.ascSortid(); break;
				case 4:
					ob.searchid(); break;
				default:
					System.out.println("회원가입 시스템을 종료합니다.");
					System.exit(0);
				}
			}

			catch (Exception e) {

				System.out.println(e.toString());

			}
		}
	}
}
