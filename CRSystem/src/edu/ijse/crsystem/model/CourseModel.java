/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.crsystem.model;

import edu.ijse.crsystem.db.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import edu.ijse.crsystem.dto.CourseDto;
import java.util.ArrayList;



/**
 *
 * @author Rasuni
 */
public class CourseModel {
    public String saveCourse(CourseDto courseDto) throws Exception{
        String sql = "INSERT INTO course VALUES (?,?,?,?,?,?)";
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, courseDto.getCourseId());
        statement.setString(2, courseDto.getTitle());
        statement.setInt(3, courseDto.getCreditHours());
        statement.setString(4, courseDto.getDepartment());
        statement.setInt(5, courseDto.getMaxCapacity());
        statement.setString(6, courseDto.getPrerequisites());
        
        return statement.executeUpdate() > 0 ? "Successfully saved": "Failed to save";
    }
    
    public String updateCourse(CourseDto courseDto) throws Exception{
        String sql = "UPDATE course SET Title=?,CreditHours=?, Department=?, MaxCapacity=?, Prerequisites=? WHERE CourseId=?";
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(6, courseDto.getCourseId());
        statement.setString(1, courseDto.getTitle());
        statement.setInt(2, courseDto.getCreditHours());
        statement.setString(3, courseDto.getDepartment());
        statement.setInt(4, courseDto.getMaxCapacity());
        statement.setString(5, courseDto.getPrerequisites());
        
        return statement.executeUpdate() > 0 ? "Successfully updated": "Failed to update";
    }
    
    public String deleteCourse(String courseId) throws Exception{
        String sql = "DELETE from course WHERE CourseId=?";
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, courseId);
      
        return statement.executeUpdate() > 0 ? "Successfully deleted": "Failed to delete";
    }
    
    public CourseDto searchCourse (String courseId) throws Exception{
        String sql = "SELECT * from course WHERE CourseId=?";
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, courseId);
        
        ResultSet rst = statement.executeQuery();
        if(rst.next()){
            CourseDto dto = new CourseDto(rst.getString("CourseId"), 
                    rst.getString("Title"),
                    rst.getInt("CreditHours"),
                    rst.getString("Department"),
                    rst.getInt("MaxCapacity"),
                    rst.getString("Prerequisites"));
            return dto;
        }
        return null;   
    }
    
     public ArrayList<CourseDto> getAllCourse() throws Exception{
        String sql = "SELECT * from course";
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);        
        
        ResultSet rst = statement.executeQuery();
        ArrayList<CourseDto> courseDtos = new ArrayList<>();
        while(rst.next()){
            CourseDto dto = new CourseDto(rst.getString("CourseId"), 
                    rst.getString("Title"),
                    rst.getInt("CreditHours"),
                    rst.getString("Department"),
                    rst.getInt("MaxCapacity"),
                    rst.getString("Prerequisites"));
            courseDtos.add(dto);
        }
        return courseDtos;
}
     
}
