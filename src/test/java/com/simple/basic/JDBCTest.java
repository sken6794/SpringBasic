package com.simple.basic;

import java.sql.Connection;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.simple.basic.mapper.TestMapper;

@RunWith(SpringJUnit4ClassRunner.class) //Junit 테스트 진행
@ContextConfiguration("file:src/main/webapp/WEB-INF/config/root-context.xml") //테스트를 진행할 스프링 설정파일
public class JDBCTest {
	
//	@Autowired
//	private DataSource dataSource; //HikariDataSource 객체 주입
//	
//	
//	@Test //junit이 해당 메소드를 실행
//	public void testCode() {
//		System.out.println("실행됨 test메소드");
//		try {
//			Connection connection =  dataSource.getConnection();
//			
//			System.out.println(connection);//null이 아니라는 건 데이터베이스 연결이 성공했다는 것.
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//	}
	
	//
//	@Autowired
//	private SqlSessionFactory sqlSessionFactory;
	
	@Autowired
	private TestMapper testMapper; //마이바티스 인터페이스
	
	@Test
	public void testCode2() {
		//System.out.println(sqlSessionFactory);
		String re = testMapper.getTime();
		System.out.println(re);
	}
	
	
	
	
	
	
	
}
