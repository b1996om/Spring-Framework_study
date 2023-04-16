package com.spring.ex03;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MemberDAO {
	public static SqlSessionFactory sqlMapper = null;
	
	private static SqlSessionFactory getInstance() {
		if(sqlMapper == null) {
			try {
				String resource = "mybatis/SqlMapConfig.xml"; //MemberDAO의 각 메서드 호출 시 sqlMapConfig.xml에서 설정 정보를 읽은 후 db와 연동준비를 한다.
				Reader reader = Resources.getResourceAsReader(resource);
				sqlMapper = new SqlSessionFactoryBuilder().build(reader); //마이바티스를 이용하는 sqlMapper 객체를 가져온다.
				reader.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		 } return sqlMapper;
	}
	
	public List<MemberVO> selectAllMemberList() {
		sqlMapper = getInstance(); //getInstance() : db연동하겠다.(아직연동은 안된상태)
		SqlSession session = sqlMapper.openSession(); //openSession() : db와 이클립스를 연동한다.
		List<MemberVO> memlist = null; //List<MemberVO>제네릭형
		memlist = session.selectList("mapper.member.selectAllMemberList"); //selectList : select의 list형?, 여기서 list형으로 받음!
		return memlist;
	} 
    
	public MemberVO selectMemberById(String id) {
		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();
		MemberVO memberVO = session.selectOne("mapper.member.selectMemberById", id); //selectOne : id에 대한 select문을 실행한 후 지정한 타입으로 한 개의 레코드를 반환. 따옴표 뒤에는 조건(id는 파라미터값)
		return memberVO;
	}

	public List<MemberVO> selectMemberByPwd(int pwd) {
		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();
		List<MemberVO> membersList = null;
		membersList = session.selectList("mapper.member.selectMemberByPwd", pwd);
		return membersList;
	}
}

