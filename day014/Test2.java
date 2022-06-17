package com.day014;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;
import java.util.stream.Collectors;

public class Test2 {

	private static String city[] = {"서울", "부산", "대구","인천", "광주", "대전", "울산"};


	public static void main(String[] args) {

		Vector<String> v = new Vector<String>();

		System.out.println("초기 용량: " + v.capacity());

		for(String c : city) {

			v.add(c);

		}

		//v.add(10); string이 아닌 데이터는 들어갈 수가 없다.

		String str;

		str = v.firstElement(); //첫번째 value 값을 불러와라, 배열의 0번째
		System.out.println(str);

		str = v.get(1);
		System.out.println(str);

		str = v.lastElement();
		System.out.println(str); //배열의 6번째
		//모든 언어에 공통적으로 정해져있는 규칙, first와 last값만 지정되어있다.

		System.out.println("배열의 수: "+v.size()+"개\n");

		System.out.println("[for문을 사용하여 배열을 출력]");

		for(int i=0;i<v.size();i++) {
			System.out.print(v.get(i) + " ");

		}

		System.out.println("\n\n[for each(확장 for)문을 사용하여 배열을 출력]");

		for(String c : v) {
			System.out.print(c + " ");
		}

		System.out.println("\n\n[Collection의 자체출력기를 사용해 배열을 출력]");
		//반복자(Collection의 자체 for문이다)
		//Iterator는 interface임 interface에 값을 저장함

		Iterator<String> it = v.iterator(); //List와 Map에서도 사용

		//몇번 돌려야할지 데이터 값을 모르고있는 상태이기 때문에 while문 사용
		while(it.hasNext()) { //it안에 데이터 값을 가지고 있을 때 까지 반복해서 출력

			str = it.next(); //하나의 데이터를 읽어냄
			System.out.print(str + " ");

		}

		/*
		it의 값은 한번 찍으면 출력되지 않는다. 임시저장소의 개념
		while문을 다시 작성해도 값이 출력되지 않음.
		만약 이 while문을 출력하고 싶다면 Iterator<String> it = v.iterator();를
		다시 출력하려면 it에는 새로운 변수값을 넣어 출력해야 한다.
		 */
		while(it.hasNext()) { 
			str = it.next(); 
			System.out.print(str + " ");

		} System.out.println(); // 이 값은 출력되지 않는다.

		System.out.println("\n[변경]");

		v.set(0, "Seoul");
		v.set(1, "Busan");

		for(String c : v) {
			System.out.print(c + " ");
		}

		System.out.println("\n\n[삽입]");
		v.insertElementAt("대한민국", 0);
		System.out.println(v.size() + "개");

		for(String c : v) {
			System.out.print(c + " ");
		}

		System.out.println("\n\n[index 검색]");

		int idx = v.indexOf("대구");
		if(idx != -1) { //idx != -1 인덱스에 데이터가 있으면!
			System.out.println("검색 성공: "+ idx);
		}else {
			System.out.println("검색 실패: " + idx);
		}

		System.out.println("\n[오름차순 정렬]");
		Collections.sort(v);
		for(String c : v) {
			System.out.print(c + " ");
		}

		System.out.println("\n\n[내림차순 정렬(10-1, z-a)]");
		Collections.sort(v, Collections.reverseOrder()); 
		//Collections.reverseOrder() : 역순으로 정렬하여라
		//괄호 안 v 뒤에 값 생략하면 오름차순
		for(String c : v) {
			System.out.print(c + " ");
		}

		System.out.println("\n\n[삭제]");
		v.remove("Busan"); //v.rmove(7)도 가능함
		for(String c : v) {
			System.out.print(c + " ");
		}

		System.out.println("\n\n공간의 수: " + v.capacity());
		System.out.println("데이터의 수: "+ v.size() + "개");

		System.out.println("\n[공간 증가]");
		for(int i = 1; i<=20; i++) {
			v.add(Integer.toString(i));
		}
		for(String c : v) {
			System.out.print(c + " ");
		} System.out.println();
		System.out.println("\n공간의 수: " + v.capacity());
		System.out.println("데이터의 수: "+ v.size() + "개");

		System.out.println("\n\n[범위 삭제]");
		//같은 위치의 데이터를 계속해서 삭제한다.
		for(int i=1; i<=10; i++) { //인덱스 5번안의 데이터를 10개를 지워라
			v.remove(5);
		}
		for(String c : v) {
			System.out.print(c + " ");
		} System.out.println();
		System.out.println("\n공간의 수: " + v.capacity());
		//공간은 늘어날때는 자동으로 늘어나지만 줄어들 때는 자동으로 줄지는 않는다.
		System.out.println("데이터의 수: "+ v.size() + "개");
		
		System.out.println("\n\n[빈 공간 삭제]");
		v.trimToSize();
		System.out.println("공간의 수: " + v.capacity());
		System.out.println("데이터의 수: "+ v.size() + "개");
		
		System.out.println("\n\n[모든 데이터 삭제]");
		v.clear();
		//데이터를 지워도 공간은 그대로 남는다.
		//공간도 지우고 싶다면 trimToSize를 넣어준다.
		System.out.println("공간의 수: " + v.capacity());
		System.out.println("데이터의 수: "+ v.size() + "개");
	}
}
