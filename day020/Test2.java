package com.day020;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//replaceAll

public class Test2 {

	public static String replaceAll(String str, String oldStr, String newStr) {
		
		if(str==null) {
			return null;
		}
		
		Pattern p = Pattern.compile(oldStr);
		
		Matcher m = p.matcher(str); //str에서 oldStr을 찾아넣어라
		
		StringBuffer sb = new StringBuffer();
		
		while(m.find()) {
			m.appendReplacement(sb, newStr);
		}
		
		m.appendTail(sb);
		//마지막으로 찾은 데이터 다음에 있는 문장을 이어 붙여줌.
		//tail없으면 우리나라 大韓민국 大韓독립 大韓까지만 출력되고 
		//~~~의 건아...는 출력이 되지 않는다.
		
		return sb.toString();
		
	}
	
	public static void main(String[] args) {

		String str = "우리나라 대한민국 대한독립 대한의 건아...";
		
		String s = Test2.replaceAll(str, "대한", "大韓");
		
		System.out.println(s);
		
	}

}
