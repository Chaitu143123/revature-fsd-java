package com.revature.app.dao.impl;

import static org.junit.Assert.fail;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import com.revature.bankapp.model.Model;

import om.revature.app.dao.CustomerDao;

class CustomerDaoImplTest {

	@Test
	void testCreate_success() {
		Model model=new Model("mars","gd","dgwqd","dgw");
		CustomerDao dao=new CustomerDaoImpl();
		try {
			dao.create(model);
		}catch(SQLException e){
			e.printStackTrace();
			fail("creating employee failed");
		}
	}

}
