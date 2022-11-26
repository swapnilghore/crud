package com.ATDev.crud;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDAO {
	
	@Autowired
	public SessionFactory sf;
	
	List<Student> getAllStudents(){
		Session session = sf.openSession();
		@Deprecated
		Criteria criteria = session.createCriteria(Student.class);
		List<Student> al =   criteria.list();
		return al;
	}

	Student getStudent(int id){
		Session session = sf.openSession();
		Student s = session.load(Student.class, id);
		return s;
	}

	String addStudent(Student std){
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
		session.save(std);
		trans.commit();
		session.close();
		return "Record Saved Successfully !!";
	}

	void updateStudent(Student std){
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
		Student student = session.load(Student.class, std.getRollno());
		student.setName(std.getName());
		session.update(student);
		trans.commit();
		session.close();
	}

	String deleteStudentRecord(int id){
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
		Object persistentInstance = session.load(Student.class, id);
		session.delete(persistentInstance);
		trans.commit();
		return "Record Deleted Succesfully !!";
	}
}
