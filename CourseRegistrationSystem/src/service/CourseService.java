package service;

import dao.CourseDAO;
import models.Course;
import java.util.List;

public class CourseService {
    private CourseDAO courseDAO;

    public CourseService() {
        courseDAO = new CourseDAO();
    }

    public void addCourse(Course course) {
        courseDAO.addCourse(course);
    }

    public Course getCourseById(String courseId) {
        return courseDAO.getCourseById(courseId);
    }

    public List<Course> getAllCourses() {
        return courseDAO.getAllCourses();
    }

    public void updateCourse(Course course) {
        courseDAO.updateCourse(course);
    }

    public void deleteCourse(String courseId) {
        courseDAO.deleteCourse(courseId);
    }
}
