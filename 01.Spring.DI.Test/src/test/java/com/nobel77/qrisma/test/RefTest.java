package com.nobel77.qrisma.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nobel77.qrisma.beans.Family;

public class RefTest {

	private Family family1, family2, family3;

	@Before
	public void setUp() throws Exception {
		String coinfigLocation = "/spring-config/ref-context.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(
				coinfigLocation);
		
		try {
			family1 = context.getBean("family1",
					com.nobel77.qrisma.beans.Family.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			family2 = context.getBean("family2",
					com.nobel77.qrisma.beans.Family.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			family3 = context.getBean("family3",
					com.nobel77.qrisma.beans.Family.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void test() {
		System.out.println(">>>>>>>>>>>>>> 다른 빈에 대한 참조를 이용한 생성자 할당1");
		System.out.println(family1);
		System.out.println(">>>>>>>>>>>>>> 없는 빈에 대한 참조를 이용한 생성자 할당2");
		System.out.println(family2);
		System.out.println(">>>>>>>>>>>>>> 다른 빈에 대한 참조를 이용한 생성자 할당3");
		System.out.println(family3);
	}

}
