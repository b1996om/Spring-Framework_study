package com.spring.ex02;

import com.spring.ex01.PersonService;

public class PersonServiceImpl implements PersonService {
	
	private String name;
	private int age;
	
	public PersonServiceImpl(String name) { //person.xml에서 인자가 한개인 생성자 설정시 사용된다.
		this.name= name;
	}
	
	public PersonServiceImpl(String name, int age) {  //person.xml에서 인자가 두개인 생성자 설정시 사용된다.
		this.name = name;
		this.age = age;
	}
	
	@Override
	public void sayHello() {
		System.out.println("이름:"+name);
		System.out.println("나이:"+age + "살");
		
	}

}
