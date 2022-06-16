package com.day013;

import java.util.Scanner;

interface FruitA {
	
	String Won = "원";
	
	public int getPrice();
	public String getName();
	
}

interface ItemFruit extends FruitA{//인터페이스의 상속은 extends
	//메소드 3개 변수는 1개 사용가능
	public String getItems();
	
}

class Orange implements ItemFruit{

	@Override
	public int getPrice() {
		return 1000;
	}

	@Override
	public String getName() {
		return "오렌지";
	}

	@Override
	public String getItems() {
		return "과일";
	}
	
}

class Apple implements ItemFruit{

	@Override
	public int getPrice() {
		return 1500;
	}

	@Override
	public String getName() {
		return "사과";
	}

	@Override
	public String getItems() {
		return "과일";
	}
	
}


public class Test3 {
	
	public void packing(ItemFruit ob) {
		
		System.out.println(ob.getItems());
		System.out.println(ob.getName());
		System.out.println(ob.getPrice() + FruitA.Won);
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Test3 t = new Test3();
		
		System.out.print("1.오렌지, 2.사과?"); //1 or 2 입력
		int n = sc.nextInt();
		
		//ItemFruit ob;
		//ob = new Orange();
		//ob = new Apple();
		
		if(n==1)
			t.packing(new Orange());
		//매개변수를 이용해 new 객체를 준다.
		
		else if(n==2)
			t.packing(new Apple());
		else
			System.out.print("정확한 값을 입력하시오.");
		
		/*
		 int ob1;
		 
		 ob1 = 10;
		 System.out.println(ob1); //10
		 
		 ob1 = 20;
		 System.out.println(ob2); //20
		 */
		
	}

}
