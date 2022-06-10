package com.day007;

import java.util.Scanner;

class Tan{
	
	int w,h,a;
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("밑변의 값은 무엇인가?");
		w = sc.nextInt();
		
		System.out.print("높이의 값은 무엇인가?");
		h = sc.nextInt();
	}
	
	public int cnt() {
		
		a = ( w * h ) / 2;
		
		return a;
	}
	
	public void print(int a) {
		System.out.println("넓이: " + a);
	}
	
	
}

public class Homework2 {

	public static void main(String[] args) {
		
		Tan t = new Tan();
		t.input();
		int sum = t.cnt();
		t.print(sum);
				
		
		
	}

}
