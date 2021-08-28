package com.education.service;

import com.education.model.College;
import com.education.model.Department;
import com.education.model.Student;
import com.education.model.University;

public interface DepartmentService {

	public abstract Student serachstudentsByName(Department department1, String name);

	public abstract Department searchStudentByDepartment(College college1, String name);

	public abstract College searchStudentByCollegeName(University university, String string);

}
