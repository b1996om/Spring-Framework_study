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
}

