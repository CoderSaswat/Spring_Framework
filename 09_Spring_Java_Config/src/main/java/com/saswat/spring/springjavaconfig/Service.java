package com.saswat.spring.springjavaconfig;

import org.springframework.beans.factory.annotation.Autowired;

public class Service {
	@Autowired
	Dao dao;

	public void save() {
		dao.create();
	}
}
