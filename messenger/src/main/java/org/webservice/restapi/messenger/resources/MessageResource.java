package org.webservice.restapi.messenger.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.webservice.restapi.messenger.model.Message;
import org.webservice.restapi.messenger.service.MessageService;

@Path("/messages")
public class MessageResource {

	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> getMessages(){
		MessageService messageService=new MessageService();
		return messageService.getAllMessages();
	}

}
