package com.homeworkMap;

public interface Score {

	public void input(); //입력
	public boolean searchID(String ID); //회원정보에 대한 검사를 해줌
	public void print(); //출력
	public void deleteID();//회원정보삭제
	public void updateID(); //회원번호추가
	public void findID(); //회원번호 찾기
	public void findName(); //회원이름 찾기
	
}
