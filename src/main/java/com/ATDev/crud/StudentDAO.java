package com.ATDev.crud;
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

    List<Student> getAllStudents() {
        Session session = sf.openSession();
        @Deprecated
        Criteria criteria = session.createCriteria(Student.class);
        return (List<Student>) criteria.list();
    }

    Student getStudent(int rno) {
        Session session = sf.openSession();
        return session.load(Student.class, rno);
    }

    String addStudent(Student std) {
        Session session = sf.openSession();
        Transaction trans = session.beginTransaction();
        session.save(std);
        trans.commit();
        session.close();
        return "Record Saved Successfully !!";
    }

    String updateStudent(Student std) {
        Session session = sf.openSession();
        Transaction trans = session.beginTransaction();
        Student student = session.load(Student.class, std.getRollno());
        student.setName(std.getName());
        student.setBranch(std.getBranch());
        student.setYear(std.getYear());
        student.setCollege(std.getCollege());
        session.update(student);
        trans.commit();
        session.close();
        return "Record Updated Successfully !!";
    }

    String deleteStudentRecord(int rno) {
        Session session = sf.openSession();
        Transaction trans = session.beginTransaction();
        Object persistentInstance = session.load(Student.class, rno);
        session.delete(persistentInstance);
        trans.commit();
        return "Record Deleted Succesfully !!";
    }
}
