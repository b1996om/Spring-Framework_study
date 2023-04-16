package com.spring.account;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class AccountController extends MultiActionController {
	
	private AccountService accService;
	
	public void setService(AccountService accService) { //속성 accService에 빈을 주입하기 위해 setter를 구현한다.
		this.accService = accService;
	}
	
	public ModelAndView sendMoney(HttpServletRequest request, HttpServletRequest response) throws Exception {
		ModelAndView mav = new ModelAndView(); //ModelAndView : 컨트롤러가 처리한 결과 및 뷰 선택에 필요한 정보를 저장.
		accService.sendMoney(); //금액을 이체한다.
		mav.setViewName("result");
		return mav;
	}
}
