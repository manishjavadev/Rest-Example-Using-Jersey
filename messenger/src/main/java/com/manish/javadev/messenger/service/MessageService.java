package com.manish.javadev.messenger.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.manish.javadev.messenger.model.Message;

public class MessageService {

	public List<Message> getAllMessage() {
		List<Message> list = new ArrayList<Message>();
		Message message1 = new Message(1, "Hello Manish", new Date(), "Akansha");
		Message message2 = new Message(2, "Hello Ashis", new Date(), "Adarsh");
		list.add(message1);
		list.add(message2);
		return list;
	}

}
