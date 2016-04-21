package com.manish.javadev.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.manish.javadev.messenger.database.DatabaseService;
import com.manish.javadev.messenger.model.Profile;

public class ProfileService {
	public static Map<String, Profile> profileMap = DatabaseService
			.getProfiles();

	public List<Profile> getAllProfiles() {
		ArrayList<Profile> list = new ArrayList<Profile>(profileMap.values());
		return list;
	}

	public Profile getProfile(String pfofileName) {
		return profileMap.get(pfofileName);
	}

	public Profile addProfile(Profile profile) {
		long profileId = profileMap.size() + 1;
		profile.setId(profileId);
		profileMap.put(profile.getProfileName(), profile);
		Profile resultMessage = profileMap.get(profile.getProfileName());
		return resultMessage;
	}

	public Profile updateProfile(String profileName, Profile profile) {
		profileMap.put(profileName, profile);
		Profile updatedProfile = profileMap.get(profileName);
		return updatedProfile;
	}

	public void removeProfile(String profileName) {
		profileMap.remove(profileName);
	}

}
