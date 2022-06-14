package com.day011;

public class Test2 {

	public static void main(String[] args) {
		
		String ob1 = "Seoul"; //첫글자가 대문자, Heap영역에 저장이 됨.
		String ob2 = "Seoul";
		//string은 주소값을 비교할 필요가 없고 데이터 값을 비교해야 하는것이다.
		String ob3 = new String("Seoul"); 
		//class이기 때문에 객체 생성이 가능. 
		//new라는 명령어가 Heap영역에 새로운 주소값을 가진 "seoul"을 복사한것임.
		
		
		System.out.println("ob1==ob2: "+ (ob1==ob2)); 
		//true
		System.out.println("ob1==ob3: "+ (ob1==ob3)); 
		//false 데이터를 비교하는 것이 아닌 주소값을 비교한 것임.
		//ob3이 new를 이용해 새로운 객체를 생성했기 때문에 주소값이 다르다.
		//String은 데이터를 비교하려면 ==을 사용하면 안된다.
		System.out.println("ob1.equals(ob3): " + ob1.equals(ob3));
		//true, String은 equals로 비교해야 한다.
		//객체가 담고 있는 데이터가 동일하기 때문에 true가 나온다.
		//String의 equals를 비교 하는 것이기 때문에 string을 찾아가 데이터 값을 비교함
		//object의 equls는 주소를 비교하지만 String의 equals는 value값을 비교함
		//주소를 가지고 찾아가서 저장되어있는 데이터를 비교하여라!
		
		ob2 = "korea";
		System.out.println("ob1==ob2: "+ (ob1==ob2)); //false
		
		ob2 = "japan";
		System.out.println("ob1==ob2: "+ (ob1==ob2)); //false
		
		ob2 = "china";
		System.out.println("ob1==ob2: "+ (ob1==ob2)); //false
		
		ob2 = "Seoul";
		System.out.println("ob1==ob2: "+ (ob1==ob2)); //true
		//기존의 값으로 다시 돌아가기 때문에 true값이 나온다.
		
		System.out.println(ob2);
		//String이기 때문에 저장된 데이터값이 string이 나옴
		//자료형을 흉내내는 것이기 때문
		System.out.println(ob2.toString());
		//object의 toString을 오버라이드 했기 때문에 데이터 값이 나옴.
	}
	
}


/*
[String] -> class
: String은 8가지의 자료형 중 하나가 아니고 class이다.
: 저장할 데이터가 너무 크기 때문에 stack영역에는 저장할 수 없고 
: Heap영역에서만 저장이 가능한다. but 사용빈도가 너무 높기 때문에
자료형처럼 사용한 것이다.
: String은 불변의 법칙을 가지고 있다. [Call By Reference]
(한 번 만들어 놓은 것은 또 만들 수 없다. 또 만들지도 않음. static과는 다름)
*/
