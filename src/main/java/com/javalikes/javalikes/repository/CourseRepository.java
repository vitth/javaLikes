package com.javalikes.javalikes.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javalikes.javalikes.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {
    List<Course> findByType(String type);

	List<Course> findByCategory(String string);
	
}
