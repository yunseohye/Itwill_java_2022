package com.score1;

public class Record {
	//instance변수만 호출한 class
	
	String name;
	int[] score = new int[3]; //kor, eng, mat
	int tot, ave, rank;
	
}
/*
 [배열을 사용하는 이유]
 배열 없이 3번 째 줄 처럼 나열할 경우 method에서
 값을 지정할 때 for문과 같은 공식을 이용하지 못하고
 하나하나 값을 다 지정해야 한다.
*/