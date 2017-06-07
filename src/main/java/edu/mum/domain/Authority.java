package edu.mum.domain;

import java.io.Serializable;

/**
 * @author Diana Yamaletdinova
 *
 * May 21, 2017
 */

public class Authority implements Serializable{


	private long id;

	private String username;
	

 	private String authority;
 	
	 public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getAuthority() {
		return authority;
	}
	public void setAuthority(String authority) {
		this.authority = authority;
	}
 
 	
}
