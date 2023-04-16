package com.spring.ex02;

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
	/*
	public List<MemberVO> selectAllMemberList() {
		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();
		List<MemberVO> memlist = null;
		memlist = session.selectList("mapper.member.selectAllMemberList");
		
		return memlist;
	} */

	public String selectName() {
		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();
		String name = session.selectOne("mapper.member.selectName");
		return name;
	}
	
	public int selectPwd() {
		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();
		int pwd = session.selectOne("mapper.member.selectPwd");
		return pwd;
	}
}

