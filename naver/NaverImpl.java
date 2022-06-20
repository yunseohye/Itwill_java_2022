package com.naver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;




public class NaverImpl implements Naver {

	private List<NaverVO> lists = new ArrayList<>();

	Scanner sc = new Scanner(System.in);

	@Override
	public void input() throws Exception  {

		NaverVO vo = new NaverVO();

		System.out.print("ID?[8~15자 이내, 영문자 혼용할 것]"); 
		vo.setId(sc.next());

		String str= vo.getId();

		if(str.length() < 8 || str.length() > 15) {

			throw new Exception("8~15자 이내로 입력하시오.");

		}

		int num=0, eng = 0;

		for(int i=0; i<str.length(); i++ ) {

			char ch = str.charAt(i);

			if((ch>='A' && ch<='Z' ) || (ch>='a' && ch<='z')) {
				eng++;

			} else if(ch>='0'&&ch<='9'){
				num++;		
			}
		}

		if(eng == 0 || num == 0) {
			throw new Exception("영문자와 숫자를 혼용해야 입력이 가능합니다."+str);
		}

		System.out.print("이름?"); 
		vo.setName(sc.next());

		System.out.print("비밀번호?");
		vo.setPw(sc.next());

		System.out.print("비밀번호를 한 번 더 입력하시오.");

		if(vo.getPw().equals(sc.next())) 
			System.out.print("비밀번호가 일치합니다.");
		else
			System.out.print("비밀번호가 일치하지 않습니다.\n");

		System.out.print("성별을 입력하시오.");
		vo.setGender(sc.next());

		System.out.print("생년월일?");
		vo.setBirth(sc.next());

		System.out.print("이메일?");
		vo.setEmail(sc.next());

		System.out.print("전화번호?");
		vo.setTel(sc.next());

		lists.add(vo);

	}

	@Override
	public void print() {
		Iterator<NaverVO> it = lists.iterator();
		while(it.hasNext()) {
			NaverVO vo = it.next();

			System.out.println(vo.toString());
		}
	}

	@Override
	public void ascSortid() {

		Comparator<NaverVO> comp = new Comparator<NaverVO>() {

			@Override
			public int compare(NaverVO o1, NaverVO o2) {
				return o1.getId().compareTo(o2.getId());
			}

		};
		Collections.sort(lists,comp);

		print();

	}

	@Override
	public void searchid() {
		System.out.print("검색할 ID를 입력하시오.");
		String id = sc.next();

		Iterator<NaverVO> it = lists.iterator();
		while(it.hasNext()) {
			NaverVO vo = it.next();

			if(id.equals(vo.getId())) {

				System.out.println(vo.toString());
				break;

			}
		}
	}



}
