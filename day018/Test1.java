package com.day018;

import java.io.IOException;

/*
 Stream
데이터 입출력시 모든 데이터의 형태와는 관계없이 
일련된 흐름으로(단방향) 테이터를 전송하는 클래스이다.
: 어떠한 데이터건간에 한 번 보낼 때 1byte씩만 전송할 수 있다.
단방향이기 때문에 짝을 지어 이루어진다.
 */

//in : java의 기본 입력 스트림(읽어낼 때 byte로 읽어내기 때문에 바이트스트림이라고도 한다.)
//in.read, out.print

public class Test1 {

	public static void main(String[] args) throws Exception {

		int data;
		
		System.out.print("문자열을 입력하시오."); //abcd
		while((data=System.in.read()) !=-1) { //사용자가 몇자를 입력할지 모르니까 while
		//System.in.read()는 기본적으로 정수를 반환한다.
		//컴퓨터는 이진수라 0,1을 반환하기 때문에 -1값은 false
			
			char ch = (char)data;
			System.out.print(ch);
			
		}
		
	}

}
//System.in.read() -> 바이트 단위로 값을 읽어 오는 것
//System.in : 키보드로 입력한 1바이트의 문자를 입력할 때 쓰는 것.

