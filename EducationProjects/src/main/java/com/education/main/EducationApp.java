package com.education.main;

import com.education.model.College;
import com.education.model.Department;
import com.education.model.Student;
import com.education.model.University;
import com.education.service.DepartmentService;
import com.education.service.DepartmentServiceImpl;

public class EducationApp {
	public static void main(String[] args) {
		Student student1 = new Student(123, "rohini", 25);
		Student student2 = new Student(456, "nihal", 5);
		Student student3 = new Student(789, "honey", 1);
		Student student4 = new Student(11, "gopi", 32);
		Student student5 = new Student(12, "sai", 31);

		Department department = new Department();
		department.setDeptId(100);
		department.setDeptName("ECE");
		Department dep = new Department();
		dep.setDeptId(101);
		dep.setDeptName("CSE");

		College college1 = new College();
		college1.setCollegeId("A20");
		college1.setCollegeName("sasi");

		College college2 = new College();
		college2.setCollegeId("B21");
		college2.setCollegeName("IIIT");
		College[] college = new College[2];
		college[0] = college1;
		college[1] = college2;
		Department[] departments = new Department[2];
		departments[0] = department;
		departments[1] = dep;
		college1.setDepartments(departments);
		student1.setDepartment(department);
		student2.setDepartment(dep);
		Student[] students = new Student[3];
		students[0] = student1;
		students[1] = student2;
		students[2] = student3;
		department.setStudent(students);
		Student[] batch2 = new Student[2];
		batch2[0] = student4;
		batch2[1] = student5;
		dep.setStudent(batch2);
		University university = new University();
		university.setUniversityCode(122);
		university.setUniversityName("JNTUK");
		university.setColleges(college);

		DepartmentService departmentService = new DepartmentServiceImpl();

		Student student = departmentService.searchStudentById(department, 456);
		// Student[] student = departmentService.searchStudentById(departments, 456);

		Department departmentObj = departmentService.searhDepartmentsByDepartmentId(college1, "A20");
		College collegeresult = departmentService.searchCollegeName(university, "sasi");

		if (departmentObj != null) {
			System.out.println("College Name " + college1.getCollegeName());
			System.out.println("College id " + college1.getCollegeId());

			for (int i = 0; i < college1.getDepartments().length; i++) {

				System.out.println("Department Id" + departments[i].getDeptId());
				System.out.println("Department Name" + departments[i].getDeptName());

			}
			System.out.println();
		}

		Student batch = departmentService.searchStudentById(dep, 11);
		if (batch != null) {
			System.out.println("student id " + batch.getStudId());
			System.out.println("student name " + batch.getStudName());
			System.out.println("student age " + batch.getStudAge());
			System.out.println("student departmentid " + dep.getDeptId());
			System.out.println("student department Name " + dep.getDeptName());
			System.out.println("student collegeName " + college1.getCollegeName());
			if (collegeresult != null) {
				System.out.println("student UniversityName " + university.getUniversityName());
			}
		}
		if (student != null) {
			System.out.println("student id " + student.getStudId());
			System.out.println("student name " + student.getStudName());
			System.out.println("student age " + student.getStudAge());
			System.out.println("student departmentid " + department.getDeptId());
			System.out.println("student department Name " + department.getDeptName());
		}
		// if (student != null) {
		// for (int i = 0; i < student.length; i++) {
		// System.out.println("student id " + student[i].getStuId());
		// System.out.println("student name " + student[i].getStuName());
		// System.out.println("student age " + student[i].getStuAge());
		// System.out.println("student departmentid " + departments[i].getDeptId());
		// System.out.println("student department Name " +
		// departments[i].getDeptName());
		// }
		// }
		Student studentObj = departmentService.searchStudentByName(department, "rohini");
		if (studentObj != null) {
			System.out.println("student id " + studentObj.getStudId());
			System.out.println("student name " + studentObj.getStudName());
			System.out.println("student age " + studentObj.getStudAge());
			System.out.println("student departmentid " + department.getDeptId());
			System.out.println("student department Name " + department.getDeptName());
		}

	}

}
