package com.homeworkList;

import java.util.Scanner;

public class ScoreMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Score ob = new ScoreImpl();

		int ch;

		while(true) {

			do {
				System.out.println("회원정보 입력");
				System.out.print("1.회원정보 입력 \n2.회원정보 출력 \n3.회원정보 삭제 \n4.회원번호 검색"
			+ " \n5.이름 검색 \n6.PT횟수별 내림차순 정렬 \n7.회원번호별 오름차순 정렬 \n8.종료");
				System.out.print("\n---------------------------\n");
				System.out.print(":");
				ch = sc.nextInt();
			}while(ch<1);

			switch(ch) {
			case 1:
				ob.input(); break;
			case 2:
				ob.print(); break;
			case 3:
				ob.deleteID(); break;
			case 4:
				ob.searchID(); break;
			case 5:
				ob.searchName(); break;
			case 6:
				ob.descSortPT(); break;
			case 7:
				ob.ascSortID(); break;
			default:
				System.out.println("회원정보 시스템을 종료합니다.");
				System.exit(0); //console프로그램의 종료 수식, (1)은 취소
			}

		}

	}
		
	}
	
