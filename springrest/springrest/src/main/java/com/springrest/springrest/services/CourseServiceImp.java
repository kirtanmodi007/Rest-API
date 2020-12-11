package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Courses;

//So, here we can see that this class is directly IMPLEMENTING my INTERFACE. 
@Service
public class CourseServiceImp implements CourseService {

	//aa function ae list return karshe.
	//But list return karwa mate mari pase howi to joi ae ne.
	//Actual ma ahi thi aapde database calling and query execution karwu pade.
	//But right now aapde STATIC LIST j lai laishu.
	
	List<Courses> list;
	
	
	//Have aapde aa class no CONSTRUCTOER KEM banai ae 6iye, ae I don't know.


	public CourseServiceImp() 
	{
		//Constructor ma jai ne aapde actual ma je necessary data 6e ae add karishu.
		//Future ma aapde aa rite nahi kariye, but actual ma DATABASE thi data laishu.
		list = new ArrayList<>();
		list.add(new Courses(1,"Physics","Its a very god book"));
		list.add(new Courses(2,"PE","Its a very very very practical subject"));
		list.add(new Courses(3,"Maths","Its the toughest course ever"));
		list.add(new Courses(4,"Chemistry","Its pretty boaring sub"));
		
		//Now simply aa list ne return kari de.
	}
	
	
	@Override
	public List<Courses> getCourses() 
	{
		return list;
	}
	
	@Override
	public Courses getCourse(Long courseId)
	{
		//Now aapde while list ne traverse kari ne check karwu padshe ke
		//user je course mange 6e ae actual ma exist kare 6e ke nahi.
		//Jo exist karto hoy to aeno object return kar.

		
				
		for(int i = 0 ; i < list.size(); i++)
		{
			if(list.get(i).getCourseId() == courseId)
			{
				return list.get(i);
			}
		}
		return null;
	}
	
	@Override
	public Courses addCourse(Courses course)
	{
		list.add(course);
		
		return course;
	}
	
	@Override
	public Courses updateCourse(Courses course)
	{
		//Now je course update karwano 6e aeni ID tara database ma kyak to match thavi joiae
		//Because database ma match thay to j tu aema changes kari shake.
		
		for(int i = 0; i < list.size(); i++)
		{
			if(list.get(i).getCourseId() == course.getCourseId())
			{
				list.get(i).setCourseName(course.getCourseName());
				list.get(i).setCourseDescription(course.getCourseDescription()); 
			}
		}		
		return course;
	}


}
