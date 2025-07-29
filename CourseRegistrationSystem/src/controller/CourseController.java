package controller;

import models.Course;
import service.CourseService;
import java.util.List;

public class CourseController {
    private CourseService courseService;

    public CourseController() {
        courseService = new CourseService();
    }

    public void addCourse(Course course) {
        courseService.addCourse(course);
    }

    public Course getCourseById(String courseId) {
        return courseService.getCourseById(courseId);
    }

    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }

    public void updateCourse(Course course) {
        courseService.updateCourse(course);
    }

    public void deleteCourse(String courseId) {
        courseService.deleteCourse(courseId);
    }
}
