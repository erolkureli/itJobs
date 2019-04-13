package com.it.jobs.response;

import java.util.List;

import com.it.jobs.model.Job;

public class JobListResponse {
	private String msg;
	private List<Job> jobList;

	public JobListResponse(String msg, List<Job> jobList) {
		this.msg = msg;
		this.jobList = jobList;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public List<Job> getJobList() {
		return jobList;
	}

	public void setJobList(List<Job> jobList) {
		this.jobList = jobList;
	}

}
