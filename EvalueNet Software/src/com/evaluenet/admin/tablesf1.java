/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.evaluenet.admin;

import com.evaluenet.admin.StudentAdd;
import com.evaluenet.login.login;
import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.awt.Dimension;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import javax.swing.DefaultCellEditor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/**
 *
 * @author lordz
 */
public class tablesf1 extends javax.swing.JFrame {

    /**
     * Creates new form tablesf1
     */
    public tablesf1(String val) {
        initComponents();
        adminTtl.setText(val);
        
        try {
            establishConnection();
        } catch (SQLException ex) {
            Logger.getLogger(tablesf1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(tablesf1.class.getName()).log(Level.SEVERE, null, ex);
        }
       // getTblVal();
        
        java.awt.Image img = new ImageIcon(this.getClass().getResource("iconic.png")).getImage();
        this.setIconImage(img);
          
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        
        filterType.setEnabled(false);
        studTable.setDefaultEditor(Object.class, null);
    }
    
    Connection conn;
    DefaultComboBoxModel<String> value = new DefaultComboBoxModel<>();
    
    public void getItem(){
        
         String tblVal =(String) tblFilter.getSelectedItem();
            
            filterType.removeAllItems();
            value.addElement("Please select a section: ");
            if(tblVal.equals("ICT")){
                filterType.setEnabled(true);
             try {    
                 PreparedStatement getSec = conn.prepareStatement("SELECT SctnName FROM ictsections");
                    ResultSet findSec = getSec.executeQuery();
                        while(findSec.next()){
                            String section = findSec.getString("SctnName");
                                value.addElement(section);
                        }
             } catch (SQLException ex) {
                 Logger.getLogger(tablesf1.class.getName()).log(Level.SEVERE, null, ex);
             }
            }else if(tblVal.equals("HE")){
                filterType.setEnabled(true);
                try {    
                 PreparedStatement getSec = conn.prepareStatement("SELECT SctnName FROM hesections");
                    ResultSet findSec = getSec.executeQuery();
                        while(findSec.next()){
                            String section = findSec.getString("SctnName");
                                value.addElement(section);
                        }
             } catch (SQLException ex) {
                 Logger.getLogger(tablesf1.class.getName()).log(Level.SEVERE, null, ex);
             }
                }else if(tblVal.equals("GAS")){
                    filterType.setEnabled(true);
                    try {    
                 PreparedStatement getSec = conn.prepareStatement("SELECT SctnName FROM ictsections");
                    ResultSet findSec = getSec.executeQuery();
                        while(findSec.next()){
                            String section = findSec.getString("SctnName");
                                value.addElement(section);
                        }
             } catch (SQLException ex) {
                 Logger.getLogger(tablesf1.class.getName()).log(Level.SEVERE, null, ex);
             }
                }else if(tblVal.equals("ABM")){
                    filterType.setEnabled(true);
                    try {    
                 PreparedStatement getSec = conn.prepareStatement("SELECT SctnName FROM ictsections");
                    ResultSet findSec = getSec.executeQuery();
                        while(findSec.next()){
                            String section = findSec.getString("SctnName");
                                value.addElement(section);
                        }
             } catch (SQLException ex) {
                 Logger.getLogger(tablesf1.class.getName()).log(Level.SEVERE, null, ex);
             }
                }else{
                    filterType.setEnabled(false);
                }
    }
    
    public void testSearch(){
        String strandVal =(String) tblFilter.getSelectedItem();
        int tblVal = tblFilter.getSelectedIndex();
        try {
            if(tblVal != 0){
            String valType =(String) filterType.getSelectedItem();
            int cbIndex = filterType.getSelectedIndex();
            
            if(cbIndex == 0){
            PreparedStatement getSection = conn.prepareStatement("SELECT LRN, NAME, STRAND FROM sf1_db WHERE STRAND = ?");
                getSection.setString(1,strandVal);
                ResultSet findSection = getSection.executeQuery();
            ResultSetMetaData getColVal = (ResultSetMetaData) findSection.getMetaData();
            int q = getColVal.getColumnCount();
            DefaultTableModel secAssign = (DefaultTableModel) studTable.getModel();
            studTable.setDefaultEditor(Object.class, null);
            
            secAssign.setRowCount(0);
            while (findSection.next()) {
                Object[] row = new Object[q];
                for (int i = 1; i <= q; i++) {
                    row[i - 1] = findSection.getObject(i); // Get each column value
                } 
                
                secAssign.addRow(row); // Add the row to the table model
            }
            }else{
                PreparedStatement getSection = conn.prepareStatement("SELECT LRN, NAME, STRAND, Section_Assigned FROM sf1_db WHERE Section_Assigned = ?");
                    getSection.setString(1,valType);
                ResultSet findSection = getSection.executeQuery();
            ResultSetMetaData getColVal = (ResultSetMetaData) findSection.getMetaData();
            int q = getColVal.getColumnCount();
            DefaultTableModel secAssign = (DefaultTableModel) studTable.getModel();
            studTable.setDefaultEditor(Object.class, null);
            
            secAssign.setRowCount(0);
            while (findSection.next()) {
                Object[] row = new Object[q];
                for (int i = 1; i <= q; i++) {
                    row[i - 1] = findSection.getObject(i); // Get each column value
                } 
                
                secAssign.addRow(row); // Add the row to the table model
            }
            }
            
            
            }else{
                    JOptionPane.showMessageDialog(null,"Please choose a strand.");
            }
        } catch (SQLException ex) {
            Logger.getLogger(tablesf1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    } 
    
    /*public void getTblVal(){
        try {            
            int q;
            PreparedStatement pstmt = conn.prepareStatement("SELECT LRN, NAME, STRAND, Section_Assigned FROM sf1_db");
            ResultSet getValues = pstmt.executeQuery();
            ResultSetMetaData getColVal = (ResultSetMetaData) getValues.getMetaData();
            q = getColVal.getColumnCount();
            DefaultTableModel secAssign = (DefaultTableModel) studTable.getModel();
            
            
            secAssign.setRowCount(0);
            while (getValues.next()) {
                Object[] row = new Object[q];
                for (int i = 1; i <= q; i++) {
                    row[i - 1] = getValues.getObject(i); // Get each column value
                }
                secAssign.addRow(row); // Add the row to the table model
            }
        
            
        } catch (SQLException ex) {
            Logger.getLogger(tablestudent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }*/
    
    public void establishConnection() throws SQLException, ClassNotFoundException{
        
        
            Class.forName("com.mysql.cj.jdbc.Driver"); //Driver Connection
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/evaluenet","root","gRadingsystemDB2024"); //Database Connection
        //Checks connection
            if(conn != null){
                System.out.println("Connection successfully");
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

        jScrollPane1 = new javax.swing.JScrollPane();
        studTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        adminTitle1 = new javax.swing.JLabel();
        adminTtl = new javax.swing.JLabel();
        filterType = new javax.swing.JComboBox<>();
        tblFilter = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusCycleRoot(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        studTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "LRN", "Name", "Strand", "Section"
            }
        ));
        jScrollPane1.setViewportView(studTable);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(560, 220, 550, 430);

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 51));
        jLabel1.setText(" STUDENT INFORMATION LIST");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(340, 140, 620, 50);

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel2.setText("Search Filter:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(280, 320, 210, 30);

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jButton1.setText("Go Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(20, 650, 99, 37);

        jButton4.setBackground(new java.awt.Color(204, 255, 204));
        jButton4.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jButton4.setText("LOG OUT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(1100, 50, 110, 40);

        adminTitle1.setFont(new java.awt.Font("Tw Cen MT", 1, 20)); // NOI18N
        adminTitle1.setText("Welcome,");
        getContentPane().add(adminTitle1);
        adminTitle1.setBounds(160, 50, 90, 20);

        adminTtl.setFont(new java.awt.Font("Tw Cen MT", 1, 20)); // NOI18N
        adminTtl.setText("Admin!");
        getContentPane().add(adminTtl);
        adminTtl.setBounds(250, 50, 120, 20);

        filterType.setModel(value);
        getContentPane().add(filterType);
        filterType.setBounds(300, 430, 140, 30);

        tblFilter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select specialization:  ", "ICT", "HE", "GAS", "ABM" }));
        tblFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tblFilterActionPerformed(evt);
            }
        });
        getContentPane().add(tblFilter);
        tblFilter.setBounds(300, 370, 140, 30);

        jButton2.setBackground(new java.awt.Color(204, 255, 204));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(320, 480, 100, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EvalueNetPackage/2.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 1280, 800);

        setSize(new java.awt.Dimension(1296, 808));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        StudentAdd sa = new StudentAdd(adminTtl.getText());
        sa.setVisible(true);
        
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        login l1 = new login();
        int answer = JOptionPane.showConfirmDialog(this, "Are you sure you want to log out?","Logout Confirmation", JOptionPane.YES_NO_OPTION);
        if(answer == JOptionPane.YES_OPTION){
            dispose();
            l1.setVisible(true);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
int response = JOptionPane.showConfirmDialog(this,"Are you sure you want to Exit?","Exit Confirmation",JOptionPane.YES_NO_OPTION);
            if(response == JOptionPane.YES_OPTION){
                dispose();
            }
    }//GEN-LAST:event_formWindowClosing

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        testSearch();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tblFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tblFilterActionPerformed
        getItem();
        
    }//GEN-LAST:event_tblFilterActionPerformed

    
    public void submitChanges() {
    DefaultTableModel TableVal = (DefaultTableModel) studTable.getModel();    
    String updVal = "UPDATE sf1_db SET LRN = ?, NAME = ?, SEX = ?, BIRTHDAY = ?, AGE =?, MOTHER_TONGUE = ?, ETHNIC_GROUP = ?, RELIGION = ?, ADDRESS = ?, FATHER_NAME = ?, MOTHER_NAME = ?, CONTACT_NUMBER = ?, LEARNING_MODALITY = ?,STRAND = ? WHERE LRN = ?";

    try (PreparedStatement applySQL = conn.prepareStatement(updVal)) {
        for (int rowIndex = 0; rowIndex < TableVal.getRowCount(); rowIndex++) {
            String[] tblVal = new String[14];
            for (int colIndex = 0; colIndex < tblVal.length; colIndex++) {
                tblVal[colIndex] = (String) TableVal.getValueAt(rowIndex, colIndex);
            }

            if (tblVal[0] != null && !tblVal[0].isEmpty()) {
                for (int i = 0; i < tblVal.length; i++) {
                    applySQL.setString(i + 1, tblVal[i]);
                }
                applySQL.setString(15, tblVal[0]); 
                applySQL.addBatch(); 
            }
        }
        applySQL.executeBatch(); 
        JOptionPane.showMessageDialog(null, "Information updated successfully!");
    } catch (SQLException ex) {
        Logger.getLogger(tablesf1.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, "Error updating information: " + ex.getMessage());
    }
}
    /**
     * @param args the command line arguments
     */
    
    public static void launch(String TCname) {
        tablesf1 tl = new tablesf1(TCname);
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
            java.util.logging.Logger.getLogger(tablesf1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tablesf1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tablesf1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tablesf1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    public javax.swing.JLabel adminTitle1;
    public javax.swing.JLabel adminTtl;
    private javax.swing.JComboBox<String> filterType;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable studTable;
    private javax.swing.JComboBox<String> tblFilter;
    // End of variables declaration//GEN-END:variables
}
