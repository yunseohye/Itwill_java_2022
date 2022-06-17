package com.score4;

import java.util.Scanner;

public class ScoreMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Score ob = new ScoreImpl();
		//자기 자신의 메소드가 아닌 인터페이스를 오버라이드 했기 때문에 

		int ch;

		while(true) {

			do {
				System.out.println("학사 정보 입력");
				System.out.print("1.입력 \n2.출력 \n3.학번 삭제 \n4.학번 검색"
			+ " \n5.이름 검색 \n6.총점 내림차순 정렬 \n7.학번 오름차순 정렬 \n8.종료");
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
				ob.deleteHak(); break;
			case 4:
				ob.searchHak(); break;
			case 5:
				ob.searchName(); break;
			case 6:
				ob.descSortTot(); break;
			case 7:
				ob.ascSorthak(); break;
			default:
				System.out.println("학사정보 시스템을 종료합니다.");
				System.exit(0); //console프로그램의 종료 수식, (1)은 취소
			}

		}

	}

}
