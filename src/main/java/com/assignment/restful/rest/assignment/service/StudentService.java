package com.assignment.restful.rest.assignment.service;

import java.util.HashMap;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.assignment.restful.rest.assignment.model.Student;


@Service
public class StudentService {
	private Map<String, Student> studentsMap = new HashMap<>();

	public Student addStudent(Student student) throws Exception {
		// TODO Auto-generated method stub
		if (studentsMap.containsKey(student.getName())) {
			throw new Exception("Student already exist");
		}
		studentsMap.put(student.getName(), student);
		return student;
	}

	public Student updateStudent(String name, Student student) throws Exception {
		// TODO Auto-generated method stub
		if (!studentsMap.containsKey(student.getName())) {
			throw new Exception("Student doesn't exist");
		}
		studentsMap.put(name, student);
		return student;
	}

	public String deleteStudent(String name) throws Exception {
		// TODO Auto-generated method stub
		if (!studentsMap.containsKey(name)) {
			throw new Exception("Student doesn't exist");
		}
		studentsMap.remove(name);		
		return "Student deleted successfully";
	}

	public Student getStudent(String name) throws Exception {
		// TODO Auto-generated method stub
		if (!studentsMap.containsKey(name)) {
			throw new Exception("Student doesn't exist");
		}
		return studentsMap.get(name);
	}
	
}
