package com.ATDev.crud;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	@Autowired
	StudentDAO sdao;
	
	List<Student> getAllStudents(){
		return sdao.getAllStudents();
	}

	Student getStudent(int id){
		return sdao.getStudent(id);
	}

	String addStudent(Student std){
		return sdao.addStudent(std);
	}

	void updateStudent(Student std){
		System.out.println(std);
		sdao.updateStudent(std);
		System.out.println("In Student Service");
	}

	String deleteStudent(int id){
		return sdao.deleteStudentRecord(id);
	}
}
