package dto;

public class CourseDto {
    private String courseId;
    private String courseName;
    private int credits;
    private String department;
    private String prerequisites;
    private int maxCapacity;

    // Constructor
    public CourseDto(String courseId, String courseName, int credits, String department, String prerequisites, int maxCapacity) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.credits = credits;
        this.department = department;
        this.prerequisites = prerequisites;
        this.maxCapacity = maxCapacity;
    }

    // Getters
    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCredits() {
        return credits;
    }

    public String getDepartment() {
        return department;
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    // Setters
    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }
}