package com.day013;

interface Test {
	
	public int total();
	public void write();
	//메소드만 생성
}

class TestImpl implements Test { //테스트라는 인터페이스 구현
	
	private String hak, name;
	private int kor, eng;
	
	public TestImpl() {} //기본생성자로 메소드를 생성할 수 있게 명시적으로 표현
	
	public TestImpl(String hak, String name, int kor, int eng) {
		this.hak = hak;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		
	}

	public void set(String hak, String name, int kor, int eng) {
		//기본생성자의 초기화 값을 주는 set이라는 우회도로를 표현
		this.hak = hak;
		this.name = name;
		this.kor = kor;
		this.eng = eng;	
	}

	@Override
	public int total() {
		return kor+eng;
	}

	@Override
	public void write() {
		
		System.out.println(hak + ":" + name +":" + total()); 
		//메소드에서 메소드 호출[ total()] 클래스 내부 안에서
		
	}

	@Override
	public boolean equals(Object ob) { //upcast, TestImpl ob1.equals(ob2) TestImpl

		boolean flag = false;
		
		if(ob instanceof TestImpl) {
			
			TestImpl t = (TestImpl)ob; //downcast
			
			if(this.hak.equals(t.hak)&&name.equals(t.name)) {
				flag = true;
			}
			
		}
	
		return flag;
	}
	
}

public class Test2 {

	public static void main(String[] args) {
		
		//자식의 객체를 생성하여 부모에게 넘겨줌
		Test ob1 = new TestImpl("1111", "배수지 ", 80, 90);
		Test ob2 = new TestImpl("1111", "배수지 ", 100, 100);
		//인터페이스를 쓸 때는 앞에는 인터페이스, 뒤에는 클래스의 이름을 쓰기 때문에
		//Test ob1 = new TestImpl의 구조가 가능한것이다. 
		//인터페이스가 아닌 경우에는 앞의 이름이 Test가 아닌 TestImpl를 써야함
		//인터페이스 안에 있는 메소드만으로 구성했을 때만 가능하다.
		//앞의 이름은 Test, TestImpl 둘 중 아무거나 써도 상관 없다.
		
		
		if(ob1.equals(ob2))  //Object -> TestImpl
			//object의 equals는 주소값을 비교하기 때문에 같지 않다.
			//but Override하면 내 메소드를 쓴다.
			System.out.println("ob1과 ob2는 동일인물이다.");
		else
			System.out.println("ob1과 ob2는 동일한 인물이 아니다.");
		ob1.write();
		ob2.write();
		
		
		
	}

}
