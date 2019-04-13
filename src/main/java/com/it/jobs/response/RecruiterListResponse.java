package com.it.jobs.response;

import java.util.List;

import com.it.jobs.model.Recruiter;

public class RecruiterListResponse {
	
	private String msg;
	private List<Recruiter> recruiterList;

	public RecruiterListResponse(String msg, List<Recruiter> recruiterList) {
		this.msg = msg;
		this.recruiterList = recruiterList;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public List<Recruiter> getRecruiterList() {
		return recruiterList;
	}

	public void setRecruiterList(List<Recruiter> recruiterList) {
		this.recruiterList = recruiterList;
	}

}
