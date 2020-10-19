package com.sw409.blackboard.repositories.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sw409.blackboard.models.Course;
import com.sw409.blackboard.repositories.CourseRepository;

@Service
public class CourseService {
	@Autowired
	CourseRepository courseRepository;
	public ArrayList<Course> getAllCourses()
	{
		return(ArrayList<Course>) courseRepository.findAll();
	}

}
