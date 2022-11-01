/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import model.Doctor;
import model.Hospital;
import model.HospitalDirectory;
import model.SystemAdmin;

/**
 *
 * @author DhiralM
 */
public class CreateDoctorPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateDoctorPanel
     */
    SystemAdmin sysAdmin;
    public CreateDoctorPanel(SystemAdmin sysAdmin) {
        initComponents();
        this.sysAdmin = sysAdmin;
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

        jLabel1 = new javax.swing.JLabel();
        lblDoctorPassword = new javax.swing.JLabel();
        txtDoctorUsername = new javax.swing.JTextField();
        lblDoctorPhoneNumber = new javax.swing.JLabel();
        txtDoctorPassword = new javax.swing.JPasswordField();
        lblDoctorEmailAddress = new javax.swing.JLabel();
        btnSaveDoctor = new javax.swing.JButton();
        txtDoctorName = new javax.swing.JTextField();
        txtDoctorAge = new javax.swing.JTextField();
        txtDoctorGender = new javax.swing.JTextField();
        txtDoctorPhoneNumber = new javax.swing.JTextField();
        txtDoctorEmailAddress = new javax.swing.JTextField();
        lblpersonalDetails = new javax.swing.JLabel();
        lbDoctorName = new javax.swing.JLabel();
        lblDoctorAge = new javax.swing.JLabel();
        lblDoctorGender = new javax.swing.JLabel();
        lblPatientLoginDetails = new javax.swing.JLabel();
        lblDoctorUsername = new javax.swing.JLabel();
        lblContactDetails = new javax.swing.JLabel();
        lblDoctorHouse = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtDoctorOccupation = new javax.swing.JTextField();
        jComboBoxDoctorHospital = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtDoctorExperience = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDoctorSpecialisation = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel1.setText("Register Doctor Details");

        lblDoctorPassword.setText("Password");

        lblDoctorPhoneNumber.setText("Phone Number");

        lblDoctorEmailAddress.setText("Email Address");

        btnSaveDoctor.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnSaveDoctor.setText("Save Doctor");
        btnSaveDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveDoctorActionPerformed(evt);
            }
        });

        txtDoctorPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDoctorPhoneNumberActionPerformed(evt);
            }
        });

        lblpersonalDetails.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblpersonalDetails.setText("Personal Details");

        lbDoctorName.setText("Name");

        lblDoctorAge.setText("Age");

        lblDoctorGender.setText("Gender");

        lblPatientLoginDetails.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblPatientLoginDetails.setText("Login Details");

        lblDoctorUsername.setText("Username");

        lblContactDetails.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblContactDetails.setText("Contact Details");

        lblDoctorHouse.setText("Hospital");

        jLabel3.setText("Occupation");

        jLabel2.setText("Experience");

        jLabel4.setText("Specialisation");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(lblpersonalDetails)
                        .addGap(312, 312, 312))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDoctorUsername)
                            .addComponent(lblDoctorPassword))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPatientLoginDetails)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtDoctorUsername)
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSaveDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtDoctorPassword)))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(339, 339, 339)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbDoctorName)
                                .addGap(68, 68, 68)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtDoctorSpecialisation, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDoctorExperience, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDoctorOccupation, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxDoctorHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDoctorGender, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDoctorAge, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDoctorName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblContactDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDoctorAge, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDoctorGender)
                            .addComponent(lblDoctorHouse)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblDoctorEmailAddress)
                                    .addComponent(lblDoctorPhoneNumber))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDoctorPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDoctorEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblpersonalDetails)
                            .addComponent(lblPatientLoginDetails))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDoctorUsername)
                            .addComponent(txtDoctorUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDoctorPassword)
                            .addComponent(txtDoctorPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbDoctorName)
                            .addComponent(txtDoctorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDoctorAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDoctorAge))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDoctorGender)
                            .addComponent(txtDoctorGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(btnSaveDoctor)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDoctorHouse)
                    .addComponent(jComboBoxDoctorHospital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDoctorSpecialisation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(38, 38, 38)
                        .addComponent(lblContactDetails))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtDoctorOccupation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDoctorExperience, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDoctorPhoneNumber)
                    .addComponent(txtDoctorPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDoctorEmailAddress)
                    .addComponent(txtDoctorEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(143, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveDoctorActionPerformed
        // TODO add your handling code here:
        
       
        
        if(jComboBoxDoctorHospital.getSelectedItem()==null){
            JOptionPane.showMessageDialog(this, "Select Hospital");
            return;
        }
        Hospital hospital = (Hospital)jComboBoxDoctorHospital.getSelectedItem();
        
        String doctorId = String.valueOf(sysAdmin.getDoctorDirectory().doctorCount() + Integer.parseInt("1000000"));
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
        Doctor d = sysAdmin.getDoctorDirectory().addDoctor();
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
        
        JOptionPane.showMessageDialog(this, "Doctor Info Saved"); 
        
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
        
        
        
        
        

    }//GEN-LAST:event_btnSaveDoctorActionPerformed

    private void txtDoctorPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDoctorPhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDoctorPhoneNumberActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSaveDoctor;
    private javax.swing.JComboBox<Object> jComboBoxDoctorHospital;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
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
    private javax.swing.JTextField txtDoctorAge;
    private javax.swing.JTextField txtDoctorEmailAddress;
    private javax.swing.JTextField txtDoctorExperience;
    private javax.swing.JTextField txtDoctorGender;
    private javax.swing.JTextField txtDoctorName;
    private javax.swing.JTextField txtDoctorOccupation;
    private javax.swing.JPasswordField txtDoctorPassword;
    private javax.swing.JTextField txtDoctorPhoneNumber;
    private javax.swing.JTextField txtDoctorSpecialisation;
    private javax.swing.JTextField txtDoctorUsername;
    // End of variables declaration//GEN-END:variables

    

    private void populateHospitals() {
        /*
        List<City> cities = sysAdmin.getCities();
        jComboBoxHouseCommunity.removeAllItems();
        for(City c : cities){
            for(Community community : c.getCommunityList()){
                jComboBoxHouseCommunity.addItem(community);
            }
        }
        
        */
        HospitalDirectory hd = sysAdmin.getHospitalDirectory();
        List<Hospital> hl = hd.getHospitalDirectory();
        for(Hospital h : hl){
            jComboBoxDoctorHospital.addItem(h);
        }
        
    }
}
