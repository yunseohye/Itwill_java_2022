package com.score2;

import java.util.Scanner;

import com.score2.Record2;

public class Score2_1 {

	private int inwon;
	Record2_1[] rec;
	String[] title = {"국어?","영어?","수학?"};

	Scanner sc = new Scanner(System.in);

	public void set() {
		do {
			System.out.print("인원 수를 입력하시오."); 
			inwon = sc.nextInt();
		} while(inwon<1||inwon>10);

		rec = new Record2_1[inwon];

	}

	public void input() {

		for(int i = 0; i<inwon; i++) {
			rec[i] = new Record2_1(); 
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

	private void ranking() { 
		
		int i,j;
		
		for(i=0;i<inwon;i++) {
			rec[i].rank = 1;
		}
		
		for(i=0;i<inwon-1;i++) {
			for(j=i+1;j<inwon;j++) {
				
				if(rec[i].tot>rec[j].tot)
					rec[j].rank++;
				else if(rec[i].tot<rec[j].tot)
					rec[i].rank++;
			}
		}
		
	}
	
	 private String panjung(int jumsu) {
	      
	      String pan;
	      
	      //int를 10으로 나누면 소수점 아래는 생략되니까 원점수가 0으로 끝나지 않더라도 case 경우에 무조건 속하게 된다.
	      switch(jumsu/10) {
	      
	      case 10:
	      case 9:
	         pan = "수"; break;
	      case 8:
	         pan = "우"; break;
	      case 7:
	         pan = "미"; break;
	      case 6:
	         pan = "양"; break;
	      default:
	         pan = "가"; break;

	      }
	      return pan;
	   }

	public void print() {
		
		ranking();

		for(int i = 0; i<inwon;i++) {
			
			System.out.printf("%4s :", rec[i].name);
			
			for(int j=0;j<3;j++) {
			
				System.out.printf("%4d점(%s)", rec[i].score[j], panjung(rec[i].score[j]));
				
			
			}
			
			System.out.printf(" 총점 :%3d, ", rec[i].tot);
			System.out.printf("평균 :%3d, ", rec[i].ave);
			System.out.printf("등수 :%3d\n", rec[i].rank);
			
		}
	}
}	


