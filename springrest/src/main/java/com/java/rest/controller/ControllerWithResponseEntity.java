package com.java.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.java.message.GenericMessage;
import com.java.rest.entity.Student;
import com.java.rest.service.StudentServiceImpl;

@RestController
public class ControllerWithResponseEntity
{

	 @Autowired
	    StudentServiceImpl studentServiceimpl;

	    @PostMapping("/save")
	    public ResponseEntity<GenericMessage> CreateStud(@RequestBody Student std)
	    {
	     studentServiceimpl.createStudent(std);
	     
	     GenericMessage mesg= new GenericMessage();
	     mesg.setMsg("new Student created");
	     
	     return new ResponseEntity<GenericMessage>(mesg,HttpStatus.CREATED);
	    }

	        
	    
	    
	    @DeleteMapping ("/student/{id}")
	    public ResponseEntity<GenericMessage> DeleteStud(@PathVariable Long id)
	    {
	        studentServiceimpl.deleteStud(id);
	        
	        GenericMessage mesg= new GenericMessage();
		     mesg.setMsg(" Student removed successfully");
		     
		     return new ResponseEntity<GenericMessage>(mesg, HttpStatus.OK);
	    }
	    
	    
	    
	    @GetMapping("/student/{id}")
	    public Student GetStud(@PathVariable Long id)
	    {
	        return studentServiceimpl.getStudent(id);
	    }

	    @GetMapping("/student/getall")
	    public List<Student> GetAllStud()
	    {

	        return studentServiceimpl.getAllStud();
	    }

	

	    @PutMapping("/student/{eid}")
	    public Student UpdateStud(@RequestBody Student std , @PathVariable Long eid)
	    {
	      Student existStud=  studentServiceimpl.getStudent(eid);
	      existStud.setName(std.getName());
	      existStud.setAge(std.getAge());
	      return studentServiceimpl.createStudent(existStud);
	    }

	
}
