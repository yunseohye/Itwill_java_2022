package com.day020;

import java.io.Serializable;

//웹에서는 이미 Serializable가 내장되어있기 때문에 직렬화 하지 않아도 된다.
public class FileInfo implements Serializable{

	private static final long serialVersionUID = 1L;

	//code
	// 100 : 파일 전송 시작(파일명 전송)
	// 110 : 파일 내용 전송
	// 200 : 파일 전송 종료(파일명 전송)
	//size : 전송 길이
	//data : 전송 내용
	
	//저장할 변수(3개) 입력
	private int code;
	private int size;
	private byte[] data = new byte[1024];
	//데이터를 담아내는 곳
	
	//데이터 입출력기
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public byte[] getData() {
		return data;
	}
	public void setData(byte[] data) {
		this.data = data;
	}
		
}
