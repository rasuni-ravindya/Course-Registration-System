import controller.StudentController;
import dto.StudentDto;

public class MainApp {
    public static void main(String[] args) {
        // Create an instance of StudentController
        StudentController studentController = new StudentController();

        // Create a new StudentDto (Data Transfer Object), studentId is not needed (auto-incremented by database)
        // Now including email and password
        StudentDto studentDto = new StudentDto(0, "Dilshan Fernando", "2000-12-28", "Data Science", 2, "0774349990", "dilshan@example.com", "password123");

        // Add student to the system (studentId is auto-generated)
        studentController.addStudent(studentDto);

        // Get student by ID (assuming student with ID 1 exists)
        StudentDto fetchedStudentDto = studentController.getStudentById(8);  // Assuming ID 1 exists
        if (fetchedStudentDto != null) {
            System.out.println("Fetched Student: " + fetchedStudentDto.getName());
        } else {
            System.out.println("Student not found!");
        }

        // Update student info
        if (fetchedStudentDto != null) {
            fetchedStudentDto.setProgram("Data Science Advanced");  // Update program
            studentController.updateStudent(fetchedStudentDto);
            System.out.println("Updated Student: " + fetchedStudentDto.getName());
        }

        // Delete student (if the student exists)
        if (fetchedStudentDto != null) {
            studentController.deleteStudent(fetchedStudentDto.getStudentId());
            System.out.println("Student with ID " + fetchedStudentDto.getStudentId() + " has been deleted.");
        }
    }
}
