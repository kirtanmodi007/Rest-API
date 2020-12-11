package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.entities.Courses;

//Interface banayu to bija class ae aa interface ma raheli METHODS ne IMPLEMENT KARWI PAde.
public interface CourseService 
{
	//Since, aa interface 6e, ahi badhi methods ae ABSTRACT hase.
	//Je controller wada class ma method nu name 6e ae ahi interface ma same j hoy.
	//Because Interface ma method ABSTRACT hoy jene actually ma aapde implement karwi pade.
	//Have aa method ne implmenet karwa we need to create a NEW CLASS.
	//Ae new class tu aa same package ma j banai de.
	public List<Courses> getCourses();
	
	public Courses getCourse(Long courseId);
	
	public Courses addCourse(Courses course);

	public Courses updateCourse(Courses course);

}
