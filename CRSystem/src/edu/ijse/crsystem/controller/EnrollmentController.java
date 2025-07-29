/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.crsystem.controller;

import edu.ijse.crsystem.Dao.EnrollmentDao;
import edu.ijse.crsystem.Dao.EnrollmentDaoImpl;
import edu.ijse.crsystem.db.DBConnection;
import edu.ijse.crsystem.dto.EnrollmentDto;
import java.util.ArrayList;

/**
 *
 * @author Rasuni
 */
public class EnrollmentController {
     private EnrollmentDao enrollmentDao;
     
     public EnrollmentController(EnrollmentDao enrollmentDao) {
        this.enrollmentDao = enrollmentDao;
    }
     
     public EnrollmentController() throws Exception {
        enrollmentDao = new EnrollmentDaoImpl(DBConnection.getInstance().getConnection());
    }
     

    public ArrayList<EnrollmentDto> getAllEnrollments() throws Exception {
        return enrollmentDao.getAllEnrollments();
    }
}
