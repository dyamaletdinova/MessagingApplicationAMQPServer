package edu.mum.amqp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.amqp.rabbit.core.RabbitTemplate;

import edu.mum.AmqpMain;
import edu.mum.domain.Message;

public class DirectServiceImpl implements MessageService {
	public void publish(Message message) {
		List<RabbitTemplate> rabbitTemplates = getTemplates(message);
		for (RabbitTemplate rabbitTemplate : rabbitTemplates) {
			rabbitTemplate.convertAndSend(message);
		}
	}

	private List<RabbitTemplate> getTemplates(Message message) {
		List<RabbitTemplate> templates = new ArrayList<RabbitTemplate>();

		if (message.getReceiver().equals("clientOne")) {
			RabbitTemplate template = AmqpMain.context.getBean("clientOne", RabbitTemplate.class);
			templates.add(template);
		} else if (message.getReceiver().equals("clientTwo")) {
			RabbitTemplate template = AmqpMain.context.getBean("clientTwo", RabbitTemplate.class);
			templates.add(template);
		} else {
			RabbitTemplate template1 = AmqpMain.context.getBean("clientOne", RabbitTemplate.class);
			templates.add(template1);
			RabbitTemplate template2 = AmqpMain.context.getBean("clientTwo", RabbitTemplate.class);
			templates.add(template2);
		}
		return templates;
	}
}
