package com.spring.account;

import org.apache.ibatis.session.SqlSession;
import org.springframework.dao.DataAccessException;

public class AccountDAO {
	private SqlSession sqlSession;
	
	public void setSqlSession(SqlSession sqlSession) { //속성 sqlSession에 빈을 주입하기 위해 setter를 구현
		this.sqlSession = sqlSession;
	}
	
	public void updateBalance1() throws DataAccessException { //첫번째 update문을 실행해 홍길동 계좌에서 5000000원을 차감
		sqlSession.update("mapper.account.updateBalance1"); //account.xml의 네임스페이스의 updateBalance1
	}
	
	public void updateBalance2() throws DataAccessException { //두번째 update문은 실행해 김유신 계좌에서 5000000원을 증액
		sqlSession.update("mapper.account.updateBalance2"); //account.xml의 네임스페이스의 updateBalance2
 }
}
