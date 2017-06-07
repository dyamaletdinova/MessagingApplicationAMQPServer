package edu.mum;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class AmqpMain {
	public static ApplicationContext context;
    public static void main(String[] args) {
         context = new GenericXmlApplicationContext("classpath:META-INF/spring/order-app-context.xml");
    }
}
