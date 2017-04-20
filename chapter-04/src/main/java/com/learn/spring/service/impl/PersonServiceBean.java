package com.learn.spring.service.impl;

import com.learn.spring.bean.Person;
import com.learn.spring.service.PersonService;
import org.springframework.stereotype.Service;

/**
 * @author whp
 * @Email whp@ehoo.cn
 * @Jan 4, 2011
 * 
 */
@Service("personService")
public class PersonServiceBean implements PersonService {
	private String user;

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public PersonServiceBean() {
	}

	public PersonServiceBean(String user) {
		super();
		this.user = user;
	}

	public void save(Person person) {
		System.out.println("执行PerServiceBean的save方法");
		//throw new RuntimeException("======");
	}
}
