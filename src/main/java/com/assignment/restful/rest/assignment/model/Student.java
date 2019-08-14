package com.assignment.restful.rest.assignment.model;

public class Student {
	private String name;
	private String section; 
	private String fatherName;
	private String address;
	public Student() {
		
	}
	public Student(String name,String section,String fatherName,String address) {
		this.name=name;
		this.section=section;
		this.fatherName=fatherName;
		this.address=address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
