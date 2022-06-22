package com.homwork018;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class TestImpl implements Score {

	private List<TestVO> lists = new ArrayList<>();
	
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void input() {
		
		TestVO vo = new TestVO();
		
		System.out.print("이름?");
		vo.setName(sc.next());
		
		System.out.print("생일?");
		vo.setBirth(sc.next());
		
		System.out.print("점수?");
		vo.setScore(sc.nextInt());
		
		lists.add(vo);
	
	}

	@Override
	public void print() {
		
		Iterator<TestVO> it = lists.iterator();
		while(it.hasNext()) {
			
			TestVO vo = it.next();
			
			System.out.println(vo.toString());
		}
		
	}

}
