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
import com.it.jobs.model.Recruiter;
import com.it.jobs.response.RecruiterAddResponse;
import com.it.jobs.response.RecruiterListResponse;

@RestController
@RequestMapping("/recruiters")
public class RecruitersController {
	
	@PostMapping("getList")
	public ResponseEntity<RecruiterListResponse> getRecruiters() {
		try {
			List<Recruiter> recruiterList = new ArrayList<Recruiter>();
			
			Recruiter recruiter1 = new Recruiter();
			Recruiter recruiter2 = new Recruiter();
			Recruiter recruiter3 = new Recruiter();

			recruiter1.setId(1);
			recruiter1.setRecruiter("Outsource UK");
			recruiter1.setComment("Comment 1");

			recruiter2.setId(2);
			recruiter2.setRecruiter("Recruiter2");
			recruiter2.setComment("Comment 2");

			recruiter3.setId(2);
			recruiter3.setRecruiter("Recruiter3");
			recruiter3.setComment("Comment 3");

			recruiterList.add(recruiter1);
			recruiterList.add(recruiter2);
			recruiterList.add(recruiter3);

			RecruiterListResponse response = new RecruiterListResponse(Constant.COMPANY_LIST_RETURNED, recruiterList);
			return new ResponseEntity<RecruiterListResponse>(response, HttpStatus.OK);
		} catch (Exception e) {
			RecruiterListResponse response = new RecruiterListResponse(Constant.ERROR_IN_LISTING_COMPANY, null);
			return new ResponseEntity<RecruiterListResponse>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PostMapping("add")
	public ResponseEntity<RecruiterAddResponse> addRecruiter(@RequestBody Recruiter recruiter) {
		try {
			RecruiterAddResponse response = new RecruiterAddResponse(Constant.RECRUITER_ADDED);
			return new ResponseEntity<RecruiterAddResponse>(response, HttpStatus.OK);
		} catch (Exception e) {
			RecruiterAddResponse response = new RecruiterAddResponse(Constant.ERROR_IN_ADDING_RECRUITER);
			return new ResponseEntity<RecruiterAddResponse>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
