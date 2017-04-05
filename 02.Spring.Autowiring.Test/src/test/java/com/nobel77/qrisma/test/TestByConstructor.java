package com.nobel77.qrisma.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nobel77.qrisma.bean.Developer;
import com.nobel77.qrisma.bean.Person;

public class TestByConstructor {
	private Developer developer;

	@Before
	public void setUp() throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "/spring-config/byConstructor-context.xml" });

		developer = (Developer) context.getBean("developer");

	}

	@Test
	public void test() {
		System.out.println(developer);
	}

}
