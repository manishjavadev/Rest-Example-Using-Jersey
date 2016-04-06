package com.manish.javadev.messenger.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.manish.javadev.messenger.model.Message;
import com.manish.javadev.messenger.service.MessageService;

@Path("/messages")
public class MessageResource {
	MessageService ms = new MessageService();

	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> getMessage() {
		return ms.getAllMessage();
	}

}
