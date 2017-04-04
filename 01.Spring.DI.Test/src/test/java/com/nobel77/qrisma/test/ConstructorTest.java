package com.nobel77.qrisma.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nobel77.qrisma.beans.Customer;
import com.nobel77.qrisma.beans.Me;

public class ConstructorTest {
	private Me me1, me2;
	private Customer customer, customer1, customer2, customer3, customer4, customer5;
	
	@Before
	public void setUp() throws Exception {
		String coinfigLocation = "/spring-config/constructor-context.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(coinfigLocation);
		me1 = context.getBean("me1", com.nobel77.qrisma.beans.Me.class);
		me2 = context.getBean("me2", com.nobel77.qrisma.beans.Me.class);
				
		customer1 = (Customer)context.getBean("CustomerBean1");
		customer2 = (Customer)context.getBean("CustomerBean2");
		customer3 = (Customer)context.getBean("CustomerBean3");
		customer4 = (Customer)context.getBean("CustomerBean4");
		customer5 = (Customer)context.getBean("CustomerBean5");
	}

	@Test
	public void test() {
		System.out.println(">>>>>>>>>>>>>> 생성자 인젝션1");
		System.out.println(me1);
		System.out.println(">>>>>>>>>>>>>> 생성자 인젝션2");
		System.out.println(me2);
		System.out.println(">>>>>>>>>>>>>> 생성자 인젝션3");
		System.out.println(customer1);
		System.out.println(customer2);
		System.out.println(customer3);
		System.out.println(customer4);
		System.out.println(customer5);
	}

}
