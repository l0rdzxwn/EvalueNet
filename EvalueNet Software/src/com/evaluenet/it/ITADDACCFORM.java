/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.evaluenet.it;
import com.evaluenet.services.ITService;
import com.evaluenet.teacher.TCHLANDING;
import com.evaluenet.admin.SubjectForm;
import com.evaluenet.admin.tablesf1;
import com.evaluenet.login.LoginUI;
import com.evaluenet.models.Account;
import com.evaluenet.models.Teacher;
import com.evaluenet.services.AccountService;
import com.formdev.flatlaf.FlatLightLaf;
import com.mysql.cj.jdbc.result.ResultSetMetaData;
import io.github.cdimascio.dotenv.Dotenv;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;


public class ITADDACCFORM extends javax.swing.JFrame {

    /**
     * Creates new form ITADDACCFORM
     */
    public ITADDACCFORM(String val) {
        initComponents();
        ITName.setText(val);
        java.awt.Image img = new ImageIcon(this.getClass().getResource("/com/evaluenet/assets/iconic.png")).getImage();
        this.setIconImage(img);
        fName.setEnabled(false);
        lName.setEnabled(false);
        tchName.setEnabled(false);
        tchName.addItem("Select a Teacher: ");
        displayIntoTable();
        insertIntoTeacherCB();
    }

    AccountService accServ = new AccountService();
    ITService service = new ITService();
    DefaultComboBoxModel<String> tcModel = new DefaultComboBoxModel<>();
    
    public void displayIntoTable(){
        Set<Account> accounts = service.getAll();
        DefaultTableModel secAssign = (DefaultTableModel) accTable.getModel();
        secAssign.setRowCount(0);
        accTable.setDefaultEditor(Object.class, null);
        
        for(Account acc: accounts){
            Object[] row = new Object[3];
            row[0] = acc.getFullname();
            row[1] = acc.getUsername();
            row[2] = acc.getType();
            secAssign.addRow(row);
        }
    }
    
    public void insertIntoTeacherCB(){
        List<Teacher> teacher = service.getTeachers();
        for(Teacher tch: teacher){
            tcModel.addElement(tch.getName());
        } 
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        passbox = new javax.swing.JTextField();
        button = new javax.swing.JButton();
        userType = new javax.swing.JComboBox<>();
        lName = new javax.swing.JTextField();
        fName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tchName = new javax.swing.JComboBox<>();
        uName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        ITName = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        accTable = new javax.swing.JTable();
        button1 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        uNameRem = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        uNameRes = new javax.swing.JTextField();
        button2 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel1.setText("LAST NAME:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(570, 230, 140, 22);

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel6.setText("PASSWORD:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(290, 410, 140, 16);

        passbox.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(passbox);
        passbox.setBounds(290, 440, 500, 40);

        button.setBackground(new java.awt.Color(0, 153, 102));
        button.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        button.setForeground(new java.awt.Color(255, 255, 255));
        button.setText("SUBMIT");
        button.setBorder(null);
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionPerformed(evt);
            }
        });
        getContentPane().add(button);
        button.setBounds(450, 490, 190, 40);

        userType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select account type: ","IT", "HR", "Admin", "Teacher" }));
        userType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTypeActionPerformed(evt);
            }
        });
        getContentPane().add(userType);
        userType.setBounds(290, 170, 250, 40);

        lName.setBackground(new java.awt.Color(204, 204, 204));
        lName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lNameKeyTyped(evt);
            }
        });
        getContentPane().add(lName);
        lName.setBounds(570, 260, 220, 40);

        fName.setBackground(new java.awt.Color(204, 204, 204));
        fName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fNameKeyTyped(evt);
            }
        });
        getContentPane().add(fName);
        fName.setBounds(290, 260, 250, 40);

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel2.setText("FOR TEACHER ACCOUNT: ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(570, 140, 220, 22);

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel5.setText("USERNAME:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(290, 310, 140, 22);

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel3.setText(" FIRST NAME:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(290, 230, 140, 22);

        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel7.setText("SELECT ACCOUNT TYPE: ");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(290, 140, 220, 22);

        tchName.setModel(tcModel);
        getContentPane().add(tchName);
        tchName.setBounds(570, 170, 220, 40);

        uName.setBackground(new java.awt.Color(204, 204, 204));
        uName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                uNameKeyTyped(evt);
            }
        });
        getContentPane().add(uName);
        uName.setBounds(290, 350, 500, 40);
        getContentPane().add(jLabel9);
        jLabel9.setBounds(150, 60, 60, 0);

        jPanel1.setBackground(new java.awt.Color(0, 108, 72));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Poppins SemiBold", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("IT Dashboard");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 190, 30));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1280, 70);

        jPanel4.setBackground(new java.awt.Color(0, 153, 102));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel4.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 610, 250, 56));

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
        jPanel4.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 680, 250, 55));

        ITName.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        ITName.setForeground(new java.awt.Color(255, 255, 255));
        ITName.setText("LORD ZIERWIN");
        jPanel4.add(ITName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 200, 30));

        jLabel8.setFont(new java.awt.Font("Poppins ExtraBold", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("IT Administrator");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 240, 30));

        jPanel2.setBackground(new java.awt.Color(0, 153, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 242, 242), 2));
        jPanel4.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 70, 290, 120));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("IT Administrator");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 220, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("IT Administrator");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 220, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("IT Administrator");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 220, 30));

        getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 0, 270, 800);

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(28, 68, 45));
        jLabel4.setText("ADD ACCOUNT");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(410, 90, 270, 40);

        accTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "username", "User Type"
            }
        ));
        jScrollPane1.setViewportView(accTable);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(300, 550, 950, 200);

        button1.setBackground(new java.awt.Color(0, 153, 102));
        button1.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setText("REMOVE");
        button1.setBorder(null);
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        getContentPane().add(button1);
        button1.setBounds(960, 230, 170, 40);

        jLabel17.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel17.setText("USERNAME:");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(860, 140, 140, 22);

        uNameRem.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(uNameRem);
        uNameRem.setBounds(860, 170, 380, 40);

        jLabel20.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(28, 68, 45));
        jLabel20.setText("REMOVE ACCOUNT");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(900, 90, 320, 40);

        uNameRes.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(uNameRes);
        uNameRes.setBounds(850, 440, 380, 40);

        button2.setBackground(new java.awt.Color(0, 153, 102));
        button2.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        button2.setForeground(new java.awt.Color(255, 255, 255));
        button2.setText("RESET LIMIT");
        button2.setBorder(null);
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        getContentPane().add(button2);
        button2.setBounds(960, 490, 170, 40);

        jLabel18.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel18.setText("USERNAME:");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(850, 410, 140, 22);

        jLabel21.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(28, 68, 45));
        jLabel21.setText("RESET LIMITS");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(950, 350, 200, 40);

        setSize(new java.awt.Dimension(1294, 810));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionPerformed
        String usertype = (String) userType.getSelectedItem();
        if(!userType.equals("Teacher")){
            if(fName.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Please put a first name");
            }else if(lName.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Please put a last name");
            }else if(uName.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Please put a username");
            }else if(passbox.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Please put a password");
            }else{
                String firstName = fName.getText();
                String lastName = lName.getText();
                String fullName = firstName+"\n"+lastName;
                accServ.createAccount(fullName,uName.getText(),passbox.getText(),usertype);
            }
        }else if(uName.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Please put a username");
        }else if(passbox.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Please put a password");
        }else{
            String tcName = (String) tchName.getSelectedItem();
            accServ.createAccount(tcName,uName.getText(),passbox.getText(),usertype);
        }
            displayIntoTable();
 
    }//GEN-LAST:event_buttonActionPerformed

    private void userTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTypeActionPerformed
         String cbVal = (String) userType.getSelectedItem();
        
         fName.setText(null);
         lName.setText(null);
         uName.setText(null);
         passbox.setText(null);
        if(cbVal.equals("Teacher")){
           tchName.setEnabled(true);
           fName.setEnabled(false);
          lName.setEnabled(false);
       }else if(cbVal.equals("Select account type: ")){ 
           fName.setEnabled(false);
          lName.setEnabled(false);
       }else if(cbVal.equals("Admin")){
          fName.setEnabled(true);
          lName.setEnabled(true);
          tchName.setEnabled(false);
          
        }else{
          fName.setEnabled(true);
          lName.setEnabled(true);
          tchName.setEnabled(false);
         
        }
    }//GEN-LAST:event_userTypeActionPerformed

    private void fNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fNameKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
             evt.consume();
        }
    }//GEN-LAST:event_fNameKeyTyped

    private void lNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lNameKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
             evt.consume();
        }
    }//GEN-LAST:event_lNameKeyTyped

    private void uNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_uNameKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
             evt.consume();
        }
    }//GEN-LAST:event_uNameKeyTyped

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        ITADDACC iac = new ITADDACC(ITName.getText());
        iac.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        LoginUI l1 = new LoginUI();
        int answer = JOptionPane.showConfirmDialog(this, "Are you sure you want to log out?","Logout Confirmation", JOptionPane.YES_NO_OPTION);
        if(answer == JOptionPane.YES_OPTION){
            dispose();
            l1.setVisible(true);
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        accServ.deleteAccount(uNameRem.getText());
        displayIntoTable();
    }//GEN-LAST:event_button1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        accServ.resetAccountLimit(uNameRes.getText());
        displayIntoTable();
    }//GEN-LAST:event_button2ActionPerformed
    
    public static void launch(String TCname) {
        ITADDACCFORM tl = new ITADDACCFORM(TCname);
         // Set the sub value if needed
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
            java.util.logging.Logger.getLogger(ITADDACCFORM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ITADDACCFORM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ITADDACCFORM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ITADDACCFORM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        System.setProperty("flatlaf.useNativeLibrary", "false");
        FlatLightLaf.setup();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                launch("");
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ITName;
    private javax.swing.JTable accTable;
    private javax.swing.JButton button;
    private javax.swing.JButton button1;
    private javax.swing.JButton button2;
    private javax.swing.JTextField fName;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lName;
    private javax.swing.JTextField passbox;
    private javax.swing.JComboBox<String> tchName;
    private javax.swing.JTextField uName;
    private javax.swing.JTextField uNameRem;
    private javax.swing.JTextField uNameRes;
    private javax.swing.JComboBox<String> userType;
    // End of variables declaration//GEN-END:variables
}
