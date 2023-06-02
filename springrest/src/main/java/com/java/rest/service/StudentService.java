package com.java.rest.service;

import com.java.rest.entity.Student;

import java.util.List;

public interface StudentService {

    public Student getStudent(Long id);
    public List<Student> getAllStud();
    public void deleteStud(Long id);
    public Student createStudent(Student std);
   // public Student updateStud(Student std);
}
