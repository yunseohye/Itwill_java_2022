package com.score4;

public interface Score {
	
	//전부 다 abstract처리가 되어있는 것이다. 생략되어있음.
	
	public int input(); //입력
	public void print(); //출력
	public void deleteHak();//학생정보삭제
	public void searchHak(); //학번검색
	public void searchName(); //이름검색
	public void descSortTot(); //총점 내림차순 정렬
	public void ascSorthak(); //학번 오름차순 정렬
	
	
}
