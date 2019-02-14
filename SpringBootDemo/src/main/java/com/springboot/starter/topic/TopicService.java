package com.springboot.starter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	List<Topic> topics=new ArrayList<>(Arrays.asList(
			new Topic("spring", "spring framework", "spring api"),
			new Topic("java", "java framework", "java api"),
			new Topic("boot", "boot framework", "boot api")
			)); 
	
	public List<Topic> getAllTopics(){
		return topics;
	}
	
	public Topic getTopic(String id) {
		return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
		
	}
	
	public void updateTopic(String id, Topic topic) {
		for(int i=0;i<topics.size();i++) {
			Topic topic1=topics.get(i);
			if(topic1.getId().equals(id)) {
				topics.set(i, topic);
				return;
			}
		}
	}
	
	public boolean deleteTopic(String id) {
		/*for(int i=0;i<topics.size();i++) {
			Topic topic1=topics.get(i);
			if(topic1.getId().equals(id)) {
				topics.remove(i);
				return topic1;
			}
		}*/
		
		return topics.removeIf(t->t.getId().equals(id));
	}
}
