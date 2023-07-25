package com.simple.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.simple.command.ScoreVO;

//DAO를 만들어서.... 서비스영역에서 사용됨...!!
@Repository("xxx") //컴포넌트 스캔에 읽히면 자동으로 빈으로 등록
public class ScoreDAOImpl implements ScoreDAO {
	
	//데이터역할이라고 가정(DB연결하면 DataSource dataSource로 연결한다!)
	ArrayList<ScoreVO> list = new ArrayList<ScoreVO>();
	
	@Override
	public void scoreRegist(ScoreVO vo) {
		
		list.add(vo);
		System.out.println(vo.toString());
	}

	@Override
	public ArrayList<ScoreVO> getScores() {
		return list;
	}

	@Override
	public void scoreDelete(int index) {
		
		list.remove(index); //삭제
		
	}

}
