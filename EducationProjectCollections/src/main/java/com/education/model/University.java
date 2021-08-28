package com.education.model;

import java.util.Set;

public class University {
	private int universityCode;
	private String universityName;
	private Set<College> colleges;

	public University() {
		super();
	}

	public University(int universityCode, String universityName, Set<College> colleges) {
		super();
		this.universityCode = universityCode;
		this.universityName = universityName;
		this.colleges = colleges;
	}

	public int getUniversityCode() {
		return universityCode;
	}

	public void setUniversityCode(int universityCode) {
		this.universityCode = universityCode;
	}

	public String getUniversityName() {
		return universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	public Set<College> getColleges() {
		return colleges;
	}

	public void setColleges(Set<College> colleges) {
		this.colleges = colleges;
	}

}
