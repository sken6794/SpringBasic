package com.simple.basic;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.simple.basic.mapper.TestMapper;
import com.simple.command.MemberVO;
import com.simple.command.ScoreVO;

@RunWith(SpringJUnit4ClassRunner.class) //Junit 테스트 진행
@ContextConfiguration("file:src/main/webapp/WEB-INF/config/root-context.xml") //테스트를 진행할 스프링 설정파일
public class JDBCMybatis {
	
	@Autowired
	TestMapper testMapper;
	
//	@Test
//	public void testCode01() {
//			int result = testMapper.insertOne("test");
//			System.out.println("성골실패  : "+result);
//	}
	
//	@Test
//	public void testCode02() {
//		ScoreVO vo = new ScoreVO("0", "test", "100", "99");
//		testMapper.insertTwo(vo);
//	}
//	
//	@Test
//	public void testCode03() {
//		HashMap<String, Object> map = new HashMap<>();
//		map.put("name", "임영웅");
//		map.put("kor", "100");
//		map.put("eng", "97");
//		testMapper.insertThree(map);
//	}
	
	
//	@Test
//	public void testCode04() {
//		testMapper.insertFour("윤딴딴", "90", "85");
//	}
	
	
//	@Test
//	public void testCode05() {
//		ScoreVO vo = new ScoreVO("11", "비타민", "500", "99");
//		testMapper.updateOne(vo);
//	}
	
//	@Test
//	public void testCode06() {
//		int num = 11;
//		ScoreVO vo = testMapper.selectOne(num);
//		System.out.println(vo.toString());
//	}
	
//	@Test
//	public void testCode07() {
//		HashMap<String, Object> map = testMapper.selectTwo(12);
//		System.out.println(map.toString());
//	}
	
//	@Test
//	public void testCode08() {
//		ArrayList<HashMap<String, Object>> list = testMapper.selectThree();
//		System.out.println(list.toString());
//	}
	
//	@Test
//	public void testCode09() {
//		ArrayList<ScoreVO> list = testMapper.joinOne();
//		System.out.println(list.toString());
//	}
	
	@Test
	public void testCode10() {
		MemberVO vo = testMapper.joinTwo("test");
		System.out.println(vo.toString());
	}
}
