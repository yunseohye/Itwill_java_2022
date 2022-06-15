package com.day012;

class SuperTest{
	
	public int a = 10, b = 20;
	
	public void write() {
		System.out.println("슈퍼클래스 write()...");
	}
	
	public int hap() {
		return a + b; //10+20 = 30
	}
}

class SubTest extends SuperTest{
	
	public int b = 100, c = 200;
	
	public void print() {
		System.out.println("서브클래스 print()...");
	}

	@Override
	public int hap() {
		return a + b + c; //10+100+200 = 310
	}
	
	
}

public class Test10 {

	public static void main(String[] args) {

		SubTest ob1 = new SubTest();
		
		System.out.println("ob1.b: "+ ob1.b); //100
		
		SuperTest ob2 = ob1;
		//UPCAST 자식을 부모화 시킴 변수를 UPCAST하면 부모의 변수를 사용할 수 있다.
		//부모가 자식보다 큰개념이기 때문에 형변환을 해주지 않아도 된다.
		//SuperTest ob2 = (SuperTest)ob1;
		
		System.out.println("ob2.b: "+ ob2.b); //20
		
		System.out.println("합: " + ob2.hap()); //310
		//메소드를 부모와 나 둘 다 가지고 있으면 내것이 실행이 된다.
		
		ob2.hap(); 
		//310의 값을 가지지만 출력기가 없기 때문에 console창에 보이지 않음.
		//에러는 나지 않는다.
		
		ob2.write();
		//자식에 write가 없기 때문에 부모의 것으로 출력
		
		//ob2.print(); 상속의 공식: 부모는 자식의 값을 쓸 수 없다. 
		
		((SubTest)ob2).print();
		//부모를 자식화 시킨 것 Downcast
		
	}

}



















