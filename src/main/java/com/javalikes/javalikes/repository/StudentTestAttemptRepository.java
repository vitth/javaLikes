package com.javalikes.javalikes.repository;

import com.javalikes.javalikes.model.StudentTestAttempt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentTestAttemptRepository extends JpaRepository<StudentTestAttempt, Long> {
    List<StudentTestAttempt> findByStudentEmail(String email);
    List<StudentTestAttempt> findByTestName(String testName);
}
