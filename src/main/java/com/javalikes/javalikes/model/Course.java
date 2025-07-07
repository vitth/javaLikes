package com.javalikes.javalikes.model;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String topic;    // e.g. "Core Java all"
    private String category; // e.g. "syllabus", "tool", "project"

    public Course() {}

    public Course(String topic, String category) {
        this.topic = topic;
        this.category = category;
    }

    public Long getId() {
        return id;
    }
    public String getTopic() {
        return topic;
    }
    public void setTopic(String topic) {
        this.topic = topic;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
}

