package com.javalikes.javalikes.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javalikes.javalikes.model.StudentBadge;
import com.javalikes.javalikes.service.StudentBadgeService;

@RestController
@RequestMapping("/api/badges")
public class StudentBadgeController {

    private final StudentBadgeService badgeService;

    public StudentBadgeController(StudentBadgeService badgeService) {
        this.badgeService = badgeService;
    }

    @GetMapping("/{email}")
    public List<StudentBadge> getBadges(@PathVariable String email) {
        return badgeService.getBadgesForStudent(email);
    }

    @PostMapping("/award")
    public StudentBadge awardBadge(@RequestParam String email,
                                   @RequestParam String badgeName,
                                   @RequestParam String description) {
        return badgeService.awardBadge(email, badgeName, description);
    }
}
