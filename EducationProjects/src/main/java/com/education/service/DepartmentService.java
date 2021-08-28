package com.education.service;

import com.education.model.College;
import com.education.model.Department;
import com.education.model.Student;
import com.education.model.University;

public interface DepartmentService {
	public abstract Student searchStudentById(Department dep, int id);

	public abstract Student searchStudentByName(Department department, String name);

	public abstract Department searhDepartmentsByDepartmentId(College college1, String string);

	public abstract College searchCollegeName(University university, String string);

}
