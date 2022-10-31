/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import model.City;
import model.Community;
import model.House;
import model.Patient;
import model.PatientDirectory;
import model.SystemAdmin;

/**
 *
 * @author DhiralM
 */
public class CreatePatientPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreatePatientPanel
     */
    SystemAdmin sysAdmin;
    public CreatePatientPanel(SystemAdmin sysAdmin) {
        initComponents();
        this.sysAdmin = sysAdmin;
        populateHouses();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblpersonalDetails = new javax.swing.JLabel();
        lblPatientName = new javax.swing.JLabel();
        lblPatientAge = new javax.swing.JLabel();
        lblPatientGender = new javax.swing.JLabel();
        lblContactDetails = new javax.swing.JLabel();
        lblPatientPhoneNumber = new javax.swing.JLabel();
        lblPatientEmailAddress = new javax.swing.JLabel();
        txtPatientName = new javax.swing.JTextField();
        txtPatientAge = new javax.swing.JTextField();
        txtPatientGender = new javax.swing.JTextField();
        txtPatientPhoneNumber = new javax.swing.JTextField();
        txtPatientEmailAddress = new javax.swing.JTextField();
        lblPatientFundamentals = new javax.swing.JLabel();
        lblPatientHeight = new javax.swing.JLabel();
        lblPatientWeight = new javax.swing.JLabel();
        lblPatientAllergies = new javax.swing.JLabel();
        txtPatientHeight = new javax.swing.JTextField();
        txtPatientWeight = new javax.swing.JTextField();
        txtPatientAllergies = new javax.swing.JTextField();
        lblPatientLoginDetails = new javax.swing.JLabel();
        lblPatientUsername = new javax.swing.JLabel();
        lblPatientPassword = new javax.swing.JLabel();
        txtPatientUsername = new javax.swing.JTextField();
        txtPatientPassword = new javax.swing.JPasswordField();
        btnSavePatient = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxHouses = new javax.swing.JComboBox<>();

        lblpersonalDetails.setText("Personal Details");

        lblPatientName.setText("Name");

        lblPatientAge.setText("Age");

        lblPatientGender.setText("Gender");

        lblContactDetails.setText("Contact Details");

        lblPatientPhoneNumber.setText("Phone Number");

        lblPatientEmailAddress.setText("Email Address");

        txtPatientPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientPhoneNumberActionPerformed(evt);
            }
        });

        lblPatientFundamentals.setText("Fundamentals");

        lblPatientHeight.setText("Height");

        lblPatientWeight.setText("Weight");

        lblPatientAllergies.setText("Allergies");

        txtPatientHeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientHeightActionPerformed(evt);
            }
        });

        lblPatientLoginDetails.setText("Login Details");

        lblPatientUsername.setText("Username");

        lblPatientPassword.setText("Password");

        btnSavePatient.setText("Save Patient");
        btnSavePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSavePatientActionPerformed(evt);
            }
        });

        jLabel1.setText("House");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblpersonalDetails, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(44, 44, 44)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblPatientName)
                                        .addComponent(lblPatientAge)
                                        .addComponent(lblPatientGender)
                                        .addComponent(jLabel1))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtPatientAge, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                        .addComponent(txtPatientGender, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                        .addComponent(txtPatientName)
                                        .addComponent(jComboBoxHouses, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblPatientEmailAddress)
                                        .addComponent(lblPatientPhoneNumber))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtPatientPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtPatientEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(190, 190, 190)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblPatientPassword)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtPatientPassword))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblPatientUsername)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtPatientUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                                    .addComponent(btnSavePatient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(212, 212, 212)
                                .addComponent(lblPatientLoginDetails)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblPatientFundamentals)
                                .addGap(68, 68, 68))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPatientHeight)
                                .addGap(18, 18, 18)
                                .addComponent(txtPatientHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPatientWeight)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPatientWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPatientAllergies)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPatientAllergies, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)))
                .addGap(181, 181, 181))
            .addGroup(layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(lblContactDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblpersonalDetails)
                            .addComponent(lblPatientLoginDetails))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPatientName)
                            .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPatientUsername)
                            .addComponent(txtPatientUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPatientPassword)
                            .addComponent(txtPatientPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPatientAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblPatientAge)))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPatientGender)
                    .addComponent(txtPatientGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBoxHouses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(lblContactDetails)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPatientFundamentals)
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPatientHeight)
                            .addComponent(txtPatientHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPatientPhoneNumber)
                    .addComponent(txtPatientPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPatientWeight)
                    .addComponent(txtPatientWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPatientEmailAddress)
                    .addComponent(txtPatientEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPatientAllergies)
                    .addComponent(txtPatientAllergies, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(btnSavePatient)
                .addContainerGap(199, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtPatientPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientPhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientPhoneNumberActionPerformed

    private void txtPatientHeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientHeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientHeightActionPerformed

    private void btnSavePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSavePatientActionPerformed
        // TODO add your handling code here:
        
        if(jComboBoxHouses.getSelectedItem()==null){
            JOptionPane.showMessageDialog(this, "Select Hospital");
            return;
        }
        House house = (House)jComboBoxHouses.getSelectedItem();
        
        String patientId = String.valueOf(sysAdmin.getPatientDirectory().patientCount() + Integer.parseInt("10000000"));
        String patientName = txtPatientName.getText();
        int patientAge;
        String patientGender = txtPatientGender.getText();
        
        String patientEmail = txtPatientEmailAddress.getText();
        String patientPhone = txtPatientPhoneNumber.getText();
        String username = txtPatientUsername.getText();
        String password = txtPatientPassword.getText();
        
        if(patientName.length()==0 || patientGender.length()==0 ||  patientEmail.length()==0 ||
                patientPhone.length()==0 || username.length()==0 || password.length()==0){
            JOptionPane.showMessageDialog(this, "Enter All Fields");
            return;
        }
        try{
            patientAge = Integer.parseInt(txtPatientAge.getText());
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "Enter Valid Age");
            return;
        }
        
        
        
        String emailRegex = "^(.+)@(.+)$";
        Pattern emailPattern = Pattern.compile(emailRegex);
        Matcher emailmatcher = emailPattern.matcher(patientEmail);
        if(emailmatcher.matches()==false){
            JOptionPane.showMessageDialog(this, "Enter Valid Email");
            return;
        }
        if(patientPhone.length()!=10){
            JOptionPane.showMessageDialog(this, "Enter Valid Phone Number");
            return;
        }
        Patient p = sysAdmin.getPatientDirectory().addPatient();
        p.setPatientId(patientId);
        p.setName(patientName);
        p.setAge(patientAge);
        
        p.setGender(patientGender);
        
        p.setAddress(house);
        try{
            p.setWeightInKgs(Double.parseDouble(txtPatientWeight.getText()));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "Enter Weight in correct format");
            return;
        }
        try{
            p.setHeightIncms(Double.parseDouble(txtPatientHeight.getText()));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "Enter Height in correct format");
            return;
        }
        
        p.setAllergies(txtPatientAllergies.getText());
        
        
        
        p.setEmailAddress(patientEmail);
        p.setPhoneNumber(patientPhone);
        p.setUsername(username);
        p.setPassword(password);
        
        
        JOptionPane.showMessageDialog(this, "Patient Info Saved"); 
        
        txtPatientAge.setText("");
        txtPatientEmailAddress.setText("");
        txtPatientAllergies.setText("");
        txtPatientGender.setText("");
        txtPatientName.setText("");
        txtPatientHeight.setText("");
        txtPatientWeight.setText("");
        txtPatientPassword.setText("");
        txtPatientPhoneNumber.setText("");
        
        txtPatientUsername.setText("");
        jComboBoxHouses.setSelectedItem(null);
        
        
    }//GEN-LAST:event_btnSavePatientActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSavePatient;
    private javax.swing.JComboBox<Object> jComboBoxHouses;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblContactDetails;
    private javax.swing.JLabel lblPatientAge;
    private javax.swing.JLabel lblPatientAllergies;
    private javax.swing.JLabel lblPatientEmailAddress;
    private javax.swing.JLabel lblPatientFundamentals;
    private javax.swing.JLabel lblPatientGender;
    private javax.swing.JLabel lblPatientHeight;
    private javax.swing.JLabel lblPatientLoginDetails;
    private javax.swing.JLabel lblPatientName;
    private javax.swing.JLabel lblPatientPassword;
    private javax.swing.JLabel lblPatientPhoneNumber;
    private javax.swing.JLabel lblPatientUsername;
    private javax.swing.JLabel lblPatientWeight;
    private javax.swing.JLabel lblpersonalDetails;
    private javax.swing.JTextField txtPatientAge;
    private javax.swing.JTextField txtPatientAllergies;
    private javax.swing.JTextField txtPatientEmailAddress;
    private javax.swing.JTextField txtPatientGender;
    private javax.swing.JTextField txtPatientHeight;
    private javax.swing.JTextField txtPatientName;
    private javax.swing.JPasswordField txtPatientPassword;
    private javax.swing.JTextField txtPatientPhoneNumber;
    private javax.swing.JTextField txtPatientUsername;
    private javax.swing.JTextField txtPatientWeight;
    // End of variables declaration//GEN-END:variables

    private void populateHouses() {
        /*
        List<City> cities = sysAdmin.getCities();
        jComboBoxHouseCommunity.removeAllItems();
        for(City c : cities){
            for(Community community : c.getCommunityList()){
                jComboBoxHouseCommunity.addItem(community);
            }
        }
        */
        List<City> cities = sysAdmin.getCities();
        jComboBoxHouses.removeAllItems();
        for(City c : cities){
            for(Community community : c.getCommunityList()){
                for(House h : community.getHouseList()){
                    jComboBoxHouses.addItem(h);
                }
            }
        }
        
    }
}
