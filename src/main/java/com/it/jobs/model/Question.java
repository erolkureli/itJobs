package com.it.jobs.model;

public class Question {

	private int id;
	private int company;
	private int title;
	private String question;
	private String answer;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCompany() {
		return company;
	}

	public void setCompany(int company) {
		this.company = company;
	}

	public int getTitle() {
		return title;
	}

	public void setTitle(int title) {
		this.title = title;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
}
