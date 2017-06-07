package edu.mum.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * @author Diana Yamaletdinova
 *
 * May 21, 2017
 */

public class UserCredentials implements Serializable{


	String userName;

	String password;
	
	Boolean enabled;

	private User user;

	List<Authority> authority = new ArrayList<Authority>();

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

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Authority> getAuthority() {
		return authority;
	}

	public void setAuthority(List<Authority> authority) {
		this.authority = authority;
	}

}
