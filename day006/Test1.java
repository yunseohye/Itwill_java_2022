package com.day006;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		System.out.println("[10명 이내의 이름과 점수를 입력 받은 후\n"
				+ "점수가 높은 사람 순으로 나열하시오.]\n");
		//이름 : string, 점수 : int이기 때문에 배열을 따로 만들어줘야한다.

		//스캐너가 메모리를 할당 받았다.(스캐너의 객체를 생성했다.)
		Scanner sc = new Scanner(System.in);

		String[] name;
		int[] score;
		//null값 들어가 있음, 갯수를 지정하지 않았고 배열만 선언해놨기 때문

		int i,j, temp1, inwon;
		String temp2;

		do {
			System.out.print("[1~10명] 사이의 인원 수를 입력하시오."); //3
			inwon = sc.nextInt();
		} while(inwon<1||inwon>10);

		//배열의 메모리를 할당함(배열의 객체 생성)
		name = new String[inwon];
		score = new int[inwon];

		for(i=0;i<inwon;i++) {
			System.out.print((i+1) + "번째 이름 : ");
			name[i] = sc.next();

			System.out.print("점수 : ");
			score[i] = sc.nextInt();

		}

		//Selection sort(내림차순 정렬)
		for(i=0;i<inwon-1;i++) { //name.length와 score.length를 입력해도 상관은 없다.
			
			for(j=i+1;j<inwon;j++) {

				if(score[i]<score[j]) { //비교는 무조건 숫자만 할 수 있기 때문에 score

					temp1 = score[i];
					score[i] = score[j];
					score[j] = temp1;
					
					temp2 = name[i];
					name[i] = name[j];
					name[j] = temp2;

				
				}

			}

		}
		
		//출력 (but 확장 for문 사용 불가 name, score 두 군데서 값을 꺼내와야함)
		//확장 for문은 한 개의 배열에서만 사용할 수 있다. 두 개 이상의 배열에서 값을 동시에 가져올 수 없다.
		for(i=0;i<inwon;i++) {
			System.out.printf("%6s : %4d점\n",name[i],score[i]);
		}

	}

}
