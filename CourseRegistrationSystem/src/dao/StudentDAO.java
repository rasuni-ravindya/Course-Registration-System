package dao;

import models.Student;
import org.mindrot.jbcrypt.BCrypt; // For password hashing

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
    private static final String URL = "jdbc:mysql://localhost:3306/crs_db";
    private static final String USER = "root";
    private static final String PASSWORD = "1234";

    // Register a new student (with email and hashed password)
    public boolean registerStudent(Student student) {
        String query = "INSERT INTO students (name, dob, program, year, contact, email, password) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {

            stmt.setString(1, student.getName());
            stmt.setString(2, student.getDob());
            stmt.setString(3, student.getProgram());
            stmt.setInt(4, student.getYear());
            stmt.setString(5, student.getContact());
            stmt.setString(6, student.getEmail());

            // Hash the password before storing it
            String hashedPassword = BCrypt.hashpw(student.getPassword(), BCrypt.gensalt());
            stmt.setString(7, hashedPassword);

            int rowsInserted = stmt.executeUpdate();
            if (rowsInserted > 0) {
                try (ResultSet generatedKeys = stmt.getGeneratedKeys()) {
                    if (generatedKeys.next()) {
                        student.setStudentId(generatedKeys.getInt(1));
                        System.out.println("✅ Student registered successfully with ID: " + student.getStudentId());
                        return true;
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println("❌ Error registering student: " + e.getMessage());
        }
        return false;
    }

    // Authenticate login (checks email and password)
    public boolean authenticateStudent(String email, String password) {
        String query = "SELECT password FROM students WHERE email = ?";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, email);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                String hashedPassword = rs.getString("password");
                return BCrypt.checkpw(password, hashedPassword); // Compare input password with hashed password
            }
        } catch (SQLException e) {
            System.out.println("❌ Error during authentication: " + e.getMessage());
        }
        return false;
    }

    // Retrieve student by ID
    public Student getStudentById(int studentId) {
        String query = "SELECT * FROM students WHERE student_id = ?";
        Student student = null;

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, studentId);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                student = new Student(
                    rs.getInt("student_id"),
                    rs.getString("name"),
                    rs.getString("dob"),
                    rs.getString("program"),
                    rs.getInt("year"),
                    rs.getString("contact"),
                    rs.getString("email"),
                    rs.getString("password")
                );
            }
        } catch (SQLException e) {
            System.out.println("❌ Error retrieving student: " + e.getMessage());
        }
        return student;
    }

    // Update student info
    public void updateStudent(Student student) {
        String query = "UPDATE students SET program = ?, year = ?, contact = ?, email = ? WHERE student_id = ?";
        
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, student.getProgram());
            stmt.setInt(2, student.getYear());
            stmt.setString(3, student.getContact());
            stmt.setString(4, student.getEmail());
            stmt.setInt(5, student.getStudentId());

            stmt.executeUpdate();
            System.out.println("✅ Student updated successfully!");
        } catch (SQLException e) {
            System.out.println("❌ Error updating student: " + e.getMessage());
        }
    }

    // Delete student
    public void deleteStudent(int studentId) {
        String query = "DELETE FROM students WHERE student_id = ?";
        
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, studentId);
            stmt.executeUpdate();
            System.out.println("✅ Student deleted successfully!");
        } catch (SQLException e) {
            System.out.println("❌ Error deleting student: " + e.getMessage());
        }
    }

    // Retrieve all students
    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        String query = "SELECT * FROM students";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                Student student = new Student(
                    rs.getInt("student_id"),
                    rs.getString("name"),
                    rs.getString("dob"),
                    rs.getString("program"),
                    rs.getInt("year"),
                    rs.getString("contact"),
                    rs.getString("email"),
                    rs.getString("password")
                );
                students.add(student);
            }
        } catch (SQLException e) {
            System.out.println("❌ Error retrieving students: " + e.getMessage());
        }
        return students;
    }
}
