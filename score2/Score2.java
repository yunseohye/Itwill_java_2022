package com.score2;

import java.util.Scanner;

import com.score2.Record2;

public class Score2 {

	private int inwon;
	Record2[] rec;
	String[] title = {"국어?","영어?","수학?"};

	Scanner sc = new Scanner(System.in);

	public void set() {
		do {
			System.out.print("인원 수를 입력하시오."); 
			inwon = sc.nextInt();
		} while(inwon<1||inwon>10);

		rec = new Record2[inwon];

	}

	public void input() {

		for(int i = 0; i<inwon; i++) {
			rec[i] = new Record2(); 
			System.out.print("이름?");
			rec[i].name = sc.next();

			for (int j=0; j<3; j++) {

				System.out.print(title[j]); 
				rec[i].score[j] = sc.nextInt();
				rec[i].tot += rec[i].score[j];

			}

			rec[i].ave = rec[i].tot / 3;

		}

	}

	private void grading() { 
		
		for(int i = 0; i<inwon; i++) {

			for (int j=0; j<3; j++) {

				if(rec[i].score[j]>=90) {
					rec[i].grade[j] = "A";
				} else if(rec[i].score[j]>=80) {
					rec[i].grade[j] = "B";
				} else if(rec[i].score[j]>=70) {
					rec[i].grade[j] = "C";
				} else if(rec[i].score[j]>=60) {
					rec[i].grade[j] = "D";
				} else {
					rec[i].grade[j] = "F";
				}

			}	
		}

	}

	public void print() {

		grading();

		for(int i = 0; i<inwon;i++) {

			System.out.printf("%6s :", rec[i].name);

			for(int j=0;j<3;j++) {

				System.out.printf("%3d ", rec[i].score[j]);
				System.out.printf("(학점:%s) ", rec[i].grade[j]);

			}

			System.out.printf("총점 :%4d, ", rec[i].tot);
			System.out.printf("평균 :%3d\n", rec[i].ave);

		}
	}	

}
