package com.spring.assignments;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Question {

	
	private int questionId;
	private String question;
	
	private List<String> listAnswer;
	private Set<String> setAnswer;
	private Map<Integer, String> mapAnswer;
	
	public Question() {
		// TODO Auto-generated constructor stub
	}

	

	public Question(int questionId, String question, List<String> listAnswer,
			Set<String> setAnswer, Map<Integer, String> mapAnswer) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.listAnswer = listAnswer;
		this.setAnswer = setAnswer;
		this.mapAnswer = mapAnswer;
	}



	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	

	public List<String> getListAnswer() {
		return listAnswer;
	}

	public void setListAnswer(List<String> listAnswer) {
		this.listAnswer = listAnswer;
	}

	public Set<String> getSetAnswer() {
		return setAnswer;
	}

	public void setSetAnswer(Set<String> setAnswer) {
		this.setAnswer = setAnswer;
	}

	public Map<Integer, String> getMapAnswer() {
		return mapAnswer;
	}

	public void setMapAnswer(Map<Integer, String> mapAnswer) {
		this.mapAnswer = mapAnswer;
	}

	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", question=" + question
				+ ", listAnswer=" + listAnswer + ", setAnswer=" + setAnswer
				+ ", mapAnswer=" + mapAnswer + "]";
	}

	

	
	
}
