package com.simple.command;

public class ScoreVO {
	private String num;
	private String name;
	private String kor;
	private String eng;

	private String id;
	private String addr;

	public ScoreVO() {
		// TODO Auto-generated constructor stub
	}

	public String getNum() {
		return num;
	}


	public void setNum(String num) {
		this.num = num;
	}

	public ScoreVO(String num, String name, String kor, String eng) {
		super();
		this.num = num;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}




	

	@Override
	public String toString() {
		return "ScoreVO [num=" + num + ", name=" + name + ", kor=" + kor + ", eng=" + eng + ", id=" + id + ", addr="
				+ addr + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKor() {
		return kor;
	}

	public void setKor(String kor) {
		this.kor = kor;
	}

	public String getEng() {
		return eng;
	}

	public void setEng(String eng) {
		this.eng = eng;
	}


}
