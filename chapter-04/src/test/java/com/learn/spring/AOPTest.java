package com.learn.spring;

import com.learn.spring.bean.Person;
import com.learn.spring.service.PersonService;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPTest {
	static PersonService personService;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		AbstractApplicationContext cxt = new ClassPathXmlApplicationContext("beans.xml");
		personService = (PersonService) cxt.getBean("personService");
	}

	/**
	 * @author whp
	 * @Email whp@ehoo.cn
	 * @Jan 4, 2011
	 * 
	 */
	
	public static void main(String[] args) {
		try {
			setUpBeforeClass();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void saveTest() {
		personService.save(new Person());
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
}
