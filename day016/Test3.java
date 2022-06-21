package com.day016;

//사용자 정의 에러를 완충작업 해주기 위한 class 생성

//사용자 class를 만든 후 Exception을 상속받은 형태
class MyException extends Exception{ //class에게 Exception을 상속받아 그 능력을 주는 것
	//아직 Exception의 값을 정해놓지 않은 상태임.


	private static final long serialVersionUID = 1L; 
	//안써도 됨. 메모리공간을 달라고 요청하는 것. 우리가 사용하는 것이 아님

	public MyException(String msg) {
		//여기서는 연산자 입력오류 이외에 어떤 값을 넣느냐에 따라
		//메시지 값을 바꿔서 출력할 수 있다.

		super(msg); //오버로딩된 생성자를 찾아가서 메시지를 넣어라
		//호출할때 마다 메시지의 값을 바꿀 수 있음.
		//Test2의 new Exception("연산자 입력 오류!!"); 작업과 같음
		//직접적으로 값을 넣을 경우 하나의 값만 가질 수 있기 때문에 우회적으로 호출한다.

	}

}

public class Test3 {

	private int value;//초기값이 0이기 때문에 에러가 나면 0이 출력된다.

	public void setValue(int value) throws MyException {

		if(value < 0) { //사용자 정의 에러
			throw new MyException("수는 0보다 작을 수 없습니다.");
			//사용자 정의 에러를 만들경우 위에 메소드명 옆에 
			//throws MyException를 붙여주어야 오류가 나지 않는다.
		} else {
			this.value = value;
		}
	}

	public void setValue2(int value) throws MyException {

		if(value > 10) { 
			throw new MyException("수는 10보다 클 수 없습니다.");

		} else {
			this.value = value;
		}
	}

	public int getValue() {
		return value;
	}

	public static void main(String[] args) {

		Test3 ob = new Test3();

		try {

			//ob.setValue(20); //숫자가 에러인지 확인하는 절차
			ob.setValue2(20);
			
		} catch (Exception e) {

			System.out.println(e.toString());

		}

		System.out.println(ob.getValue()); //이상이 없을 경우 값을 출력

	}

}
