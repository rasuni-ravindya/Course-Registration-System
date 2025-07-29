/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edu.ijse.crsystem;

import edu.ijse.crsystem.view.AdminDashboardView;
import edu.ijse.crsystem.view.CourseView;
import edu.ijse.crsystem.view.EnrollmentView;
import edu.ijse.crsystem.view.FacultyDashboardView;
import edu.ijse.crsystem.view.LoginView;
import edu.ijse.crsystem.view.StudentView;
import edu.ijse.crsystem.view.SignUpView;
import edu.ijse.crsystem.view.StudentDashboardView;


/**
 *
 * @author Rasuni
 */
public class CRSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        new EnrollmentView().setVisible(true);
        new AdminDashboardView().setVisible(true);
        new FacultyDashboardView().setVisible(true);
        new StudentDashboardView().setVisible(true);
        new CourseView().setVisible(true);
        new StudentView().setVisible(true);
        new SignUpView().setVisible(true);
        new LoginView().setVisible(true);
       
    }
    
}
