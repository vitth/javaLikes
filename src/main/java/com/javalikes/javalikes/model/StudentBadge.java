package com.javalikes.javalikes.model;



import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class StudentBadge {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String studentEmail;
    private String badgeName;
    private String description;
    private LocalDateTime awardedAt;

    public StudentBadge() {
    }

    public StudentBadge(String studentEmail, String badgeName, String description) {
        this.studentEmail = studentEmail;
        this.badgeName = badgeName;
        this.description = description;
        this.awardedAt = LocalDateTime.now();
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

	public String getBadgeName() {
		return badgeName;
	}

	public void setBadgeName(String badgeName) {
		this.badgeName = badgeName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDateTime getAwardedAt() {
		return awardedAt;
	}

	public void setAwardedAt(LocalDateTime awardedAt) {
		this.awardedAt = awardedAt;
	}

    // Getters and Setters
}
