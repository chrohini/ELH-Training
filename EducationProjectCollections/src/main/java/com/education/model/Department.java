package com.education.model;

import java.util.List;

public class Department {
	private int deptId;
	private String deptName;
	private List<Student> students;

	public Department() {
		super();
	}

	public Department(int deptId, String deptName, List<Student> students) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.students = students;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

}
