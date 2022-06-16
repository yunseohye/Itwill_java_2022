package com.day013;

/*
 Interface
 1. 추상클래스의 일종으로 선언만 있고 정의가 없다.(내부적으로 상속관게 유지)
 2. final변수만 정의할 수 있다. 기본적으로 static임
 3. 인터페이스를 구현할려면 implements를 사용한다.
 (내부적으로는 상속이지만 인터페이스에서는 구현이라고 표현한다. extends -> implements)
 4. 하나 이상의 인터페이스를 implements한 클래스는 인터페이스의 모든 메소드를
 	재정의 해야 한다.
 5. 인터페이스가 다른 인터페이스를 상속받을 수 있으며 이때는 extends를 사용한다.
 6. 클래스와는 다르게 인터페이스는 다중 상속이 가능하다.
 */

interface Fruit{//class라고 작성하면 안되지만 class이기 때문에 첫글자가 대문자 Fruit
	
	String won = "원"; 
	//public static final이 생략되어있다.
	//public - 누군가 사용해야하기 때문에 무조건 public으로 배포
	//static - won이 기울어져있음
	//final - 값을 넣지 않으면 컴파일 오류가 난다.
	
	int getPrice(); //public, abstract(추상메소드) 생략
	public String getName(); // abstract 생략 굳이 타이핑 하지 않아도 된다.
	
}

class FruitImpl implements Fruit {

	//abstract, 메소드 자체가 추상 메소드이기 때문에 무조건 오버라이드 해야한다.
	@Override
	public int getPrice() {
		return 1000;
	}

	@Override
	public String getName() {
		return "사과";
	}
	
	public String getItems() {
		return "과일";
	}
	
}


public class Test1 {

	public static void main(String[] args) {

		FruitImpl ob1 = new FruitImpl();
		
		System.out.println(ob1.getItems());
		System.out.println(ob1.getName());
		System.out.println(ob1.getPrice() + Fruit.won);
		
		Fruit ob2 = ob1;
		//내부적으로는 클래스이기 때문에 자식이 부모에게 들어가는것. 에러없음
		
		System.out.println(ob2.getName());
		//ob2는 부모가 됬지만 getName은 부모, 자식 둘 다 가지고 있기 때문에 자식값을 출력
		//System.out.println(ob2.getItems());
		//ob2는 부모인데 getItems()은 자식한테만 있기 때문에 컴파일 오류
		
	}

}
