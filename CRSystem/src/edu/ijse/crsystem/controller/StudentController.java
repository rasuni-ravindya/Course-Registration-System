/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.crsystem.controller;

import edu.ijse.crsystem.dto.StudentDto;
import edu.ijse.crsystem.model.StudentModel;
import java.util.ArrayList;

/**
 *
 * @author Rasuni
 */
public class StudentController {
    private StudentModel studentModel = new StudentModel();
    
    public String saveStudent(StudentDto studentDto) throws Exception{
        return studentModel.saveStudent(studentDto);
    }
    
    public String updateStudent(StudentDto studentDto) throws Exception{
        return studentModel.updateStudent(studentDto);
    }
    
    public String deleteStudent(String studentId) throws Exception{
        return studentModel.deleteStudent(studentId);
    }
    
    public ArrayList<StudentDto>getAllStudent() throws Exception{
        return studentModel.getAllStudent();
    }
    
    public StudentDto searchStudent(String studentId) throws Exception{
        return studentModel.searchStudent(studentId);
    }
    
}
