package com.kamegatze.studentsystem.service;

import com.kamegatze.studentsystem.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
