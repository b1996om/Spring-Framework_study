package com.spring.news.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.spring.news.service.NewsService;
import com.spring.news.service.NewsServiceImpl;

public class NewsControllerImpl extends MultiActionController implements NewsController {
	
	private NewsService newsService;
	
	public void setNewsService(NewsService newsService) {
		this.newsService = newsService;
	}
	
	@Override
	public ModelAndView listNews(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String viewName = getViewName(request); //viewName : 
		List newsList = newsService.listNews();
		ModelAndView mav = new ModelAndView(viewName); //��Ʈ�ѷ��� Ŭ���̾�Ʈ�� ��û�� ó���� ����� View�̸��� ModelAndView�� �����ؼ� DispatcherServlet���� ��ȯ�Ѵ�.
		mav.addObject("newsList", newsList);
		return mav;
	}

	@Override
	public ModelAndView addNews(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelAndView removeNews(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelAndView modNews(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	private String getViewName(HttpServletRequest request) throws Exception {
		String contextPath = request.getContextPath();
		String uri = (String) request.getAttribute("javax.servlet.include.request_uri");
		if(uri == null || uri.trim().equals("")) {
			uri = request.getRequestURI();
		}
		
		int begin = 0;
		if(!(contextPath == null || contextPath.equals(""))) {
			begin = contextPath.length();
		}
		
		int end = 0;
		if(uri.indexOf(";") != -1) {
			end = uri.indexOf(";");
		} else if (uri.indexOf("?") != -1 ) {
			end = uri.indexOf("?");
		} else {
			end = uri.length();
		}
		
		String fileName = uri.substring(begin,end);
		if(fileName.indexOf(".") != -1) {
			fileName = fileName.substring(0,fileName.lastIndexOf("."));
		}
		if(fileName.lastIndexOf("/") != -1) {
			fileName = fileName.substring(fileName.lastIndexOf("/"),fileName.length());
		}
		return fileName;
				
	}
}
