package com.spring.account;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(propagation = Propagation.REQUIRED) //@Transactional�� �̿��� AccountServiceŬ������ ��� �޼��忡 Ʈ������� �����Ѵ�.
public class AccountService {
		
	private AccountDAO accDAO;
		
	public void setAccDAO(AccountDAO accDAO) { //�Ӽ� addDAO�� ���� �����ϱ� ���� setter�� �����Ѵ�.
		this.accDAO = accDAO;
	}
	
	public void sendMoney() throws Exception {
		accDAO.updateBalance1(); //sendMoney() �޼��� ȣ�� �� accDAO�� �ΰ��� sql���� �����Ѵ�.(account.xml������ sql��)
		accDAO.updateBalance2();
			
	  }
	}
