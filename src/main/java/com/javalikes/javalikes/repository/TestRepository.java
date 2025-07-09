package com.javalikes.javalikes.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javalikes.javalikes.model.Test;

@Repository
public interface TestRepository extends JpaRepository<Test, Long> {
	Optional<Test> findByCourseAndWeekNo(String course, int weekNo);
}
