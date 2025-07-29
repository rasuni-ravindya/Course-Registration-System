package dao;

import models.Course;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CourseDAO {
    private static final String URL = "jdbc:mysql://localhost:3306/crs_db";
    private static final String USER = "root";
    private static final String PASSWORD = "1234";

    public void addCourse(Course course) {
        String checkPrerequisiteQuery = "SELECT course_id FROM courses WHERE course_id = ?";
        String query = "INSERT INTO courses (course_id, c_name, credits, department, prerequisites, max_capacity) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(query)) {
            
            if (course.getPrerequisites() != null) {
            try (PreparedStatement checkStmt = conn.prepareStatement(checkPrerequisiteQuery)) {  // ✅ Declare here
                checkStmt.setString(1, course.getPrerequisites());
                ResultSet rs = checkStmt.executeQuery();
                if (!rs.next()) {
                    course.setPrerequisites(null); // Set to NULL if prerequisite doesn't exist
                }
            }
        }

            stmt.setString(1, course.getCourseId());
            stmt.setString(2, course.getCourseName());
            stmt.setInt(3, course.getCredits());
            stmt.setString(4, course.getDepartment());
            stmt.setString(5, course.getPrerequisites());
            stmt.setInt(6, course.getMaxCapacity());

            stmt.executeUpdate();
            System.out.println("✅ Course added successfully!");
        } catch (SQLException e) {
            System.out.println("❌ Error adding course: " + e.getMessage());
        }
    }

    public Course getCourseById(String courseId) {
        String query = "SELECT * FROM courses WHERE course_id = ?";
        Course course = null;

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, courseId);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                course = new Course(
                        rs.getString("course_id"),
                        rs.getString("c_name"),
                        rs.getInt("credits"),
                        rs.getString("department"),
                        rs.getString("prerequisites"),
                        rs.getInt("max_capacity")
                );
            }
        } catch (SQLException e) {
            System.out.println("❌ Error fetching course: " + e.getMessage());
        }

        return course;
    }

    public List<Course> getAllCourses() {
        String query = "SELECT * FROM courses";
        List<Course> courses = new ArrayList<>();

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(query)) {

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Course course = new Course(
                        rs.getString("course_id"),
                        rs.getString("c_name"),
                        rs.getInt("credits"),
                        rs.getString("department"),
                        rs.getString("prerequisites"),
                        rs.getInt("max_capacity")
                );
                courses.add(course);
            }
        } catch (SQLException e) {
            System.out.println("❌ Error fetching courses: " + e.getMessage());
        }

        return courses;
    }

    public void updateCourse(Course course) {
        String query = "UPDATE courses SET c_name = ?, credits = ?, department = ?, prerequisites = ?, max_capacity = ? WHERE course_id = ?";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, course.getCourseName());
            stmt.setInt(2, course.getCredits());
            stmt.setString(3, course.getDepartment());
            stmt.setString(4, course.getPrerequisites());
            stmt.setInt(5, course.getMaxCapacity());
            stmt.setString(6, course.getCourseId());

            stmt.executeUpdate();
            System.out.println("✅ Course updated successfully!");
        } catch (SQLException e) {
            System.out.println("❌ Error updating course: " + e.getMessage());
        }
    }

    public void deleteCourse(String courseId) {
        String query = "DELETE FROM courses WHERE course_id = ?";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, courseId);
            stmt.executeUpdate();
            System.out.println("✅ Course deleted successfully!");
        } catch (SQLException e) {
            System.out.println("❌ Error deleting course: " + e.getMessage());
        }
    }
}
