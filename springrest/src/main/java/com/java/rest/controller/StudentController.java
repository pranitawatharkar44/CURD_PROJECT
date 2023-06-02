//package com.java.rest.controller;
//
//import com.java.rest.entity.Student;
//import com.java.rest.service.StudentServiceImpl;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//public class StudentController {
//
//    @Autowired
//    StudentServiceImpl studentServiceimpl;
//
//    @PostMapping("/save")
//    public Student CreateStud(@RequestBody Student std)
//    {
//    return studentServiceimpl.createStudent(std);
//    }
//
//    @GetMapping("/student/{id}")
//    public Student GetStud(@PathVariable Long id)
//    {
//        return studentServiceimpl.getStudent(id);
//    }
//
//    @GetMapping("/student/getall")
//    public List<Student> GetAllStud()
//    {
//
//        return studentServiceimpl.getAllStud();
//    }
//
//    @DeleteMapping ("/student/{id}")
//    public String DeleteStud(@PathVariable Long id)
//    {
//        studentServiceimpl.deleteStud(id);
//        return "deleted succesfully";
//    }
//
//    @PutMapping("/student/{eid}")
//    public Student UpdateStud(@RequestBody Student std , @PathVariable Long eid)
//    {
//      Student existStud=  studentServiceimpl.getStudent(eid);
//      existStud.setName(std.getName());
//      existStud.setAge(std.getAge());
//      return studentServiceimpl.createStudent(existStud);
//    }
//
//
//}
