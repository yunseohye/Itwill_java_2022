package com.excep;

public class OperationAuthenticator {

	public void inputFormat(String str) throws AuthenticationException {
		
		String[] temp = str.split(",");
		
		if(temp.length!=2) {
			throw new AuthenticationException("숫자 입력 형식 오류: " + str );
		}
		
	}
	
	@SuppressWarnings("unused") 
	//사용하지 않은 변수에 대한 노란색 줄을 보이지 않도록 하여라.
	//값은 받아내지만 그 값을 쓰지 않을 경우.
	public void number(String str) throws AuthenticationException {
		
		try {

			if(str.indexOf(".")!=-1) { //실수
				
				double num = Double.parseDouble(str);
				
			} else {
				
				int num = Integer.parseInt(str);
				
			}
			
		} catch (NumberFormatException e) {
		
			throw new AuthenticationException("숫자 변환 불가: " + str);
			
		}
		
	}

	public void operator(char ch) throws AuthenticationException {
		
		switch(ch) {
		case '+':case '-':case '*':case '/':
			return; //+,-,*,/일 경우 제대로 입력했기 때문에 아무것도 실행하지않음
		default :
			throw new AuthenticationException("연산자 오류: " + ch);
		
		}
		
	}
	
	
}
