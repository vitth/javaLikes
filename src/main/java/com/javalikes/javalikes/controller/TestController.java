package com.javalikes.javalikes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.javalikes.javalikes.model.Question;
import com.javalikes.javalikes.model.StudentTestAttempt;
import com.javalikes.javalikes.model.Test;
import com.javalikes.javalikes.repository.QuestionRepository;
import com.javalikes.javalikes.repository.TestRepository;
import com.javalikes.javalikes.repository.StudentTestAttemptRepository;

@RestController
@RequestMapping("/api/tests")
public class TestController {

    @Autowired
    private TestRepository testRepo;

    @Autowired
    private QuestionRepository questionRepo;

    @Autowired
    private StudentTestAttemptRepository studentTestAttemptRepo;

    @GetMapping("/{course}/week/{weekNo}")
    public List<Question> getWeeklyTest(@PathVariable String course, @PathVariable int weekNo) {
        Test test = testRepo.findByCourseAndWeekNo(course, weekNo)
                            .orElseThrow(() -> new RuntimeException("Test not found"));
        return questionRepo.findByTestId(test.getId());
    }

    @PostMapping("/submit")
    public String submitTest(@RequestBody StudentTestAttempt attempt) {
        studentTestAttemptRepo.save(attempt);
        return "Test submitted successfully!";
    }
}
