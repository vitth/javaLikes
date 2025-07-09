package com.javalikes.javalikes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.javalikes.javalikes.model.CourseDetail;

@Controller
public class CourseController {

	/*
	 * @Autowired private CourseDetailRepository courseRepo;
	 * 
	 * @GetMapping("/courses") public String showCourses(Model model) {
	 * List<CourseDetail> courses = courseRepo.findAll();
	 * model.addAttribute("courses", courses); return "courses"; }
	 */
}
