package com.javalikes.javalikes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.javalikes.javalikes.model.Student;
import com.javalikes.javalikes.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;

	@GetMapping("/register")
	public String showRegisterForm(Model model) {
		model.addAttribute("student", new Student());
		return "register";
	}

	@PostMapping("/api/students")
	public String saveStudent(@ModelAttribute Student student) {
		studentService.save(student);
		return "redirect:/success";
	}

	@GetMapping("/success")
	public String showSuccessPage() {
		return "success";
	}

	@GetMapping("/students")
	public String listStudents(Model model) {
		model.addAttribute("students", studentService.getAllStudents());
		return "list";
	}
}
