package com.spring.ex04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class LazyTest {
	public static void main(String[] args) {
		
		// FileSystemXmlApplicationContext : 파일경로로 지정된 곳의 xml을 읽어 설정정보 로딩
		ApplicationContext  context = new FileSystemXmlApplicationContext("lazy.xml"); 
		System.out.println("SecondBean 얻기");
		context.getBean("secondBean");
	}
}
