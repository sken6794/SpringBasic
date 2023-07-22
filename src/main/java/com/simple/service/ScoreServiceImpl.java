package com.simple.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.simple.command.ScoreVO;
import com.simple.dao.ScoreDAO;
import com.simple.mapper.ScoreMapper;

//service 어노테이션이 컴포넌트스캔에 읽히면 자동으로 빈으로 등록된다.
//해당 service interface를 상속받는 구현체가 많은 경우 service를 autowired로 선언할 때
// 에러가 발생할 수 있기 때문에 autowired를 붙인 service가 인식할 수 있는 이름을 service옆에 달아줄 수 있다.
// autowired붙이는 service에 qualifier 를 같이 붙인다.
@Service("scoreService")
public class ScoreServiceImpl implements ScoreService{

	

	//DAO영역 필드로 선언
	/*
	@Autowired
	@Qualifier("scoreDAO")
	ScoreDAO scoreDAO;
	
	@Override
	public void scoreRegist(ScoreVO vo) {
		System.out.println(vo.toString());
		scoreDAO.scoreRegist(vo);
		
	}

	@Override
	public ArrayList<ScoreVO> getScores() {
		return scoreDAO.getScores();
	}

	@Override
	public void scoreDelete(int index) {
		
		scoreDAO.scoreDelete(index);
	}
	*/
	
	/////////////mapper로 이제 연결//////////
	@Autowired
	ScoreMapper scoreMapper; //mybatis와 연결한 매퍼인터페이스와 연결
	
	
	@Override
	public void scoreRegist(ScoreVO vo) {
		scoreMapper.scoreRegist(vo);
	}

	@Override
	public ArrayList<ScoreVO> getScores() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void scoreDelete(int index) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
}








