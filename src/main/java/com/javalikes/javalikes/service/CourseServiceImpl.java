package com.javalikes.javalikes.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javalikes.javalikes.model.CourseDetail;
import com.javalikes.javalikes.repository.CourseDetailRepository;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseDetailRepository repo;

    @Override
    public List<CourseDetail> getAllCourses() {
        return repo.findAll();
    }

    @Override
    public List<CourseDetail> getAllJavaTopics() {
        return repo.findByCategory("JAVA");
    }

    @Override
    public List<CourseDetail> getAllDevopsTopics() {
        return repo.findByCategory("DEVOPS");
    }

    @Override
    public List<CourseDetail> getAllTools() {
        return repo.findByCategory("TOOLS");
    }

    @Override
    public List<CourseDetail> getAllProjects() {
        return repo.findByCategory("PROJECT");
    }

    @Override
    public List<CourseDetail> getByCategory(String category) {
        return repo.findByCategory(category);
    }

    @Override
    public List<CourseDetail> getCoursesByCategory(String category) {
        return repo.findByCategory(category);
    }

    @Override
    public List<CourseDetail> getCoursesByTrainer(Long trainerId) {
        return repo.findByTrainerId(trainerId);
    }

    @Override
    public List<CourseDetail> getUpcomingBatches() {
         return repo.findAll();
    }

    @Override
    public CourseDetail getCourseDetails(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public CourseDetail getCourseById(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<CourseDetail> getAllSyllabus() {
        // This is a stub; implement as needed
        return null;
    }
}
