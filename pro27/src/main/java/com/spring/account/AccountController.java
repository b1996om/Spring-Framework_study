package com.spring.account;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class AccountController extends MultiActionController {
	
	private AccountService accService;
	
	public void setService(AccountService accService) { //�Ӽ� accService�� ���� �����ϱ� ���� setter�� �����Ѵ�.
		this.accService = accService;
	}
	
	public ModelAndView sendMoney(HttpServletRequest request, HttpServletRequest response) throws Exception {
		ModelAndView mav = new ModelAndView(); //ModelAndView : ��Ʈ�ѷ��� ó���� ��� �� �� ���ÿ� �ʿ��� ������ ����.
		accService.sendMoney(); //�ݾ��� ��ü�Ѵ�.
		mav.setViewName("result");
		return mav;
	}
}
