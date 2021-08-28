package com.education.service;

import java.util.List;
import java.util.Set;

import com.education.model.College;
import com.education.model.Department;
import com.education.model.Student;
import com.education.model.University;

public class DepartmentServiceImpl implements DepartmentService {

	@Override
	public Student serachstudentsByName(Department department, String name) {
		Student student = null;

		List<Student> students = department.getStudents();
		for (Student student2 : students) {
			if (student2.getStudName().equals(name)) {
				student = student2;
			}

		}
		return student;
	}

	@Override
	public Department searchStudentByDepartment(College college1, String name) {
		Department department = null;
		Set<Department> departments = college1.getDepartments();
		for (Department department2 : departments) {
			if (department2.getDeptName().equals(name)) {
				department = department2;
			}

		}
		return department;
	}

	@Override
	public College searchStudentByCollegeName(University university, String name) {
		College college = null;
		Set<College> colleges = university.getColleges();
		for (College college2 : colleges) {
			if (college2.getCollegeName().equals(name)) {
				college = college2;
			}
		}
		return college;
	}

}
