package com.homeworkMap;

import java.util.Scanner;

import com.homeworkMap.Score;
import com.homeworkMap.ScoreImpl;

public class ScoreMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Score ob = new ScoreImpl();

		int ch;

		while(true) {

			do {
				System.out.println("회원정보 입력");
				System.out.print("1.회원정보 입력 2. 회원정보 출력 3. 회원정보 삭제 4. 회원정보 수정"
						+ " 5.회원번호 검색 6. 회원이름 검색 7.종료");
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
				ob.updateID(); break;
			case 5:
				ob.findID(); break;
			case 6:
				ob.findName(); break;
			default:
				System.out.println("회원정보 시스템을 종료합니다.");
				System.exit(0); //console프로그램의 종료 수식, (1)은 취소
			}

		}
		
	}

}
