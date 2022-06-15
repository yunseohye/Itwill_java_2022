package com.day012;

//selection sort를 분해하여 메소드로 만들기

abstract class SortInt{ //추상클래스

	private int[] value; //배열변수 생성

	protected abstract void sorting(); 
	//추상메소드
	//추상메소드를 private로 정립하면 오버라이드가 불가능하기 때문에 기본이 protected임

	public void sort(int[] value) { //value를 초기화하는 우회도로 메소드, 일반 메소드
		this.value = value;
		//초기화
		sorting();
		//추상메소드의 sorting을 호출 but 추출할 값이 없다.
		
		//값을 넣고 값이 초기화 되는 순간 sorting을 실행하여라

	}

	public int length() { //배열의 길이를 알려주는 메소드

		if(value == null) {
			return 0;
		}

		return value.length;

	}

	protected final int compare(int i, int j) { //값을 비교해주는 메소드

		if(value[i] == value[j]) {
			return 0;
		} else if(value[i]>value[j]) {
			return 1;
		} else {
			return -1;
		}
	}

	protected final void swap(int i, int j) { //자리를 바꿔주는 메소드
		int temp;
		temp = value[i];
		value[i] = value[j];
		value[j] = temp;
	}

	public void print() {

		if (value == null) {
			return;
		}

		for(int su : value) {
			System.out.printf("%4d", su);

		}

		System.out.println();
	}
}

class SortTest extends SortInt{

	@Override//추상메소드이기 때문에 무조건 Override해줘야 한다.
	protected void sorting() { 
		//위에 sorting메소드는 선언, 정의만 해두어서 실행할 수 없기 때문에 이 메소드를 추출한다.
		//메소드는 무조건 내 메소드를 출력한다.(상속 공식)

		//selection sort
		for(int i=0; i<length()-1;i++) {
			for(int j=i+1;j<length();j++) {

				if(compare(i,j)>0) {

					swap(i,j);

				}

			}
		}

	}

}

public class Test8 {

	public static void main(String[] args) {

		SortTest ob = new SortTest();

		int[] value = {50,30,10,70,20};

		ob.sort(value);
		ob.print();

	}

}
//변수도 접근지정자를 생략하면 protected가 된다.