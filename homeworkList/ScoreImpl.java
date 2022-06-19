package com.homeworkList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.homeworkList.Score;
import com.homeworkList.ScoreVO;

public class ScoreImpl implements Score{

	private List<ScoreVO> lists = new ArrayList<>();
	
	Scanner sc = new Scanner(System.in);

	@Override
	public int input() {

		int result = 0;

		ScoreVO vo = new ScoreVO();

		System.out.print("회원번호를 입력하시오."); // 111
		vo.setID(sc.next());

		System.out.print("회원 이름을 입력하시오."); //suzi
		vo.setName(sc.next());

		System.out.print("PT를 실행한 횟수를 입력하시오.");
		vo.setPT(sc.nextInt());

		lists.add(vo);

		return result;
	}

	@Override
	public void print() {
		Iterator<ScoreVO> it = lists.iterator();
		while(it.hasNext()) {

			ScoreVO vo = it.next();

			System.out.println(vo.toString());
		}
	}	

	@Override
	public void deleteID() {
		System.out.print("삭제 할 회원번호를 입력하시오."); //222
		String ID = sc.next();

		Iterator<ScoreVO> it = lists.iterator();

		while(it.hasNext()) {
			ScoreVO vo = it.next();

			if(ID.equals(vo.getID())) {

				lists.remove(vo);
				break;
			}
		}
	}

	@Override
	public void searchID() {
		System.out.print("검색 할 회원번호를 입력하시오."); //222
		String ID = sc.next();

		Iterator<ScoreVO> it = lists.iterator();
		while(it.hasNext()) {

			ScoreVO vo = it.next();

			if(ID.equals(vo.getID())) {

				System.out.println(vo.toString());
				break;
			}
		}
	}

	@Override
	public void searchName() {
	
		System.out.print("검색 할 회원명을 입력하시오."); //222
		String name = sc.next();

		Iterator<ScoreVO> it = lists.iterator();
		while(it.hasNext()) {

			ScoreVO vo = it.next();

			if(name.equals(vo.getName())) {

				System.out.println(vo.toString());
			}
		}
	
	}

	@Override
	public void descSortPT() {
		
		Comparator<ScoreVO> comp = new Comparator<ScoreVO>() {

			@Override
			public int compare(ScoreVO vo1, ScoreVO vo2) {
				return vo1.getPT()<vo2.getPT()?1:-1;
			}
		};

		Collections.sort(lists, comp);

		print();

		
	}

	@Override
	public void ascSortID() {
		
		Comparator<ScoreVO> comp = new Comparator<ScoreVO>() {

			@Override
			public int compare(ScoreVO o1, ScoreVO o2) {
				return o1.getID().compareTo(o2.getID());

			}
		};

		Collections.sort(lists, comp);

		print();

	}

	

}
