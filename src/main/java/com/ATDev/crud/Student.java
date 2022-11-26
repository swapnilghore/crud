package com.ATDev.crud;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
    int rollno;
    String name;
    String branch;
    int year;
    String college;

    public Student() {
    }

    public Student(int rollno, String name, String branch, int year, String college) {
        this.rollno = rollno;
        this.name = name;
        this.branch = branch;
        this.year = year;
        this.college = college;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", branch='" + branch + '\'' +
                ", year=" + year +
                ", college='" + college + '\'' +
                '}';
    }
}
