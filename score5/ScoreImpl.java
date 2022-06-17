package com.score5;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class ScoreImpl implements Score { //score가 여러개이기 때문에 꼭 5번 선택하기

	private Map<String, ScoreVO> hMap = new TreeMap<>();

	Scanner sc = new Scanner(System.in);
	String hak;

	@Override
	public void input() {

		System.out.print("학번?"); //key값
		hak = sc.next();

		if(searchHak(hak)) { //boolean값을 받으려면 if문 사용
			System.out.println("학번이 존재하여 추가할 수 없습니다.");
			return;
		}

		ScoreVO vo = new ScoreVO();

		System.out.print("이름?");
		vo.setName(sc.next());

		System.out.print("국어점수는?");
		vo.setKor(sc.nextInt());

		System.out.print("영어점수는?");
		vo.setEng(sc.nextInt());

		System.out.print("수학점수는?");
		vo.setMat(sc.nextInt());

		hMap.put(hak, vo);

		System.out.println("학번을 생성하였습니다.");

	}

	@Override
	public boolean searchHak(String hak) {
		/* 
		if(hMap.containsKey(hak)) {
			return true;
		}
		return false;
		 */

		//if문 없이 boolean값 받기
		return hMap.containsKey(hak);
	}

	@Override
	public void print() {

		Iterator<String> it = hMap.keySet().iterator(); //set이라는 collection의 것을 빌려옴

		while(it.hasNext()) {

			String hak = it.next();
			ScoreVO vo = hMap.get(hak); 

			System.out.println(hak + " " + vo.toString());

		}

	}

	@Override
	public void delete() {
		System.out.println("삭제할 학번을 입력하시오.");
		hak = sc.next();

		if(searchHak(hak)) {
			hMap.remove(hak); //hak을 지우면 데이터도 같이 지워짐
			System.out.println("학번을 삭제하였습니다.");
		} else {
			System.out.println("학번 삭제 실패!");
		}

	}

	@Override
	public void update() {
		System.out.println("추가 할 학번을 입력하시오.");
		hak = sc.next();

		if(!searchHak(hak)) {
			System.out.println("수정 실패!!");
			return;
		}

		//방법1
		/*
		ScoreVO pVO = hMap.get(hak);
		ScoreVO vo = new ScoreVO();

		vo.setName(pVO.getName());

		System.out.print("국어점수는?");
		vo.setKor(sc.nextInt());

		System.out.print("영어점수는?");
		vo.setEng(sc.nextInt());

		System.out.print("수학점수는?");
		vo.setMat(sc.nextInt());

		hMap.put(hak, vo);
		 */

		//방법2
		ScoreVO vo = hMap.get(hak);

		System.out.print("국어점수는?");
		vo.setKor(sc.nextInt());

		System.out.print("영어점수는?");
		vo.setEng(sc.nextInt());

		System.out.print("수학점수는?");
		vo.setMat(sc.nextInt());

		hMap.put(hak, vo);

		System.out.println("수정 성공!!");
	}

	@Override
	public void findHak() {

		System.out.print("검색할 학번? ");
		hak = sc.next();

		if(!searchHak(hak)) {
			System.out.println("학번이 존재하지 않습니다. 검색 실패!");
			return;
		}

		ScoreVO vo = hMap.get(hak);
		System.out.println(hak + " "+ vo.toString());
	}

	@Override
	public void findName() {

		System.out.println("검색할 이름?");
		String name = sc.next();

		Iterator<String> it = hMap.keySet().iterator();
		
		boolean flag = false;
		
		while(it.hasNext()) {

			String hak = it.next();
			ScoreVO vo = hMap.get(hak);

			if(name.equals(vo.getName())) {
				System.out.println(hak + " "+ vo.toString());
				flag = true;
			}

		}

		if(flag) {
			System.out.println("검색성공!!");
		} else {
			System.out.println("이름이 존재하지 않습니다. 검색 실패");
		}
	}

}
