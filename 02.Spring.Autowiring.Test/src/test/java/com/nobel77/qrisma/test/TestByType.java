package com.nobel77.qrisma.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nobel77.qrisma.bean.Person;

public class TestByType {
	private Person person;

	@Before
	public void setUp() throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "/spring-config/byType-context.xml" });

		person = (Person) context.getBean("person");

	}

	@Test
	public void test() {
		System.out.println(person);
	}

}
