/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edu.ijse.crsystem.view;

import edu.ijse.crsystem.controller.StudentController;
import edu.ijse.crsystem.dto.StudentDto;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Date;



/**
 *
 * @author Rasuni
 */
public class StudentView extends javax.swing.JFrame {
    
    private StudentController studentController = new StudentController();

 
    public StudentView() {
        initComponents();
        loadTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHeading = new javax.swing.JLabel();
        lblStudentId = new javax.swing.JLabel();
        lblProgram = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblStudyYear = new javax.swing.JLabel();
        lblContact = new javax.swing.JLabel();
        lblDob = new javax.swing.JLabel();
        txtStudentId = new javax.swing.JTextField();
        txtDob = new javax.swing.JTextField();
        txtProgram = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtContact = new javax.swing.JTextField();
        txtStudyYear = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStudent = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblHeading.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeading.setText("Student Registration Form");

        lblStudentId.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblStudentId.setText("Student Id:");

        lblProgram.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblProgram.setText("Program:");

        lblName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblName.setText("Full Name:");

        lblStudyYear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblStudyYear.setText("Study Year:");

        lblContact.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblContact.setText("Contact(Email):");

        lblDob.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDob.setText("Date of Birth:");

        btnSave.setBackground(new java.awt.Color(0, 153, 255));
        btnSave.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSave.setText("Save Student");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(0, 204, 0));
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUpdate.setText("Edit Student");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(255, 51, 0));
        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDelete.setText("Delete Student");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        tblStudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblStudentMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblStudent);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(lblHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblName)
                            .addComponent(lblStudentId)
                            .addComponent(lblDob)
                            .addComponent(lblProgram)
                            .addComponent(lblStudyYear)
                            .addComponent(lblContact)
                            .addComponent(btnSave))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtProgram, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtStudentId, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDob, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtStudyYear, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(btnUpdate)
                                .addGap(41, 41, 41)
                                .addComponent(btnDelete))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(lblHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStudentId)
                    .addComponent(txtStudentId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDob)
                    .addComponent(txtDob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProgram)
                    .addComponent(txtProgram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStudyYear)
                    .addComponent(txtStudyYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContact)
                    .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
                                        
    try {
        String dobText = txtDob.getText().trim();

        // Parse user input date
        java.util.Date utilDate = new java.text.SimpleDateFormat("dd-MM-yyyy").parse(dobText);
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());

        StudentDto studentDto = new StudentDto(
            txtStudentId.getText().trim(),
            txtName.getText().trim(),
            sqlDate,
            txtProgram.getText().trim(),
            Integer.parseInt(txtStudyYear.getText().trim()),
            txtContact.getText().trim()
        );

        String resp = studentController.saveStudent(studentDto);
        JOptionPane.showMessageDialog(this, resp);
        loadTable();
        clearForm();

    } catch (java.text.ParseException ex) {
        JOptionPane.showMessageDialog(this, "Invalid Date! Please enter date as dd-MM-yyyy");
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
    }


    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        updateStudent();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        deleteStudent();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tblStudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblStudentMouseClicked
        searchStudent();
    }//GEN-LAST:event_tblStudentMouseClicked

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblContact;
    private javax.swing.JLabel lblDob;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblProgram;
    private javax.swing.JLabel lblStudentId;
    private javax.swing.JLabel lblStudyYear;
    private javax.swing.JTable tblStudent;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtDob;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtProgram;
    private javax.swing.JTextField txtStudentId;
    private javax.swing.JTextField txtStudyYear;
    // End of variables declaration//GEN-END:variables

private void saveStudent(){
        StudentDto  studentDto = new StudentDto(
                txtStudentId.getText(),
                txtName.getText(),
                Date.valueOf(txtDob.getText()),
                txtProgram.getText(),
                Integer.parseInt(txtStudyYear.getText()),
                txtContact.getText()
        );
        
        try {
            String resp = studentController.saveStudent(studentDto);
            JOptionPane.showMessageDialog(this, resp);
            loadTable();
            clearForm();
            
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage());
            
        }
       
    }
    
    private void updateStudent(){
        StudentDto  studentDto = new StudentDto(
                txtStudentId.getText(),
                txtName.getText(),
                Date.valueOf(txtDob.getText()),
                txtProgram.getText(),
                Integer.parseInt(txtStudyYear.getText()),
                txtContact.getText()
        );
        
        try {
            String resp = studentController.updateStudent(studentDto);
            JOptionPane.showMessageDialog(this, resp);
            loadTable();
            clearForm();
            
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage());
            
        }
       
    }
        
     
        
    private void deleteStudent(){
        try {
            String resp = studentController.deleteStudent(txtStudentId.getText());
            JOptionPane.showMessageDialog(this, resp);
            loadTable();
            clearForm();
            
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage());
            
        }
       
    }  
        
    
    public void loadTable(){
        try {
            String columns[] = {"Student Id", "Full Name", "Date of Birth", "Program", "Study Year", "Contact"};
            DefaultTableModel dtm = new DefaultTableModel(columns, 0){
                public boolean isCellEditable(int row, int column){
                    return false;
                }
            };
            tblStudent.setModel(dtm);
            
            ArrayList<StudentDto> studentDtos = studentController.getAllStudent();
            for (StudentDto studentDto : studentDtos){
                Object[] rowData = {studentDto.getStudentId(), studentDto.getName(), studentDto.getDob(), studentDto.getProgram(), studentDto.getStudyYear(), studentDto.getContact()};
                dtm.addRow(rowData);
            }
            
        } catch (Exception e) {
             e.printStackTrace();
             JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    
    private void clearForm(){
        txtStudentId.setText("");
        txtName.setText("");
        txtDob.setText("");
        txtProgram.setText("");
        txtStudyYear.setText("");
        txtContact.setText("");
    }
    
    private void searchStudent(){
        String studentId = tblStudent.getValueAt(tblStudent.getSelectedRow(), 0).toString();
        try {
            StudentDto studentDto = studentController.searchStudent(studentId);
            if(studentDto != null){
                txtStudentId.setText(studentDto.getStudentId());
                txtName.setText(studentDto.getName());
                txtDob.setText(studentDto.getDob().toString());
                txtProgram.setText(studentDto.getProgram());
                txtStudyYear.setText(Integer.toString(studentDto.getStudyYear()));
                txtContact.setText(studentDto.getContact());
            }else{
                JOptionPane.showMessageDialog(this, "Student not found.");
            }
        } catch (Exception e) {
            e.printStackTrace();
             JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
}
