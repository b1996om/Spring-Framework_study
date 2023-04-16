package com.spring.ex01;

public class PersonServiceImpl implements PersonService {
	private String name;
	private int age;
	
	public void setName(String name) { //setter를 이용함
		this.name = name;
	}
	
	@Override
	public void sayHello() {
		System.out.println("이름:" +name );
		System.out.println("나이:" +age );
	}
	
}
