package com.javalikes.javalikes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.javalikes.javalikes.model.Enquiry;
import com.javalikes.javalikes.model.Student;

@Controller
public class UIController {

	@GetMapping("/registerff")
	public String showRegistrationForm(Model model) {
		model.addAttribute("student", new Student());
		return "register";
	}

	@GetMapping("/enquiry")
	public String showEnquiryForm(Model model) {
		model.addAttribute("enquiry", new Enquiry());
		return "enquiry";
	}

	@GetMapping("/enquiry/status")
	public String showEnquiryStatusForm() {
		return "enquiryStatus";
	}
}
