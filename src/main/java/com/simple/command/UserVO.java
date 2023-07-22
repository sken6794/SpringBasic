package com.simple.command;

public class UserVO {
	private String id;
	private String pw;
	
	public UserVO() {
		// TODO Auto-generated constructor stub
	}

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

	public UserVO(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}
	
	

}
