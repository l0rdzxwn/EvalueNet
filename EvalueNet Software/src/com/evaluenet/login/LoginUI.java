/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.evaluenet.login;

//Essential import classes


import com.evaluenet.admin.Admin;
import com.evaluenet.hr.HRLANDING;
import com.evaluenet.it.ITADDACC;
import com.evaluenet.services.AccountService;
import com.evaluenet.teacher.TCHLANDING;
import com.evaluenet.util.UtilityFunctions;
import java.awt.Insets;
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
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import com.formdev.flatlaf.FlatLightLaf;
import io.github.cdimascio.dotenv.Dotenv;

public class LoginUI extends javax.swing.JFrame {
   
    public LoginUI() {
        initComponents();
        UtilityFunctions.disableCopy(userLP);
        UtilityFunctions.disableCopy(passLP);
        UtilityFunctions.disablePaste(userLP);
        UtilityFunctions.disablePaste(passLP);       
       
        //------------
        // ICON SETUP 
        //------------
        java.awt.Image img = new ImageIcon(this.getClass().getResource("/com/evaluenet/assets/iconic.png")).getImage();
        this.setIconImage(img);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }
    
    private final AccountService service = new AccountService();
       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        userLP = new javax.swing.JTextField();
        passLP = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        sampTxt = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        sampTxt1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

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
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 102));
        jLabel3.setText("C.O.D.E.S");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(1180, 770, 110, 30);

        userLP.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        userLP.setToolTipText("");
        getContentPane().add(userLP);
        userLP.setBounds(700, 290, 340, 50);

        passLP.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        getContentPane().add(passLP);
        passLP.setBounds(700, 390, 340, 50);

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 102));
        jLabel5.setText("Password");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(700, 360, 80, 21);

        sampTxt.setFont(new java.awt.Font("Tw Cen MT", 1, 16)); // NOI18N
        sampTxt.setForeground(new java.awt.Color(0, 153, 102));
        sampTxt.setText("<html><u>Forgot Password?</u></html>");
        getContentPane().add(sampTxt);
        sampTxt.setBounds(890, 440, 150, 40);

        jButton2.setBackground(new java.awt.Color(0, 153, 102));
        jButton2.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("LOGIN");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(800, 490, 150, 50);

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 102));
        jLabel4.setText("Username");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(700, 260, 100, 16);

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 102));
        jLabel6.setText("EvalueNet V1.1");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(1040, 770, 130, 30);

        sampTxt1.setFont(new java.awt.Font("Tw Cen MT", 1, 42)); // NOI18N
        sampTxt1.setText("EvalueNet");
        getContentPane().add(sampTxt1);
        sampTxt1.setBounds(770, 170, 210, 40);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1300, 0);

        jPanel2.setBackground(new java.awt.Color(0, 153, 102));
        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 530, 840);

        setSize(new java.awt.Dimension(1294, 808));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        service.loginAuth(userLP.getText(), passLP.getText(),this);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        UtilityFunctions.closeForm(this);
    }//GEN-LAST:event_formWindowClosing
       
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
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        System.setProperty("flatlaf.useNativeLibrary", "false");
        FlatLightLaf.setup();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField passLP;
    public javax.swing.JLabel sampTxt;
    public javax.swing.JLabel sampTxt1;
    public javax.swing.JTextField userLP;
    // End of variables declaration//GEN-END:variables
}
