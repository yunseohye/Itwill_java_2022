package com.homeworkList;

public interface Score {

	public int input(); //입력
	public void print(); //출력
	public void deleteID();//회원정보삭제
	public void searchID(); //회원번호검색
	public void searchName(); //회원이름검색
	public void descSortPT(); //PT 횟수별 내림차순 정렬
	public void ascSortID(); //회원번호별 오름차순 정렬
	
}
