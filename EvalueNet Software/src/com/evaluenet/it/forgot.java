/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.evaluenet.it;

import com.evaluenet.login.LoginUI;
import com.evaluenet.models.Account;
import com.evaluenet.services.ITService;
import com.formdev.flatlaf.FlatLightLaf;
import io.github.cdimascio.dotenv.Dotenv;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC
 */
public class forgot extends javax.swing.JFrame {

    /**
     * Creates new form forgot
     */
    public forgot() {
        initComponents();
        displayIntoTable();
        java.awt.Image img = new ImageIcon(this.getClass().getResource("/com/evaluenet/assets/iconic.png")).getImage();
        this.setIconImage(img);
        this.setResizable(false);
    }
    
    public void displayIntoTable(){
        Set<Account> accounts = service.getAll();
        DefaultTableModel secAssign = (DefaultTableModel) accTable.getModel();
        secAssign.setRowCount(0);
        accTable.setDefaultEditor(Object.class, null);
        
        for(Account acc: accounts){
            Object[] row = new Object[4];
            row[0] = acc.getFullname();
            row[1] = acc.getUsername();
            row[2] = acc.getType();
            row[3] = acc.getQuestion();
            secAssign.addRow(row);
        }
    }
    
    
    ITService service = new ITService();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        itVal = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        ansSQ = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        chosenSQ = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        userField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        accTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 800));
        getContentPane().setLayout(null);
        getContentPane().add(jLabel10);
        jLabel10.setBounds(80, -30, 260, 0);

        jPanel1.setBackground(new java.awt.Color(0, 108, 72));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Poppins SemiBold", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Security Question Panel");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 320, 30));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1280, 70);

        jPanel4.setBackground(new java.awt.Color(0, 153, 102));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton10.setBackground(new java.awt.Color(0, 108, 72));
        jButton10.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("LOG OUT");
        jButton10.setBorder(null);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 700, 250, 55));

        itVal.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        itVal.setForeground(new java.awt.Color(255, 255, 255));
        itVal.setText("LORD ZIERWIN");
        jPanel4.add(itVal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 200, 30));

        jLabel7.setFont(new java.awt.Font("Poppins ExtraBold", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("IT Administrator");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 240, 30));

        jPanel2.setBackground(new java.awt.Color(0, 153, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 242, 242), 2));
        jPanel4.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 70, 290, 120));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("IT Administrator");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 220, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("IT Administrator");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 220, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("IT Administrator");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 220, 30));

        jButton11.setBackground(new java.awt.Color(0, 108, 72));
        jButton11.setFont(new java.awt.Font("Poppins Medium", 1, 18)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("GO BACK");
        jButton11.setBorder(null);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 630, 250, 56));

        getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 0, 270, 800);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel3.setText("ANSWER");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, 100, 30));

        jButton2.setBackground(new java.awt.Color(0, 153, 102));
        jButton2.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("SAVE");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 80, 150, 40));

        ansSQ.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        ansSQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ansSQActionPerformed(evt);
            }
        });
        jPanel3.add(ansSQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 80, 220, 40));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel4.setText("SECURITY QUESTION");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 210, 20));

        chosenSQ.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose a question", "What's the name of your first pet?", "What is your favorite food?", "Who is your favorite person?" }));
        chosenSQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chosenSQActionPerformed(evt);
            }
        });
        jPanel3.add(chosenSQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 300, 40));

        jLabel15.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel15.setText("USERNAME");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 90, 20));
        jPanel3.add(userField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 220, 40));

        accTable.setAutoCreateRowSorter(true);
        accTable.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        accTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Username", "User Type", "Has Security Question"
            }
        ));
        jScrollPane1.setViewportView(accTable);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 920, 450));

        getContentPane().add(jPanel3);
        jPanel3.setBounds(300, 110, 950, 610);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String squestion = (String) chosenSQ.getSelectedItem();
        service.saveSQ(userField.getText(), ansSQ.getText(), squestion);
        displayIntoTable();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ansSQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ansSQActionPerformed
        
    }//GEN-LAST:event_ansSQActionPerformed

    private void chosenSQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chosenSQActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chosenSQActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        LoginUI l1 = new LoginUI();
        int answer = JOptionPane.showConfirmDialog(this, "Are you sure you want to log out?","Logout Confirmation", JOptionPane.YES_NO_OPTION);
        if(answer == JOptionPane.YES_OPTION){
            dispose();
            l1.setVisible(true);
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        ITADDACC iac = new ITADDACC(itVal.getText());
        iac.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton11ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(forgot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(forgot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(forgot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(forgot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        System.setProperty("flatlaf.useNativeLibrary", "false");
        FlatLightLaf.setup();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new forgot().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable accTable;
    private javax.swing.JTextField ansSQ;
    private javax.swing.JComboBox<String> chosenSQ;
    private javax.swing.JLabel itVal;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField userField;
    // End of variables declaration//GEN-END:variables
}
