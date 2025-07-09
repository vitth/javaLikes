package com.javalikes.javalikes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.javalikes.javalikes.service.CourseService;

@Controller
public class PageController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("batches", courseService.getUpcomingBatches());
        return "index";
    }

    @GetMapping("/courses")
    public String allCourses(Model model) {
        model.addAttribute("courses", courseService.getAllCourses());
        return "courses";
    }

    @GetMapping("/courses/{id}")
    public String courseDetails(@PathVariable Long id, Model model) {
        model.addAttribute("course", courseService.getCourseById(id));
        return "course-details";
    }

    @GetMapping("/contact")
    public String contact() { return "contact"; }

    @GetMapping("/faq")
    public String faq() { return "faq"; }

    @GetMapping("/about")
    public String about() { return "about"; }
}

