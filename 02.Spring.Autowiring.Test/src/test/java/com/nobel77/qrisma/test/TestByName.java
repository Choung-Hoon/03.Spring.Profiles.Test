package com.nobel77.qrisma.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nobel77.qrisma.bean.Customer;

public class TestByName {
	private Customer customer;

	@Before
	public void setUp() throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "/spring-config/byName-context.xml" });

		customer = (Customer) context.getBean("customer");

	}

	@Test
	public void test() {	
		System.out.println(customer);
	}

}
