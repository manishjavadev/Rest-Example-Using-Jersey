package com.manish.javadev.messenger.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.manish.javadev.messenger.model.Message;
import com.manish.javadev.messenger.service.MessageService;

@Path("/messages")
public class MessageResource {
	MessageService messageService = new MessageService();

	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> getMessage() {
		return messageService.getAllMessage();
	}

	@GET
	@Path("/{messageId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Message getMessageById(@PathParam("messageId") Long messageId) {
		return messageService.getMessageById(messageId);
	}

	@POST
	@Produces(MediaType.TEXT_PLAIN)
	public String addMessage() {
		return "Post Work";
	}

}
