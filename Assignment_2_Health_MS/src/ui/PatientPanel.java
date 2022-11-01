/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import java.util.List;
import javax.swing.JOptionPane;
import model.Doctor;
import model.Patient;
import model.PatientDirectory;
import model.SystemAdmin;

/**
 *
 * @author DhiralM
 */
public class PatientPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientPanel
     */
    CardLayout cardLayoutmain;
    SystemAdmin sysAdmin;
    Patient p;
    public PatientPanel(SystemAdmin sysAdmin) {
        initComponents();
        this.sysAdmin = sysAdmin;
        cardLayoutmain = (CardLayout)(this.getLayout());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPanePatientPanel = new javax.swing.JSplitPane();
        controlPanelPatientHome = new javax.swing.JPanel();
        btnCheckDoctors = new javax.swing.JButton();
        btncheckEncounters = new javax.swing.JButton();
        btnCheckDetails = new javax.swing.JButton();
        btnBookAppointment = new javax.swing.JButton();
        viewPanelPatientHome = new javax.swing.JPanel();
        PatientLoginPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPatientUsername = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPatientPassword = new javax.swing.JPasswordField();
        btnDoctorLogin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new java.awt.CardLayout());

        jSplitPanePatientPanel.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        btnCheckDoctors.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnCheckDoctors.setText("Check for Doctors");
        btnCheckDoctors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckDoctorsActionPerformed(evt);
            }
        });

        btncheckEncounters.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btncheckEncounters.setText("Check Encounters");
        btncheckEncounters.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncheckEncountersActionPerformed(evt);
            }
        });

        btnCheckDetails.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnCheckDetails.setText("Check Personal Details");
        btnCheckDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckDetailsActionPerformed(evt);
            }
        });

        btnBookAppointment.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnBookAppointment.setText("Book an Appointment");
        btnBookAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookAppointmentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlPanelPatientHomeLayout = new javax.swing.GroupLayout(controlPanelPatientHome);
        controlPanelPatientHome.setLayout(controlPanelPatientHomeLayout);
        controlPanelPatientHomeLayout.setHorizontalGroup(
            controlPanelPatientHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelPatientHomeLayout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(btnCheckDoctors)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btncheckEncounters)
                .addGap(18, 18, 18)
                .addComponent(btnCheckDetails)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBookAppointment)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        controlPanelPatientHomeLayout.setVerticalGroup(
            controlPanelPatientHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelPatientHomeLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(controlPanelPatientHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCheckDoctors)
                    .addComponent(btncheckEncounters)
                    .addComponent(btnCheckDetails)
                    .addComponent(btnBookAppointment))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jSplitPanePatientPanel.setTopComponent(controlPanelPatientHome);

        javax.swing.GroupLayout viewPanelPatientHomeLayout = new javax.swing.GroupLayout(viewPanelPatientHome);
        viewPanelPatientHome.setLayout(viewPanelPatientHomeLayout);
        viewPanelPatientHomeLayout.setHorizontalGroup(
            viewPanelPatientHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 873, Short.MAX_VALUE)
        );
        viewPanelPatientHomeLayout.setVerticalGroup(
            viewPanelPatientHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 618, Short.MAX_VALUE)
        );

        jSplitPanePatientPanel.setRightComponent(viewPanelPatientHome);

        add(jSplitPanePatientPanel, "jSplitPanePatientPanel");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel2.setText("Patient Login");

        jLabel3.setText("Username");

        txtPatientUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientUsernameActionPerformed(evt);
            }
        });

        jLabel4.setText("Password");

        btnDoctorLogin.setText("Login");
        btnDoctorLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoctorLoginActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/Patient login.gif"))); // NOI18N

        javax.swing.GroupLayout PatientLoginPanelLayout = new javax.swing.GroupLayout(PatientLoginPanel);
        PatientLoginPanel.setLayout(PatientLoginPanelLayout);
        PatientLoginPanelLayout.setHorizontalGroup(
            PatientLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PatientLoginPanelLayout.createSequentialGroup()
                .addGroup(PatientLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PatientLoginPanelLayout.createSequentialGroup()
                        .addGap(254, 254, 254)
                        .addGroup(PatientLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(77, 77, 77)
                        .addGroup(PatientLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPatientPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPatientUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PatientLoginPanelLayout.createSequentialGroup()
                        .addGap(318, 318, 318)
                        .addGroup(PatientLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(btnDoctorLogin)))
                    .addGroup(PatientLoginPanelLayout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(171, Short.MAX_VALUE))
        );
        PatientLoginPanelLayout.setVerticalGroup(
            PatientLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PatientLoginPanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel2)
                .addGap(45, 45, 45)
                .addGroup(PatientLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPatientUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(PatientLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPatientPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(btnDoctorLogin)
                .addGap(37, 37, 37)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, Short.MAX_VALUE)
                .addGap(81, 81, 81))
        );

        add(PatientLoginPanel, "PatientLoginPanel");
    }// </editor-fold>//GEN-END:initComponents

    private void btnDoctorLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoctorLoginActionPerformed
        // TODO add your handling code here:

        String username = txtPatientUsername.getText();
        String password = txtPatientPassword.getText();
        
        boolean validate = validateLogin(username,password);
        if(validate){
            cardLayoutmain.show(this, "jSplitPanePatientPanel");
            this.p = getPatient(username);
            
        }
        
        else{
            JOptionPane.showMessageDialog(this, "Enter Valid Username and password");
            return;
        }
    }//GEN-LAST:event_btnDoctorLoginActionPerformed

    private void btnCheckDoctorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckDoctorsActionPerformed
        // TODO add your handling code here:
        ViewDoctorsPatientPanel viewDoctorsnear = new ViewDoctorsPatientPanel(sysAdmin,p);
        jSplitPanePatientPanel.setRightComponent(viewDoctorsnear);
    }//GEN-LAST:event_btnCheckDoctorsActionPerformed

    private void btncheckEncountersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncheckEncountersActionPerformed
        // TODO add your handling code here:
        CheckEncounterPatientPanel chkencounters = new CheckEncounterPatientPanel(sysAdmin,p);
        jSplitPanePatientPanel.setRightComponent(chkencounters);
        
    }//GEN-LAST:event_btncheckEncountersActionPerformed

    private void btnCheckDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckDetailsActionPerformed
        // TODO add your handling code here:
        ViewPatientPanel viewPatientPanel = new ViewPatientPanel(sysAdmin);
        jSplitPanePatientPanel.setRightComponent((viewPatientPanel));
    }//GEN-LAST:event_btnCheckDetailsActionPerformed

    private void btnBookAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookAppointmentActionPerformed
        // TODO add your handling code here:
        AddEncounterPanel addEncounter = new AddEncounterPanel(sysAdmin);
        jSplitPanePatientPanel.setRightComponent(addEncounter);
    }//GEN-LAST:event_btnBookAppointmentActionPerformed

    private void txtPatientUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientUsernameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PatientLoginPanel;
    private javax.swing.JButton btnBookAppointment;
    private javax.swing.JButton btnCheckDetails;
    private javax.swing.JButton btnCheckDoctors;
    private javax.swing.JButton btnDoctorLogin;
    private javax.swing.JButton btncheckEncounters;
    private javax.swing.JPanel controlPanelPatientHome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSplitPane jSplitPanePatientPanel;
    private javax.swing.JPasswordField txtPatientPassword;
    private javax.swing.JTextField txtPatientUsername;
    private javax.swing.JPanel viewPanelPatientHome;
    // End of variables declaration//GEN-END:variables

    private boolean validateLogin(String username, String password) {
        PatientDirectory pd = sysAdmin.getPatientDirectory();
        List<Patient> pl = pd.getPatientDirectory();
        for(Patient p : pl){
            if(p.getUsername().equals(username) && p.getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }

    private Patient getPatient(String username) {
        Patient pa = new Patient();
        PatientDirectory pd = sysAdmin.getPatientDirectory();
        List<Patient> pl = pd.getPatientDirectory();
        for(Patient p : pl){
            if(p.getUsername().equals(username)){
                pa = p;
                break;
            }
        }
        return pa;
    }
}
