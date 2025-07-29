package models;

public class Course {
    private String courseId;
    private String courseName;
    private int credits;
    private String department;
    private String prerequisites;
    private int maxCapacity;

    // Constructor
    public Course(String courseId, String courseName, int credits, String department, String prerequisites, int maxCapacity) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.credits = credits;
        this.department = department;
        this.prerequisites = prerequisites;
        this.maxCapacity = maxCapacity;
    }

    // Getters and Setters
    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }
}
