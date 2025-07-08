package com.javalikes.javalikes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.javalikes.javalikes.service.CourseService;

@Controller
public class DashboardController {

	@Autowired
	private CourseService courseService;

	@GetMapping("/")
	public String homePage(Model model) {
		// You can add any summary stats here if needed
		model.addAttribute("courseList", courseService.getAllCourses());
		return "index";
	}

	@GetMapping("/syllabus")
	public String syllabusPage(Model model) {
		model.addAttribute("javaTopics", courseService.getAllJavaTopics());
		model.addAttribute("devopsTopics", courseService.getAllDevopsTopics());
		model.addAttribute("testingTopics", courseService.getByCategory("TESTING"));

		return "syllabus";
	}

	@GetMapping("/tools")
	public String toolsPage(Model model) {
		model.addAttribute("tools", courseService.getAllTools());
		return "tools";
	}

	@GetMapping("/projects")
	public String projectsPage(Model model) {
		model.addAttribute("projects", courseService.getAllProjects());
		return "projects";
	}

	@GetMapping("/testing")
	public String showTestingPage(Model model) {
		model.addAttribute("manualTopics", courseService.getByCategory("TESTING_MANUAL"));
		model.addAttribute("seleniumTopics", courseService.getByCategory("TESTING_SELENIUM"));
		model.addAttribute("frameworkTopics", courseService.getByCategory("TESTING_FRAMEWORK"));
		model.addAttribute("apiTopics", courseService.getByCategory("TESTING_API"));
		model.addAttribute("mobileTopics", courseService.getByCategory("TESTING_MOBILE"));
		model.addAttribute("perfTopics", courseService.getByCategory("TESTING_PERFORMANCE"));
		return "testing"; // this matches your testing.html
	}
}
