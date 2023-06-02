package com.java.rest.service;

import com.java.rest.entity.Student;
import com.java.rest.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    StudentRepo studentRepo;

    @Override
    public Student getStudent(Long id) {
        return studentRepo.findById(id).get();
    }
    @Override
    public List<Student> getAllStud() {
        return studentRepo.findAll();
    }

    @Override
    public void deleteStud(Long id) {
        studentRepo.deleteById(id);
    }

    @Override
    public Student createStudent(Student std) {
        return studentRepo.save(std);
    }


}
