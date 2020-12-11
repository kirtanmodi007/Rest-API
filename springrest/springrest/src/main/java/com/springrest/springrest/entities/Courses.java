package com.springrest.springrest.entities;

public class Courses 
{
	 //Let's say ke aa class ma hu Courses na object banai shaku.
	//Every object kai k data to consiste karto hoy.
	//Here, maro every Courses object ae 3 data contain karshe.
	private int courseId;
	private String courseName;
	private String courseDescription;
	
	//3 ae variables private 6e, so you need to create getters and setters
	//We will also require a Constructor, so will create that as well.
	//toString method pan generate kari de.
	
	public Courses(int courseId, String courseName, String courseDescription) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseDescription = courseDescription;
	}


	//Aa maro without argument wado default constructor thayo
	public Courses() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseDescription() {
		return courseDescription;
	}
	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}
	
	@Override
	public String toString() {
		return "Courses [courseId=" + courseId + ", courseName=" + courseName + ", courseDescription="
				+ courseDescription + "]";
	}

}
