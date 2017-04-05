package com.nobel77.qrisma.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.nobel77.qrisma.beans.Person;

/*
 *
 *@ContextConfiguration("/app-config.xml")
 * @ContextConfiguration(locations = {
        "classpath:pathTo/appConfig.xml",
        "classpath:pathTo/appConfig2.xml"})
   
   @ContextConfiguration(classes = {AppConfig.class})
   @ContextConfiguration(classes = {AppConfig.class, AppConfig2.class})
        
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/app-config.xml")
@ActiveProfiles("debug")
public class DebugProfileTest {

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