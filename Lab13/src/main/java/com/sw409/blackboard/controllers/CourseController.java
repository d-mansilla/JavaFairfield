package com.sw409.blackboard.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sw409.blackboard.models.Course;
import com.sw409.blackboard.repositories.services.CourseService;

@RestController
@CrossOrigin("*")
@PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_USER')")


public class CourseController {
	@Autowired
	CourseService courseService;
	@GetMapping("api/courses")
	public ArrayList<Course> getAllCourses()
	{
		return courseService.getAllCourses();
	}

}
