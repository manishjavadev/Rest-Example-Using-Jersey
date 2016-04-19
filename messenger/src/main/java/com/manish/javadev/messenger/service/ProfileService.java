package com.manish.javadev.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.manish.javadev.messenger.database.DatabaseService;
import com.manish.javadev.messenger.model.Profile;

public class ProfileService {
	public static Map<String, Profile> profileMap = DatabaseService.getProfiles();

	public List<Profile> getAllProfiles() {
		ArrayList<Profile> list= new ArrayList<Profile>(profileMap.values());
		return list;
	}
	
	public Profile getProfile(String pfofileName){
		return profileMap.get(pfofileName);
		
	}

	
}
