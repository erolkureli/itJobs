package com.it.jobs.response;

import java.util.List;

import com.it.jobs.model.Company;

public class CompanyListResponse {

	private String msg;
	private List<Company> companyList;

	public CompanyListResponse(String msg, List<Company> companyList) {
		this.msg = msg;
		this.companyList = companyList;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public List<Company> getCompanyList() {
		return companyList;
	}

	public void setCompanyList(List<Company> companyList) {
		this.companyList = companyList;
	}

}
