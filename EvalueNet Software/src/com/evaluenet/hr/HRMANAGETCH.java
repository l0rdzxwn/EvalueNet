/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.evaluenet.hr;

import com.evaluenet.models.Teacher;
import com.evaluenet.services.TeacherServices;
import com.formdev.flatlaf.FlatLightLaf;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lordz
 */
public class HRMANAGETCH extends javax.swing.JFrame {

    /**
     * Creates new form HRMANAGETCH
     */
    public HRMANAGETCH() {
        initComponents();
        displayToTable();
        insertDataToCB();
    }
    
    private void displayToTable(){
        List<Teacher> teachers = service.fetchTeachers();
        DefaultTableModel tchModel = (DefaultTableModel) tchTable.getModel();
        tchModel.setRowCount(0);
        for(Teacher teacher: teachers){
            List<Object> row = new ArrayList<>();
                row.add(teacher.getName());
                row.add(teacher.getSex());
                row.add(teacher.getAge());
                row.add(teacher.getEmpStatus());
                row.add(teacher.getActiveStatus());
            tchModel.addRow(row.toArray());
        }
    }
    
    private void insertDataToCB(){
        List<Teacher> teachers = service.fetchTeachers();
        DefaultComboBoxModel tchModel = (DefaultComboBoxModel) teacherCB.getModel();
        for(Teacher teacher: teachers){
            tchModel.addElement(teacher.getName());
        }
    }
    
    TeacherServices service = new TeacherServices();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameField = new javax.swing.JTextField();
        statusCB = new javax.swing.JComboBox<>();
        sexCB = new javax.swing.JComboBox<>();
        eStatusCB = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tchTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        ageField = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        hrName = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        teacherCB = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        statusCB1 = new javax.swing.JComboBox<>();
        eStatusCB2 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 350, 40));

        statusCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select student's status: ","Active", "Inactive" }));
        getContentPane().add(statusCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, 350, 40));

        sexCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a sex: ","Male", "Female" }));
        getContentPane().add(sexCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 150, 40));

        eStatusCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select an employment status: ","Part-time", "Casual", "Full-time" }));
        getContentPane().add(eStatusCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, 350, 40));

        tchTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "Sex", "Age", "Employment Status", "Status"
            }
        ));
        jScrollPane1.setViewportView(tchTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 540, 950, 240));

        jButton1.setBackground(new java.awt.Color(0, 153, 102));
        jButton1.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("UPDATE STATUS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 320, 180, 40));
        getContentPane().add(ageField, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, 180, 40));

        jPanel1.setBackground(new java.awt.Color(0, 108, 72));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Poppins SemiBold", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("HR Manage Teacher Dashboard");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 420, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 70));

        jPanel4.setBackground(new java.awt.Color(0, 153, 102));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton11.setBackground(new java.awt.Color(0, 108, 72));
        jButton11.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("LOG OUT");
        jButton11.setBorder(null);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 700, 250, 55));

        hrName.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        hrName.setForeground(new java.awt.Color(255, 255, 255));
        hrName.setText("LORD ZIERWIN");
        jPanel4.add(hrName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 200, 30));

        jLabel5.setFont(new java.awt.Font("Poppins ExtraBold", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("HR Administrator");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 240, 30));

        jPanel2.setBackground(new java.awt.Color(0, 153, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 242, 242), 2));
        jPanel4.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 70, 290, 120));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("IT Administrator");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 220, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("IT Administrator");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 220, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("IT Administrator");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 220, 30));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 108, 72));
        jLabel4.setText("ADD ACCOUNT");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 200));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 800));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel1.setText("STATUS: ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, 150, 30));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel2.setText("AGE:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, 150, 30));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel3.setText("SEX:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 150, 30));

        jLabel12.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel12.setText("TEACHER'S NAME:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 150, 30));

        jLabel17.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel17.setText("EMPLOYMENT STATUS: ");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, 220, 30));

        jLabel8.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 108, 72));
        jLabel8.setText("ADD TEACHER");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 280, 40));

        jLabel13.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 108, 72));
        jLabel13.setText("CHANGE STATUS");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 100, 280, 40));

        jLabel14.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel14.setText("TEACHER'S NAME:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 150, 150, 30));

        jButton2.setBackground(new java.awt.Color(0, 153, 102));
        jButton2.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("SUBMIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 480, 150, 40));

        teacherCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Select teacher's name: "}));
        getContentPane().add(teacherCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 180, 470, 40));

        jLabel18.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel18.setText("EMPLOYMENT STATUS: ");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 230, 220, 30));

        jLabel16.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel16.setText("STATUS: ");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 230, 100, 30));

        statusCB1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Default","Active", "Inactive" }));
        getContentPane().add(statusCB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 260, 210, 40));

        eStatusCB2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Default","Part-time", "Casual", "Full-time" }));
        getContentPane().add(eStatusCB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 260, 230, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String name = (String) teacherCB.getSelectedItem();
        String empStatus =(String) eStatusCB2.getSelectedItem();
        String activeStatus =(String) statusCB1.getSelectedItem();
        
        if(teacherCB.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null,"Please choose a proper teacher name");
            return;
        }
        
        service.updateStatus(name,empStatus,activeStatus);
        displayToTable();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(eStatusCB.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null, "Please select an employment status ");
            return;
        }
        
        if(statusCB.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null, "Please select whether its an active or inactive status ");
            return;
        }
        
        String name = nameField.getText();
        String age = ageField.getText();
        String sex = (String) sexCB.getSelectedItem();
        String empStatus = (String) eStatusCB.getSelectedItem();
        String activeStatus = (String) statusCB.getSelectedItem();
        
        service.createTeacher(name, age, sex, empStatus, activeStatus);
        displayToTable();
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
        System.setProperty("flatlaf.useNativeLibrary", "false");
        FlatLightLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HRMANAGETCH().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageField;
    private javax.swing.JComboBox<String> eStatusCB;
    private javax.swing.JComboBox<String> eStatusCB2;
    private javax.swing.JLabel hrName;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameField;
    private javax.swing.JComboBox<String> sexCB;
    private javax.swing.JComboBox<String> statusCB;
    private javax.swing.JComboBox<String> statusCB1;
    private javax.swing.JTable tchTable;
    private javax.swing.JComboBox<String> teacherCB;
    // End of variables declaration//GEN-END:variables
}
