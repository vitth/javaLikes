package com.javalikes.javalikes.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.javalikes.javalikes.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
