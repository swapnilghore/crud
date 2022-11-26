package com.ATDev.crud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
public class StudentController {
    @Autowired
    StudentService ss;

    @GetMapping("/getallstudents") // Gives all the records in database.
    public List<Student> getAllStudents() {
        return ss.getAllStudents();
    }

    @GetMapping("/getstudent/{rno}") // Gives single Record from the database.
    public Student getStudent(@PathVariable("rno") int rno) {
        return ss.getStudent(rno);
    }

    @PostMapping("/addstudent/stud") // Add new Record into the database.
    public String addStudent(@RequestBody Student stud) {
        return ss.addStudent(stud);
    }

    @PutMapping("/updatestudent/stud") // Update the existing record in the database.
    public String updateStudent(@RequestBody Student stud) {
        return ss.updateStudent(stud);
    }

    @DeleteMapping("/deletestudent/{rno}") // Delete the record from the database.
    public String deleteStudent(@PathVariable("rno") int rno) {
        return ss.deleteStudent(rno);
    }
}
