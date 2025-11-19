/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.evaluenet.hr;

import com.evaluenet.admin.SubjectForm;
import com.evaluenet.admin.tablesf1;
import com.evaluenet.login.LoginUI;
import javax.swing.JOptionPane;
import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
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
        
        try {
            establishConnection();
        } catch (SQLException ex) {
            Logger.getLogger(HRLANDING.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HRLANDING.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
        

        testSearch();
        getTeachers();
    }

    Connection conn;
    DefaultComboBoxModel<String> tcModel = new DefaultComboBoxModel<>();
    
    public void establishConnection() throws SQLException, ClassNotFoundException{
        
            Class.forName("com.mysql.cj.jdbc.Driver"); //Driver Connection
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/evaluenet","root","gRadingsystemDB2024"); //Database Connection
        //Checks connection
            if(conn != null){
                System.out.println("Connection successfully");
            }
    }
    
     public void getTeachers() {
    String getTC = "SELECT FullName, username FROM tblaccounts";
    try {
        PreparedStatement applySQL = conn.prepareStatement(getTC);
        ResultSet tcVal = applySQL.executeQuery();
        
        System.out.println("All Rows:");
        while(tcVal.next()) {
            String getUN = tcVal.getString("username");
            String tcName = tcVal.getString("FullName");
            System.out.println("Username: " + getUN + ", FullName: " + tcName);
        }
        
        
        tcVal = applySQL.executeQuery();
        
        System.out.println("\nRows with 'TCH' in username:");
        while(tcVal.next()) {
            String getUN = tcVal.getString("username");
            if(getUN.contains("TCH")) {
                String tcName = tcVal.getString("FullName");
                tcModel.addElement(tcName);
            }
        }
    } catch (SQLException ex) {
        Logger.getLogger(SubjectForm.class.getName()).log(Level.SEVERE, null, ex);
    }
}
     
     public void submitBtn(){
         if(nameField.getText().equals(null)){
             JOptionPane.showMessageDialog(null,"Please select a teacher.");
         }else if(sexCB.getSelectedIndex() == 0){
             JOptionPane.showMessageDialog(null,"Please select a sex.");
         }else if(ageField1.getText().equals(null)){
             JOptionPane.showMessageDialog(null,"Please add your age");
         }else if(eStatusCB.getSelectedIndex() == 0){
             JOptionPane.showMessageDialog(null,"Please select an employment status.");
         }else if(statusCB.getSelectedIndex() == 0){
             JOptionPane.showMessageDialog(null,"Please select a status.");
         }else{
             try {
                 String tcName = nameField.getText();
                 String sexVal = (String) sexCB.getSelectedItem();
                 String ageVal = ageField1.getText();
                 String eStatusVal = (String) eStatusCB.getSelectedItem();
                 String statusVal = (String) statusCB.getSelectedItem();
                 
                 
                 PreparedStatement addValues = conn.prepareStatement("INSERT INTO tchInfo(NAME,SEX,AGE,EMP_STATUS,STATUS) VALUES(?,?,?,?,?)");
                    addValues.setString(1,tcName);
                    addValues.setString(2,sexVal);
                    addValues.setString(3,ageVal);
                    addValues.setString(4,eStatusVal);
                    addValues.setString(5,statusVal);
                    addValues.executeUpdate();
                    JOptionPane.showMessageDialog(null,"New teacher information has been added successfully.");
             } catch (SQLException ex) {
                 Logger.getLogger(HRLANDING.class.getName()).log(Level.SEVERE, null, ex);
             }   
         }
     }
     
       public void testSearch(){
        
        try {
            
                PreparedStatement getSection = conn.prepareStatement("SELECT NAME, SEX, AGE, EMP_STATUS, STATUS FROM tchInfo");        
                ResultSet findSection = getSection.executeQuery();
            ResultSetMetaData getColVal = (ResultSetMetaData) findSection.getMetaData();
            int q = getColVal.getColumnCount();
            DefaultTableModel secAssign = (DefaultTableModel) tchTable.getModel();
          
            tchTable.setDefaultEditor(Object.class, null);
            
            secAssign.setRowCount(0);
            while (findSection.next()) {
                Object[] row = new Object[q];
                for (int i = 1; i <= q; i++) {
                    row[i - 1] = findSection.getObject(i); // Get each column value
                } 
                
                secAssign.addRow(row); // Add the row to the table model
            }
            
            

            
        } catch (SQLException ex) {
            Logger.getLogger(tablesf1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    } 
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        statusCB = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        sexCB = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        eStatusCB = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tchTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        randText = new javax.swing.JLabel();
        hrName = new javax.swing.JLabel();
        ageField1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 51));
        jLabel5.setText("Add a Teacher");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(100, 130, 440, 50);
        getContentPane().add(nameField);
        nameField.setBounds(120, 190, 270, 40);

        statusCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select student's status: ","Active", "Inactive" }));
        getContentPane().add(statusCB);
        statusCB.setBounds(130, 460, 260, 40);

        jLabel1.setText("Status:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 470, 50, 16);

        jLabel2.setText("Name:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 200, 40, 16);

        jLabel3.setText("Sex:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 270, 40, 16);

        jLabel4.setText("Age:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 340, 40, 16);

        sexCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a sex: ","Male", "Female" }));
        getContentPane().add(sexCB);
        sexCB.setBounds(120, 260, 270, 40);

        jLabel6.setText("Employment Status:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(60, 410, 110, 16);

        eStatusCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select an employment status: ","Part-time", "Casual", "Full-time" }));
        getContentPane().add(eStatusCB);
        eStatusCB.setBounds(180, 400, 210, 40);

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
        jScrollPane1.setBounds(410, 170, 770, 402);

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(250, 520, 110, 30);

        jButton2.setBackground(new java.awt.Color(204, 255, 204));
        jButton2.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jButton2.setText("Refresh");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(420, 590, 110, 30);

        randText.setFont(new java.awt.Font("Tw Cen MT", 1, 20)); // NOI18N
        randText.setText("Welcome,");
        getContentPane().add(randText);
        randText.setBounds(160, 50, 100, 20);

        hrName.setFont(new java.awt.Font("Tw Cen MT", 1, 20)); // NOI18N
        hrName.setText("HRName");
        getContentPane().add(hrName);
        hrName.setBounds(250, 50, 240, 20);
        getContentPane().add(ageField1);
        ageField1.setBounds(120, 330, 270, 40);

        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 1, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 51));
        jLabel7.setText("Teacher's Information");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(570, 110, 440, 50);

        jButton10.setBackground(new java.awt.Color(204, 255, 204));
        jButton10.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jButton10.setForeground(new java.awt.Color(51, 51, 51));
        jButton10.setText("LOG OUT");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10);
        jButton10.setBounds(1060, 20, 110, 40);

        setSize(new java.awt.Dimension(1216, 808));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        submitBtn();
        testSearch();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        testSearch();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        LoginUI l1 = new LoginUI();
        int answer = JOptionPane.showConfirmDialog(this, "Are you sure you want to log out?","Logout Confirmation", JOptionPane.YES_NO_OPTION);
        if(answer == JOptionPane.YES_OPTION){
            dispose();
            l1.setVisible(true);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public static void launch(String HRname) {
        HRLANDING tl = new HRLANDING(HRname);
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
            java.util.logging.Logger.getLogger(HRLANDING.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HRLANDING.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HRLANDING.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HRLANDING.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                launch("");
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageField1;
    private javax.swing.JComboBox<String> eStatusCB;
    public javax.swing.JLabel hrName;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameField;
    public javax.swing.JLabel randText;
    private javax.swing.JComboBox<String> sexCB;
    private javax.swing.JComboBox<String> statusCB;
    private javax.swing.JTable tchTable;
    // End of variables declaration//GEN-END:variables
}
