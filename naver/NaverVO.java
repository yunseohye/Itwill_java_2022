package com.naver;

public class NaverVO {

	private String id;
	private String pw;
	private String pw2;	
	private String name;
	private String gender;
	private String birth;
	private String email;
	private String tel;



	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public void setPw2(String pw2) {
		this.pw2 = pw2;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Override
	public String toString() {

		if(id==null||id.equals("")) {
			return null;
		}

		String str = String.format("아이디: %2s \n비밀번호: %2s"
				+ " \n이름: %2s \n성별: %2s \n생년월일: %2s \n이메일: %2s \n전화번호: %2s", 
				id,pw,name,gender,birth,email,tel);

		return str;
	}



}
