package com.niit.collaborate.controller;
import java.util.Date;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.collaborate.model.Message;
import com.niit.collaborate.model.OutputMessage;

@Controller
public class ChatController {

	@MessageMapping("/chat")
	@SendTo("/topic/message")
	public OutputMessage sendMessage(Message message) {
		System.out.println("calling the method sendMessage");
		System.out.println("Message : " + message.getMessage());
		System.out.println("MessageId : " + message.getId());
		
		return new OutputMessage(message, new Date());
	}
}

