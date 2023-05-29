package com.HibernateExample;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name ="College")
public class Student {
@javax.persistence.Id	
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int Id;
private String studentName;
private String course;
private String duration;
private double fee;

public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
public String getDuration() {
	return duration;
}
public Student(int id, String studentName, String course, String duration, double fee) {
	super();
	Id = id;
	this.studentName = studentName;
	this.course = course;
	this.duration = duration;
	this.fee = fee;
}
public void setDuration(String duration) {
	this.duration = duration;
}
public double getFee() {
	return fee;
}
public void setFee(double fee) {
	this.fee = fee;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Student [Id=" + Id + ", studentName=" + studentName + ", course=" + course + ", duration=" + duration
			+ ", fee=" + fee + "]";
}
}
