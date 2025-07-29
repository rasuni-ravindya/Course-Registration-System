/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.crsystem.Dao;

import edu.ijse.crsystem.Dao.EnrollmentDao;
import edu.ijse.crsystem.dto.EnrollmentDto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Rasuni
 */
public class EnrollmentDaoImpl implements EnrollmentDao {
    private final Connection connection;

    public EnrollmentDaoImpl(Connection connection) {
        this.connection = connection;
    }

    public EnrollmentDaoImpl() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean enrollStudent(EnrollmentDto dto) throws Exception {
        String sql = "INSERT INTO Enrollment (StudentId, CourseId, EnrollmentDate) VALUES (?, ?, ?)";
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setString(1, dto.getStudentId());
        stmt.setString(2, dto.getCourseId());
        stmt.setDate(3, java.sql.Date.valueOf(dto.getEnrollmentDate()));
        return stmt.executeUpdate() > 0;
    }

    @Override
    public boolean dropEnrollment(String studentId, String courseId) throws Exception {
        String sql = "DELETE FROM Enrollment WHERE StudentId = ? AND CourseId = ?";
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setString(1, studentId);
        stmt.setString(2, courseId);
        return stmt.executeUpdate() > 0;
    }

    @Override
    public boolean isEnrolled(String studentId, String courseId) throws Exception {
        String sql = "SELECT * FROM Enrollment WHERE StudentId = ? AND CourseId = ?";
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setString(1, studentId);
        stmt.setString(2, courseId);
        ResultSet rst = stmt.executeQuery();
        return rst.next();
    }

    @Override
    public ArrayList<EnrollmentDto> getAllEnrollments() throws Exception {
        ArrayList<EnrollmentDto> enrollments = new ArrayList<>();
        String sql = "SELECT EnrollmentId, StudentId, CourseId, EnrollmentDate FROM enrollment";

    try (PreparedStatement stmt = connection.prepareStatement(sql);
         ResultSet rs = stmt.executeQuery()) {

        while (rs.next()) {
            int enrollmentId = rs.getInt("EnrollmentId");
            String studentId = rs.getString("StudentId");
            String courseId = rs.getString("CourseId");
            LocalDate enrollmentDate = rs.getDate("EnrollmentDate").toLocalDate();

            EnrollmentDto dto = new EnrollmentDto(enrollmentId, studentId, courseId, enrollmentDate);
            enrollments.add(dto);
        }
    }

    return enrollments;
}

}