package com.spring.ex02;

import com.spring.ex01.PersonService;

public class PersonServiceImpl implements PersonService {
	
	private String name;
	private int age;
	
	public PersonServiceImpl(String name) { //person.xml���� ���ڰ� �Ѱ��� ������ ������ ���ȴ�.
		this.name= name;
	}
	
	public PersonServiceImpl(String name, int age) {  //person.xml���� ���ڰ� �ΰ��� ������ ������ ���ȴ�.
		this.name = name;
		this.age = age;
	}
	
	@Override
	public void sayHello() {
		System.out.println("�̸�:"+name);
		System.out.println("����:"+age + "��");
		
	}

}
