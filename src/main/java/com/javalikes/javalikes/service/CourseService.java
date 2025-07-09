package com.javalikes.javalikes.service;

import java.util.List;

import com.javalikes.javalikes.model.Course;
import com.javalikes.javalikes.model.CourseDetail;

public interface CourseService {
	List<CourseDetail> getAllSyllabus();

	List<CourseDetail> getAllTools();

	List<CourseDetail> getAllProjects();

	List<CourseDetail> getAllJavaTopics();

	List<CourseDetail> getAllDevopsTopics();

	List<CourseDetail> getByCategory(String category);

	List<CourseDetail> getAllCourses();

	List<CourseDetail> getCoursesByCategory(String category);

	List<CourseDetail> getCoursesByTrainer(Long trainerId);

	CourseDetail getCourseById(Long id);

	List<CourseDetail> getUpcomingBatches();

    CourseDetail getCourseDetails(Long id);

}
