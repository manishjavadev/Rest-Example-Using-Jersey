package com.manish.javadev.messenger.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.manish.javadev.messenger.model.Profile;
import com.manish.javadev.messenger.service.MessageService;
import com.manish.javadev.messenger.service.ProfileService;

@Path("/messages")
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
	@Produces(MediaType.APPLICATION_JSON)
	public Profile getProfile(@PathParam("profileName") String profileName) {
		return profileService.getProfile(profileName);
	}

}
