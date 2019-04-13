package com.it.jobs.model;

public class Job {
	private int id;
	private int company;
	private String title;

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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "company = " + this.company + " , title = " + this.title;
	}

}
