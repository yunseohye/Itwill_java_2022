package com.score1;

import java.util.Scanner;

public class Score {

	private int inwon;
	Record[] rec;

	Scanner sc = new Scanner(System.in);

	public void set() { //사용자에게 인원 수를 받을 코드

		do {
			System.out.print("인원 수를 입력하시오."); 
			inwon = sc.nextInt();
		} while(inwon<1||inwon>10); //1~10사이의 값만 받을 수 있음
		//while이 false가 되어야 값이 빠져나올 수 있음.
		//while이 true일 경우 다시 인원수를 입력하라는 문자로 돌아간다.

		rec = new Record[inwon];
		//Record[] rec; 배열의 객체를 생성해준 것임.
	}

	public void input() {

		//rec[i] = new Record();
		//밖에 있으면 한개의 데이터 안에 세 명의 데이터가 들어가서
		// 맨 마지막의 값이 나올 것이다.

		String[] title = {"국어?","영어?","수학?"};

		for(int i = 0; i<inwon; i++) {
			rec[i] = new Record(); //rec의 0번 째에 레코드를 생성하여 값을 넣어주어라.

			System.out.print("이름?");
			rec[i].name = sc.next();

			for (int j=0; j<3; j++) {

				System.out.print(title[j]); 
				rec[i].score[j] = sc.nextInt();


				rec[i].tot += rec[i].score[j];

			}

			rec[i].ave = rec[i].tot / 3;
			//평균은 반복문이 전부 다 돌고 난 값을 계산하는 것이라
			//for문 바깥에 써주어야 한다.
		}

	}

	private void ranking() { 
	
		int i,j;
		
		//rank 초기화
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

	public void print() {
		
		ranking();
		//위치가 달라지면 안된다. 밑으로 내려가면 이 값을 읽을 수가 없음

		for(int i = 0; i<inwon;i++) {
			
			System.out.printf("%6s :", rec[i].name);
			
			for(int j=0;j<3;j++) {
			
				System.out.printf("%3d", rec[i].score[j]);
			
			}
			
			System.out.printf(" 총점 :%3d, ", rec[i].tot);
			System.out.printf("평균 :%3d, ", rec[i].ave);
			System.out.printf("등수 :%3d\n", rec[i].rank);
			
		}
	}
}
/*
int a; a라는 변수 안에는 int(정수) 형태의 값이 한 개 들어감.

Record rec; 
rec라는 변수 안에는 Record 형태의 데이터 7개를 저장한다.
현재 Record 안에는 문자형태의 변수 하나, int형태의 score 3개, 
int 형태의 tot, ave, rank 총 7개의 값을 가지고 있다.
rec는 int와 다르게 값이 7개가 있기 때문에 7개의 값을 저장할 수 있다.
 */

/*
 Record[] rec;
배열을 이용하여 공간을 3개 만들어 둔 것이다.
Record 클래스를 배열안에 넣으려면 객체를 생성해야만 사용할 수 있다. -> new Record();
배열 안에 레코드라는 클래스를 3개 저장한 것이고 레코드 하나당 7개의 값을 가지고 있다.

int[] a;
배열을 이용하여 공간을 3개 만든것임.
int 형태의 값을 정수 형태로 배열 안에 넣으면 된다. 
 */

//기본값을 public void로 지정, 나중에 아닌 것 같다 싶으면 교체하면 된다.