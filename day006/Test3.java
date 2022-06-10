package com.day006;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		System.out.println("[10명 이내의 이름과 점수를 입력 받아 석차를 구하시오]\n");

		Scanner sc = new Scanner(System.in);

		String[] name; //배열에서는 문자이기 때문에 기본값 : null 초기화
		int[] score; //배열에서는 숫자이기 때문에 기본값 : 0 초기화
		int[] rank;

		int i,j, temp1, inwon;
		String temp2;

		do {
			System.out.print("[1~10명] 사이의 인원 수를 입력하시오.");
			inwon = sc.nextInt();
		} while(inwon<1||inwon>10);

		//배열의 메모리를 할당함(배열의 객체 생성)
		name = new String[inwon];
		score = new int[inwon];
		rank = new int[inwon];
		
		for(i=0;i<inwon;i++) {
			System.out.print((i+1) + "번째 이름 : ");
			name[i] = sc.next();

			System.out.print("점수 : ");
			score[i] = sc.nextInt();

		}
		
		//석차(rank)의 값을 1로 초기화 작업을 해준다. (석차에는 0등이 없음)
		for(i=0;i<inwon;i++) {
			rank[i] = 1;
		}
		
		//Selection sort(석차 계산)
		for(i=0;i<inwon-1;i++) { 
			
			for(j=i+1;j<inwon;j++) {

				//낮은 점수의 rank에 +1을 해준다.
				//단일if문으로 하면 동점이 나왔을때 등수가 같은 값이 나오지 않기 때문에
				//if, else if문으로 값을 넣어주어야 동점이 나온다.
				if(score[i]>score[j]) {
					rank[j]++;
				} else if(score[i]<score[j]) {
					rank[i]++;
				}
				
				
			}

		}
		
		//출력
		for(i=0;i<inwon;i++) {
			System.out.printf("\n%6s : %4d점 %4d등\n",name[i],score[i],rank[i]);
		}

	}

}
