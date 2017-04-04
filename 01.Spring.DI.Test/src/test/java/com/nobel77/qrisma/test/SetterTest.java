package com.nobel77.qrisma.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nobel77.qrisma.beans.Me;

public class SetterTest {
	private Me me1, me2;

	@Before
	public void setUp() throws Exception {
		String coinfigLocation = "/spring-config/setter-context.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(coinfigLocation);
		me1 = context.getBean("me1", com.nobel77.qrisma.beans.Me.class);
		me2 = context.getBean("me2", com.nobel77.qrisma.beans.Me.class);
	}

	@Test
	public void test() {
		System.out.println(">>>>>>>>>>>>>> 세터 인젝션1");
		System.out.println(me1);
		System.out.println(">>>>>>>>>>>>>> 세터 인젝션2");
		System.out.println(me2);
	}

}
