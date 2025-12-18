/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.evaluenet.hr;
import com.evaluenet.login.LoginUI;
import com.evaluenet.models.Teacher;
import com.evaluenet.services.TeacherServices;
import com.formdev.flatlaf.FlatLightLaf;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author lordz
 */
public class HRLANDING extends javax.swing.JFrame {

    /**
     * Creates new form HRLANDING
     */
    public HRLANDING(String name) {
        initComponents();
        hrName.setText(name);
        displayAnalytics();
        displayToTable();
    }  
    
    TeacherServices service = new TeacherServices();
    
    private void displayAnalytics(){
        List<Integer> analytics = service.fetchAnalytics();
        numTch.setText(analytics.get(0).toString());
        numActiveStatus.setText(analytics.get(1).toString());
        numInactiveStatus.setText(analytics.get(2).toString());
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
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tchTable = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        hrName = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        numTch = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        numInactiveStatus = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        numActiveStatus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

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

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(330, 240, 890, 410);

        jButton2.setBackground(new java.awt.Color(0, 153, 102));
        jButton2.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("REFRESH");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(1020, 660, 200, 50);

        jPanel1.setBackground(new java.awt.Color(0, 108, 72));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Poppins SemiBold", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("HR Dashboard");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 390, 30));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1280, 70);

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

        getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 0, 270, 800);

        jPanel3.setBackground(new java.awt.Color(0, 153, 102));

        jLabel1.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Teacher");

        numTch.setFont(new java.awt.Font("Poppins Medium", 1, 28)); // NOI18N
        numTch.setForeground(new java.awt.Color(255, 255, 255));
        numTch.setText("34");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(numTch))
                .addGap(87, 87, 87))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(5, 5, 5)
                .addComponent(numTch)
                .addContainerGap())
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(330, 120, 270, 100);

        jPanel7.setBackground(new java.awt.Color(0, 153, 102));

        jLabel11.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Inactive Status");

        numInactiveStatus.setFont(new java.awt.Font("Poppins Medium", 1, 28)); // NOI18N
        numInactiveStatus.setForeground(new java.awt.Color(255, 255, 255));
        numInactiveStatus.setText("65");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(numInactiveStatus))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(numInactiveStatus)
                .addContainerGap())
        );

        getContentPane().add(jPanel7);
        jPanel7.setBounds(940, 120, 280, 100);

        jPanel6.setBackground(new java.awt.Color(0, 153, 102));

        jLabel2.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Active Status");

        numActiveStatus.setFont(new java.awt.Font("Poppins Medium", 1, 28)); // NOI18N
        numActiveStatus.setForeground(new java.awt.Color(255, 255, 255));
        numActiveStatus.setText("45");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(numActiveStatus))
                .addGap(154, 154, 154))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(numActiveStatus)
                .addContainerGap())
        );

        getContentPane().add(jPanel6);
        jPanel6.setBounds(620, 120, 300, 100);

        setSize(new java.awt.Dimension(1296, 808));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        displayToTable();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        LoginUI l1 = new LoginUI();
        int answer = JOptionPane.showConfirmDialog(this, "Are you sure you want to log out?","Logout Confirmation", JOptionPane.YES_NO_OPTION);
        if(answer == JOptionPane.YES_OPTION){
            dispose();
            l1.setVisible(true);
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    public static void launch(String HRname) {
        HRLANDING tl = new HRLANDING(HRname);
         // Set the sub value if needed
        tl.setVisible(true);
    }
    public static void main(String args[]) {
        System.setProperty("flatlaf.useNativeLibrary", "false");
        FlatLightLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                launch("");
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel hrName;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel numActiveStatus;
    private javax.swing.JLabel numInactiveStatus;
    private javax.swing.JLabel numTch;
    private javax.swing.JTable tchTable;
    // End of variables declaration//GEN-END:variables
}
