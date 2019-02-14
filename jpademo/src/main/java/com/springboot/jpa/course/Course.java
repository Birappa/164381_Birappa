package com.springboot.jpa.course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.springboot.jpa.topic.Topic;

@Entity
public class Course {

	@Id
	private String id;
	private String name;
	private String descriptor;
	@ManyToOne
	private Topic topic;
	
	public Course() {
		super();
	}


	public Course(String id, String name, String descriptor, String topicId) {
		super();
		this.id = id;
		this.name = name;
		this.descriptor = descriptor;
		this.topic=new Topic(topicId,"","");
	}


	public Topic getTopic() {
		return topic;
	}


	public void setTopic(Topic topic) {
		this.topic = topic;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescriptor() {
		return descriptor;
	}


	public void setDescriptor(String descriptor) {
		this.descriptor = descriptor;
	}
	
	
	
}
