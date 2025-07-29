/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.crsystem.Dao;

import edu.ijse.crsystem.dto.EnrollmentDto;
import java.util.ArrayList;
/**
 *
 * @author Rasuni
 */
public interface EnrollmentDao {
    boolean enrollStudent(EnrollmentDto dto) throws Exception;
    boolean dropEnrollment(String studentId, String courseId) throws Exception;
    boolean isEnrolled(String studentId, String courseId) throws Exception;
    
    ArrayList<EnrollmentDto> getAllEnrollments() throws Exception;
}
