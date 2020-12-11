package com.springrest.springrest.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Courses;
import com.springrest.springrest.services.CourseService;
import com.springrest.springrest.services.CourseServiceImp;

//Class ni upar me annotation aapyu ke this class is going to be my CONTROLLER.
//So, mari frontend technologeis ae aa control jode j pahela request moklshe.
//Since, we are making a REST API, we need to write RESTCONTROLLER instead of only controller
//@Controller

@RestController
public class MyController 
{
	//Getmapping annotation thi aapde aewu kahewa mangiye 6iye ke
	//jyare user Get request with /abc path kare tyare aa function call thawu joi ae.
	//Since, aa function string return kare 6e, user ne particular string
	//return thai ne aena web page par dekhawi joi ae.
	
	//Get All Courses Method.
	//Ke aapde Courses type no data return kariye 6iye, which is ADT
	//So, we need to create a Class Courses, which handle Courses type data.
	
	//ACTUAL MA TO JYARE USER COURSES MATE NI REQUEST KARE,
	//MARE DATABASE MA QUESRY MARI NE BADHA COURSES GET KARWA PADE AND THEN RETURN KARWANU.
	
	@Autowired
	CourseService obj;
	
	
	
	@GetMapping("/Courses")
	public List<Courses> getCourses()
	{
		//HAVE SCENE AE 6E KE USER AE JE COURSES MATE NI REQUEST KARI,
		//AE PRESENTATION LAYER / CONTROLLER PASE AAWI TO GAI.
		//BUT HAVE KAI PRESENTATION LAYER KOI OPERATION PERFORM NAHI KARE.
		//AENU KAM TO JUST USER NE LIST RETURN KARWANU 6E.
		//SO, HAVE AHI AAPDE SERVICES GENERATE KARWI PADE, KE JE ACTUAL MA DATA RETURN KARSHE.
		//SO, NOW CONTORLLER WILL CONTACT OTHER LAYERS.
		//SO, NOW SERVICES MATE PAN 1 EXTRA CLASS BANAWO PADE.

		return obj.getCourses();
	}
	
	//Now we need to create another function, which can actually return particular id's data
	@GetMapping("/Courses/{courseId}")
	public Courses getCourse(@PathVariable String courseId)
	{
		//Have aapde particular id wado j course get karwo so ae pass karwu pade
		//Have user pase thi je courseId aawshe ae string ma aawshe, so we need to convert
		//it into Long
		return obj.getCourse(Long.parseLong(courseId));
	}
	
	
	//Now we are making a 3rd FUNCTION to ADD NEW COURSE
	@PostMapping("/Courses")
	//Now this time we need a object to add into our database
	//Have object ae aapda user pase thi aawshe means ke frontend technology mathi
	//Hal frontend nathi so object ae POSTMAN mathi aawshe.
	public Courses addCourse(@RequestBody Courses course)
	{
		return obj.addCourse(course);
	}
	
	//Now in order to create a put request we have to create a new class.
	//Put vakhte pan JSON format ma data aawto hase.
	
	@PutMapping("/Courses")
	public Courses updateCourse(@RequestBody Courses course)
	{
		return obj.updateCourse(course);
	}
}
