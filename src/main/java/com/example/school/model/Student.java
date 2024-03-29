package com.example.school.model;

public class Student {
    private int studentId;
    private String studentName;
    private String gender;
    private Integer standard;

    public Student(int studentId, String studentName, String gender, Integer standard) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.gender = gender;
        this.standard = standard;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getStandard() {
        return standard;
    }

    public void setStandard(Integer standard) {
        this.standard = standard;
    }
}