package com.score5;

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
				System.out.print("1.입력 2.출력 3.삭제 4.수정"
			+ " 5.학번 검색 6.이름 검색 7.종료: ");
				ch = sc.nextInt();
			}while(ch<1);

			switch(ch) {
			case 1:
				ob.input(); break;
			case 2:
				ob.print(); break;
			case 3:
				ob.delete(); break;
			case 4:
				ob.update(); break;
			case 5:
				ob.findHak(); break;
			case 6:
				ob.findName(); break;
			case 7:
				System.out.println("학사정보 시스템을 종료합니다.");
				System.exit(0); //console프로그램의 종료 수식, (1)은 취소
			}

		}

	}

}
