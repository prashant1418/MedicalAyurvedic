package com.medical.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.medical.Entity.LoginBean;

@Component
public class LoginDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	public boolean addLogin(LoginBean loginBean) {
		boolean dataPresentFlag=false;
		Session session = sessionFactory.getCurrentSession();
		List<LoginBean> userList = new ArrayList();
		
		String SQL_QUERY =" from LoginBean as l where l.userName=? and l.password=?";
		Query query = session.createQuery(SQL_QUERY);
		query.setParameter(0,loginBean.getUserName());
		query.setParameter(1,loginBean.getPassword());
		userList = query.list();
		/*userList = session.createQuery("FROM LoginBean as L where l.userName=").list();*/
		
		if(userList.size()>0) {
			dataPresentFlag=true;
		}else {
			System.out.println("Login Failed");
		}
		
		/*for (LoginBean userObj : userList) {
			System.out.println(userObj.getUserName()+"   "+userObj.getPassword());
			
		}*/

		/*session.save(loginBean);*/
		return dataPresentFlag;
	}
}
