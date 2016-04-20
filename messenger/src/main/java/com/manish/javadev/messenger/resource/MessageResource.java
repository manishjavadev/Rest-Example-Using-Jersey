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

import com.manish.javadev.messenger.model.Message;
import com.manish.javadev.messenger.service.MessageService;
import com.manish.javadev.messenger.service.ProfileService;

@Path("/messages")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
public class MessageResource {
	MessageService messageService = new MessageService();
	ProfileService profileService = new ProfileService();

	@GET
	public List<Message> getMessage() {
		return messageService.getAllMessage();
	}

	@GET
	@Path("/{messageId}")
	public Message getMessageById(@PathParam("messageId") Long messageId) {
		return messageService.getMessageById(messageId);
	}

	@POST
	public Message addMessage(Message message) {
		return messageService.addMessage(message);
	}

	@PUT
	@Path("/{messageId}")
	public Message updateMessage(@PathParam("messageId") Long messageId,
			Message message) {
		message.setId(messageId);
		return messageService.updateMessage(message);
	}

	@DELETE
	@Path("/{messageId}")
	public void removeMessage(@PathParam("messageId") Long messageId) {
		messageService.removeMessage(messageId);
	}
}
