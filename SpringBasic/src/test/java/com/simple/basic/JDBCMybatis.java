package com.simple.basic;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.simple.basic.mapper.TestMapper;
import com.simple.command.MemberVO;

@RunWith(SpringJUnit4ClassRunner.class) //Junit테스트 진행
@ContextConfiguration("file:src/main/webapp/WEB-INF/config/root-context.xml") //테스트를....
public class JDBCMybatis {

	
	@Autowired
	private TestMapper testMapper;
	
//	@Test
//	public void testCode01() {
//		int result = testMapper.insertOne("test");
//		System.out.println("성공실패?:" + result);
//		//insert, update, delete는 boolean형태나 int형태에서 성공시 1, 실패시 0반환
//		//성공실패여부 확인 가능
//	}
	
	
//	@Test
//	public void testCode02() {
//		ScoreVO vo = new ScoreVO("0", "test", "100", "90");
//		int result = testMapper.insertTwo(vo);
//		System.out.println("성공실패?:" + result);
//	}
	
//	@Test
//	public void testCode03() {
//		HashMap<String, Object> map = new HashMap<>();
//		map.put("name", "맵을통한");
//		map.put("kor", "100");
//		map.put("eng", "100");
//	
//		int result = testMapper.insertThree(map);
//		System.out.println("성공실패?:" + result);
//	}
	
//	@Test
//	public void testCode04() {
//		
//		int result = testMapper.insertFour("파람", "100", "200");
//		
//		System.out.println("성공실패?:" + result);
//		
//	}
	
//	@Test
//	public void testCode05() {
//		ScoreVO vo = new ScoreVO("4", "admin", "100", "100");
//		boolean result = testMapper.updateOne(vo);
//		System.out.println(result);
//	}
	
//	@Test
//	public void testCode06() {
//		ScoreVO vo = testMapper.selectOne(3);
//		System.out.println(vo.toString());
//	}
	
//	@Test
//	public void testCode07() {
//		HashMap<String, Object> map = testMapper.selectTwo(4);
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
