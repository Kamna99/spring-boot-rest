package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Course;


@Service
public class CourseServiceImpl implements CourseService {

	
	
	List <Course> list;
	
	public CourseServiceImpl(){
		
		list = new ArrayList<>();
		list.add(new Course(1,"BAC","Bank and Customers"));
		list.add(new Course(2,"BAF","Bank and Finance"));
		list.add(new Course(3,"BAI","Bank and Investment"));
		list.add(new Course(4,"BAU","Bank and Upgrade"));
	}
	
	@Override
	public List<Course> getCourses() {
	
		return list;
	}

	@Override
	public Course getCourses(long courseid) {
	 
		
		Course course = null;
		
		for(Course c : list){
			if(c.getId()==courseid){
				return c;
			}
		}
		return course;
	}

	@Override
	public Course addCourse(Course course) {
		list.add(course);
		
		return course;
	}

}
