/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.evaluenet.login;

//Essential import classes


import com.evaluenet.admin.Admin;
import com.evaluenet.hr.HRLANDING;
import com.evaluenet.it.ITADDACC;
import com.evaluenet.models.Account;
import com.evaluenet.services.AccountService;
import com.evaluenet.services.ITService;

import com.evaluenet.teacher.TCHLANDING;
import io.github.cdimascio.dotenv.Dotenv;
import java.awt.Insets;
import java.util.List;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import javax.swing.JComponent;
import javax.swing.KeyStroke;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.swing.ImageIcon;
import javax.swing.JFrame;


/**
 * 
 *
 * @author PC
 */
public final class SecurityQuestionUI extends javax.swing.JFrame {

    public SecurityQuestionUI(String value) {
        initComponents();      
        userName.setText(value);
        getQuestion();
        java.awt.Image img = new ImageIcon(this.getClass().getResource("/com/evaluenet/assets/iconic.png")).getImage();
        this.setIconImage(img);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.setResizable(false);
    }

    private Map<String, String> userDatabase = new HashMap<>();
    AccountService service = new AccountService();
    ITService itServ = new ITService();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        loginPanel = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        userName = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        sqLabel = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        answerField = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        loginBtn = new javax.swing.JButton();

        jPanel4.setBackground(new java.awt.Color(242, 239, 238));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setSize(new java.awt.Dimension(0, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(240, 248, 245));
        jPanel5.setLayout(new java.awt.GridBagLayout());

        loginPanel.setBackground(new java.awt.Color(255, 255, 255));
        loginPanel.setName(""); // NOI18N
        loginPanel.setPreferredSize(new java.awt.Dimension(500, 450));
        loginPanel.setLayout(new javax.swing.BoxLayout(loginPanel, javax.swing.BoxLayout.Y_AXIS));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setMaximumSize(new java.awt.Dimension(455, 35));
        jPanel9.setPreferredSize(new java.awt.Dimension(100, 60));
        loginPanel.add(jPanel9);

        jLabel6.setFont(new java.awt.Font("Segoe UI Emoji", 0, 48)); // NOI18N
        jLabel6.setText("🔒");
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel6.setAlignmentX(0.5F);
        jLabel6.setMaximumSize(new java.awt.Dimension(66, 72));
        loginPanel.add(jLabel6);

        jLabel1.setBackground(new java.awt.Color(27, 94, 32));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 102));
        jLabel1.setText("Security Check");
        jLabel1.setAlignmentX(0.5F);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setMaximumSize(new java.awt.Dimension(206, 41));
        loginPanel.add(jLabel1);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(200, 200, 200));
        jLabel5.setText("Sign in to your account");
        jLabel5.setAlignmentX(0.5F);
        loginPanel.add(jLabel5);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMaximumSize(new java.awt.Dimension(455, 30));
        jPanel2.setPreferredSize(new java.awt.Dimension(100, 50));
        loginPanel.add(jPanel2);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Username:");
        jLabel3.setAlignmentX(0.5F);
        jLabel3.setMaximumSize(new java.awt.Dimension(205, 25));
        loginPanel.add(jLabel3);

        userName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        userName.setText("lord");
        userName.setAlignmentX(0.5F);
        userName.setMaximumSize(new java.awt.Dimension(205, 25));
        loginPanel.add(userName);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setMaximumSize(new java.awt.Dimension(455, 10));
        jPanel6.setPreferredSize(new java.awt.Dimension(100, 10));
        loginPanel.add(jPanel6);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Security Question:");
        jLabel4.setAlignmentX(0.5F);
        jLabel4.setMaximumSize(new java.awt.Dimension(205, 25));
        loginPanel.add(jLabel4);

        sqLabel.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        sqLabel.setForeground(new java.awt.Color(0, 153, 102));
        sqLabel.setText("What is your favorite food?");
        sqLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        sqLabel.setAlignmentX(0.5F);
        sqLabel.setMaximumSize(new java.awt.Dimension(205, 25));
        sqLabel.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        loginPanel.add(sqLabel);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setMaximumSize(new java.awt.Dimension(455, 10));
        jPanel7.setPreferredSize(new java.awt.Dimension(100, 10));
        loginPanel.add(jPanel7);

        answerField.setMaximumSize(new java.awt.Dimension(200, 28));
        loginPanel.add(answerField);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setMaximumSize(new java.awt.Dimension(455, 20));
        jPanel8.setPreferredSize(new java.awt.Dimension(100, 50));
        loginPanel.add(jPanel8);

        loginBtn.setBackground(new java.awt.Color(0, 153, 102));
        loginBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        loginBtn.setForeground(new java.awt.Color(255, 255, 255));
        loginBtn.setText("LOGIN");
        loginBtn.setAlignmentX(0.5F);
        loginBtn.setMaximumSize(new java.awt.Dimension(205, 43));
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });
        loginPanel.add(loginBtn);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        jPanel5.add(loginPanel, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(3, 3, 3)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 894, Short.MAX_VALUE)
                    .addGap(3, 3, 3)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        setSize(new java.awt.Dimension(916, 608));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
     
    public void getQuestion(){
        Set<Account> acc = itServ.getAll();
        for(Account account: acc){
            if(account.getUsername().contains(userName.getText())){
                sqLabel.setText(account.getQuestion());
            }
        }
    }
    
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int closeApp = JOptionPane.showConfirmDialog(this, "Are you sure you want to Exit?", "Exit Confirmation", JOptionPane.YES_NO_OPTION);
            if(closeApp == JOptionPane.YES_OPTION) {
                    dispose();
                } 
    }//GEN-LAST:event_formWindowClosing

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        service.sqAuth(userName.getText(), answerField.getText(), this);
    }//GEN-LAST:event_loginBtnActionPerformed

    public static void launch(String userVal) {
        SecurityQuestionUI tl = new SecurityQuestionUI(userVal);
        tl.setVisible(true);
    }
    
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
            java.util.logging.Logger.getLogger(SecurityQuestionUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SecurityQuestionUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SecurityQuestionUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SecurityQuestionUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               launch("");
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField answerField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JButton loginBtn;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JLabel sqLabel;
    private javax.swing.JLabel userName;
    // End of variables declaration//GEN-END:variables
}
