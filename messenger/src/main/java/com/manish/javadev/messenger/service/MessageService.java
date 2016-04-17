package com.manish.javadev.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.manish.javadev.messenger.database.DatabaseService;
import com.manish.javadev.messenger.model.Message;
import com.manish.javadev.messenger.model.Profile;

public class MessageService {
	public static Map<Long, Message> messageMap = DatabaseService.getMessages();
	public static Map<Long, Profile> profileMap = DatabaseService.getProfiles();

	public List<Message> getAllMessage() {
		ArrayList<Message> list= new ArrayList<Message>(messageMap.values());
		return list;
	}

	public Message getMessageById(long messageId) {
		return messageMap.get(messageId);
	}

	public Message addMessage(Message message) {
		return message;
	}

	public Message updateMessage(Message message) {
		return message;
	}

	public Message removeMessage(Message message) {

		return message;
	}

}
