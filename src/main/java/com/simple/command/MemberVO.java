package com.simple.command;

import java.util.ArrayList;

public class MemberVO {
	// 1
	private String id;
	private String addr;
	//member 정보는 하나만 넣고
	// score 정보는 여러개 넣을 것
	// M
	private ArrayList<ScoreVO> list;
	
	public MemberVO() {
		// TODO Auto-generated constructor stub
	}

	public MemberVO(String id, String addr, ArrayList<ScoreVO> list) {
		super();
		this.id = id;
		this.addr = addr;
		this.list = list;
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

	public ArrayList<ScoreVO> getList() {
		return list;
	}

	public void setList(ArrayList<ScoreVO> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", addr=" + addr + ", list=" + list + "]";
	}
	
	
}
