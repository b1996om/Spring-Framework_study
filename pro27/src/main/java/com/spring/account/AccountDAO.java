package com.spring.account;

import org.apache.ibatis.session.SqlSession;
import org.springframework.dao.DataAccessException;

public class AccountDAO {
	private SqlSession sqlSession;
	
	public void setSqlSession(SqlSession sqlSession) { //�Ӽ� sqlSession�� ���� �����ϱ� ���� setter�� ����
		this.sqlSession = sqlSession;
	}
	
	public void updateBalance1() throws DataAccessException { //ù��° update���� ������ ȫ�浿 ���¿��� 5000000���� ����
		sqlSession.update("mapper.account.updateBalance1"); //account.xml�� ���ӽ����̽��� updateBalance1
	}
	
	public void updateBalance2() throws DataAccessException { //�ι�° update���� ������ ������ ���¿��� 5000000���� ����
		sqlSession.update("mapper.account.updateBalance2"); //account.xml�� ���ӽ����̽��� updateBalance2
 }
}
