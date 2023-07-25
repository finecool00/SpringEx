package com.simple.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simple.command.ScoreVO;
import com.simple.mapper.ScoreMapper;

@Service("scoreService") //컴포넌트 스캔에 읽히면 자동으로 빈 등록
public class ScoreServiceImpl implements ScoreService {

	@Autowired //service -> mapper 연결
	ScoreMapper scoreMapper;
	
	@Override
	public void scoreRegist(ScoreVO vo) {
		scoreMapper.scoreRegist(vo);
		
	}

	@Override
	public ArrayList<ScoreVO> getScores() {

		return scoreMapper.getScores();
	}

	@Override
	public void scoreDelete(int index) {
		
		scoreMapper.scoreDelete(index);
	}

//	//DAO영역
//	@Autowired
//	@Qualifier("xxx")
//	ScoreDAO scoreDAO;
//	
//	
//	
//	@Override
//	public void scoreRegist(ScoreVO vo) {
//		
//		scoreDAO.scoreRegist(vo);
//		
//	}
//
//
//
//	@Override
//	public ArrayList<ScoreVO> getScores() {
////		ArrayList<ScoreVO> list = scoreDAO.getScores();
////		return list;
//		
//		return scoreDAO.getScores();
//	}
//
//
//	@Override
//	public void scoreDelete(int index) {
//		
//		scoreDAO.scoreDelete(index);
//		
//	}
	
	

	
	
	
}
