package com.manish.javadev.messenger.database;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.manish.javadev.messenger.model.Message;
import com.manish.javadev.messenger.model.Profile;

public class DatabaseService {
	public static Message message = null;

	public static Map<Long, Message> messageMap = new HashMap<>();
	public static Map<Long, Profile> profileMap = new HashMap<>();
	static {
		Message message1 = new Message(1, "Hello Manish", new Date(),
				"Akanksha");
		Message message2 = new Message(2, "Hello Ashish", new Date(), "Adarsh");
		Message message3 = new Message(3, "Hello Manish", new Date(), "Divya");

		messageMap.put(new Long(1), message1);
		messageMap.put(new Long(2), message2);
		messageMap.put(new Long(3), message3);
	}

	public DatabaseService() {

	}

	public static Map<Long, Message> getMessages() {
		return messageMap;
	}

	public static Map<Long, Profile> getProfiles() {
		return profileMap;
	}

}
