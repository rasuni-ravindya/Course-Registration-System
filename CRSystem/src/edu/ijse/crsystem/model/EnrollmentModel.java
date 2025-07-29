/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.crsystem.model;

import edu.ijse.crsystem.Dao.EnrollmentDao;
import edu.ijse.crsystem.Dao.EnrollmentDaoImpl;
import edu.ijse.crsystem.db.DBConnection;
import edu.ijse.crsystem.dto.EnrollmentDto;

/**
 *
 * @author Rasuni
 */
public class EnrollmentModel {
    private final EnrollmentDao enrollmentDao;

    public EnrollmentModel() throws Exception {
        this.enrollmentDao = new EnrollmentDaoImpl(DBConnection.getInstance().getConnection());
    }

    public boolean enroll(EnrollmentDto dto) throws Exception {
        return enrollmentDao.enrollStudent(dto);
    }

    public boolean drop(String studentId, String courseId) throws Exception {
        return enrollmentDao.dropEnrollment(studentId, courseId);
    }

    public boolean isAlreadyEnrolled(String studentId, String courseId) throws Exception {
        return enrollmentDao.isEnrolled(studentId, courseId);
    }
}
