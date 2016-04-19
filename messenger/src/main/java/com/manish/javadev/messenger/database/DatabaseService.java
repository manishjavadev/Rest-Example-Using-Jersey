package com.manish.javadev.messenger.database;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.manish.javadev.messenger.model.Message;
import com.manish.javadev.messenger.model.Profile;

public class DatabaseService {
	public static Message message = null;

	public static Map<Long, Message> messageMap = new HashMap<>();
	public static Map<String, Profile> profileMap = new HashMap<>();
	static {
		Message message1 = new Message(1, "Hello Manish", new Date(),
				"Akanksha");
		Message message2 = new Message(2, "Hello Ashish", new Date(), "Adarsh");
		Message message3 = new Message(3, "Hello Manish", new Date(), "Divya");

		messageMap.put(new Long(1), message1);
		messageMap.put(new Long(2), message2);
		messageMap.put(new Long(3), message3);
		
		Profile Profile1 = new Profile(1,"Profile1", "Manish","Srivastava" ,"RDB");
		Profile Profile2 = new Profile(2,"Profile2", "Ashish","Srivastava" ,"Java");
		Profile Profile3 = new Profile(3,"Profile3", "Abhishek","Srivastava" ,"MangoDB");

		profileMap.put("Profile1", Profile1);
		profileMap.put("Profile2", Profile2);
		profileMap.put("Profile3", Profile3);
	}

	public DatabaseService() {

	}

	public static Map<Long, Message> getMessages() {
		return messageMap;
	}

	public static Map<String, Profile> getProfiles() {
		return profileMap;
	}

}
