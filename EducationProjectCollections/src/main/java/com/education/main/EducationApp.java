package com.education.main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.education.model.College;
import com.education.model.Department;
import com.education.model.Student;
import com.education.model.University;
import com.education.service.DepartmentService;
import com.education.service.DepartmentServiceImpl;

public class EducationApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter College Name");
		String clzName = scanner.nextLine();
		System.out.println("Enter Department");
		String depart = scanner.nextLine();
		System.out.println("enter student name");
		String stuName = scanner.nextLine();

		Student student1 = new Student(123, "rohini", 25);
		Student student2 = new Student(456, "nihal", 5);
		Student student3 = new Student(789, "honey", 1);
		Student student4 = new Student(11, "gopi", 32);
		Student student5 = new Student(12, "sai", 31);
		Student student6 = new Student(21, "lakshmi", 40);

		List<Student> batch1 = new ArrayList<Student>();
		batch1.add(student1);
		batch1.add(student2);
		batch1.add(student3);
		List<Student> batch2 = new ArrayList<Student>();
		batch2.add(student4);
		batch2.add(student5);
		List<Student> batch3 = new ArrayList<Student>();
		batch3.add(student6);
		List<Student> all=new ArrayList<Student>();
		all.add(student1);
		all.add(student2);
		all.add(student3);
		all.add(student4);
		all.add(student5);
		all.add(student6);
		Department department1 = new Department(100, "ECE", batch1);
		Department department2 = new Department(101, "CSE", batch2);
		Department department3 = new Department(102, "EEE", batch3);
		// department1.setStudents(batch1);
		/*
		 * department2.setStudents(batch2); department3.setStudents(batch3);
		 */
		Set<Department> departments = new HashSet<>();
		departments.add(department1);
		departments.add(department2);
		departments.add(department3);
		/*
		 * College college1 = new College("123 ", "Sasi", departments); College college2
		 * = new College("124", "Gite", departments); College college3 = new
		 * College("125", "Site", departments);
		 */
		College college1 = new College("A20", "SITE");
		College college2 = new College("B21", "GITE");
		College college3 = new College("B21", "SVITE");
		

		Set<College> colleges = new HashSet<>();
		colleges.add(college1);
		colleges.add(college2);
		colleges.add(college3);

		University university = new University(103467, "JNTUK", colleges);
		university.setColleges(colleges);
		DepartmentService departmentService = new DepartmentServiceImpl();
		College college = departmentService.searchStudentByCollegeName(university, clzName);
		college.setDepartments(departments);
		Department department = departmentService.searchStudentByDepartment(college1, depart);
		department.setStudents(all);
		Student students = departmentService.serachstudentsByName(department1, stuName);

		if (students != null && department != null && college != null) {
			System.out.println("student id " + students.getStudId());
			System.out.println("student name " + students.getStudName());
			System.out.println("student Age " + students.getStudAge());
			System.out.println("student Department " + department.getDeptName());
			System.out.println("Student College Name " + college.getCollegeName());
			System.out.println("Student Univerisity Name " + university.getUniversityName());

		} else {
			System.out.println("No Data Found");
		}
	}

}
