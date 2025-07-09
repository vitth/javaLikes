package com.javalikes.javalikes.service;

import com.javalikes.javalikes.model.StudentBadge;
import com.javalikes.javalikes.repository.StudentBadgeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentBadgeService {

    private final StudentBadgeRepository badgeRepo;

    public StudentBadgeService(StudentBadgeRepository badgeRepo) {
        this.badgeRepo = badgeRepo;
    }

    public List<StudentBadge> getBadgesForStudent(String email) {
        return badgeRepo.findByStudentEmail(email);
    }

    public StudentBadge awardBadge(String email, String badgeName, String description) {
        StudentBadge badge = new StudentBadge(email, badgeName, description);
        return badgeRepo.save(badge);
    }
}
