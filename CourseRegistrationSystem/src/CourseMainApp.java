import controller.CourseController;
import models.Course;

public class CourseMainApp {
    public static void main(String[] args) {
        CourseController courseController = new CourseController();

        // Add a course
        Course course = new Course("C004", "Data Structures", 4, "Computer Science", "C001", 50);
        courseController.addCourse(course);

         Course fetchedCourse = courseController.getCourseById("C001");
        if (fetchedCourse != null) {
            System.out.println("Fetched Course: " + fetchedCourse.getCourseName());
        } else {
            System.out.println("Course not found!");
        }

        // Update course
        if (fetchedCourse != null) {
            fetchedCourse.setCourseName("Intro to Cyber Security");
            courseController.updateCourse(fetchedCourse);
            System.out.println("Updated Course: " + fetchedCourse.getCourseName());
        }

        // Delete course
        courseController.deleteCourse("C002");
    }
}
