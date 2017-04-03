package com.nobel77.qrisma.test;

import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nobel77.qrisma.collection.Customer;

public class CollectionTest {
	private Customer customer;
	
	@Before
	public void setUp() throws Exception {
		String coinfigLocation = "/spring-config/collection-context.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(coinfigLocation);
		customer = context.getBean("CustomerBean", com.nobel77.qrisma.collection.Customer.class);
	}

	@Test
	public void test() {
		System.out.println(customer);
	}

}
