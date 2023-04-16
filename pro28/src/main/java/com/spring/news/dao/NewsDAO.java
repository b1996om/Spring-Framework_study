package com.spring.news.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.spring.news.vo.NewsVO;

public interface NewsDAO {
	public List selectAllNewsList() throws DataAccessException;
	public int insertNews(NewsVO newsVO) throws DataAccessException;
	public int deleteNews(String id) throws DataAccessException;
	public NewsVO selectNewsById(String id)throws DataAccessException;
	public int updateNews(NewsVO newsVO) throws DataAccessException;
}
