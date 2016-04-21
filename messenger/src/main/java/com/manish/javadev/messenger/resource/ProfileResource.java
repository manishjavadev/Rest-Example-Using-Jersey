package com.manish.javadev.messenger.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.manish.javadev.messenger.model.Profile;
import com.manish.javadev.messenger.service.MessageService;
import com.manish.javadev.messenger.service.ProfileService;

@Path("/profiles")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
public class ProfileResource {
	MessageService messageService = new MessageService();
	ProfileService profileService = new ProfileService();

	@GET
	public List<Profile> getProfile() {
		return profileService.getAllProfiles();
	}

	@GET
	@Path("/{profileName}")
	public Profile getProfile(@PathParam("profileName") String profileName) {
		return profileService.getProfile(profileName);
	}

	@POST
	public Profile addProfile(Profile profile) {
		System.out.println("Called");
		return profileService.addProfile(profile);
	}

	@PUT
	@Path("/{profileName}")
	public Profile updateProfile(@PathParam("profileName") String profileName,
			Profile profile) {
		profile.setProfileName(profileName);
		return profileService.updateProfile(profileName, profile);
	}

	@DELETE
	@Path("/{profileName}")
	public void removeMessage(@PathParam("profileName") String profileName) {
		profileService.removeProfile(profileName);
	}

}
