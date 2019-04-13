package com.it.jobs.response;

import java.util.List;

import com.it.jobs.model.Title;

public class TitleListResponse {

	private String msg;
	private List<Title> titleList;

	public TitleListResponse(String msg, List<Title> titleList) {
		this.msg = msg;
		this.titleList = titleList;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public List<Title> getTitleList() {
		return titleList;
	}

	public void setTitleList(List<Title> titleList) {
		this.titleList = titleList;
	}

}
