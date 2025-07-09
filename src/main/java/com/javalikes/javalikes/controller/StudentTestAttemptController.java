package com.javalikes.javalikes.controller;

import com.javalikes.javalikes.model.StudentTestAttempt;
import com.javalikes.javalikes.service.StudentTestAttemptService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tests")
public class StudentTestAttemptController {

	private final StudentTestAttemptService attemptService;

	public StudentTestAttemptController(StudentTestAttemptService attemptService) {
		this.attemptService = attemptService;
	}

	@GetMapping("/{email}")
	public List<StudentTestAttempt> getAttempts(@PathVariable String email) {
		return attemptService.getAttemptsForStudent(email);
	}

	@PostMapping("/record")
	public StudentTestAttempt recordAttempt(@RequestParam String email, @RequestParam String testName,
			@RequestParam Double score) {
		return attemptService.recordTestAttempt(email, testName, score);
	}
}
