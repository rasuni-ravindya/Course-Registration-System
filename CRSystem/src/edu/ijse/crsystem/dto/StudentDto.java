/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.crsystem.dto;
import java.sql.Date;

/**
 *
 * @author Rasuni
 */
public class StudentDto {
    private String studentId;
    private String name;
    private Date dob;
    private String program;
    private Integer studyYear;
    private String contact;

    public StudentDto() {
    }

    public StudentDto(String studentId, String name, Date dob, String program, Integer studyYear, String contact) {
        this.studentId = studentId;
        this.name = name;
        this.dob = dob;
        this.program = program;
        this.studyYear = studyYear;
        this.contact = contact;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public Integer getStudyYear() {
        return studyYear;
    }

    public void setStudyYear(Integer studyYear) {
        this.studyYear = studyYear;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "StudentDto{" + "studentId=" + studentId + ", name=" + name + ", dob=" + dob + ", program=" + program + ", studyYear=" + studyYear + ", contact=" + contact + '}';
    }
    
    
    
}
