/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.crsystem.controller;

import edu.ijse.crsystem.model.CourseModel;
import edu.ijse.crsystem.dto.CourseDto;
import java.util.ArrayList;

/**
 *
 * @author Rasuni
 */
public class CourseController {
    
    private CourseModel courseModel = new CourseModel();
    
    public String saveCourse(CourseDto courseDto) throws Exception{
        return courseModel.saveCourse(courseDto);
    }
    
    public String updateCourse(CourseDto courseDto) throws Exception{
        return courseModel.updateCourse(courseDto);
    }
    
    public String deleteCourse(String courseId) throws Exception{
        return courseModel.deleteCourse(courseId);
    }
    
    public ArrayList<CourseDto>getAllCourse() throws Exception{
        return courseModel.getAllCourse();
    }
    
    public CourseDto searchCourse(String courseId) throws Exception{
        return courseModel.searchCourse(courseId);
    }
    
}
