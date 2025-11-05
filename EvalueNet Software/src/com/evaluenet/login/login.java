/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.evaluenet.login;

//Essential import classes

import com.evaluenet.admin.Admin;
import com.evaluenet.hr.HRLANDING;
import com.evaluenet.it.ITADDACC;
import com.evaluenet.teacher.TCHLANDING;
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


public class login extends javax.swing.JFrame {

    public login() {
        initComponents();
        disableCopy(userLP);
        disableCopy(passLP);
        disablePaste(userLP);
        disablePaste(passLP);        
        convUppercase(userLP);
        //-----------------------
        // DATABASE CALLING
        //-----------------------
            try {
                establishConnection(); //function calling
            } catch (SQLException ex) {
                Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
            }
        //------------
        // ICON SETUP 
        //------------
        java.awt.Image img = new ImageIcon(this.getClass().getResource("/com/evaluenet/assets/iconic.png")).getImage();
        this.setIconImage(img);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }
       
    
   //-------------------------
   // VARIABLE INITIALIZATION
   //-------------------------
   private Map<String, String> userDatabase = new HashMap<>();
   Connection conn;
   int i = 1;
   int x = 4;
   int limit = 4;
   int z = 5;
 
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
        jLabel5.setBounds(700, 360, 80, 24);

        sampTxt.setFont(new java.awt.Font("Tw Cen MT", 1, 16)); // NOI18N
        sampTxt.setForeground(new java.awt.Color(0, 153, 102));
        sampTxt.setText("<html><u>Forgot Password?</u></html>");
        sampTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sampTxtMouseClicked(evt);
            }
        });
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

    //-------------------
    // UTILITY FUNCTIONS
    //-------------------
    public void resetAttempts(){
        try {
            String user = userLP.getText();
            PreparedStatement getUserAttempt = conn.prepareStatement("UPDATE tblaccounts SET logAttempt = 4 WHERE username = ?");
                getUserAttempt.setString(1, user);
                getUserAttempt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void convUppercase(JTextField textfield) {
    ((AbstractDocument) textfield.getDocument()).setDocumentFilter(new DocumentFilter() {
        @Override
        public void insertString(DocumentFilter.FilterBypass fb, int offset, String string, AttributeSet attr)
                throws BadLocationException {
            if (string != null) {
                super.insertString(fb, offset, string.toUpperCase(), attr);
            }
        }

        @Override
        public void replace(DocumentFilter.FilterBypass fb, int offset, int length, String text, AttributeSet attrs)
                throws BadLocationException {
            if (text != null) {
                super.replace(fb, offset, length, text.toUpperCase(), attrs);
            }
        }
    });
}
    
    private void disableCopy(JComponent component){
        component.getInputMap().put(KeyStroke.getKeyStroke("control C"), "none");
    }
    
    private void disablePaste(JComponent component){
        component.getInputMap().put(KeyStroke.getKeyStroke("control V"), "none");
    }
    
    private void disableCP(JComponent component){
        disableCopy(component);
        disablePaste(component);
    }
    
   //----------------
   // LOGIN FUNCTION  
   //----------------
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

     if(!userLP.getText().equals("") && !passLP.getText().equals("")){
             String user = userLP.getText().trim();
             String pass = passLP.getText().trim();
             String sqlQuery = "SELECT*FROM tblaccounts WHERE username = ? AND password = ?"; //Looks for the UN and PW value             
          try {
              
              PreparedStatement getUtype = conn.prepareStatement("SELECT userType FROM tblaccounts WHERE username = ?");
                getUtype.setString(1, user);
                ResultSet findUserType = getUtype.executeQuery();
                
            //Checking credentials
                PreparedStatement pstmt = conn.prepareStatement(sqlQuery);
                pstmt.setString(1, user); //Sets String user to column, username
                pstmt.setString(2, pass); //Sets String pass to column, password
                ResultSet verify = pstmt.executeQuery();
            //Checking attempts    
                String limitcnt = "SELECT logAttempt,username FROM tblaccounts WHERE username = ?";   
             PreparedStatement limitCheck = conn.prepareStatement(limitcnt);
             limitCheck.setString(1, user);
                ResultSet checkLimit = limitCheck.executeQuery();
              
              
            if(verify.next()){ //Verifies username & password  
                if(checkLimit.next()){
                    int limitVal = checkLimit.getInt("logAttempt");
                        if(limitVal > 0){  
                            //Level of access    
                            String getName = "SELECT FullName FROM tblaccounts WHERE username = ?";
                           if(findUserType.next()){
                                String userType = findUserType.getString("userType");
                               
                                if(userType.equals("Admin")){
                                    PreparedStatement getAdminName = conn.prepareStatement(getName);
                                    getAdminName.setString(1, user);
                                    ResultSet findAdmin = getAdminName.executeQuery();

                                    if(findAdmin.next()){
                                        String adminName = findAdmin.getString("FullName");
                                    dispose();
                                    Admin a1 = new Admin(adminName);
                                    resetAttempts();
                                    a1.setVisible(true);

                                    }
                                }else if(userType.equals("Teacher")){
                                    PreparedStatement getTCName = conn.prepareStatement(getName);
                                    getTCName.setString(1, user);
                                    ResultSet findTC = getTCName.executeQuery();

                                    if(findTC.next()){
                                    String TCname = findTC.getString("FullName");
                                    TCHLANDING tl = new TCHLANDING(TCname);

                                    dispose();
                                    resetAttempts();
                                    tl.setVisible(true);
                                    }
                                }else if(userType.equals("IT")){
                                    PreparedStatement getITName = conn.prepareStatement(getName);
                                    getITName.setString(1, user);
                                    ResultSet findIT = getITName.executeQuery();
                                    if(findIT.next()){
                                    dispose();
                                    String ITname = findIT.getString("FullName");
                                    ITADDACC i1 = new ITADDACC(ITname);

                                   resetAttempts();
                                    i1.setVisible(true);
                                    }
                                }else if(userType.equals("HR")){
                                    PreparedStatement getHRName = conn.prepareStatement(getName);
                                    getHRName.setString(1, user);
                                    ResultSet findHR = getHRName.executeQuery();

                                    if(findHR.next()){
                                    dispose();

                                    String HRname = findHR.getString("FullName");
                                    HRLANDING h1 = new HRLANDING(HRname);

                                    resetAttempts();
                                    h1.setVisible(true);
                                    }
                                }
                            }
                
                
                }else if(limitVal == 0){
                    JOptionPane.showMessageDialog(null, "Login limit has been reached. Account locked.");
                       
                      }
                }else{
                    JOptionPane.showMessageDialog(null,"Invalid username.");
                        userLP.setText(""); //Clears username Textfield 
                        passLP.setText(""); //Clears password Textfield 
                }
              }else{
                  if(checkLimit.next()){
                    int limitValue = checkLimit.getInt("logAttempt");   
                    String limit = "UPDATE tblaccounts SET logAttempt = logAttempt - 1 WHERE username = ?";
                PreparedStatement lmtcheckupdate = conn.prepareStatement(limit);
                    lmtcheckupdate.setString(1,user);
                
                    if(limitValue != 0){ //defines the limits of access
                    int decrement = lmtcheckupdate.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Incorrect password. "+limitValue+" tries left.");
                        userLP.setText(""); //Clears username Textfield 
                        passLP.setText(""); //Clears password Textfield    
                    }else{  
                    JOptionPane.showMessageDialog(null, "Login limit has been reached. Account locked.");
                    int ans = JOptionPane.showConfirmDialog(null, "Do you want to access via Security Question?", "Yes/No Dialog", JOptionPane.YES_NO_OPTION);
                        if(ans == JOptionPane.YES_OPTION) {
                            String userVal = userLP.getText();    
                            
                            loginviaSQ lvsq = new loginviaSQ(userVal);
                                
                                lvsq.setVisible(true);
                                this.setVisible(false);
                          
                        } else if(ans == JOptionPane.NO_OPTION) {
                          dispose();  
                        }
                    }
                
                }else{
                    JOptionPane.showMessageDialog(null,"Invalid username.");
                        userLP.setText(""); //Clears username Textfield 
                        passLP.setText(""); //Clears password Textfield 
            }
              }
              
          
        } catch (SQLException ex) {
             Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex); 
         }
     }else{
         
         if(x!=0){
            JOptionPane.showMessageDialog(null,"Username or password has a null value. Please input a value. You have "+x+" attempt(s) left.");
            x--;
            
         }else{
             JOptionPane.showMessageDialog(null,"You keep accessing a null value. The system is now shutting down. Please Contact an IT support.");

             
             dispose();
         }
         }
    }//GEN-LAST:event_jButton2ActionPerformed
    
    
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
             int closeApp = JOptionPane.showConfirmDialog(this, "Are you sure you want to Exit?", "Exit Confirmation", JOptionPane.YES_NO_OPTION);
                    if(closeApp == JOptionPane.YES_OPTION) {
                            dispose();
                        } 
    }//GEN-LAST:event_formWindowClosing
    
   
    //--------------------------------------
    //LOGIN via SECURITY QUESTION FUNCTIONS
    //--------------------------------------
    private void sampTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sampTxtMouseClicked
        if(userLP.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please put your username first before proceeding.");
        }else{
            String userVal = userLP.getText();
                loginviaSQ lvsq = new loginviaSQ(userVal);
                                
                                lvsq.setVisible(true);
                                this.setVisible(false);
        }
    }//GEN-LAST:event_sampTxtMouseClicked
    
    public void checkSQ(){
        String userVal = userLP.getText();
        if(userLP.getText().equals(null)){
            JOptionPane.showMessageDialog(null, "Please put your username first before proceeding.");
        }else{
        try {
            PreparedStatement getSQ = conn.prepareStatement("SELECT SEC_QUES,username FROM tblaccounts WHERE username = ?");
            getSQ.setString(1, userVal);
            ResultSet rs = getSQ.executeQuery();
                if(rs.next()){
                    String values = rs.getString("SEC_QUES");
                        if(values.equals("none")){
                            JOptionPane.showMessageDialog(null, "You haven't set a security question yet.");
                        }else{
                            loginviaSQ lvsq = new loginviaSQ(userVal);
                                
                                lvsq.setVisible(true);
                                this.setVisible(false);
                               
                        }
                }
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        }  
    }   
    
   
    //-----------------------------
    //DATABASE CONNECTION FUNCTION
    //-----------------------------
    public void establishConnection() throws SQLException, ClassNotFoundException{
        
            Class.forName("com.mysql.cj.jdbc.Driver"); //Driver Connection
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/evaluenet","root","gRadingsystemDB2024"); //Database Connection
        //Checks connection
            if(conn != null){
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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        System.setProperty("flatlaf.useNativeLibrary", "false");
        FlatLightLaf.setup();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
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
