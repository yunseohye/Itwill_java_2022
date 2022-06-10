package com.day007;

import java.util.Scanner;

class Dan {
	int i,j, su;
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("단 입력 : ");
		su = sc.nextInt();
	}
	
	public void cnt() {
		
		for(int i=1;i<=9;i++) {

			System.out.println(su + "*"+ i + "=" + (su*i));
		
		}
	}
	
}

public class Homework3 {

	public static void main(String[] args) {

		Dan d = new Dan();
		
		d.input();
		d.cnt();
		
	}

}
