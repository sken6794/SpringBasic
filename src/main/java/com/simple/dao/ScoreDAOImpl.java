package com.simple.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.simple.command.ScoreVO;

@Repository("scoreDAO") //컴포넌트 스캔에 읽히면 자동으로 빈 등록
public class ScoreDAOImpl implements ScoreDAO{

	
	//원래 여기서 DB랑 연결해서 정보갖고 오고 하는 곳
	//데이터역할이라고 가정
	ArrayList<ScoreVO> list = new ArrayList<>();
	
	
	
	@Override
	public void scoreRegist(ScoreVO vo) {
		list.add(vo);
		System.out.println(list.toString()+"DAO메소드");
		
	}



	@Override
	public ArrayList<ScoreVO> getScores() {
		System.out.println("getScores메소드 실행");
		return list;
	}



	@Override
	public void scoreDelete(int index) {
		System.out.println("scoreDelete메소드 실행");
		list.remove(index);
		
	}

}
