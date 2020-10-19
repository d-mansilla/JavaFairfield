package com.sw409.blackboard.repositories;

import org.springframework.data.repository.CrudRepository;

import com.sw409.blackboard.models.Course;

public interface CourseRepository extends CrudRepository<Course, Integer> {

}
