package com.ATDev.crud;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentDAO sdao;

    List<Student> getAllStudents() {
        return sdao.getAllStudents();
    }

    Student getStudent(int rno) {
        return sdao.getStudent(rno);
    }

    String addStudent(Student std) {
        return sdao.addStudent(std);
    }

    String updateStudent(Student std) {
        return sdao.updateStudent(std);
    }

    String deleteStudent(int rno) {
        return sdao.deleteStudentRecord(rno);
    }
}
