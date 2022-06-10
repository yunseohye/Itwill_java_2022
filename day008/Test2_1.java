package com.day008;

public class Test2_1 {
	
	public static int a = 10; 
	
	public int b = 20;
	
	public void write() { 
		System.out.println("class변수: "+ a);
		System.out.println("instance변수: "+ b);
	}
	
	public static void print() {
		System.out.println("class변수: "+ a);
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("class변수: " + a);
		System.out.println("class변수: " + Test2_1.a); 
	
		print(); 	
		Test2_1.print(); 
		 
		Test2_1 ob = new Test2_1();
		
		System.out.println(ob.a);
		System.out.println(Test2_1.a);
		ob.write();
		ob.print(); 
		Test2_1.print();
	
		System.out.println(ob.a); //10
		System.out.println(ob.b); //20
		System.out.println("-----------------");
		Test2_1 ob1 = new Test2_1();
		
		ob1.a = 100;
		ob1.b = 200;
		System.out.println(ob1.a); //100
		System.out.println(ob1.b); //200
		
		System.out.println("-----------------");
		
		Test2_1 ob2 = new Test2_1();
		System.out.println(ob2.a); //100
		System.out.println(ob2.b); //20
		
		System.out.println("-----------------");
		
		Test2_1 ob3 = new Test2_1();
		System.out.println(ob3.a); //100
		System.out.println(ob3.b); //20
	
	
	}

}
