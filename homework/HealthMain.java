package com.homework;

public class HealthMain {

	public static void main(String[] args) {
		System.out.println("[헬스장 회원(1~10명)의 리스트를 작성하시오.]");
		Health ob = new Health();
		ob.set();
		ob.input();
		ob.print();
	}

}
