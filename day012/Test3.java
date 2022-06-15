package com.day012;

import java.util.Calendar;
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {

		//오늘을 기준으로 1일 후 2022년 6월 15일 수요일
		//년도? 2022
		//월? 6
		//일? 14
		//몇일 뒤? 100
		//결과값) 만난 날: 2022년 6월 14일 화요일
		//결과값) 100일 후: 2022년 x월 x일 x요일 메소드 API에서 찾아서 풀기

		Calendar now = Calendar.getInstance();
		Scanner sc = new Scanner(System.in);

		String[] yoil = {"일","월","화","수","목","금","토"};

		int y,m,d,i,w,nal;

		do {

			System.out.print("년도?");
			y = sc.nextInt();
		}while(y<1);
		do {

			System.out.print("월?");
			m = sc.nextInt();
		}while(m<1||m>12);
		do {

			System.out.print("일?");
			d = sc.nextInt();
		}while(d<1||d>31);
		do {

			System.out.print("몇일 후?");
			nal = sc.nextInt();
		}while(nal<1);

		now.set(y, m-1, d);
		
		y = now.get(Calendar.YEAR); 
		m = now.get(Calendar.MONTH)+1; 
		d = now.get(Calendar.DATE);
		w = now.get(Calendar.DAY_OF_WEEK);
		
		System.out.printf("만난 날: %d년 %d월 %d일 %s요일\n", y,m,d,yoil[w-1]);
		
		now.add(Calendar.DATE, nal);
		
		y = now.get(Calendar.YEAR); 
		m = now.get(Calendar.MONTH)+1; 
		d = now.get(Calendar.DATE);
		w = now.get(Calendar.DAY_OF_WEEK);
		
		System.out.printf("만난 날: %d년 %d월 %d일 %s요일\n", y,m,d,yoil[w-1]);
	}

}
