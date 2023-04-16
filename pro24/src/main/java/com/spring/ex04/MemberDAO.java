package com.spring.ex04;

import java.io.Reader;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MemberDAO {
	public static SqlSessionFactory sqlMapper = null;
	
	private static SqlSessionFactory getInstance() {
		if(sqlMapper == null) {
			try {
				String resource = "mybatis/SqlMapConfig.xml"; //MemberDAO�� �� �޼��� ȣ�� �� sqlMapConfig.xml���� ���� ������ ���� �� db�� �����غ� �Ѵ�.
				Reader reader = Resources.getResourceAsReader(resource);
				sqlMapper = new SqlSessionFactoryBuilder().build(reader); //���̹�Ƽ���� �̿��ϴ� sqlMapper ��ü�� �����´�.
				reader.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		 } return sqlMapper;
	}
	
	public List<MemberVO> selectAllMemberList() {
		sqlMapper = getInstance(); //getInstance() : db�����ϰڴ�.(���������� �ȵȻ���)
		SqlSession session = sqlMapper.openSession(); //openSession() : db�� ��Ŭ������ �����Ѵ�.
		List<MemberVO> memlist = null; //List<MemberVO>���׸���
		memlist = session.selectList("mapper.member.selectAllMemberList"); //selectList : select�� list��?, ���⼭ list������ ����!
		return memlist;
	} 
    
	public MemberVO selectMemberById(String id) {
		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();
		MemberVO memberVO = session.selectOne("mapper.member.selectMemberById", id); //selectOne : id�� ���� select���� ������ �� ������ Ÿ������ �� ���� ���ڵ带 ��ȯ. ����ǥ �ڿ��� ����(id�� �Ķ���Ͱ�)
		return memberVO;
	}

	public List<MemberVO> selectMemberByPwd(int pwd) {
		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();
		List<MemberVO> membersList = null;
		membersList = session.selectList("mapper.member.selectMemberByPwd", pwd);
		return membersList;
	}
	
	public int insertMember(MemberVO memberVO) {
		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();
		int result = 0;
		result=session.insert("mapper.member.inserMemer", memberVO);
		session.commit();
		return result;
	}
	
	public int insertMember2(Map<String, String> memberMap) {
		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();
		int result = 0;
		result = session.insert("mapper.member.insertMember2", memberMap);
		session.commit();
		return result;
	}
	
	public int updateMember(MemberVO memberVO) {
		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();
		int result = session.update("mapper.member.updateMember", memberVO);
		session.commit();
		return result;
	}
	
	public int deleteMember(String id) {
		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();
		int result=0;
		result = session.delete("mapper.member.deleteMember", id);
		session.commit();
		return result;
	}
	
	public List<MemberVO> searchMember(MemberVO memberVO) {
		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();
		List list = session.selectList("mapper.member.searchMember", memberVO);
		return list;
	}
	
	public List<MemberVO> foreachSelect(List nameList) {
		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();
		List list = session.selectList("mapper.member.searchSelect", nameList);
		return list;
	}
	
	public int foreachInsert(List memList) {
		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();
		int result = session.insert("mapper.member.foreachInsert", memList);
		session.commit();
		return result;
	}
	
	public List<MemberVO> selectLike(String name) {
		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();
		List list = session.selectList("mapper.nenber.selectLike", name);
		return list;
	}
}

