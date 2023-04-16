package com.spring.news.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.dao.DataAccessException;

import com.spring.news.vo.NewsVO;

public class NewsDAOImpl implements NewsDAO{
	
	private SqlSession sqlSession;
	
	public void setSqlSession (SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public List selectAllNewsList() throws DataAccessException {
		List<NewsVO> newsList = null;
		newsList = sqlSession.selectList("mapper.news.selectAllNewsList");
		return newsList ;
	}

	@Override
	public int insertNews(NewsVO newsVO) throws DataAccessException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteNews(String id) throws DataAccessException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public NewsVO selectNewsById(String id) throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateNews(NewsVO newsVO) throws DataAccessException {
		// TODO Auto-generated method stub
		return 0;
	}

}
