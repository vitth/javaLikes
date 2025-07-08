package com.javalikes.javalikes.service;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javalikes.javalikes.model.Course;
import com.javalikes.javalikes.model.CourseDetail;
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

    public List<CourseDetail> getAllCourses() {
        return List.of(
            new CourseDetail("Java Fullstack and Spring Boot and devops", "5 Months", "25000","15th Aug 2025"),
            new CourseDetail("Spring Boot And Microservice", "3 Months", "17000","15th Aug 2025"),
            new CourseDetail("Manual & Automation Testing", "4 Months", "20000","15th Aug 2025")
        );
    }
}
