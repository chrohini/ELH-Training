package com.education.model;

import java.util.Set;

public class College {
	private String collegeId;
	private String collegeName;
	private Set<Department> departments;

	public College() {
		super();
		// TODO Auto-generated constructor stub
	}



	public College(String collegeId, String collegeName, Set<Department> departments) {
		super();
		this.collegeId = collegeId;
		this.collegeName = collegeName;
		this.departments = departments;
	}



	public College(String collegeId, String collegeName) {
		super();
		this.collegeId = collegeId;
		this.collegeName = collegeName;
	}



	public String getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(String collegeId) {
		this.collegeId = collegeId;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}



	public Set<Department> getDepartments() {
		return departments;
	}



	public void setDepartments(Set<Department> departments) {
		this.departments = departments;
	}

	
}
