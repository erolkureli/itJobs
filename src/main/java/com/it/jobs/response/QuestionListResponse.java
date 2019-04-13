package com.it.jobs.response;

import java.util.List;

import com.it.jobs.model.Question;

public class QuestionListResponse {
	private String msg;
	private List<Question> questionList;

	public QuestionListResponse(String msg, List<Question> questionList) {
		this.msg = msg;
		this.questionList = questionList;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public List<Question> getQuestionList() {
		return questionList;
	}

	public void setQuestionList(List<Question> questionList) {
		this.questionList = questionList;
	}

}
