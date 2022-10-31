/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Doctor;
import model.DoctorDirectory;
import model.Hospital;
import model.HospitalDirectory;
import model.SystemAdmin;

/**
 *
 * @author DhiralM
 */
public class ViewDoctorPanelSystemAdmin extends javax.swing.JPanel {

    /**
     * Creates new form ViewDoctorPanelSystemAdmin
     */
    SystemAdmin sysAdmin;
    public ViewDoctorPanelSystemAdmin(SystemAdmin sysAdmin) {
        initComponents();
        this.sysAdmin = sysAdmin;
        populateTable();
        populateHospitals();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtDoctorSpecialisation = new javax.swing.JTextField();
        btnViewDoctor = new javax.swing.JButton();
        btnUpdateDoctor = new javax.swing.JButton();
        txtDoctorName = new javax.swing.JTextField();
        lblPatientLoginDetails = new javax.swing.JLabel();
        txtDoctorAge = new javax.swing.JTextField();
        lblDoctorUsername = new javax.swing.JLabel();
        txtDoctorGender = new javax.swing.JTextField();
        lblContactDetails = new javax.swing.JLabel();
        lblDoctorHouse = new javax.swing.JLabel();
        txtDoctorPhoneNumber = new javax.swing.JTextField();
        lblDoctorAge = new javax.swing.JLabel();
        lblDoctorPassword = new javax.swing.JLabel();
        txtDoctorUsername = new javax.swing.JTextField();
        lblDoctorGender = new javax.swing.JLabel();
        lblDoctorPhoneNumber = new javax.swing.JLabel();
        txtDoctorPassword = new javax.swing.JPasswordField();
        lblDoctorEmailAddress = new javax.swing.JLabel();
        btnSaveDoctor = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtDoctorId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDoctors = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtDoctorEmailAddress = new javax.swing.JTextField();
        txtDoctorOccupation = new javax.swing.JTextField();
        jComboBoxDoctorHospital = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        lblpersonalDetails = new javax.swing.JLabel();
        txtDoctorExperience = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lbDoctorName = new javax.swing.JLabel();
        btnDeleteDoctor = new javax.swing.JButton();

        btnViewDoctor.setText("View Doctor");
        btnViewDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDoctorActionPerformed(evt);
            }
        });

        btnUpdateDoctor.setText("Update Doctors");
        btnUpdateDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateDoctorActionPerformed(evt);
            }
        });

        lblPatientLoginDetails.setText("Login Details");

        lblDoctorUsername.setText("Username");

        lblContactDetails.setText("Contact Details");

        lblDoctorHouse.setText("Hospital");

        txtDoctorPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDoctorPhoneNumberActionPerformed(evt);
            }
        });

        lblDoctorAge.setText("Age");

        lblDoctorPassword.setText("Password");

        lblDoctorGender.setText("Gender");

        lblDoctorPhoneNumber.setText("Phone Number");

        lblDoctorEmailAddress.setText("Email Address");

        btnSaveDoctor.setText("Save Doctor");
        btnSaveDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveDoctorActionPerformed(evt);
            }
        });

        jLabel5.setText("DoctorId");

        jLabel1.setText("View Doctors");

        tblDoctors.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "DoctorId", "Doctor Name", "Doctor Occupation", "Doctor Experience", "Doctor Specialisation", "Doctor Hospital"
            }
        ));
        jScrollPane1.setViewportView(tblDoctors);

        jLabel3.setText("Occupation");

        jLabel2.setText("Experience");

        lblpersonalDetails.setText("Personal Details");

        jLabel4.setText("Specialisation");

        lbDoctorName.setText("Name");

        btnDeleteDoctor.setText("Delete Doctor");
        btnDeleteDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteDoctorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(369, 369, 369)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 825, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(lblContactDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbDoctorName)
                    .addComponent(lblDoctorAge)
                    .addComponent(jLabel3)
                    .addComponent(lblDoctorGender)
                    .addComponent(lblDoctorHouse)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(lblDoctorPhoneNumber)
                    .addComponent(lblDoctorEmailAddress)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblpersonalDetails)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnViewDoctor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdateDoctor)
                        .addGap(18, 18, 18)
                        .addComponent(btnDeleteDoctor)
                        .addGap(55, 55, 55))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDoctorPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtDoctorAge)
                                .addComponent(txtDoctorGender)
                                .addComponent(txtDoctorName)
                                .addComponent(jComboBoxDoctorHospital, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtDoctorExperience)
                                .addComponent(txtDoctorOccupation)
                                .addComponent(txtDoctorSpecialisation, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtDoctorEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(119, 119, 119)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblDoctorUsername)
                                            .addComponent(lblDoctorPassword))
                                        .addGap(34, 34, 34)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtDoctorPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                            .addComponent(txtDoctorUsername))
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(212, 212, 212)
                                        .addComponent(lblPatientLoginDetails)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSaveDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(93, 93, 93))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtDoctorId, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewDoctor)
                    .addComponent(btnUpdateDoctor)
                    .addComponent(lblpersonalDetails)
                    .addComponent(btnDeleteDoctor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPatientLoginDetails)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(txtDoctorId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbDoctorName)
                            .addComponent(txtDoctorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDoctorUsername)
                            .addComponent(txtDoctorUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDoctorPassword)
                            .addComponent(txtDoctorPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDoctorAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblDoctorAge)))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDoctorGender)
                    .addComponent(txtDoctorGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDoctorHouse)
                    .addComponent(jComboBoxDoctorHospital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSaveDoctor))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtDoctorOccupation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(49, 49, 49))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtDoctorExperience, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)))
                        .addGap(34, 34, 34)
                        .addComponent(jLabel4))
                    .addComponent(txtDoctorSpecialisation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblContactDetails)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDoctorPhoneNumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDoctorPhoneNumber, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDoctorEmailAddress)
                    .addComponent(txtDoctorEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDoctorActionPerformed
        // TODO add your handling code here:

        int selectedrowIndex = tblDoctors.getSelectedRow();
        if(selectedrowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select row to view the details");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tblDoctors.getModel();
        Doctor d = (Doctor) model.getValueAt(selectedrowIndex, 1);

        txtDoctorId.setText(String.valueOf(d.getDoctorId()));
        txtDoctorId.setEditable(false);
        txtDoctorName.setText(d.getDoctorName());
        txtDoctorName.setEditable(false);
        txtDoctorAge.setText(String.valueOf(d.getAge()));
        txtDoctorAge.setEditable(false);
        txtDoctorGender.setText(String.valueOf(d.getGender()));
        txtDoctorGender.setEditable(false);
        jComboBoxDoctorHospital.setSelectedItem(d.getHospital());
        jComboBoxDoctorHospital.setEditable(false);
        txtDoctorOccupation.setText(d.getOccupation());
        txtDoctorOccupation.setEditable(false);
        txtDoctorExperience.setText(String.valueOf(d.getExperience()));
        txtDoctorExperience.setEditable(false);
        txtDoctorSpecialisation.setText(d.getSpecialization());
        txtDoctorSpecialisation.setEditable(false);
        txtDoctorPhoneNumber.setText(d.getPhoneNumber());
        txtDoctorPhoneNumber.setEditable(false);
        txtDoctorEmailAddress.setText(d.getEmail());
        txtDoctorEmailAddress.setEditable(false);
        txtDoctorUsername.setText(d.getUsername());
        txtDoctorUsername.setEditable(false);
        txtDoctorPassword.setText(d.getPassword());
        txtDoctorPassword.setEditable(false);

    }//GEN-LAST:event_btnViewDoctorActionPerformed

    private void btnUpdateDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateDoctorActionPerformed
        // TODO add your handling code here:
        int selectedrowIndex = tblDoctors.getSelectedRow();
        if(selectedrowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select row to view the details");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblDoctors.getModel();
        Doctor d = (Doctor) model.getValueAt(selectedrowIndex, 1);

        txtDoctorId.setText(String.valueOf(d.getDoctorId()));
        txtDoctorId.setEditable(false);
        txtDoctorName.setText(d.getDoctorName());
        txtDoctorName.setEditable(true);
        txtDoctorAge.setText(String.valueOf(d.getAge()));
        txtDoctorAge.setEditable(true);
        txtDoctorGender.setText(String.valueOf(d.getGender()));
        txtDoctorGender.setEditable(true);
        jComboBoxDoctorHospital.setSelectedItem(d.getHospital());
        jComboBoxDoctorHospital.setEditable(true);
        txtDoctorOccupation.setText(d.getOccupation());
        txtDoctorOccupation.setEditable(true);
        txtDoctorExperience.setText(String.valueOf(d.getExperience()));
        txtDoctorExperience.setEditable(true);
        txtDoctorSpecialisation.setText(d.getSpecialization());
        txtDoctorSpecialisation.setEditable(true);
        txtDoctorPhoneNumber.setText(d.getPhoneNumber());
        txtDoctorPhoneNumber.setEditable(true);
        txtDoctorEmailAddress.setText(d.getEmail());
        txtDoctorEmailAddress.setEditable(true);
        txtDoctorUsername.setText(d.getUsername());
        txtDoctorUsername.setEditable(true);
        txtDoctorPassword.setText(d.getPassword());
        txtDoctorPassword.setEditable(true);
    }//GEN-LAST:event_btnUpdateDoctorActionPerformed

    private void txtDoctorPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDoctorPhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDoctorPhoneNumberActionPerformed

    private void btnSaveDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveDoctorActionPerformed
        // TODO add your handling code here:

        if(jComboBoxDoctorHospital.getSelectedItem()==null){
            JOptionPane.showMessageDialog(this, "Select Hospital");
            return;
        }
        Hospital hospital = (Hospital)jComboBoxDoctorHospital.getSelectedItem();

        Doctor d = sysAdmin.getDoctorDirectory().getDoctor(txtDoctorId.getText());
        String doctorId = txtDoctorId.getText();
        String doctorName = txtDoctorName.getText();
        int doctorAge,doctorExperience;
        String doctorGender = txtDoctorGender.getText();
        String doctorOccupation = txtDoctorOccupation.getText();

        String specialisation = txtDoctorSpecialisation.getText();
        String doctorEmail = txtDoctorEmailAddress.getText();
        String doctorPhone = txtDoctorPhoneNumber.getText();
        String username = txtDoctorUsername.getText();
        String password = txtDoctorPassword.getText();

        if(doctorName.length()==0 || doctorGender.length()==0 || doctorOccupation.length()==0 || specialisation.length()==0 || doctorEmail.length()==0 ||
            doctorPhone.length()==0 || username.length()==0 || password.length()==0){
            JOptionPane.showMessageDialog(this, "Enter All Fields");
            return;
        }
        try{
            doctorAge = Integer.parseInt(txtDoctorAge.getText());
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "Enter Valid Age");
            return;
        }

        try{
            doctorExperience = Integer.parseInt(txtDoctorExperience.getText());
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "Enter Valid Experience");
            return;
        }

        String emailRegex = "^(.+)@(.+)$";
        Pattern emailPattern = Pattern.compile(emailRegex);
        Matcher emailmatcher = emailPattern.matcher(doctorEmail);
        if(emailmatcher.matches()==false){
            JOptionPane.showMessageDialog(this, "Enter Valid Email");
            return;
        }
        if(doctorPhone.length()!=10){
            JOptionPane.showMessageDialog(this, "Enter Valid Phone Number");
            return;
        }

        d.setDoctorId(doctorId);
        d.setDoctorName(doctorName);
        d.setAge(doctorAge);
        d.setExperience(doctorExperience);
        d.setGender(doctorGender);
        d.setOccupation(doctorOccupation);
        d.setSpecialization(specialisation);
        d.setEmail(doctorEmail);
        d.setPhoneNumber(doctorPhone);
        d.setUsername(username);
        d.setPassword(password);
        d.setHospital(hospital);

        JOptionPane.showMessageDialog(this, "Doctor Info Updated");

        txtDoctorAge.setText("");
        txtDoctorEmailAddress.setText("");
        txtDoctorExperience.setText("");
        txtDoctorGender.setText("");
        txtDoctorName.setText("");
        txtDoctorOccupation.setText("");
        txtDoctorPassword.setText("");
        txtDoctorPhoneNumber.setText("");
        txtDoctorSpecialisation.setText("");
        txtDoctorUsername.setText("");
        jComboBoxDoctorHospital.setSelectedItem(null);
        populateTable();
    }//GEN-LAST:event_btnSaveDoctorActionPerformed

    private void btnDeleteDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteDoctorActionPerformed
        // TODO add your handling code here:
        
        int selectedrowIndex = tblDoctors.getSelectedRow();
        if(selectedrowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select row to delete the details");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblDoctors.getModel();
        Doctor d = (Doctor) model.getValueAt(selectedrowIndex, 1);
        DoctorDirectory dd = sysAdmin.getDoctorDirectory();
        dd.deleteDoctor(d);
        JOptionPane.showMessageDialog(this, "Doctor deleted");
        populateTable();
        
        
    }//GEN-LAST:event_btnDeleteDoctorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteDoctor;
    private javax.swing.JButton btnSaveDoctor;
    private javax.swing.JButton btnUpdateDoctor;
    private javax.swing.JButton btnViewDoctor;
    private javax.swing.JComboBox<Object> jComboBoxDoctorHospital;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbDoctorName;
    private javax.swing.JLabel lblContactDetails;
    private javax.swing.JLabel lblDoctorAge;
    private javax.swing.JLabel lblDoctorEmailAddress;
    private javax.swing.JLabel lblDoctorGender;
    private javax.swing.JLabel lblDoctorHouse;
    private javax.swing.JLabel lblDoctorPassword;
    private javax.swing.JLabel lblDoctorPhoneNumber;
    private javax.swing.JLabel lblDoctorUsername;
    private javax.swing.JLabel lblPatientLoginDetails;
    private javax.swing.JLabel lblpersonalDetails;
    private javax.swing.JTable tblDoctors;
    private javax.swing.JTextField txtDoctorAge;
    private javax.swing.JTextField txtDoctorEmailAddress;
    private javax.swing.JTextField txtDoctorExperience;
    private javax.swing.JTextField txtDoctorGender;
    private javax.swing.JTextField txtDoctorId;
    private javax.swing.JTextField txtDoctorName;
    private javax.swing.JTextField txtDoctorOccupation;
    private javax.swing.JPasswordField txtDoctorPassword;
    private javax.swing.JTextField txtDoctorPhoneNumber;
    private javax.swing.JTextField txtDoctorSpecialisation;
    private javax.swing.JTextField txtDoctorUsername;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblDoctors.getModel();
        model.setRowCount(0);
        DoctorDirectory dd = sysAdmin.getDoctorDirectory();
        List<Doctor> doctors = dd.getDoctorDirectory();
        for(Doctor d : doctors){
            Object[] row = new Object[6];
            row[0] = d.getDoctorId();
            row[1] = d;
            row[2] = d.getOccupation();
            row[3] = d.getExperience();
            row[4] = d.getSpecialization();
            row[5] = d.getHospital();
            model.addRow(row);
        }
    }

    private void populateHospitals() {
        HospitalDirectory hd = sysAdmin.getHospitalDirectory();
        List<Hospital> hl = hd.getHospitalDirectory();
        for(Hospital h : hl){
            jComboBoxDoctorHospital.addItem(h);
        }
    }
}
