package com.assignment.restful.rest.assignment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.restful.rest.assignment.model.Student;
import com.assignment.restful.rest.assignment.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	StudentService studentService;
	@PostMapping("/add")
	public Student addStudent(@RequestBody Student student) throws Exception {
		return this.studentService.addStudent(student);
	}
	@GetMapping("/{name}")
	public Student getStudent(@PathVariable("name") String name) throws Exception {
		return this.studentService.getStudent(name);
	}
	@PutMapping("/{name}/update")
	public Student updateStudent(@PathVariable("name") String name, @RequestBody Student student) throws Exception {
		return this.studentService.updateStudent(name, student);
	}
	
	@DeleteMapping("/{name}/delete")
	public String deleteStudent(@PathVariable("name") String name) throws Exception {
		return this.studentService.deleteStudent(name);
	}
}
