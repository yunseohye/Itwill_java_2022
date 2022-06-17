package com.day014;

import java.util.Vector;

/*
Collection 
: 데이터를 저장하는 공간, 배열의 단점을 커버하기 때문에 편리함. 사용빈도 높음

배열의 단점
: 크기를 반드시 정해야 함. 
: 크기가 정해지면 늘리거나 줄이거나 중간에 삽입을 할 수 없다.
: 숫자일때만 정렬이 가능, 문자일때는 정렬이 어려움

인터페이스를 통해 구현한 클래스를 사용하는 것인데 이미 만들어져있는 클래스를 사용한다.
구현되어진 클래스에 객체만 생성하여 값을 넣어주면 된다.
list(interface) - ArrayList(class), Vector(class)...
Map(interface) - HashMap(class), HashTable(class)...
*/
public class Test1 {
	
	public static void main(String[] args) {

		//<E> : Generic 어떤 자료형을 가질지 자료형을 적는 것임.
		//collection의 기본 자료형은 Object이다.
		Vector v = new Vector<>(); //Generic을 생략했기 때문에 Vector의 자료형이 Object이다.
		
		v.add("서울"); //String클래스, 
		v.add(30); //Integer클래스
		v.add('A'); //Character 클래스
		//클래스의 상위 부모는 Object, UPCAST가 자동으로 됨, object에 값을 넣음
		
		String str = (String)v.get(0); //downcast
		System.out.println(str);
		
		Integer i = (int)v.get(1); //뒤에 값은 Integer, int 둘 다 가능, 저장장소만 다름
		System.out.println(i);
		
		Character c = (char)v.get(2); //뒤에 값은 Character. ch 둘 다 가능
		System.out.println(c);
		
		System.out.println();
		
		for(int j=0;j<v.size();j++) {
			
			Object ob = v.get(j);
			
			if(ob instanceof String) {
				str = (String)ob;
				System.out.println(str);
			} else if(ob instanceof Integer) {
				i = (int)ob;
				System.out.println(i);
			} else if(ob instanceof Character) {
				c = (char)ob;
				System.out.println(c);
			}
			
		}
		
	}

}
