package com.javalikes.javalikes.service;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javalikes.javalikes.model.Course;
import com.javalikes.javalikes.repository.CourseRepository;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public List<Course> getAllSyllabus() {
        return courseRepository.findByType("syllabus");
    }

    @Override
    public List<Course> getAllTools() {
        return courseRepository.findByType("tools");
    }

    @Override
    public List<Course> getAllProjects() {
        return courseRepository.findByType("projects");
    }
    
    @Override
    public List<Course> getAllJavaTopics() {
        return courseRepository.findByCategory("JAVA");
    }
    @Override
    public List<Course> getAllDevopsTopics() {
        return courseRepository.findByCategory("DEVOPS");
    }
    @Override
    public List<Course> getByCategory(String category) {
    	return courseRepository.findByCategory("TESTING");
    }

}
