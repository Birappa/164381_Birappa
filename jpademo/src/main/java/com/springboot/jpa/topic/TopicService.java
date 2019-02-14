package com.springboot.jpa.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;
	
	/*List<Topic> topics=new ArrayList<>(Arrays.asList(
			new Topic("spring", "spring framework", "spring api"),
			new Topic("java", "java framework", "java api"),
			new Topic("boot", "boot framework", "boot api")
			)); */
	
	public List<Topic> getAllTopics(){
		//return topics;
		/*List<Topic> topics=new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);
		return topics;*/
		return (List<Topic>) topicRepository.findAll();
	}
	
	public Topic getTopic(String id) {
		//return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
		
		return topicRepository.findById(id).get();
	}

	public void addTopic(Topic topic) {
		//topics.add(topic);
		topicRepository.save(topic);
	}
	
	public void updateTopic(String id, Topic topic) {
		/*for(int i=0;i<topics.size();i++) {
			Topic topic1=topics.get(i);
			if(topic1.getId().equals(id)) {
				topics.set(i, topic);
				return;
			}
		}*/
		
		topicRepository.save(topic);
	}
	
	public void  deleteTopic(String id) {
		/*for(int i=0;i<topics.size();i++) {
			Topic topic1=topics.get(i);
			if(topic1.getId().equals(id)) {
				topics.remove(i);
				return topic1;
			}
		}*/
		
		//return topics.removeIf(t->t.getId().equals(id));
		
		topicRepository.deleteById(id);
	}
}
