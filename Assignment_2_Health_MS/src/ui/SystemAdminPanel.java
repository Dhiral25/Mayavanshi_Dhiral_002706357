/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import model.Patient;
import model.PatientDirectory;
import model.SystemAdmin;

/**
 *
 * @author DhiralM
 */
public class SystemAdminPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminPanel
     */
    CardLayout cardLayoutmain;
    CardLayout cardLayoutSystemAdmin;
    SystemAdmin sysAdmin;
    public SystemAdminPanel(SystemAdmin sysAdmin) {
        initComponents();
        this.sysAdmin = sysAdmin;
        cardLayoutmain = (CardLayout)(this.getLayout());
        cardLayoutSystemAdmin = (CardLayout)(viewPanelSystemAdmin.getLayout());
        
        
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hospitalAdminLoginPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtSystemAdminUsername = new javax.swing.JTextField();
        txtSystemAdminPassword = new javax.swing.JPasswordField();
        btnSystemAdminLogin = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jSplitPaneHospitalAdmin = new javax.swing.JSplitPane();
        controlPanelSystemAdmin = new javax.swing.JPanel();
        btnHospitlaDirectory = new javax.swing.JButton();
        btnDoctorsDirectory = new javax.swing.JButton();
        btnPatientDirectory = new javax.swing.JButton();
        btnEncountersDirectory = new javax.swing.JButton();
        viewPanelSystemAdmin = new javax.swing.JPanel();
        hospitalDirectoryPanel = new javax.swing.JPanel();
        jSplitPaneHospitalDirectory = new javax.swing.JSplitPane();
        controlPanelHospitalDirectory = new javax.swing.JPanel();
        btnCreateHospital = new javax.swing.JButton();
        btnViewHospital = new javax.swing.JButton();
        viewPanelHospitalDirectory = new javax.swing.JPanel();
        DoctorsDirectoryPanel = new javax.swing.JPanel();
        jSplitPaneDoctorsDirectory = new javax.swing.JSplitPane();
        controlPanelDoctorsDirectory = new javax.swing.JPanel();
        btnAddDoctor = new javax.swing.JButton();
        btnViewDoctors = new javax.swing.JButton();
        viewPanelDoctorsDirectory = new javax.swing.JPanel();
        PatientDirectoryPanel = new javax.swing.JPanel();
        jSplitPanePatientDirectory = new javax.swing.JSplitPane();
        controlPanelPatientDirectroy = new javax.swing.JPanel();
        btnAddPatient = new javax.swing.JButton();
        btnViewPatient = new javax.swing.JButton();
        viewPanelPatientDirectroy = new javax.swing.JPanel();
        EncounterDirectoryPanel = new javax.swing.JPanel();
        jSplitPaneEncountersDirectory = new javax.swing.JSplitPane();
        controlPanelEncountersDirectory = new javax.swing.JPanel();
        btnAddEncounter = new javax.swing.JButton();
        btnViewEncounter = new javax.swing.JButton();
        viewPanelEncountersDirectory = new javax.swing.JPanel();

        setLayout(new java.awt.CardLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel1.setText("System Administrator Login");

        jLabel2.setText("Username");

        jLabel3.setText("Password");

        txtSystemAdminUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSystemAdminUsernameActionPerformed(evt);
            }
        });

        btnSystemAdminLogin.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnSystemAdminLogin.setText("Login");
        btnSystemAdminLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSystemAdminLoginActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/sysadminlogin.gif"))); // NOI18N

        javax.swing.GroupLayout hospitalAdminLoginPanelLayout = new javax.swing.GroupLayout(hospitalAdminLoginPanel);
        hospitalAdminLoginPanel.setLayout(hospitalAdminLoginPanelLayout);
        hospitalAdminLoginPanelLayout.setHorizontalGroup(
            hospitalAdminLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hospitalAdminLoginPanelLayout.createSequentialGroup()
                .addGroup(hospitalAdminLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(hospitalAdminLoginPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(hospitalAdminLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(hospitalAdminLoginPanelLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSystemAdminUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(hospitalAdminLoginPanelLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSystemAdminPassword))))
                    .addGroup(hospitalAdminLoginPanelLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1))
                    .addGroup(hospitalAdminLoginPanelLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(btnSystemAdminLogin)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 786, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        hospitalAdminLoginPanelLayout.setVerticalGroup(
            hospitalAdminLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hospitalAdminLoginPanelLayout.createSequentialGroup()
                .addGroup(hospitalAdminLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(hospitalAdminLoginPanelLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel1)
                        .addGap(39, 39, 39)
                        .addGroup(hospitalAdminLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtSystemAdminUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(hospitalAdminLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtSystemAdminPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnSystemAdminLogin))
                    .addGroup(hospitalAdminLoginPanelLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        add(hospitalAdminLoginPanel, "hospitalAdminLoginPanel");

        jSplitPaneHospitalAdmin.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        btnHospitlaDirectory.setText("Hospital Directory");
        btnHospitlaDirectory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHospitlaDirectoryActionPerformed(evt);
            }
        });

        btnDoctorsDirectory.setText("Doctors Directory");
        btnDoctorsDirectory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoctorsDirectoryActionPerformed(evt);
            }
        });

        btnPatientDirectory.setText("Patient Directory");
        btnPatientDirectory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatientDirectoryActionPerformed(evt);
            }
        });

        btnEncountersDirectory.setText("Encounters Directory");
        btnEncountersDirectory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncountersDirectoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlPanelSystemAdminLayout = new javax.swing.GroupLayout(controlPanelSystemAdmin);
        controlPanelSystemAdmin.setLayout(controlPanelSystemAdminLayout);
        controlPanelSystemAdminLayout.setHorizontalGroup(
            controlPanelSystemAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelSystemAdminLayout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(btnHospitlaDirectory)
                .addGap(52, 52, 52)
                .addComponent(btnDoctorsDirectory)
                .addGap(39, 39, 39)
                .addComponent(btnPatientDirectory)
                .addGap(34, 34, 34)
                .addComponent(btnEncountersDirectory)
                .addContainerGap(286, Short.MAX_VALUE))
        );
        controlPanelSystemAdminLayout.setVerticalGroup(
            controlPanelSystemAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controlPanelSystemAdminLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(controlPanelSystemAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHospitlaDirectory)
                    .addComponent(btnDoctorsDirectory)
                    .addComponent(btnPatientDirectory)
                    .addComponent(btnEncountersDirectory))
                .addGap(35, 35, 35))
        );

        jSplitPaneHospitalAdmin.setTopComponent(controlPanelSystemAdmin);

        viewPanelSystemAdmin.setLayout(new java.awt.CardLayout());

        btnCreateHospital.setText("Create Hospital");
        btnCreateHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateHospitalActionPerformed(evt);
            }
        });

        btnViewHospital.setText("View Hospital");
        btnViewHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewHospitalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlPanelHospitalDirectoryLayout = new javax.swing.GroupLayout(controlPanelHospitalDirectory);
        controlPanelHospitalDirectory.setLayout(controlPanelHospitalDirectoryLayout);
        controlPanelHospitalDirectoryLayout.setHorizontalGroup(
            controlPanelHospitalDirectoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controlPanelHospitalDirectoryLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCreateHospital)
                .addContainerGap())
            .addGroup(controlPanelHospitalDirectoryLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btnViewHospital)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        controlPanelHospitalDirectoryLayout.setVerticalGroup(
            controlPanelHospitalDirectoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelHospitalDirectoryLayout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(btnCreateHospital)
                .addGap(52, 52, 52)
                .addComponent(btnViewHospital)
                .addContainerGap(382, Short.MAX_VALUE))
        );

        jSplitPaneHospitalDirectory.setLeftComponent(controlPanelHospitalDirectory);

        javax.swing.GroupLayout viewPanelHospitalDirectoryLayout = new javax.swing.GroupLayout(viewPanelHospitalDirectory);
        viewPanelHospitalDirectory.setLayout(viewPanelHospitalDirectoryLayout);
        viewPanelHospitalDirectoryLayout.setHorizontalGroup(
            viewPanelHospitalDirectoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 901, Short.MAX_VALUE)
        );
        viewPanelHospitalDirectoryLayout.setVerticalGroup(
            viewPanelHospitalDirectoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 637, Short.MAX_VALUE)
        );

        jSplitPaneHospitalDirectory.setRightComponent(viewPanelHospitalDirectory);

        javax.swing.GroupLayout hospitalDirectoryPanelLayout = new javax.swing.GroupLayout(hospitalDirectoryPanel);
        hospitalDirectoryPanel.setLayout(hospitalDirectoryPanelLayout);
        hospitalDirectoryPanelLayout.setHorizontalGroup(
            hospitalDirectoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPaneHospitalDirectory)
        );
        hospitalDirectoryPanelLayout.setVerticalGroup(
            hospitalDirectoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hospitalDirectoryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPaneHospitalDirectory))
        );

        viewPanelSystemAdmin.add(hospitalDirectoryPanel, "hospitalDirectoryPanel");

        btnAddDoctor.setText("Add Doctor");
        btnAddDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDoctorActionPerformed(evt);
            }
        });

        btnViewDoctors.setText("View Doctors");
        btnViewDoctors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDoctorsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlPanelDoctorsDirectoryLayout = new javax.swing.GroupLayout(controlPanelDoctorsDirectory);
        controlPanelDoctorsDirectory.setLayout(controlPanelDoctorsDirectoryLayout);
        controlPanelDoctorsDirectoryLayout.setHorizontalGroup(
            controlPanelDoctorsDirectoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelDoctorsDirectoryLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controlPanelDoctorsDirectoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnViewDoctors, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAddDoctor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        controlPanelDoctorsDirectoryLayout.setVerticalGroup(
            controlPanelDoctorsDirectoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelDoctorsDirectoryLayout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(btnAddDoctor)
                .addGap(49, 49, 49)
                .addComponent(btnViewDoctors)
                .addContainerGap(364, Short.MAX_VALUE))
        );

        jSplitPaneDoctorsDirectory.setLeftComponent(controlPanelDoctorsDirectory);

        javax.swing.GroupLayout viewPanelDoctorsDirectoryLayout = new javax.swing.GroupLayout(viewPanelDoctorsDirectory);
        viewPanelDoctorsDirectory.setLayout(viewPanelDoctorsDirectoryLayout);
        viewPanelDoctorsDirectoryLayout.setHorizontalGroup(
            viewPanelDoctorsDirectoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 909, Short.MAX_VALUE)
        );
        viewPanelDoctorsDirectoryLayout.setVerticalGroup(
            viewPanelDoctorsDirectoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 637, Short.MAX_VALUE)
        );

        jSplitPaneDoctorsDirectory.setRightComponent(viewPanelDoctorsDirectory);

        javax.swing.GroupLayout DoctorsDirectoryPanelLayout = new javax.swing.GroupLayout(DoctorsDirectoryPanel);
        DoctorsDirectoryPanel.setLayout(DoctorsDirectoryPanelLayout);
        DoctorsDirectoryPanelLayout.setHorizontalGroup(
            DoctorsDirectoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DoctorsDirectoryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPaneDoctorsDirectory)
                .addContainerGap())
        );
        DoctorsDirectoryPanelLayout.setVerticalGroup(
            DoctorsDirectoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DoctorsDirectoryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPaneDoctorsDirectory))
        );

        viewPanelSystemAdmin.add(DoctorsDirectoryPanel, "DoctorsDirectoryPanel");

        btnAddPatient.setText("Add Patient");
        btnAddPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPatientActionPerformed(evt);
            }
        });

        btnViewPatient.setText("View Patient");
        btnViewPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewPatientActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlPanelPatientDirectroyLayout = new javax.swing.GroupLayout(controlPanelPatientDirectroy);
        controlPanelPatientDirectroy.setLayout(controlPanelPatientDirectroyLayout);
        controlPanelPatientDirectroyLayout.setHorizontalGroup(
            controlPanelPatientDirectroyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelPatientDirectroyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controlPanelPatientDirectroyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddPatient)
                    .addComponent(btnViewPatient))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        controlPanelPatientDirectroyLayout.setVerticalGroup(
            controlPanelPatientDirectroyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelPatientDirectroyLayout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(btnAddPatient)
                .addGap(64, 64, 64)
                .addComponent(btnViewPatient)
                .addContainerGap(364, Short.MAX_VALUE))
        );

        jSplitPanePatientDirectory.setLeftComponent(controlPanelPatientDirectroy);

        javax.swing.GroupLayout viewPanelPatientDirectroyLayout = new javax.swing.GroupLayout(viewPanelPatientDirectroy);
        viewPanelPatientDirectroy.setLayout(viewPanelPatientDirectroyLayout);
        viewPanelPatientDirectroyLayout.setHorizontalGroup(
            viewPanelPatientDirectroyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 915, Short.MAX_VALUE)
        );
        viewPanelPatientDirectroyLayout.setVerticalGroup(
            viewPanelPatientDirectroyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 637, Short.MAX_VALUE)
        );

        jSplitPanePatientDirectory.setRightComponent(viewPanelPatientDirectroy);

        javax.swing.GroupLayout PatientDirectoryPanelLayout = new javax.swing.GroupLayout(PatientDirectoryPanel);
        PatientDirectoryPanel.setLayout(PatientDirectoryPanelLayout);
        PatientDirectoryPanelLayout.setHorizontalGroup(
            PatientDirectoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PatientDirectoryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPanePatientDirectory)
                .addContainerGap())
        );
        PatientDirectoryPanelLayout.setVerticalGroup(
            PatientDirectoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PatientDirectoryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPanePatientDirectory))
        );

        viewPanelSystemAdmin.add(PatientDirectoryPanel, "PatientDirectoryPanel");

        btnAddEncounter.setText("Add Encounter");
        btnAddEncounter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEncounterActionPerformed(evt);
            }
        });

        btnViewEncounter.setText("View Encounter");
        btnViewEncounter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewEncounterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlPanelEncountersDirectoryLayout = new javax.swing.GroupLayout(controlPanelEncountersDirectory);
        controlPanelEncountersDirectory.setLayout(controlPanelEncountersDirectoryLayout);
        controlPanelEncountersDirectoryLayout.setHorizontalGroup(
            controlPanelEncountersDirectoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelEncountersDirectoryLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controlPanelEncountersDirectoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddEncounter)
                    .addComponent(btnViewEncounter))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        controlPanelEncountersDirectoryLayout.setVerticalGroup(
            controlPanelEncountersDirectoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelEncountersDirectoryLayout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(btnAddEncounter)
                .addGap(71, 71, 71)
                .addComponent(btnViewEncounter)
                .addContainerGap(350, Short.MAX_VALUE))
        );

        jSplitPaneEncountersDirectory.setLeftComponent(controlPanelEncountersDirectory);

        javax.swing.GroupLayout viewPanelEncountersDirectoryLayout = new javax.swing.GroupLayout(viewPanelEncountersDirectory);
        viewPanelEncountersDirectory.setLayout(viewPanelEncountersDirectoryLayout);
        viewPanelEncountersDirectoryLayout.setHorizontalGroup(
            viewPanelEncountersDirectoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 910, Short.MAX_VALUE)
        );
        viewPanelEncountersDirectoryLayout.setVerticalGroup(
            viewPanelEncountersDirectoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 643, Short.MAX_VALUE)
        );

        jSplitPaneEncountersDirectory.setRightComponent(viewPanelEncountersDirectory);

        javax.swing.GroupLayout EncounterDirectoryPanelLayout = new javax.swing.GroupLayout(EncounterDirectoryPanel);
        EncounterDirectoryPanel.setLayout(EncounterDirectoryPanelLayout);
        EncounterDirectoryPanelLayout.setHorizontalGroup(
            EncounterDirectoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPaneEncountersDirectory)
        );
        EncounterDirectoryPanelLayout.setVerticalGroup(
            EncounterDirectoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPaneEncountersDirectory)
        );

        viewPanelSystemAdmin.add(EncounterDirectoryPanel, "EncounterDirectoryPanel");

        jSplitPaneHospitalAdmin.setRightComponent(viewPanelSystemAdmin);

        add(jSplitPaneHospitalAdmin, "jSplitPaneHospitalAdmin");
    }// </editor-fold>//GEN-END:initComponents

    private void btnSystemAdminLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSystemAdminLoginActionPerformed
        // TODO add your handling code here:
        /*
        String username = txtCommunityAdminUsername.getText();
        String password = txtCommunityAdminPassword.getText();
        if(username.equals("cadmin") && password.equals("12345")){
            cardLayoutmain.show(this, "jSplitPaneCommunityAdmin");
        }
        else{
            JOptionPane.showMessageDialog(this, "Enter Valid Id");
            return;
        }
        */
        String username = txtSystemAdminUsername.getText();
        String password = txtSystemAdminPassword.getText();
        if(username.equals("hadmin") && password.equals("12345")){
            cardLayoutmain.show(this, "jSplitPaneHospitalAdmin");
        }
        else{
            JOptionPane.showMessageDialog(this, "Enter Valid Username and password");
            return;
        }
    }//GEN-LAST:event_btnSystemAdminLoginActionPerformed

    private void btnHospitlaDirectoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHospitlaDirectoryActionPerformed
        // TODO add your handling code here:
        cardLayoutSystemAdmin.show(viewPanelSystemAdmin, "hospitalDirectoryPanel");
    }//GEN-LAST:event_btnHospitlaDirectoryActionPerformed

    private void btnDoctorsDirectoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoctorsDirectoryActionPerformed
        // TODO add your handling code here:
        cardLayoutSystemAdmin.show(viewPanelSystemAdmin, "DoctorsDirectoryPanel");
    }//GEN-LAST:event_btnDoctorsDirectoryActionPerformed

    private void btnPatientDirectoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatientDirectoryActionPerformed
        // TODO add your handling code here:
        cardLayoutSystemAdmin.show(viewPanelSystemAdmin, "PatientDirectoryPanel");
    }//GEN-LAST:event_btnPatientDirectoryActionPerformed

    private void btnEncountersDirectoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncountersDirectoryActionPerformed
        // TODO add your handling code here:
        cardLayoutSystemAdmin.show(viewPanelSystemAdmin, "EncounterDirectoryPanel");
    }//GEN-LAST:event_btnEncountersDirectoryActionPerformed

    private void btnCreateHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateHospitalActionPerformed
        // TODO add your handling code here:
        CreateHospitalPanel createHospital = new CreateHospitalPanel(sysAdmin);
        jSplitPaneHospitalDirectory.setRightComponent(createHospital);
    }//GEN-LAST:event_btnCreateHospitalActionPerformed

    private void btnViewHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewHospitalActionPerformed
        // TODO add your handling code here:
        ViewHospitalPanelSystemAdmin viewHospital = new ViewHospitalPanelSystemAdmin(sysAdmin);
        jSplitPaneHospitalDirectory.setRightComponent(viewHospital);
    }//GEN-LAST:event_btnViewHospitalActionPerformed

    private void btnAddDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDoctorActionPerformed
        // TODO add your handling code here:
        CreateDoctorPanel createDoctor = new CreateDoctorPanel(sysAdmin);
        jSplitPaneDoctorsDirectory.setRightComponent(createDoctor);
    }//GEN-LAST:event_btnAddDoctorActionPerformed

    private void btnViewDoctorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDoctorsActionPerformed
        // TODO add your handling code here:
        ViewDoctorPanelSystemAdmin viewDoctors = new ViewDoctorPanelSystemAdmin(sysAdmin);
        jSplitPaneDoctorsDirectory.setRightComponent(viewDoctors);
    }//GEN-LAST:event_btnViewDoctorsActionPerformed

    private void btnAddPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPatientActionPerformed
        // TODO add your handling code here:
        CreatePatientPanel createPatient = new CreatePatientPanel(sysAdmin);
        jSplitPanePatientDirectory.setRightComponent(createPatient);
    }//GEN-LAST:event_btnAddPatientActionPerformed

    private void btnViewPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewPatientActionPerformed
        // TODO add your handling code here:
        ViewPatientPanelSystemAdmin viewPatient = new ViewPatientPanelSystemAdmin(sysAdmin);
        jSplitPanePatientDirectory.setRightComponent(viewPatient);
    }//GEN-LAST:event_btnViewPatientActionPerformed

    private void btnAddEncounterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEncounterActionPerformed
        // TODO add your handling code here:
        AddEncounterPanel addEncounter = new AddEncounterPanel(sysAdmin);
        jSplitPaneEncountersDirectory.setRightComponent(addEncounter);
    }//GEN-LAST:event_btnAddEncounterActionPerformed

    private void btnViewEncounterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewEncounterActionPerformed
        // TODO add your handling code here:
        ViewEncountersPanelSystemAdmin viewEncounters = new ViewEncountersPanelSystemAdmin(sysAdmin);
        jSplitPaneEncountersDirectory.setRightComponent(viewEncounters);
    }//GEN-LAST:event_btnViewEncounterActionPerformed

    private void txtSystemAdminUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSystemAdminUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSystemAdminUsernameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DoctorsDirectoryPanel;
    private javax.swing.JPanel EncounterDirectoryPanel;
    private javax.swing.JPanel PatientDirectoryPanel;
    private javax.swing.JButton btnAddDoctor;
    private javax.swing.JButton btnAddEncounter;
    private javax.swing.JButton btnAddPatient;
    private javax.swing.JButton btnCreateHospital;
    private javax.swing.JButton btnDoctorsDirectory;
    private javax.swing.JButton btnEncountersDirectory;
    private javax.swing.JButton btnHospitlaDirectory;
    private javax.swing.JButton btnPatientDirectory;
    private javax.swing.JButton btnSystemAdminLogin;
    private javax.swing.JButton btnViewDoctors;
    private javax.swing.JButton btnViewEncounter;
    private javax.swing.JButton btnViewHospital;
    private javax.swing.JButton btnViewPatient;
    private javax.swing.JPanel controlPanelDoctorsDirectory;
    private javax.swing.JPanel controlPanelEncountersDirectory;
    private javax.swing.JPanel controlPanelHospitalDirectory;
    private javax.swing.JPanel controlPanelPatientDirectroy;
    private javax.swing.JPanel controlPanelSystemAdmin;
    private javax.swing.JPanel hospitalAdminLoginPanel;
    private javax.swing.JPanel hospitalDirectoryPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSplitPane jSplitPaneDoctorsDirectory;
    private javax.swing.JSplitPane jSplitPaneEncountersDirectory;
    private javax.swing.JSplitPane jSplitPaneHospitalAdmin;
    private javax.swing.JSplitPane jSplitPaneHospitalDirectory;
    private javax.swing.JSplitPane jSplitPanePatientDirectory;
    private javax.swing.JPasswordField txtSystemAdminPassword;
    private javax.swing.JTextField txtSystemAdminUsername;
    private javax.swing.JPanel viewPanelDoctorsDirectory;
    private javax.swing.JPanel viewPanelEncountersDirectory;
    private javax.swing.JPanel viewPanelHospitalDirectory;
    private javax.swing.JPanel viewPanelPatientDirectroy;
    private javax.swing.JPanel viewPanelSystemAdmin;
    // End of variables declaration//GEN-END:variables
}
