package com.javalikes.javalikes.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Test {
    @Id @GeneratedValue
    private Long id;
    private String course;
    private int weekNo;
    private LocalDateTime createdAt = LocalDateTime.now();
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getWeekNo() {
		return weekNo;
	}
	public void setWeekNo(int weekNo) {
		this.weekNo = weekNo;
	}
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
    
    
    // getters/setters
}