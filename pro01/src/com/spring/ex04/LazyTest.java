package com.spring.ex04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class LazyTest {
	public static void main(String[] args) {
		
		// FileSystemXmlApplicationContext : ���ϰ�η� ������ ���� xml�� �о� �������� �ε�
		ApplicationContext  context = new FileSystemXmlApplicationContext("lazy.xml"); 
		System.out.println("SecondBean ���");
		context.getBean("secondBean");
	}
}
