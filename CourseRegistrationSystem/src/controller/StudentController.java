package controller;

import dto.StudentDto;
import service.StudentService;
import java.util.List;

public class StudentController {
    private StudentService studentService;

    public StudentController() {
        studentService = new StudentService();
    }

    public void addStudent(StudentDto studentDto) {
        studentService.addStudent(studentDto); // Calls service to add student
    }

    public StudentDto getStudentById(int studentId) {
        return studentService.getStudentById(studentId); // Get student by ID
    }

    public void updateStudent(StudentDto studentDto) {
        studentService.updateStudent(studentDto); // Calls service to update student
    }

    public void deleteStudent(int studentId) {
        studentService.deleteStudent(studentId); // Delete student by ID
    }

    public List<StudentDto> getAllStudents() {
        return studentService.getAllStudents(); // Get all students
    }
}
