/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.evaluenet.it;

import com.evaluenet.login.LoginUI;
import com.evaluenet.models.Account;
import com.evaluenet.models.Teacher;
import com.evaluenet.services.AccountService;
import com.evaluenet.services.ITService;
import com.evaluenet.services.TeacherServices;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.CardLayout;
import java.util.List;
import java.util.Set;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lordz
 */
public class ITDashboard extends javax.swing.JFrame {

    /**
     * Creates new form ITDashboard
     */
    
    CardLayout layout;
    
    public ITDashboard() {
        initComponents();
        defaultObj();
        fetchTeachers();
        fetchData(accTable);
        fetchAnalytics();
        layout = (CardLayout) MainPanel.getLayout();
        
    }
    
    DefaultComboBoxModel<String> tcModel = new DefaultComboBoxModel<>();
    TeacherServices tchServices = new TeacherServices();
    AccountService accServices = new AccountService();
    ITService itServices = new ITService();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

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
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        manageAccBtn1 = new javax.swing.JButton();
        homeBtn = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        itVal1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        sqBtn2 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        MainPanel = new javax.swing.JPanel();
        HomeDashboard = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        numAdm = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        numHR = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        numTch = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        accTable = new javax.swing.JTable();
        ManageAccountDashboard = new javax.swing.JPanel();
        passWord = new javax.swing.JTextField();
        createBtn = new javax.swing.JButton();
        userName = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        manageAccTbl = new javax.swing.JTable();
        removeBtn = new javax.swing.JButton();
        fullName = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        userType = new javax.swing.JComboBox<>();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        limitBtn = new javax.swing.JButton();
        tchName = new javax.swing.JComboBox<>();
        jLabel39 = new javax.swing.JLabel();
        SetupSecurityQuestionDashboard = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        ansSQ = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        chosenSQ = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        userField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        accTable1 = new javax.swing.JTable();

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

        jPanel1.setBackground(new java.awt.Color(0, 108, 72));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Poppins SemiBold", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("IT Dashboard");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 190, 30));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jPanel5.setBackground(new java.awt.Color(0, 108, 72));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Poppins SemiBold", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("IT Dashboard");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 190, 30));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 1040;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel3.add(jPanel5, gridBagConstraints);

        jPanel6.setBackground(new java.awt.Color(0, 153, 102));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manageAccBtn1.setBackground(new java.awt.Color(0, 153, 102));
        manageAccBtn1.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        manageAccBtn1.setForeground(new java.awt.Color(255, 255, 255));
        manageAccBtn1.setText("MANAGE ACCOUNTS");
        manageAccBtn1.setBorder(null);
        manageAccBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageAccBtn1ActionPerformed(evt);
            }
        });
        jPanel6.add(manageAccBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 270, 90));

        homeBtn.setBackground(new java.awt.Color(0, 153, 102));
        homeBtn.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        homeBtn.setForeground(new java.awt.Color(255, 255, 255));
        homeBtn.setText("HOME");
        homeBtn.setBorder(null);
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });
        jPanel6.add(homeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 270, 90));

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
        jPanel6.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 700, 250, 55));

        jPanel7.setBackground(new java.awt.Color(0, 153, 102));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 242, 242), 2));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Poppins ExtraBold", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("IT Administrator");
        jPanel7.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 240, 30));

        itVal1.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        itVal1.setForeground(new java.awt.Color(255, 255, 255));
        itVal1.setText("LORD ZIERWIN");
        jPanel7.add(itVal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 200, 30));

        jPanel6.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 290, 120));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("IT Administrator");
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 220, 30));

        sqBtn2.setBackground(new java.awt.Color(0, 153, 102));
        sqBtn2.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        sqBtn2.setForeground(new java.awt.Color(255, 255, 255));
        sqBtn2.setText("ADD SECURITY QUESTION");
        sqBtn2.setBorder(null);
        sqBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sqBtn2ActionPerformed(evt);
            }
        });
        jPanel6.add(sqBtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 270, 90));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = -10;
        gridBagConstraints.ipady = 45;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 0, 0, 0);
        jPanel3.add(jPanel6, gridBagConstraints);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel8, new java.awt.GridBagConstraints());

        MainPanel.setMaximumSize(new java.awt.Dimension(880, 530));
        MainPanel.setLayout(new java.awt.CardLayout());

        HomeDashboard.setBackground(new java.awt.Color(255, 255, 255));
        HomeDashboard.setLayout(new javax.swing.BoxLayout(HomeDashboard, javax.swing.BoxLayout.Y_AXIS));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setMaximumSize(new java.awt.Dimension(880, 88));
        jPanel11.setPreferredSize(new java.awt.Dimension(880, 88));
        jPanel11.setLayout(new javax.swing.BoxLayout(jPanel11, javax.swing.BoxLayout.LINE_AXIS));

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setMaximumSize(new java.awt.Dimension(10, 88));
        jPanel13.setPreferredSize(new java.awt.Dimension(20, 88));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 87, Short.MAX_VALUE)
        );

        jPanel11.add(jPanel13);

        jPanel20.setBackground(new java.awt.Color(0, 153, 102));
        jPanel20.setMaximumSize(new java.awt.Dimension(271, 88));
        jPanel20.setPreferredSize(new java.awt.Dimension(271, 88));

        jLabel2.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Admin Accounts");

        numAdm.setFont(new java.awt.Font("Poppins Medium", 1, 28)); // NOI18N
        numAdm.setForeground(new java.awt.Color(255, 255, 255));
        numAdm.setText("45");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(numAdm))
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(numAdm)
                .addContainerGap())
        );

        jPanel11.add(jPanel20);

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setMaximumSize(new java.awt.Dimension(10, 88));
        jPanel16.setPreferredSize(new java.awt.Dimension(20, 88));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 87, Short.MAX_VALUE)
        );

        jPanel11.add(jPanel16);

        jPanel21.setBackground(new java.awt.Color(0, 153, 102));
        jPanel21.setMaximumSize(new java.awt.Dimension(271, 88));
        jPanel21.setPreferredSize(new java.awt.Dimension(271, 88));

        jLabel12.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("HR Accounts");

        numHR.setFont(new java.awt.Font("Poppins Medium", 1, 28)); // NOI18N
        numHR.setForeground(new java.awt.Color(255, 255, 255));
        numHR.setText("65");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(numHR))
                .addContainerGap())
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(numHR)
                .addContainerGap())
        );

        jPanel11.add(jPanel21);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setMaximumSize(new java.awt.Dimension(10, 88));
        jPanel12.setPreferredSize(new java.awt.Dimension(20, 88));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 87, Short.MAX_VALUE)
        );

        jPanel11.add(jPanel12);

        jPanel22.setBackground(new java.awt.Color(0, 153, 102));

        jLabel1.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Teacher Accounts");

        numTch.setFont(new java.awt.Font("Poppins Medium", 1, 28)); // NOI18N
        numTch.setForeground(new java.awt.Color(255, 255, 255));
        numTch.setText("34");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(numTch))
                .addGap(87, 87, 87))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(5, 5, 5)
                .addComponent(numTch)
                .addContainerGap())
        );

        jPanel11.add(jPanel22);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setMaximumSize(new java.awt.Dimension(10, 88));
        jPanel15.setPreferredSize(new java.awt.Dimension(20, 88));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 87, Short.MAX_VALUE)
        );

        jPanel11.add(jPanel15);

        HomeDashboard.add(jPanel11);

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setMaximumSize(new java.awt.Dimension(902, 20));
        jPanel17.setPreferredSize(new java.awt.Dimension(225, 40));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 902, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        HomeDashboard.add(jPanel17);

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

        HomeDashboard.add(jScrollPane1);

        MainPanel.add(HomeDashboard, "HomeCard");

        ManageAccountDashboard.setBackground(new java.awt.Color(255, 255, 255));
        ManageAccountDashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        ManageAccountDashboard.add(passWord, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 390, 40));

        createBtn.setBackground(new java.awt.Color(0, 153, 102));
        createBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        createBtn.setForeground(new java.awt.Color(255, 255, 255));
        createBtn.setText("Create Account");
        createBtn.setBorder(null);
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });
        ManageAccountDashboard.add(createBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 390, 40));

        userName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                userNameKeyTyped(evt);
            }
        });
        ManageAccountDashboard.add(userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 390, 40));

        manageAccTbl.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane5.setViewportView(manageAccTbl);

        ManageAccountDashboard.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 440, 640));

        removeBtn.setBackground(new java.awt.Color(220, 53, 69));
        removeBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        removeBtn.setForeground(new java.awt.Color(255, 255, 255));
        removeBtn.setText("Remove Account");
        removeBtn.setBorder(null);
        removeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeBtnActionPerformed(evt);
            }
        });
        ManageAccountDashboard.add(removeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 600, 390, 40));

        fullName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fullNameKeyTyped(evt);
            }
        });
        ManageAccountDashboard.add(fullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 390, 40));

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(153, 153, 153));
        jLabel34.setText("Account Type:");
        ManageAccountDashboard.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 200, 22));

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(0, 153, 102));
        jLabel35.setText("Create / Add Account");
        ManageAccountDashboard.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 270, 30));

        userType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select account type: ","IT", "HR", "Admin", "Teacher" }));
        userType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTypeActionPerformed(evt);
            }
        });
        ManageAccountDashboard.add(userType, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 390, 40));

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(153, 153, 153));
        jLabel36.setText("Password:");
        ManageAccountDashboard.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 140, 16));

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(153, 153, 153));
        jLabel37.setText("Full Name:");
        ManageAccountDashboard.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 140, 22));

        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(153, 153, 153));
        jLabel38.setText("Username:");
        ManageAccountDashboard.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 140, 22));

        limitBtn.setBackground(new java.awt.Color(255, 204, 0));
        limitBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        limitBtn.setForeground(new java.awt.Color(255, 255, 255));
        limitBtn.setText("Reset Login Limits");
        limitBtn.setToolTipText("");
        limitBtn.setBorder(null);
        limitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limitBtnActionPerformed(evt);
            }
        });
        ManageAccountDashboard.add(limitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, 390, 40));

        tchName.setModel(tcModel);
        tchName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tchNameActionPerformed(evt);
            }
        });
        ManageAccountDashboard.add(tchName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 390, 40));

        jLabel39.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(153, 153, 153));
        jLabel39.setText("For Teacher Account:");
        ManageAccountDashboard.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 250, 22));

        MainPanel.add(ManageAccountDashboard, "ManageAccCard");
        ManageAccountDashboard.getAccessibleContext().setAccessibleName("");

        SetupSecurityQuestionDashboard.setBackground(new java.awt.Color(255, 255, 255));
        SetupSecurityQuestionDashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel11.setText("ANSWER");
        SetupSecurityQuestionDashboard.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, 100, 30));

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
        SetupSecurityQuestionDashboard.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 80, 150, 40));

        ansSQ.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        ansSQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ansSQActionPerformed(evt);
            }
        });
        SetupSecurityQuestionDashboard.add(ansSQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 80, 220, 40));

        jLabel13.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel13.setText("SECURITY QUESTION");
        SetupSecurityQuestionDashboard.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 210, 20));

        chosenSQ.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose a question", "What's the name of your first pet?", "What is your favorite food?", "Who is your favorite person?" }));
        chosenSQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chosenSQActionPerformed(evt);
            }
        });
        SetupSecurityQuestionDashboard.add(chosenSQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 300, 40));

        jLabel15.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel15.setText("USERNAME");
        SetupSecurityQuestionDashboard.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 90, 20));
        SetupSecurityQuestionDashboard.add(userField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 220, 40));

        accTable1.setAutoCreateRowSorter(true);
        accTable1.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        accTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(accTable1);

        SetupSecurityQuestionDashboard.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 920, 450));

        MainPanel.add(SetupSecurityQuestionDashboard, "SqCard");

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 4);
        jPanel3.add(MainPanel, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void defaultObj(){
        ManageAccountDashboard.setVisible(false);
        SetupSecurityQuestionDashboard.setVisible(false);
        fullName.setEnabled(false);
        tchName.setEnabled(false);
        passWord.setEnabled(false);
        userName.setEnabled(false);
    }
    
    private void fetchTeachers(){
        List<Teacher> teacher = tchServices.fetchTeachers();
        for(Teacher tch: teacher){
            tcModel.addElement(tch.getName());
        }
    }
    
    private void fetchData(JTable table){
        Set<Account> account = itServices.getAll();
        DefaultTableModel accModel = (DefaultTableModel) table.getModel();
        accModel.setRowCount(0);
        for(Account acc: account){
            Object[] dataRow = new Object[3];
            dataRow[0] = acc.getFullname();
            dataRow[1] = acc.getUsername();
            dataRow[2] = acc.getType();
            accModel.addRow(dataRow);
        }
    }
    
    private void fetchAnalytics(){
        numAdm.setText(Integer.toString(itServices.getAdminTotal()));
        numHR.setText(Integer.toString(itServices.getHRTotal()));
        numTch.setText(Integer.toString(itServices.getTeacherTotal()));
    }
    
    
    private void manageAccBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageAccBtnActionPerformed
        ITADDACCFORM iaf = new ITADDACCFORM(itVal.getText());
        this.dispose();
        iaf.setVisible(true);
    }//GEN-LAST:event_manageAccBtnActionPerformed

    private void sqBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sqBtnActionPerformed
        forgot f1 = new forgot();
        f1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_sqBtnActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        LoginUI l1 = new LoginUI();
        int answer = JOptionPane.showConfirmDialog(this, "Are you sure you want to log out?","Logout Confirmation", JOptionPane.YES_NO_OPTION);
        if(answer == JOptionPane.YES_OPTION){
            dispose();
            l1.setVisible(true);
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void manageAccBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageAccBtn1ActionPerformed
      layout.show(MainPanel,"ManageAccCard");
      fetchData(manageAccTbl);
    }//GEN-LAST:event_manageAccBtn1ActionPerformed

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
      layout.show(MainPanel, "HomeCard");
    }//GEN-LAST:event_homeBtnActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        LoginUI l1 = new LoginUI();
        int answer = JOptionPane.showConfirmDialog(this, "Are you sure you want to log out?","Logout Confirmation", JOptionPane.YES_NO_OPTION);
        if(answer == JOptionPane.YES_OPTION){
            dispose();
            l1.setVisible(true);
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        String fullname;
        if(userType.getSelectedIndex() == 4){
            fullname = (String) tchName.getSelectedItem();
        }else{
            fullname = fullName.getText();
        }
        accServices.createAccount(fullname, userName.getText(), passWord.getText(),(String) userType.getSelectedItem());
        fetchData(manageAccTbl);
    }//GEN-LAST:event_createBtnActionPerformed

    private void userNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userNameKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameKeyTyped

    private void removeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBtnActionPerformed
        int rowIndex = manageAccTbl.convertRowIndexToModel(manageAccTbl.getSelectedRow());
        Object username = manageAccTbl.getModel().getValueAt(rowIndex, 1);
        accServices.deleteAccount(username.toString());
    }//GEN-LAST:event_removeBtnActionPerformed

    private void fullNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fullNameKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_fullNameKeyTyped

    private void userTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTypeActionPerformed
       if(userType.getSelectedIndex() == 4){
           fullName.setEnabled(false);
           tchName.setEnabled(true);
           passWord.setEnabled(true);
           userName.setEnabled(true);
       }else if(userType.getSelectedIndex() == 0){
           fullName.setEnabled(false);
           tchName.setEnabled(false);
           passWord.setEnabled(false);
           userName.setEnabled(false);
       }else{
           fullName.setEnabled(true);
           passWord.setEnabled(true);
           userName.setEnabled(true);
           tchName.setEnabled(false);
       }
    }//GEN-LAST:event_userTypeActionPerformed

    private void limitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limitBtnActionPerformed
        int rowIndex = manageAccTbl.convertRowIndexToModel(manageAccTbl.getSelectedRow());
        Object username = manageAccTbl.getModel().getValueAt(rowIndex, 1);
        accServices.resetAccountLimit(username.toString());
        
        
    }//GEN-LAST:event_limitBtnActionPerformed

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

    private void sqBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sqBtn2ActionPerformed
        layout.show(MainPanel, "SqCard");
    }//GEN-LAST:event_sqBtn2ActionPerformed

    private void tchNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tchNameActionPerformed
        
    }//GEN-LAST:event_tchNameActionPerformed

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
            java.util.logging.Logger.getLogger(ITDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ITDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ITDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ITDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        System.setProperty("flatlaf.useNativeLibrary", "false");
        FlatLightLaf.setup();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ITDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel HomeDashboard;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel ManageAccountDashboard;
    private javax.swing.JPanel SetupSecurityQuestionDashboard;
    private javax.swing.JTable accTable;
    private javax.swing.JTable accTable1;
    private javax.swing.JTextField ansSQ;
    private javax.swing.JComboBox<String> chosenSQ;
    private javax.swing.JButton createBtn;
    private javax.swing.JTextField fullName;
    private javax.swing.JButton homeBtn;
    private javax.swing.JLabel itVal;
    private javax.swing.JLabel itVal1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JButton limitBtn;
    private javax.swing.JButton manageAccBtn;
    private javax.swing.JButton manageAccBtn1;
    private javax.swing.JTable manageAccTbl;
    private javax.swing.JLabel numAdm;
    private javax.swing.JLabel numHR;
    private javax.swing.JLabel numTch;
    private javax.swing.JTextField passWord;
    private javax.swing.JButton removeBtn;
    private javax.swing.JButton sqBtn;
    private javax.swing.JButton sqBtn2;
    private javax.swing.JComboBox<String> tchName;
    private javax.swing.JTextField userField;
    private javax.swing.JTextField userName;
    private javax.swing.JComboBox<String> userType;
    // End of variables declaration//GEN-END:variables
}
