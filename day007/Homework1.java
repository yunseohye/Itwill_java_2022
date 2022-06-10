package com.day007;

import java.util.Scanner;

class Practice{
	String name;
	int kor, eng, tot;
	Scanner sc = new Scanner(System.in);

	public String input2() {
		System.out.print("이름?");
		name = sc.next();
		
		return name;
	}
	
	public void input() {
		
		System.out.print("국어 점수는?");
		kor = sc.nextInt();
		
		System.out.print("영어 점수는?");
		eng = sc.nextInt();
	}
	
	
	
	public int cnt() {
		
		tot = kor + eng;
		
		return tot;
	}
	
	public void print(String n, int t) {
		System.out.println("이름: "+ n + ", 총점: " + t);
	}
}

public class Homework1 {

	public static void main(String[] args) {
		
		Practice p = new Practice();
		String n = p.input2();
		p.input();
		int t = p.cnt();
		p.print(n,t);

	}

}
