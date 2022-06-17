package com.day015;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class Test3 {

	public static void main(String[] args) {

		System.out.println("[Collection의 Set]");
		//Set : 중복값이 허용되지 않는다.
		
		Set<String> s = new HashSet<>();
		
		s.add("서울");
		s.add("부산");
		s.add("대구");
		
		System.out.println(s);
		
		Iterator<String> it = s.iterator();
		
		while(it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}
		
		s.add("서울");
		//서울이 중복값이기 때문에 값을 넣어도 중복값을 출력X
		//서울이 한 번만 출력이 된다.
		System.out.println(s);
		
		System.out.println("\n[java utill의 Stack]");
		
		Stack<String> st = new Stack<>();
		//push로 값을 넣어준다. but add도 사용 가능
		st.push("서울");
		st.push("부산");
		st.add("광주");
		
		while(!st.empty()) { //st의 내용이 비어있지 않을때까지 반복하여라
	
			System.out.print(st.pop()+" ");
			//집어 넣었던 순서의 역순으로 출력이 된다.
		}	
			
		System.out.println("\n\n[java utill의 Queue]");
		
		Queue<String> q = new LinkedList<>();
		//offer로 값을 넣는 것이 기본. but add도 사용 가능
		q.offer("부산");
		q.offer("대구");
		q.add("울산");
		
		while(q.peek() != null) { //값의 데이터가 있을 때 까지만 출력한다.
			System.out.print(q.poll() + " ");
		}
	
		System.out.println("\n[List]");
		List<String> list1 = new LinkedList<>();
		list1.add("a");
		list1.add("b");
		list1.add("c");
		list1.add("d");
		list1.add("e");
		list1.add("f");
		list1.add("g");
		list1.add("h");
		list1.add("i");
		
		List<String> list2 = new LinkedList<>();
		list2.add("서울");
		list2.add("부산");
		list2.add("대구");

		list2.addAll(list1);
		
		System.out.println("\nlist1...");
		for(String ss : list1) {
			System.out.print(ss + " ");
		}
		System.out.println("\n------------------");
		
		System.out.println("list2...");
		for(String ss : list2) {
			System.out.print(ss + " ");
		}
		System.out.println("\n------------------\n");
		
		System.out.println("[값 삭제]");
		list2.subList(2, 5).clear(); //뒷자리 값은 -1이 되어 출력된다.
		for(String ss : list2) {
			System.out.print(ss + " ");
		}
		
		System.out.println("\n\n[배열]");
		String[] str = {"나", "마", "라", "가", "바", "다"}; //값을 입력한대로 출력
		
		for(String sss : str)
			System.out.print(sss + " ");
		System.out.println();
		
		System.out.println("\n[Arrays]"); //오름차순으로 정렬하여 출력
		Arrays.sort(str);
		for(String ssss : str)
			System.out.print(ssss + " ");
		System.out.println();
	}

}
