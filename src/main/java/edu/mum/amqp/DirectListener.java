package edu.mum.amqp;

import edu.mum.domain.Message;

public class DirectListener {
	public void listen(Message message) {
		DirectServiceImpl directService=new DirectServiceImpl();
		directService.publish(message);		
	}
}
