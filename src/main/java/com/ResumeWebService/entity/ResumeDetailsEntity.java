package com.ResumeWebService.entity;

public class ResumeDetailsEntity {
	private String name;
	private String currJobTitle;
	private String currJobDescription;
	private String currJobCompany;

	public String getName() {
		return name;
	}

	public String getCurrJobTitle() {
		return currJobTitle;
	}

	public void setCurrJobTitle(String currJobTitle) {
		this.currJobTitle = currJobTitle;
	}

	public String getCurrJobDescription() {
		return currJobDescription;
	}

	public void setCurrJobDescription(String currJobDescription) {
		this.currJobDescription = currJobDescription;
	}

	public String getCurrJobCompany() {
		return currJobCompany;
	}

	public void setCurrJobCompany(String currJobCompany) {
		this.currJobCompany = currJobCompany;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ResumeDetailsEntity () {

	}

	public ResumeDetailsEntity (String nm, String title, String des, String com) {
		name = nm;
		currJobTitle = title;
		currJobDescription = des;
		currJobCompany = com;
	}
}
