package com.ATDev.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
	
	@Autowired
	StudentService ss;
	
	@GetMapping("/demo")
	String demo() {
		return "This is demo";
	}

	@GetMapping("/getallstudents")
	public List<Student> getAllStudents(){
		return ss.getAllStudents();
	}

	@GetMapping("/getstudent/{id}")
	public Student getStudent(@PathVariable("id") int id){
		return ss.getStudent(id);
	}

	@PostMapping("/addstudent/stud")
	public String addStudent(@RequestBody Student stud){
		return ss.addStudent(stud);
	}

	@PutMapping("/updatestudent")
	public String updateStudent(@RequestParam String id, @RequestParam String name){
		int newid = Integer.parseInt(id);
		Student s = new Student(newid, name);
		System.out.println(s);
		System.out.println("InController");
		ss.updateStudent(s);
		return "Record updated";
	}

	@DeleteMapping("/deletestudent/{id}")
	public String deleteStudent(@PathVariable("id") int id){

		return ss.deleteStudent(id);
	}

}
