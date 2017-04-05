package com.nobel77.qrisma.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nobel77.qrisma.bean.Panda;

public class TestByAutoDetect {
	private Panda panda;

	@Before
	public void setUp() throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				//new String[] { "/spring-config/byAutoDetect-context.xml" });
				new String[] { "/spring-config/byAutoDetect-context.xml" });

		panda = (Panda) context.getBean("panda");

	}

	@Test
	public void test() {
		System.out.println(panda);
	}

}
