package com.simple.command;

public class BoardVO {
	private int num;
	private String name;
	private String title;
	private String content;
	private String etc;
	
	public BoardVO() {
		// TODO Auto-generated constructor stub
	}

	public BoardVO(int num, String name, String title, String content, String etc) {
		super();
		this.num = num;
		this.name = name;
		this.title = title;
		this.content = content;
		this.etc = etc;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getEtc() {
		return etc;
	}

	public void setEtc(String etc) {
		this.etc = etc;
	}
	
	
}
