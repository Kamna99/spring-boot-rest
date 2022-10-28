package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Course;
import com.springrest.springrest.services.CourseService;

@RestController
public class MyController {

	@Autowired
	private CourseService courseService;
	
	@GetMapping("/home")
	public String home(){
		return "Hi,Hello";
	}
	
	@GetMapping("/courses")
	public List<Course> getCourses(){
	
		return this.courseService.getCourses();
	}
	
	@GetMapping("/courses/{courseid}")
	public Course getCourse(@PathVariable String courseid ){
		
		return this.courseService.getCourses(Long.parseLong(courseid));
	}
	
	@PostMapping(path="/courses",consumes="application/json")
	public Course addCourse(@RequestBody Course course ){
		
		return this.courseService.addCourse(course);
	}
}
