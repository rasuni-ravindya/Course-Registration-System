/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.crsystem.model;

import edu.ijse.crsystem.db.DBConnection;
import edu.ijse.crsystem.dto.StudentDto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Rasuni
 */
public class StudentModel {
    public String saveStudent(StudentDto studentDto) throws Exception{
        String sql = "INSERT INTO student VALUES (?,?,?,?,?,?)";
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, studentDto.getStudentId());
        statement.setString(2, studentDto.getName());
        statement.setDate(3, studentDto.getDob());
        statement.setString(4, studentDto.getProgram());
        statement.setInt(5, studentDto.getStudyYear());
        statement.setString(6, studentDto.getContact());
        
        return statement.executeUpdate() > 0 ? "Successfully saved": "Failed to save";
    }
    
    public String updateStudent(StudentDto studentDto) throws Exception{
        String sql = "UPDATE student SET Name=?,DOB=?, Program=?, StudyYear=?, Contact=? WHERE StudentId=?";
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(6, studentDto.getStudentId());
        statement.setString(1, studentDto.getName());
        statement.setDate(2, studentDto.getDob());
        statement.setString(3, studentDto.getProgram());
        statement.setInt(4, studentDto.getStudyYear());
        statement.setString(5, studentDto.getContact());
        
        return statement.executeUpdate() > 0 ? "Successfully updated": "Failed to update";
    }
    
    public String deleteStudent(String studentId) throws Exception{
        String sql = "DELETE from student WHERE StudentId=?";
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, studentId);
      
        return statement.executeUpdate() > 0 ? "Successfully deleted": "Failed to delete";
    }
    
    public StudentDto searchStudent (String studentId) throws Exception{
        String sql = "SELECT * from student WHERE StudentId=?";
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, studentId);
        
        ResultSet rst = statement.executeQuery();
        if(rst.next()){
            StudentDto dto = new StudentDto(rst.getString("StudentId"), 
                    rst.getString("Name"),
                    rst.getDate("DOB"),
                    rst.getString("Program"),
                    rst.getInt("StudyYear"),
                    rst.getString("Contact"));
            return dto;
        }
        return null;   
    }
    
     public ArrayList<StudentDto> getAllStudent() throws Exception{
        String sql = "SELECT * from student";
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);        
        
        ResultSet rst = statement.executeQuery();
        ArrayList<StudentDto> studentDtos = new ArrayList<>();
        while(rst.next()){
            StudentDto dto = new StudentDto(rst.getString("StudentId"), 
                    rst.getString("Name"),
                    rst.getDate("DOB"),
                    rst.getString("Program"),
                    rst.getInt("StudyYear"),
                    rst.getString("Contact"));
            studentDtos.add(dto);
        }
        return studentDtos;
}
}
