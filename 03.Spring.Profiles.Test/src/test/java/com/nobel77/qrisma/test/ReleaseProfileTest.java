package com.nobel77.qrisma.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.nobel77.qrisma.beans.Person;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/app-config.xml")
@ActiveProfiles("dev")
public class ReleaseProfileTest {

	@Autowired
	private Person person;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		System.out.println(person);
	}
}