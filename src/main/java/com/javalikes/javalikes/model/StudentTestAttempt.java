package com.javalikes.javalikes.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class StudentTestAttempt {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String studentEmail;
	private String testName;
	private Double score;
	private LocalDateTime attemptedAt;

	public StudentTestAttempt() {
	}

	public StudentTestAttempt(String studentEmail, String testName, Double score) {
		this.studentEmail = studentEmail;
		this.testName = testName;
		this.score = score;
		this.attemptedAt = LocalDateTime.now();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public LocalDateTime getAttemptedAt() {
		return attemptedAt;
	}

	public void setAttemptedAt(LocalDateTime attemptedAt) {
		this.attemptedAt = attemptedAt;
	}
	

	// Getters and setters
}
