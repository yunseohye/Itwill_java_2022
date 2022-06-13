package com.day011;

public class Test5 {

	public static void main(String[] args) {
		System.out.println("[많이 사용하는 String의 메소드들]");

		String s1 = "서울,부산,대구"; //배열 X
		String ss[] = s1.split(",");
		//s1에 있는 것을 ,로 구분하여 배열 안에 넣어라

		for(String s : ss) {
			System.out.print(s + " ");		
		}
		System.out.println();

		String s2 = "seoul"; //소문자
		String s3 = "Seoul"; //대문자

		System.out.println(s2==s3); //false
		System.out.println(s2.equals(s3)); //false
		//주소도 틀리고 실제 데이터 값도 틀리기 때문에 둘 다 false가 나옴
		/*
		 String은 자료형의 흉내를 낸 클래스이기 때문에 실제 데이터를 찾아가야
		 하기 때문에 String의 값은 equals로 비교한다!
		 */
		System.out.println(s2.equalsIgnoreCase(s3)); //true
		//equalsIgnoreCase : 대소문자를 가리지 않고 값을 비교하는 것임

		String s4 = "abc.def.hij";
		//index   :  01234597890

		System.out.println(s4.indexOf(".")); //3
		//왼쪽에서 부터 순서대로 값을 출력

		System.out.println(s4.lastIndexOf(".")); //7
		//오른쪽에서 부터 순서대로 값을 출력

		System.out.println(s4.indexOf("def")); //4
		System.out.println(s4.indexOf("x")); //-1
		/* s4에서 x라는 데이터 값은 존재하지 않는다. 
		배열은 음수의 값이 없기 때문에 없는 값을 출력해야할 때는 -1을 사용한다. */

		//값의 치환
		String s5 = "우리나라 대한민국 좋은나라 대한민국"; 
		String s6 = s5.replaceAll("대한", "大韓");
		System.out.println(s6);

		String s7 = "  a  b  c  "; 
		System.out.println(s7); //공백도 String으로 출력됨
		System.out.println(s7.trim());
		//앞 뒤(양쪽)의 공백이 없어짐 오른쪽 값이 한 칸 띄어진 것은 엔터값임.

		System.out.println(s7.replaceAll(" ", ""));
		//중간의 공백을 다 없애주는 값, 공백을 찾아 null로 바꾸어라
		System.out.println(s7.replaceAll("\\s", ""));
		//정규화 표현식(모든 언어에서 공통적으로 사용되는 기호)
		// \\s : 공백이라는 뜻, 공백을 찾아 null로 바꾸어라

		//String str = "abcdefg";
		//char ch = str.charAt(2);
		char ch = "abcdefg".charAt(2);
		System.out.println(ch); //c
		//String은 무조건 인덱스가 0부터 배열된다.

		System.out.println("abcdefg".startsWith("abc"));
		//문자 abcdefg가 abc로 시작하는가? true
		System.out.println("abcdefg".startsWith("abci"));
		//문자 abcdefg가 abci로 시작하는가? false
		System.out.println("자바프로그램".startsWith("자바"));
		//한글도 가능함. true

		System.out.println("abcdefg".length()); //7

		String s8 = "abcdefg";
		String s9 = "abcdffg";
		//사전식 정렬(ASCII코드값의 차이)
		System.out.println(s8.compareTo(s9)); //-1		
		System.out.println(s9.compareTo(s8)); //1	
		//s9를 기준으로 s8을 비교하면 아스키코드값의 차이로 값이 1이 나온다.

	}

}
/*
[length]
배열의  length는 ()를 사용하지 않는다.
배열의 length는 변수 - 값을 넣으면 그 값이 고정이 됨.
다른  length는 메소드 형태임 - 그때그때마다 값이 바뀜.
 */
