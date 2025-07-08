package com.javalikes.javalikes.service;




import java.util.List;

import com.javalikes.javalikes.model.Course;

public interface CourseService {
    List<Course> getAllSyllabus();
    List<Course> getAllTools();
    List<Course> getAllProjects();
	List<Course> getAllJavaTopics();
	List<Course> getAllDevopsTopics();
	 List<Course> getByCategory(String category);
    
}
