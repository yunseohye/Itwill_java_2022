package com.score4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*
 ArrayList : 동기화를 하지 않음, 속도가 빠르다.
 Vector : 동기화를 함, 속도가 상대적으로 느림.
 */

public class ScoreImpl implements Score{

	private List<ScoreVO> lists = new ArrayList<>();
	//List<ScoreVO> : 자료형, lists : 변수, new ArrayList<>(): 자식, Upcast한 것
	//사용빈도수가 정말 많은 코딩이다.

	Scanner sc = new Scanner(System.in);

	@Override
	public int input() {

		int result = 0;

		ScoreVO vo = new ScoreVO();

		System.out.print("학번?"); // 111
		vo.setHak(sc.next());

		System.out.print("이름?"); //suzi
		vo.setName(sc.next());

		System.out.print("국어점수?");
		vo.setKor(sc.nextInt());

		System.out.print("영어점수?");
		vo.setEng(sc.nextInt());

		System.out.print("수학점수?");
		vo.setMat(sc.nextInt());

		lists.add(vo);

		return result;
	}

	@Override
	public void print() {

		Iterator<ScoreVO> it = lists.iterator();
		while(it.hasNext()) {

			ScoreVO vo = it.next();

			System.out.println(vo.toString());

			/*
			System.out.printf("%5s %6s %4d %4d %4d %4d %4.1f\n",
					vo.getHak(),vo.getName(), 
					vo.getKor(),vo.getEng(),vo.getMat(),
					(vo.getKor()+vo.getEng()+vo.getMat()),
					(vo.getKor()+vo.getEng()+vo.getMat())/3.0);
			 */
		}

	}

	@Override
	public void deleteHak() {
		//if문만 넣어주면됨
		//밑에가 기본틀, 일치하는 데이터 지우기 테스트2

		System.out.print("삭제 할 학번을 입력하시오."); //222
		String hak = sc.next();

		Iterator<ScoreVO> it = lists.iterator();

		while(it.hasNext()) {
			ScoreVO vo = it.next();

			if(hak.equals(vo.getHak())) {

				lists.remove(vo); //실제 저장된 장소의 데이터를 삭제
				break;
			}
			
		}

	}

	@Override
	public void searchHak() {

		System.out.print("검색 할 학번을 입력하시오."); //222
		String hak = sc.next();

		Iterator<ScoreVO> it = lists.iterator();
		while(it.hasNext()) {

			ScoreVO vo = it.next();

			if(hak.equals(vo.getHak())) {

				System.out.println(vo.toString());
				break;
			}
		}

	}

	@Override
	public void searchName() {
		System.out.print("검색 할 이름을 입력하시오."); //222
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
	public void descSortTot() { //총점 정렬
		//정렬방법은 공식처럼 외우기

		//익명의 클래스 호출
		Comparator<ScoreVO> comp = new Comparator<ScoreVO>() {

			@Override
			public int compare(ScoreVO vo1, ScoreVO vo2) {
				return vo1.getTot()<vo2.getTot()?1:-1;
			}
		};

		Collections.sort(lists, comp);

		print();

	}

	@Override
	public void ascSorthak() {
		//string은 뭘로 비교해야하는가.
		Comparator<ScoreVO> comp = new Comparator<ScoreVO>() {

			@Override
			public int compare(ScoreVO o1, ScoreVO o2) {
				return o1.getHak().compareTo(o2.getHak());

			}
		};

		Collections.sort(lists, comp);

		print();

		

	}

}
