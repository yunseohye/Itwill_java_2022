package com.homework018correct;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Score {

	//private List<ScoreVO> lists = new ArrayList<ScoreVO>();
	//객체를 새로 생성하면 이전의 값이 다 사라진다.
	
	private List<ScoreVO> lists = null;
	//객체가 없음 기본생성자를 사용
	
	private String path = System.getProperty("user.dir");
	//시스템의 환경설정을 읽어오는 코딩(현재 사용자가 쓰고있는 디렉토리)
	//user.dir : java - work - demo까지의 위치
	private File f = new File(path, "\\data\\score.txt");
	//user.dir에서 읽은 값에 원하는 폴더와 파일을 만드는 것임.
	
	//String path = "c:\\doc\\score.txt";
	
	public Score() {
		//프로그램이 시작될 때 파일이 있는이 유무 확인하는 코딩
		//기본생성자를 사용할 것이다.
		//있으면 이미 한번 실행된적이있는 것이다.
		//없으면? 파일을 새로 만들어라! if 안의 값
		
		
		try {
			
			if(!f.getParentFile().exists()) {
				//경로가 없지? 그렇다면 만들어라
				f.getParentFile().mkdirs();
				
			}
			if(f.exists()) { //경로 있냐에서 통과 - 야 너 파일있냐?
				//파일이있다면 경로를 통해 파일을 열어라
				FileInputStream fis = new FileInputStream(f);
				ObjectInputStream ois = new ObjectInputStream(fis);
				//fis를 ois로 감싸줌
				
				lists = (ArrayList<ScoreVO>) ois.readObject();
				//Array list 초기화
				//downcast, (ArrayList<ScoreVO>)의 ScoreVO 생략 가능함.
				
				fis.close();
				ois.close();
			}
			
			//프로그램을 처음 실행할 때는 list가 null -> list에 값이 들어갈 수 없음.
			//처음 실행 후 데이터 입력시 객체를 생성해주어야 함.
			if(lists == null) {
				lists = new ArrayList<>();
			//lists가 null이면 값이 저장이 안되기 때문에 객체를
			//새로 생성해주어야 값을 넣을 수가 있다.
				
			}
			//null아닌데? 위에값 건너뛴 후 add만 해라~
			//기존에 있던 list에 새로운 값이 더해지게 되는 역할을 함.
			
		} catch (Exception e) {

		}
		
	}
	
	//입력메소드 생성
	public void input() {
		
		Scanner sc = new Scanner(System.in);
		
		ScoreVO vo = new ScoreVO();
		
		System.out.print("이름?");
		vo.setName(sc.next());
		
		System.out.print("생일?");
		vo.setBirth(sc.next());
		
		System.out.print("점수?");
		vo.setScore(sc.nextInt());
		// vo에 3개의 데이터값이 들어간 것임.		
		
		lists.add(vo);
		
	}
	
	//출력
	public void print() {
		Iterator<ScoreVO> it = lists.iterator();
		
		while(it.hasNext()) {
			ScoreVO vo = it.next();
			System.out.println(vo.toString());
		}
	}
	
	//파일저장
	public void saveFile() {
		
		try {
			//처음 list를 생성하고 저장했을때 값이 null이면 굳이 이것을 저장할 필요가없음
			//처음에 null이라면 이것을 걸러내는 작업과정.
			if(lists!=null) {
				FileOutputStream fos = new FileOutputStream(f);
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				
				oos.writeObject(lists);
			
				fos.close();
				oos.close();
				
				System.out.println("파일 저장 성공!!");
			
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}


/*
list는 한개여야함 두개가 되면 값이 나오지 않음

리스트를 저장하면 파일에 리스트가 저장이 됨 그리고 안에는 vo, vo가 있음
프로그램을 종료하면 list안의 vo는 없어진다. 프로그램을 다시 실행?
새로운 리스트가 다시 생김 - 새로운 리스트를 생성하고 이전의 데이터는 사라짐.

private List<ScoreVO> lists;
객체가 없음 기본생성자를 사용
을 통해 값을 만드면 list가 null 이냐? 아님 - 이전의 값을 가지고 오면서
리스트는 한개를 유지할 수 있다.

무조건 리스트는 하나여야한다.
*/
















