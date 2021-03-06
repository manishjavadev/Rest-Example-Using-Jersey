package com.manish.javadev.messenger.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import com.manish.javadev.messenger.database.DatabaseService;
import com.manish.javadev.messenger.model.Message;
import com.manish.javadev.messenger.model.Profile;

public class MessageService {
	public static Map<Long, Message> messageMap = DatabaseService.getMessages();
	public static Map<String, Profile> profileMap = DatabaseService
			.getProfiles();

	public List<Message> getAllMessage() {
		ArrayList<Message> list = new ArrayList<Message>(messageMap.values());
		return list;
	}

	public Message getMessageById(long messageId) {
		return messageMap.get(messageId);
	}

	public Message addMessage(Message message) {
		Long messageId = (long) (messageMap.size() + 1);
		message.setId((messageMap.size() + 1));
		messageMap.put(messageId, message);
		Message resultMessage = messageMap.get(new Long(messageMap.size()));
		System.out.println(resultMessage);
		return resultMessage;
	}

	public Message updateMessage(Message message) {
		messageMap.put(message.getId(), message);
		return messageMap.get(message.getId());
	}

	public void removeMessage(long messageId) {
		messageMap.remove(messageId);
	}

	public List<Message> getAllMessagesForYear(int year) {
		List<Message> allMessage = new ArrayList<>();
		Calendar cal = Calendar.getInstance();
		for (Message message : messageMap.values()) {
			cal.setTime(message.getDate());
			if (cal.get(Calendar.YEAR) == year) {
				allMessage.add(message);
			}
		}
		return allMessage;

	}

	public List<Message> getPaginatedMessage(int start, int size) {
		List<Message> allMessage = new ArrayList<>(messageMap.values());
		if (size >= allMessage.size()) {
			size = allMessage.size();
		}
		return allMessage.subList(start, start + size);
	}

}
