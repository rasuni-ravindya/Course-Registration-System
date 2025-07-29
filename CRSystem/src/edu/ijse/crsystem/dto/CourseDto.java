/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.crsystem.dto;
import java.util.List;

/**
 *
 * @author Rasuni
 */
public class CourseDto {
    private String courseId;
    private String title;
    private Integer creditHours;
    private String department;
    private Integer maxCapacity;
    private String prerequisites;

    public CourseDto() {
    }

    public CourseDto(String courseId, String title, Integer creditHours, String department, Integer maxCapacity, String prerequisites) {
        this.courseId = courseId;
        this.title = title;
        this.creditHours = creditHours;
        this.department = department;
        this.maxCapacity = maxCapacity;
        this.prerequisites = prerequisites;
    }

    /**
     * @return the courseId
     */
    public String getCourseId() {
        return courseId;
    }

    /**
     * @param courseId the courseId to set
     */
    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the creditHours
     */
    public Integer getCreditHours() {
        return creditHours;
    }

    /**
     * @param creditHours the creditHours to set
     */
    public void setCreditHours(Integer creditHours) {
        this.creditHours = creditHours;
    }

    /**
     * @return the department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * @param department the department to set
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * @return the maxCapacity
     */
    public Integer getMaxCapacity() {
        return maxCapacity;
    }

    /**
     * @param maxCapacity the maxCapacity to set
     */
    public void setMaxCapacity(Integer maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    /**
     * @return the prerequisites
     */
    public String getPrerequisites() {
        return prerequisites;
    }

    /**
     * @param prerequisites the prerequisites to set
     */
    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

    @Override
    public String toString() {
        return "CourseDto{" + "courseId=" + courseId + ", title=" + title + ", creditHours=" + creditHours + ", department=" + department + ", maxCapacity=" + maxCapacity + ", prerequisites=" + prerequisites + '}';
    }
    
    
    
    
    
}
