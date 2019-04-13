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
import com.it.jobs.model.Job;
import com.it.jobs.response.JobAddResponse;
import com.it.jobs.response.JobListResponse;

@RestController
@RequestMapping("/jobs")
public class ItJobsController {

	@PostMapping("add")
	public ResponseEntity<JobAddResponse> addJob(@RequestBody Job job) {
		try{
		   JobAddResponse response = new JobAddResponse(Constant.JOB_ADDED);
		   return new ResponseEntity<JobAddResponse>(response, HttpStatus.OK);
		}catch (Exception e) {
			JobAddResponse response = new JobAddResponse(Constant.ERROR_IN_ADDING_JOB);
			return new ResponseEntity<JobAddResponse>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PostMapping("getList")
	public ResponseEntity<JobListResponse> getJobs() {
		try {
			List<Job> jobList = new ArrayList<Job>();
			
			Job job1 = new Job();
			Job job2 = new Job();
			Job job3 = new Job();

			job1.setId(1);
			job1.setCompany(1);
			job1.setTitle("Job 1");

			job2.setId(2);
			job2.setCompany(1);
			job2.setTitle("Job 2");

			job3.setId(2);
			job3.setCompany(2);
			job3.setTitle("Job 3");

			jobList.add(job1);
			jobList.add(job2);
			jobList.add(job3);

			JobListResponse response = new JobListResponse(Constant.JOB_LIST_RETURNED, jobList);
			return new ResponseEntity<JobListResponse>(response, HttpStatus.OK);
		} catch (Exception e) {
			JobListResponse response = new JobListResponse(Constant.ERROR_IN_LISTING_JOB, null);
			return new ResponseEntity<JobListResponse>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
