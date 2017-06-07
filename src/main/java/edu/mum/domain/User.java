package edu.mum.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * @author Diana Yamaletdinova
 *
 * May 21, 2017
 */
public class User implements Serializable {


	private Long id = null;


	private String firstName;

	private String lastName;

	private String email;

	private boolean admin = false;

	private UserCredentials userCredentials;
	
	private List<Messages> messageList = new ArrayList<Messages>();


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

	public UserCredentials getUserCredentials() {
		return userCredentials;
	}

	public void setUserCredentials(UserCredentials userCredentials) {
		this.userCredentials = userCredentials;
	}

	public List<Messages> getMessageList() {
		return messageList;
	}

	public void setMessageList(List<Messages> messageList) {
		this.messageList = messageList;
	}

}