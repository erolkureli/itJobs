package com.it.jobs.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.it.jobs.constant.Constant;
import com.it.jobs.model.Question;
import com.it.jobs.response.QuestionAddResponse;
import com.it.jobs.response.QuestionListResponse;

@RestController
@RequestMapping("/questions")
public class QuestionController {
	
	@PostMapping("getList")
	public ResponseEntity<QuestionListResponse> getCompanies() {
		try {
			List<Question> questionList = new ArrayList<Question>();
			Question question1 = new Question();
			Question question2 = new Question();
			Question question3 = new Question();

			question1.setId(1);
			question1.setCompany(1);
			question1.setTitle(1);
			question1.setQuestion("Question 1");
			question1.setAnswer("Answer 1");

			question2.setId(1);
			question2.setCompany(1);
			question2.setTitle(1);
			question2.setQuestion("Question 2");
			question2.setAnswer("Answer 2");

			question3.setId(1);
			question3.setCompany(1);
			question3.setTitle(1);
			question3.setQuestion("Question 3");
			question3.setAnswer("Answer 3");

			questionList.add(question1);
			questionList.add(question2);
			questionList.add(question3);

			QuestionListResponse response = new QuestionListResponse(Constant.QUESTION_LIST_RETURNED, questionList);
			return new ResponseEntity<QuestionListResponse>(response, HttpStatus.OK);
		} catch (Exception e) {
			QuestionListResponse response = new QuestionListResponse(Constant.ERROR_IN_LISTING_QUESTION, null);
			return new ResponseEntity<QuestionListResponse>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PostMapping("add")
	public ResponseEntity<QuestionAddResponse> addJob(@RequestBody Question question) {
		try{
		   QuestionAddResponse response = new QuestionAddResponse(Constant.QUESTION_ADDED);
		   return new ResponseEntity<QuestionAddResponse>(response, HttpStatus.OK);
		}catch (Exception e) {
			QuestionAddResponse response = new QuestionAddResponse(Constant.ERROR_IN_ADDING_QUESTION);
			return new ResponseEntity<QuestionAddResponse>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
