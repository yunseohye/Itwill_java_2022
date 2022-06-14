package com.day012;

import java.util.Calendar;
import java.util.Scanner;

//만년달력 만들기

public class Test2_1 {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();
		Scanner sc = new Scanner(System.in);
		
		int y,m,i,week;
		
		y = cal.get(Calendar.YEAR); 
		m = cal.get(Calendar.MONTH);
		
		do {
			System.out.print("년도?");
			y = sc.nextInt();
		} while(y<1);
		
		do {
			System.out.print("월?");
			m = sc.nextInt();
		}while(m<1||m>12);
		
		cal.set(y, m-1, 1);
		
		week = cal.get(Calendar.DAY_OF_WEEK);
		
		int endDay = cal.getActualMaximum(Calendar.DATE);
		
		System.out.println(week);
		
		System.out.println("\n  일  월  화  수  목  금  토"); 
		System.out.println("------------------------------");
		
		for(i=0;i<week-1;i++) {
			System.out.print("    ");
		}
		
		for(i=1; i<=endDay;i++) {
			
			System.out.printf("%4d", i);
			
			week++;
			
			if(week%7==1) {
				System.out.println();
			}
			
		}
		
		if(week%7 != 1) {
			System.out.println();
		}
		
		System.out.println("------------------------------");
	}

}
