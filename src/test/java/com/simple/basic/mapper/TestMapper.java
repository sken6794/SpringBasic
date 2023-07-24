package com.simple.basic.mapper;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.annotations.Param;

import com.simple.command.MemberVO;
import com.simple.command.ScoreVO;

public interface TestMapper {
	// xml에서 실행시킬 추상메소드
	public String getTime();
	
	//insert - 단일값 전달할 때
	public int insertOne(String name);
	
	//insert - 다중값 전달 (추천하는 방법)
	public int insertTwo(ScoreVO vo);
	
	//insert - 다중값 전달(map 형식)
	public int insertThree(HashMap<String, Object> map);
	
	//insert - 매개변수가 2개 이상 => Param("이름") 이란 방식으로 mapper.xml 에서 인식할 수 있게 네이밍을 해줘야 함 
	public int insertFour(@Param("name") String name, @Param("kor")String kor, @Param("eng")String eng);
	
	//update
	public boolean updateOne(ScoreVO vo);
	
	//select - 파라미터를 넘기는 과정은 위와 동일하다.
	public ScoreVO selectOne(int num);
	
	//select - 반환 유형이 Map
	public HashMap<String, Object> selectTwo(int num);
	
	//여러 행을 반환받는데 map을 사용한다면?
	public ArrayList<HashMap<String, Object>> selectThree();
	
	//join처리
	//M : 1 방식 - ORM은 M 쪽에 변수를 추가
	public ArrayList<ScoreVO> joinOne();
	
	//1:M 방식 - ORM은 직접처리
	public MemberVO joinTwo(String name);
	
	
	
	
	
	
	
	
	
}

















