/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package EvalueNetPackage;
//Essential import classes
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;

/**
 *
 * @author PC
 */
public class signup extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public signup() {
        initComponents();
        try {
            establishConnection();
        } catch (SQLException ex) {
            Logger.getLogger(signup.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(signup.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    Connection conn;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        userSP = new javax.swing.JTextField();
        passSP = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setSize(new java.awt.Dimension(629, 397));
        getContentPane().setLayout(null);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EvalueNetPackage/Untitled design (2).png"))); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(80, -30, 260, 450);

        jPanel2.setBackground(new java.awt.Color(26, 68, 45));
        jPanel2.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("EvaluNet (Grading System V.1)");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(10, 370, 250, 27);

        jLabel2.setFont(new java.awt.Font("Old English Text MT", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jLabel2);
        jLabel2.setBounds(476, 406, 170, 0);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EvalueNetPackage/259.png"))); // NOI18N
        jPanel2.add(jLabel9);
        jLabel9.setBounds(20, 90, 250, 250);

        jLabel8.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("C.O.D.E.S");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(10, 10, 104, 27);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 300, 400);

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel3.setText("Username");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(370, 120, 100, 16);

        userSP.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        userSP.setToolTipText("");
        userSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userSPActionPerformed(evt);
            }
        });
        getContentPane().add(userSP);
        userSP.setBounds(370, 140, 180, 30);
        getContentPane().add(passSP);
        passSP.setBounds(370, 200, 180, 30);

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel5.setText("Password");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(370, 180, 110, 16);

        jLabel14.setFont(new java.awt.Font("Tw Cen MT", 1, 34)); // NOI18N
        jLabel14.setText("SIGN UP");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(410, 67, 140, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EvalueNetPackage/3.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(430, 290, 200, 250);

        jButton2.setBackground(new java.awt.Color(26, 68, 45));
        jButton2.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("SIGN UP");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(420, 260, 100, 28);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EvalueNetPackage/3.png"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(230, 270, 250, 290);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EvalueNetPackage/3.png"))); // NOI18N
        getContentPane().add(jLabel16);
        jLabel16.setBounds(330, 270, 250, 290);

        jPanel4.setBackground(new java.awt.Color(242, 239, 238));
        getContentPane().add(jPanel4);
        jPanel4.setBounds(300, 0, 300, 400);

        setSize(new java.awt.Dimension(617, 438));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void userSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userSPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userSPActionPerformed

//Sign up Button
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(userSP.getText().equals("")){ //Checks empty Textfield
            JOptionPane.showMessageDialog(null,"Please enter a username.");
        }else if(passSP.getText().equals("")){ //Checks empty Textfield
            JOptionPane.showMessageDialog(null,"Please enter a password.");
        }else{
            String user = userSP.getText();
            String pass = passSP.getText();
            String sqlExec = "INSERT INTO accounttbl(username, password) VALUES(?,?)";
        try {
            PreparedStatement pstmt = conn.prepareStatement(sqlExec);
                pstmt.setString(1, user);
                pstmt.setString(2, pass);
                
                if (user.matches("[A-Z]+")){ //Checks for username format
                    JOptionPane.showMessageDialog(this, "Sign up successful!");
                    pstmt.executeUpdate();
                    
    //Directs user to Login page
            dispose();
                login logFrame = new login();
                    logFrame.setVisible(true);
    
    //checks username format
                }else{
                    JOptionPane.showMessageDialog(this, "The username must be in capital letters.");
                    userSP.setText("");
                }
        } catch (SQLException ex) {
            Logger.getLogger(signup.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Error signing up: " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

//Creating connection
    public void establishConnection() throws SQLException, ClassNotFoundException{
        
            Class.forName("com.mysql.cj.jdbc.Driver"); //Connection to driver
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/schooldb","root","gRadingsystemDB2024"); //Database connection
            if(conn != null){ //Checks connection
                System.out.println("Connection successfully");
            }
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
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField passSP;
    private javax.swing.JTextField userSP;
    // End of variables declaration//GEN-END:variables
}
