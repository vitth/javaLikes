package com.javalikes.javalikes.service;


import java.util.List;

import com.javalikes.javalikes.model.Student;

public interface StudentService {
    void save(Student student);
    List<Student> getAllStudents();
}
