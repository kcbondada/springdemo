package com.springboot.student.controller;

public class Student {
	private int studId;
	private String studName;
	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studName=" + studName + "]";
	}
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public Student(int studId, String studName) {
		super();
		this.studId = studId;
		this.studName = studName;
	}
	public Student() {
		
	}

}
