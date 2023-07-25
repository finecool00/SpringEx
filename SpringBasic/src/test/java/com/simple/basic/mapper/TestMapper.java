package com.simple.basic.mapper;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.annotations.Param;

import com.simple.command.MemberVO;
import com.simple.command.ScoreVO;

public interface TestMapper {
	//xml에서 실행시킬 추상메서드
	public String getTime();
	
	//insert, update, delete 모두 적용되는 문법 ↓
	
	//insert - 단일값 전달(마이바티스는 단일값을 받는다!!)
	public int insertOne(String name);
	
	//insert - 다중값 전달(매개변수는 하나)
	public int insertTwo(ScoreVO vo);
	
	//insert - 다중값 전달(맵)(매개변수는 하나)
	public int insertThree(HashMap<String, Object> map);
	
	//insert - 다중값 실험(매개변수 여러개) -> @Param("이름") 으로 이름 붙여줄 것
	public int insertFour(@Param("name") String name, 
						  @Param("kor") String kor, 
						  @Param("eng") String eng);
	
	
	//update - 다중값 전달
	public boolean updateOne(ScoreVO vo);
	
	//select - 파라미터를 넘기는 과정은 위와 동일합니다.
	public ScoreVO selectOne(int num);
	
	//select - 반환유형이 맵
	public HashMap<String, Object> selectTwo(int num);
	
	//한행을 맵으로 처리하는데, 여러행이라면????
	public ArrayList<HashMap<String, Object>> selectThree();
	
	
	//join 처리
	//M:1방식(M쪽이 주인이 됨) - ORM은 M쪽에 변수를 추가
	public ArrayList<ScoreVO> joinOne();
	
	//1:M방식 - ORM은 직접처리!!
	public MemberVO joinTwo(String id);
}
