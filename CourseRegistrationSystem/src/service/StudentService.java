package service;

import dao.StudentDAO;
import dto.StudentDto;
import models.Student;
import java.util.ArrayList;
import java.util.List;

public class StudentService {
    private StudentDAO studentDAO;

    public StudentService() {
        studentDAO = new StudentDAO();
    }

    public void addStudent(StudentDto studentDTO) {
        Student student = new Student(
            studentDTO.getName(),
            studentDTO.getDob(),
            studentDTO.getProgram(),
            studentDTO.getYear(),
            studentDTO.getContact(),
            studentDTO.getEmail(),   // Adding email
            studentDTO.getPassword() // Adding password
        );
        studentDAO.registerStudent(student);
    }

    public StudentDto getStudentById(int studentId) {
        Student student = studentDAO.getStudentById(studentId);
        if (student != null) {
            return new StudentDto(
                student.getStudentId(),
                student.getName(),
                student.getDob(),
                student.getProgram(),
                student.getYear(),
                student.getContact(),
                student.getEmail(),    // Adding email
                student.getPassword()  // Adding password
            );
        }
        return null;
    }

    public void updateStudent(StudentDto studentDTO) {
        // Create a new Student object with the updated fields
        Student student = new Student(
            studentDTO.getName(),
            studentDTO.getDob(),
            studentDTO.getProgram(),
            studentDTO.getYear(),
            studentDTO.getContact(),
            studentDTO.getEmail(),   // Adding email
            studentDTO.getPassword() // Adding password
        );

        student.setStudentId(studentDTO.getStudentId());
        studentDAO.updateStudent(student);
    }

    public void deleteStudent(int studentId) {
        studentDAO.deleteStudent(studentId);
    }

    public List<StudentDto> getAllStudents() {
        List<Student> students = studentDAO.getAllStudents();
        List<StudentDto> studentDTOs = new ArrayList<>();
        for (Student student : students) {
            studentDTOs.add(new StudentDto(
                student.getStudentId(),
                student.getName(),
                student.getDob(),
                student.getProgram(),
                student.getYear(),
                student.getContact(),
                student.getEmail(),   // Adding email
                student.getPassword() // Adding password
            ));
        }
        return studentDTOs;
    }
}
