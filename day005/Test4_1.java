package com.day005;

import java.util.Scanner;

public class Test4_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num[] = new int[5];
		int i, j, temp;
		
		System.out.println("[정수 5개를 입력하시오.]");
		
		for(i=0;i<num.length;i++) {
			num[i] = sc.nextInt();
		}
		
		System.out.print("Source Data: ");
		for(i=0;i<num.length;i++) {
			System.out.printf("%4d", num[i]);
		}
		System.out.println();

		for(i=0;i<num.length-1;i++) {

			for(j=i+1;j<num.length;j++) {

				if(num[i]>num[j]) {

					temp = num[i];
					num[i] = num[j];
					num[j] = temp;

				}

			}

		} System.out.print("Source Data: ");
		for(int su : num) { //확장 for문 (for each)
			//int su : num에서는 꼭 콜론 사용해야한다!!!!
			System.out.printf("%4d", su);
		}
		System.out.println();
		//배열 구조를 가진 것에서만 int su : num라는 식을 사용해줄 수 있다.
		
		
	}

}
