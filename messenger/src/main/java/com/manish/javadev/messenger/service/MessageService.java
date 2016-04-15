package com.manish.javadev.messenger.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.manish.javadev.messenger.model.Message;

public class MessageService {

	public List<Message> getAllMessage() {
		List<Message> list = new ArrayList<Message>();
		Message message1 = new Message(1, "Hello Manish", new Date(),
				"Akanksha");
		Message message2 = new Message(2, "Hello Ashish", new Date(), "Adarsh");
		Message message3 = new Message(3, "Hello Manish", new Date(), "Divya");
		list.add(message1);
		list.add(message2);
		list.add(message3);
		return list;
	}

	public Message getMessageById(long messageId) {
		return null;
	}

	public Message addMessage(Message message) {
		return null;
	}

	public Message updateMessage(Message message) {
		return null;
	}

	public Message removeMessage(Message message) {
		return null;
	}

}
