package com.example.school.repository;

import com.example.school.model.Student;
import java.util.ArrayList;

public interface StudentRepository {
    ArrayList<Student> getStudents();

    Student addStudent(Student student);

    String addStudents(ArrayList<Student> student);

    Student getStudentById(int studentId);

    Student updateStudent(Student student, int studentId);

    void deleteStudent(int studentId);
}