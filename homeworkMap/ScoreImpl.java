package com.homeworkMap;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import com.homeworkMap.Score;
import com.homeworkMap.ScoreVO;

public class ScoreImpl implements Score { //score가 여러개이기 때문에 꼭 5번 선택하기

		private Map<String, ScoreVO> IDMap = new TreeMap<>();

		Scanner sc = new Scanner(System.in);
		String ID;
		
		@Override
		public void input() {
			
			System.out.print("회원 번호를 입력하시오."); //key값
			ID = sc.next();

			if(searchID(ID)) { //boolean값을 받으려면 if문 사용
				System.out.println("회원번호가 존재하여 추가할 수 없습니다.");
				return;
			}

			ScoreVO vo = new ScoreVO();

			System.out.print("회원 이름을 입력하시오."); 
			vo.setName(sc.next());

			System.out.print("PT를 실행한 횟수를 입력하시오.");
			vo.setPT(sc.nextInt());

			IDMap.put(ID, vo);

			System.out.println("회원정보를 생성하였습니다.");
		}
		
		@Override
		public boolean searchID(String ID) {
			
			return IDMap.containsKey(ID);
			
		}
		
		@Override
		public void print() {
			
			Iterator<String> it = IDMap.keySet().iterator(); //set이라는 collection의 것을 빌려옴

			while(it.hasNext()) {

				String ID = it.next();
				ScoreVO vo = IDMap.get(ID); 

				System.out.println("회원번호: "+ID + " " + vo.toString());

			}
			
		}
		
		@Override
		public void deleteID() {
			
			System.out.println("삭제할 회원번호를 입력하시오.");
			ID = sc.next();

			if(searchID(ID)) {
				IDMap.remove(ID);
				System.out.println("회원정보를 삭제하였습니다.");
			} else {
				System.out.println("회원정보 삭제 실패!");
			}
			
		}
		
		@Override
		public void updateID() {
		
			System.out.println("추가 할 회원번호를 입력하시오.");
			ID = sc.next();

			if(!searchID(ID)) {
				System.out.println("회원정보 수정 실패!!");
				return;
			}
			
			ScoreVO vo = IDMap.get(ID);

			System.out.print("회원 이름을 입력하시오."); 
			vo.setName(sc.next());

			System.out.print("PT를 실행한 횟수를 입력하시오.");
			vo.setPT(sc.nextInt());;

			IDMap.put(ID, vo);

			System.out.println("수정 성공!!");
		
		}
		
		@Override
		public void findID() {
		
			System.out.print("검색할 회원번호를 입력하시오.");
			ID = sc.next();

			if(!searchID(ID)) {
				System.out.println("회원이 존재하지 않습니다. 검색 실패!");
				return;
			}

			ScoreVO vo = IDMap.get(ID);
			System.out.println("회원번호: "+ID + " "+ vo.toString());
		}
		
		@Override
		public void findName() {
		
			System.out.println("검색할 이름을 입력하시오.");
			String name = sc.next();

			Iterator<String> it = IDMap.keySet().iterator();
			
			boolean flag = false;
			
			while(it.hasNext()) {

				String ID = it.next();
				ScoreVO vo = IDMap.get(ID);

				if(name.equals(vo.getName())) {
					System.out.println(ID + " "+ vo.toString());
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
