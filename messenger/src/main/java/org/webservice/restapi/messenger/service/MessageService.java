package org.webservice.restapi.messenger.service;

import java.util.ArrayList;
import java.util.List;

import org.webservice.restapi.messenger.model.Message;

public class MessageService {

	
	public MessageService() {
		
	}

	public List<Message> getAllMessages(){
		Message m1=new Message(1L, "Hello World!", "Birappa");
		Message m2=new Message(2L, "Hello Jersey!", "Birappa");
		List<Message> messages=new ArrayList<Message>();
		messages.add(m1);
		messages.add(m2);
		return messages;
	}
}
