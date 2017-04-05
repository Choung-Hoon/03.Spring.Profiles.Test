package com.nobel77.qrisma.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nobel77.qrisma.bean.annotation.Customer;
import com.nobel77.qrisma.bean.annotation.Customer1;
import com.nobel77.qrisma.bean.annotation.Customer2;

public class TestAnnotation {
	private Customer customer;
	private Customer1 customer1;;
	private Customer2 customer2;

	@Before
	public void setUp() throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				//new String[] { "/spring-config/byAutoDetect-context.xml" });
				new String[] { "/spring-config/annotation-context.xml" });

		customer = (Customer) context.getBean("customer");
		customer1 = (Customer1) context.getBean("customer1");
		customer2 = (Customer2) context.getBean("customer2");

	}

	@Test
	public void test() {
		System.out.println(customer);
		System.out.println(customer1);
		System.out.println(customer2);
	}

}
