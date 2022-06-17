package com.day015;

import java.util.Hashtable;
import java.util.Iterator;

/*
 Map<key,value> key는 자료형을 사용한다.
 value는 대부분 class사용함.
 class는 값을 비교하기 어렵기 때문에 
 key값을 사용해 매칭되는 데이터를 찾아줌. 
 map은 key와value라를 데이터값을 저장함. list는 하나의 value값을 가짐.
 Hashtable(class) - Vector와 비슷, 동기화를 함 속도가 느림
 HashMap(clasS) - ArrayList와 비슷, 동기화를 안함 속도가 빠름
 
 key는 중복값을 가질 수 없다.
 key의 자료형이 set이라는 인터페이스, collection인데 set은 중복값을 허용하지 않는다.
 결과적으로 key는 중복값을 가질 수 없다.
 key가 중복값을 가지게되면 제일 마지막 값을 가지게 된다. -> 수정이 된다.
 Map은 iterator가 없다. 하지만 key의 자료형이 set이기 때문에 사용이 가능하다.
 Data를 넣을때는 put(추가), 꺼낼때는 get(가져오기)
  */
public class Test2 {
	
	public static final String tel[] =
		{"111-111","222-222","333-333","111-111","444-444"}; //key
	
	public static final String name[] =
		{"배수지","유인나","정인선","강아랑","박신혜"}; //value

	public static void main(String[] args) {
		
		System.out.println("[Map의 값 출력하기]");
		Hashtable<String,String> h = new Hashtable<>();
		
		for(int i=0;i<name.length;i++) {
			
			h.put(tel[i], name[i]);
			
		}
		
		System.out.println(h); 
		//출력한 값이 순서대로 나온것이 아니라 Map이 데이터를 효율적으로 정렬해서 출력
		//list는 집어넣는대로 순서가 정렬이 되지만 key값은 순서가 중요하지않다. 
		//key가 효율적인 값을 찾는 것이기 때문에 대신 속도가 빠름
		
		System.out.println("\n[key값 찾은 후 value값 반환]");
		String str;
		str = h.get("111-111"); //key를 주면 value를 받는다.
		if(str==null) {
				System.out.println("자료 없음");
		}
			else {
				System.out.println(str);
			}
		
		System.out.println("\n[key값 찾기]");
		if(h.containsKey("222-222")) {
			System.out.println("222-222를 가지고 있다.");
		} else {
			System.out.println("222-222가 존재하지 않는다.");
		}
		
		System.out.println("\n[value값 찾기]");
		if(h.containsValue("강아랑")) { //value는 비교하기 힘들기 때문에 사용 잘 안함
			System.out.println("강아랑이 존재한다.");
		} else {
			System.out.println("강아랑이 존재하지 않는다.");
		}
		
		System.out.println("\n[key의 iterator]");
		Iterator<String> it = h.keySet().iterator(); 
		//map은 set을 가지고 있지 않음. keyset의 iterator를 사용한다.
		
		while(it.hasNext()) {
			
			String key = it.next(); //key의 값 출력
			String value = h.get(key); //key의 value 값을 꺼내주는 식
			
			System.out.println(key + " " + value);
			
			
		}
	}

}
