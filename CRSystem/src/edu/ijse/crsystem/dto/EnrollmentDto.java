/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.crsystem.dto;
import java.time.LocalDate;

public class EnrollmentDto {
     private int enrollmentId; 
     private String studentId;
     private String courseId;
     private LocalDate enrollmentDate;

    public EnrollmentDto(int enrollmentId, String studentId, String courseId, LocalDate enrollmentDate) {
        this.enrollmentId = enrollmentId;
        this.studentId = studentId;
        this.courseId = courseId;
        this.enrollmentDate = enrollmentDate;
    }
    
    public EnrollmentDto(String studentId, String courseId, LocalDate enrollmentDate) {
        this.studentId = studentId;
        this.courseId = courseId;
        this.enrollmentDate = enrollmentDate;
    }
    
    public int getEnrollmentId() {
        return enrollmentId;
    }

    public void setEnrollmentId(int enrollmentId) {
        this.enrollmentId = enrollmentId;
    }
    
    public String getStudentId() { 
        return studentId; 
    }
    
    public String getCourseId() { 
        return courseId; 
    }
    
    public LocalDate getEnrollmentDate() { 
        return enrollmentDate; 
    }

    public void setStudentId(String studentId) { 
        this.studentId = studentId; 
    }
    
    public void setCourseId(String courseId) { 
        this.courseId = courseId; 
    }
    
    public void setEnrollmentDate(LocalDate enrollmentDate) { 
        this.enrollmentDate = enrollmentDate; 
    }

   
}
