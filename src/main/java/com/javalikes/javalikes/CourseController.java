package com.javalikes.javalikes;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("newdata")
public class CourseController {

	
	
	@GetMapping("/get/course")
	public List<String> getAllCourse() {

		return Arrays.asList("python,java,spring,microservice");

	}
	
	@GetMapping("/get/love")
	public String getMsg() {

		return "Hi Shivani,I Love You";

	}
	

	

}
