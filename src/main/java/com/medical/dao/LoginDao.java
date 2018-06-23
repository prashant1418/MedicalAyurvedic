package com.medical.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.medical.Entity.LoginBean;

@Component
public class LoginDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	public void addLogin(LoginBean loginBean) {
		Session session=sessionFactory.getCurrentSession();
		session.save(loginBean);
		
		
	}
}
