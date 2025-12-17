/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.evaluenet.it;
import com.evaluenet.services.ITService;
import com.formdev.flatlaf.FlatLightLaf;
import com.evaluenet.admin.tablesf1;
import com.evaluenet.login.LoginUI;
import com.evaluenet.models.Account;
import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.awt.Font;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.JTableHeader;
import io.github.cdimascio.dotenv.Dotenv;
import java.util.List;
import java.util.Set;


public class ITADDACC extends javax.swing.JFrame {

    /**
     * Creates new form ITADDACC
     */
    public ITADDACC(String val) {
        initComponents();
        itVal.setText(val);
        //------------
        // ICON SETUP 
        //------------
        java.awt.Image img = new ImageIcon(this.getClass().getResource("/com/evaluenet/assets/iconic.png")).getImage();
        this.setIconImage(img);
        this.setResizable(false);
        displayIntoTable();
        styleHeader(accTable);
        numTch.setText(String.valueOf(service.getTeacherTotal()));
        numAdm.setText(String.valueOf(service.getAdminTotal()));
        numHR.setText(String.valueOf(service.getHRTotal()));
    }
    
    ITService service = new ITService();
    public void styleHeader(JTable table){
        JTableHeader header = table.getTableHeader();
        header.setFont(new Font("Poppins Medium", Font.PLAIN, 12));   
    }
    
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
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        manageAccBtn = new javax.swing.JButton();
        sqBtn = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        itVal = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        numTch = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        accTable = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        numAdm = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        numHR = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 108, 72));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Poppins SemiBold", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("IT Dashboard");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 190, 30));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1280, 70);

        jPanel4.setBackground(new java.awt.Color(0, 153, 102));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manageAccBtn.setBackground(new java.awt.Color(0, 153, 102));
        manageAccBtn.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        manageAccBtn.setForeground(new java.awt.Color(255, 255, 255));
        manageAccBtn.setText("MANAGE ACCOUNTS");
        manageAccBtn.setBorder(null);
        manageAccBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageAccBtnActionPerformed(evt);
            }
        });
        jPanel4.add(manageAccBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 192, 270, 90));

        sqBtn.setBackground(new java.awt.Color(0, 153, 102));
        sqBtn.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        sqBtn.setForeground(new java.awt.Color(255, 255, 255));
        sqBtn.setText("ADD SECURITY QUESTION");
        sqBtn.setBorder(null);
        sqBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sqBtnActionPerformed(evt);
            }
        });
        jPanel4.add(sqBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 270, 90));

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

        jLabel4.setFont(new java.awt.Font("Poppins ExtraBold", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("IT Administrator");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 240, 30));

        jPanel2.setBackground(new java.awt.Color(0, 153, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 242, 242), 2));
        jPanel4.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 70, 290, 120));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("IT Administrator");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 220, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("IT Administrator");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 220, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("IT Administrator");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 220, 30));

        getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 0, 270, 800);

        jPanel3.setBackground(new java.awt.Color(0, 153, 102));

        jLabel1.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Teacher Accounts");

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

        jPanel5.setBackground(new java.awt.Color(0, 153, 102));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel5);
        jPanel5.setBounds(330, 240, 220, 430);

        accTable.setAutoCreateRowSorter(true);
        accTable.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
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
                "Name", "Username", "User Type"
            }
        ));
        jScrollPane1.setViewportView(accTable);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(580, 240, 650, 430);

        jPanel6.setBackground(new java.awt.Color(0, 153, 102));

        jLabel2.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Admin Accounts");

        numAdm.setFont(new java.awt.Font("Poppins Medium", 1, 28)); // NOI18N
        numAdm.setForeground(new java.awt.Color(255, 255, 255));
        numAdm.setText("45");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(numAdm))
                .addGap(154, 154, 154))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(numAdm)
                .addContainerGap())
        );

        getContentPane().add(jPanel6);
        jPanel6.setBounds(620, 120, 300, 100);

        jPanel7.setBackground(new java.awt.Color(0, 153, 102));

        jLabel8.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("HR Accounts");

        numHR.setFont(new java.awt.Font("Poppins Medium", 1, 28)); // NOI18N
        numHR.setForeground(new java.awt.Color(255, 255, 255));
        numHR.setText("65");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(numHR))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(numHR)
                .addContainerGap())
        );

        getContentPane().add(jPanel7);
        jPanel7.setBounds(940, 120, 280, 100);

        setSize(new java.awt.Dimension(1294, 807));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
   LoginUI l1 = new LoginUI();
        int answer = JOptionPane.showConfirmDialog(this, "Are you sure you want to log out?","Logout Confirmation", JOptionPane.YES_NO_OPTION);
        if(answer == JOptionPane.YES_OPTION){
            dispose();
            l1.setVisible(true);
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void sqBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sqBtnActionPerformed
        forgot f1 = new forgot();
        f1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_sqBtnActionPerformed

    private void manageAccBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageAccBtnActionPerformed
        ITADDACCFORM iaf = new ITADDACCFORM(itVal.getText());
        this.dispose();
        iaf.setVisible(true);
    }//GEN-LAST:event_manageAccBtnActionPerformed
    
    public static void launch(String TCname) {
        ITADDACC tl = new ITADDACC(TCname);
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
            java.util.logging.Logger.getLogger(ITADDACC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ITADDACC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ITADDACC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ITADDACC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JTable accTable;
    private javax.swing.JLabel itVal;
    private javax.swing.JButton jButton10;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton manageAccBtn;
    private javax.swing.JLabel numAdm;
    private javax.swing.JLabel numHR;
    private javax.swing.JLabel numTch;
    private javax.swing.JButton sqBtn;
    // End of variables declaration//GEN-END:variables
}
