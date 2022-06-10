package com.day006;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		System.out.println("[주민번호 출력하기]\n");
		
		Scanner sc = new Scanner(System.in);
		
		//index : 01234567890123
		//jumin : 900110-2053126 
		//chk   : 234567 892345
		
		//주민번호의 공식
		//합 = (9*2)+(0*3)+.....+(2*5)
		//합 = 11-(합%11)
		//합 = 합%10
		//합 == 6
		
		String jumin; //사용자가 입력한 주민번호를 받을 변수
		int[] chk = {2,3,4,5,6,7,8,9,2,3,4,5};
		int i, tot, su;
		
		System.out.print("주민번호를 입력하시오.[xxxxxx-xxxxxxx]");
		jumin = sc.next();
		
		if(jumin.length() != 14) {
			System.out.println("입력한 값이 오류입니다.");
			return; // stop의 의미를 가짐
		} //값이 false가 되어야 빠져나올 수 있다. true이면 위의 값이 출력됨
		
		tot = 0;
		
		for(i=0;i<12;i++) { // "-"와 맨 마지막 값을 제외하기 때문에 i<12이다.
			
			if(i>=6) { //뒷자리
				tot += chk[i]*Integer.parseInt(jumin.substring(i+1, i+2));
			} else { //생년월일
				tot += chk[i]*Integer.parseInt(jumin.substring(i, i+1));
			}
			
		}
		
		su = 11 - (tot % 11);
		su = su % 10;
		
		if(su == Integer.parseInt(jumin.substring(13))) {
			System.out.println("대한민국 국민입니다.");
		} else {
			System.out.println("넌 누구냐?");
		}
		
	}

}

//배열 외의 모든 class의 method에 있는 length는 괄호가 있다.

/*
String str = "seoul korea";
 	index  :  012345678910
내부적으로 index가 생성됨
				
System.out.println(str.substring(0, 3)); //seo
System.out.println(str.substring(6, 8)); //ko 
System.out.println(str.substring(6)); //korea 6번째 index에서 부터 끝까지
*/