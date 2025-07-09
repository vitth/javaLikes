package com.javalikes.javalikes.service;

import com.javalikes.javalikes.model.StudentTestAttempt;
import com.javalikes.javalikes.repository.StudentTestAttemptRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentTestAttemptService {

    private final StudentTestAttemptRepository attemptRepo;

    public StudentTestAttemptService(StudentTestAttemptRepository attemptRepo) {
        this.attemptRepo = attemptRepo;
    }

    public List<StudentTestAttempt> getAttemptsForStudent(String email) {
        return attemptRepo.findByStudentEmail(email);
    }

    public StudentTestAttempt recordTestAttempt(String email, String testName, Double score) {
        StudentTestAttempt attempt = new StudentTestAttempt(email, testName, score);
        return attemptRepo.save(attempt);
    }
}
