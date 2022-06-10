package com.day007;

import java.util.Scanner;

class Grade {
	int a, b, temp, sum;
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두 수를 입력 받아 작은 수에서 큰 수 까지의 합을 구하시오.");
		System.out.print("첫 번째 수를 입력하시오.");
		a = sc.nextInt();
		System.out.print("두 번째 수를 입력하시오.");
		b = sc.nextInt();
		
	}
	public void cnt() {
		if(a>b) {
			temp = a;
			a = b;
			b = temp;		
		}
		for (int k = a; k<=b ; k++) {
			sum = sum + k;
		} System.out.println(a + "부터" + b + "까지의 합 : " + sum);

	}
	
}

public class Homework4 {

	public static void main(String[] args) {

		Grade g = new Grade();
		
		g.input();
		g.cnt();
		
	}

}
