package com.medical.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LoginBean {
	 public LoginBean() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "LoginBean [userName=" + userName + ", password=" + password + "]";
	}
	@Id
	private String userName;
	private String password;
	
	public LoginBean(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
