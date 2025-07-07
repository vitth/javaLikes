package com.javalikes.javalikes.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.javalikes.javalikes.service.CourseService;

@Controller
public class HomeController {

	@Autowired
	private CourseService courseService;

	@GetMapping("/")
	public String home(Model model) {
	    model.addAttribute("syllabus", courseService.getCoursesByCategory("syllabus"));
	    model.addAttribute("tools", courseService.getCoursesByCategory("tool"));
	    model.addAttribute("projects", courseService.getCoursesByCategory("project"));
	    model.addAttribute("fees", 30000);
	    model.addAttribute("discountedFees", 25000);
	    return "index";
	}

}