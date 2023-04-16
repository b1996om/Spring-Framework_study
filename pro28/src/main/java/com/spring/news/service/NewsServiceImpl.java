package com.spring.news.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.spring.news.dao.NewsDAO;
import com.spring.news.vo.NewsVO;

public class NewsServiceImpl implements NewsService {
	private NewsDAO newsDAO;
	
	public void setNewsDAO(NewsDAO newsDAO) {
		this.newsDAO = newsDAO;
	}

	@Override
	public List listNews() throws DataAccessException {
		List newsList = null;
		newsList = newsDAO.selectAllNewsList();
		return newsList;
	}

	@Override
	public int addNews(NewsVO newsVO) throws DataAccessException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int removeNews(String id) throws DataAccessException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public NewsVO modNews(String id) throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateNews(NewsVO newsVO) throws DataAccessException {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
