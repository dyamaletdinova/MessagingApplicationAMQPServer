package edu.mum.domain;

import java.io.Serializable;

/**
 * @author Diana Yamaletdinova
 *
 * May 21, 2017
 */

public class Messages implements Serializable {
	
	private long id;
	
	private User sender;
	
	private User receiver;
	
	public User getSender() {
		return sender;
	}

	public void setSender(User sender) {
		this.sender = sender;
	}

	public User getReceiver() {
		return receiver;
	}

	public void setReceiver(User receiver) {
		this.receiver = receiver;
	}

	private String message;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}




}
