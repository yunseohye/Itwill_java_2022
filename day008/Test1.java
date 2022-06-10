package com.day008;

import java.util.Scanner;

class Circle{
	
	private int r; //외부에서 접근하지 못함.
	
	public void setData(int r) { //setData(int r, Circle this)
	
		this.r = r;
	
	//private의 값(사용자가 준 반지름의 값)을 출력하기 위해 우회도로를 퍼블릭 메소드로 만들어 반지름의 값을 넣어줌
	/*
	this : 클래스 자기자신 (여기서는 Circle임), ME
	같은 메소드 안에서 다른 변수 값들끼리 혼동될 때 사용한다.	
	private으로 선언한 변수를 초기화할 때 가장 많이 사용한다.
	*/
	}
	
	public double area() { //매개변수가 X, area(Circle this)
		
		return this.r*this.r*3.14;
		// this가 생략이 가능 이 메소드에는 r이 혼동될 일이 없기 때문에 
		
	}
	
	public void write(double a) { //write(double a, Circle this)
		System.out.println("반지름: "+ this.r);
		System.out.println("넓이: "+ a);
	}
	
}

public class Test1 {

	public static void main(String[] args) {
		
		Circle ob = new Circle();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반지름? ");
		int r = sc.nextInt();
		
		//ob.r = 20; r이 private이라 접근 불가
		
		ob.setData(r);               //setData(r,ob)
		double a = ob.area();		 //area(ob)
		ob.write(a);				 //write(a,ob)
		
	}

}
