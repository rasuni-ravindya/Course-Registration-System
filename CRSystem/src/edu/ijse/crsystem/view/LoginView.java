/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edu.ijse.crsystem.view;

import edu.ijse.crsystem.controller.UserController;
import edu.ijse.crsystem.dto.UserDto;
import javax.swing.JOptionPane;


/**
 *
 * @author Rasuni
 */
public class LoginView extends javax.swing.JFrame {
    
    
  private UserController userController = new UserController(); 


    /**
     * Creates new form UserView
     */
    public LoginView() throws Exception {
    initComponents();
    userController = new UserController();
}



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHeading = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        jwpPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblHeading.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeading.setText("Log In");

        lblUserName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblUserName.setText("User Name:");

        lblPassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPassword.setText("Password:");

        btnLogin.setBackground(new java.awt.Color(0, 153, 255));
        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLogin.setText("Log In");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(lblHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jwpPassword))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnLogin)
                .addGap(261, 261, 261))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserName)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(jwpPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(btnLogin)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        performLogin();
    }//GEN-LAST:event_btnLoginActionPerformed

    /**
     * @param args the command line arguments
     */
  private void performLogin() {
        String username = txtUserName.getText().trim();
        String password = new String(jwpPassword.getPassword()); // secure handling

        if (username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill all fields.");
            return;
        }

        try {
             UserDto user = userController.login(username, password); // role not required here
            if (user != null) {
            JOptionPane.showMessageDialog(this, "Login successful as " + user.getRole());

            // open dashboard based on role
            switch (user.getRole().toLowerCase()) {
                case "admin":
                    new AdminDashboardView().setVisible(true);
                    break;
                case "faculty":
                    new FacultyDashboardView().setVisible(true);
                    break;
                case "student":
                    new StudentDashboardView().setVisible(true);
                    break;
                default:
                    JOptionPane.showMessageDialog(this, "Unknown role: " + user.getRole());
                    return;
            }

            this.dispose(); // close login window
        } else {
            JOptionPane.showMessageDialog(this, "Invalid username or password.");
        }

    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Login failed: " + e.getMessage());
    }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JPasswordField jwpPassword;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables

   public static void main(String[] args) throws Exception {
        new LoginView().setVisible(true);
    }  
}
