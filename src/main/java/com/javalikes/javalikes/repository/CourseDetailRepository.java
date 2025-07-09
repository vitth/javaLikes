package com.javalikes.javalikes.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javalikes.javalikes.model.CourseDetail;

@Repository
public interface CourseDetailRepository extends JpaRepository<CourseDetail, Long> {

	// Fetch by category if needed
	List<CourseDetail> findByCategory(String category);

	// Example: find by trainer id
	List<CourseDetail> findByTrainerId(Long trainerId);
	List<CourseDetail> findByStartDateAfter(LocalDate date);


}
