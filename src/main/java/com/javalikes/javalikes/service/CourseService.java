package com.javalikes.javalikes.service;


import java.util.List;

import com.javalikes.javalikes.model.Course;

public interface CourseService {
    List<Course> getAllCourses();
    List<Course> getCoursesByCategory(String category);
}
