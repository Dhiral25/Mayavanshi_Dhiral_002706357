/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.util.List;
import javax.swing.JOptionPane;
import model.City;
import model.Community;
import model.House;
import model.SystemAdmin;

/**
 *
 * @author DhiralM
 */
public class CreateHousePanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateHousePanel
     */
    SystemAdmin sysAdmin;
    public CreateHousePanel(SystemAdmin sysAdmin) {
        initComponents();
        this.sysAdmin = sysAdmin;
        populateCommunities();
        
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
        lblHouseStreetAddress = new javax.swing.JLabel();
        txtHouseStreetAddress = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtHousePinCode = new javax.swing.JTextField();
        jComboBoxHouseCommunity = new javax.swing.JComboBox<>();
        lblHouseCommunity = new javax.swing.JLabel();
        btnSaveHouse = new javax.swing.JButton();

        jLabel1.setText("Create House");

        lblHouseStreetAddress.setText("Street Address");

        jLabel2.setText("Pin Code");

        lblHouseCommunity.setText("Community");

        btnSaveHouse.setText("Save House");
        btnSaveHouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveHouseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(328, 328, 328)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblHouseStreetAddress)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblHouseCommunity)
                                .addComponent(jLabel2)))
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxHouseCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtHouseStreetAddress)
                                .addComponent(txtHousePinCode, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addComponent(btnSaveHouse)))
                .addContainerGap(380, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel1)
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblHouseStreetAddress)
                    .addComponent(txtHouseStreetAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(txtHousePinCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxHouseCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHouseCommunity))
                .addGap(73, 73, 73)
                .addComponent(btnSaveHouse)
                .addContainerGap(293, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveHouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveHouseActionPerformed
        // TODO add your handling code here:
        /*
        if(jComboBoxCities.getSelectedItem()==null){
            JOptionPane.showMessageDialog(this, "Select City");
            return;
        }
        City c = (City)jComboBoxCities.getSelectedItem();
        Community community = c.addCommunity();
        
        String communityName = txtCommunityName.getText();
        if(communityName.length()==0){
            JOptionPane.showMessageDialog(this, "Enter Community Name");
            return;
        }
        String cid =  String.valueOf(c.getCommunityList().size() + Integer.parseInt("1000"));
        community.setCommunityId(cid);
        community.setCity(c);
        community.setCommunityName(communityName);
        
        txtCommunityName.setText("");
        
        JOptionPane.showMessageDialog(this, "Community Info Saved"); 
        */
        if(jComboBoxHouseCommunity.getSelectedItem()==null){
            JOptionPane.showMessageDialog(this, "Select Community");
            return;
        }
        Community community = (Community)jComboBoxHouseCommunity.getSelectedItem();
        House h = community.addHouse();
        String streetAddress = txtHouseStreetAddress.getText();
        String pinCode = txtHousePinCode.getText();
        if(streetAddress.length()==0 || pinCode.length()==0){
            JOptionPane.showMessageDialog(this, "Enter All fields");
            return;
        }
        String houseId = String.valueOf(community.getHouseList().size() + Integer.parseInt("10000"));
        h.setHouseId(houseId);
        h.setStreetAddress(streetAddress);
        h.setPinCode(pinCode);
        h.setCommunity(community);
        
        txtHouseStreetAddress.setText("");
        txtHousePinCode.setText("");
        jComboBoxHouseCommunity.setSelectedItem(null);
        
        JOptionPane.showMessageDialog(this, "House Info Saved"); 
        
        
    }//GEN-LAST:event_btnSaveHouseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSaveHouse;
    private javax.swing.JComboBox<Object> jComboBoxHouseCommunity;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblHouseCommunity;
    private javax.swing.JLabel lblHouseStreetAddress;
    private javax.swing.JTextField txtHousePinCode;
    private javax.swing.JTextField txtHouseStreetAddress;
    // End of variables declaration//GEN-END:variables

    private void populateCommunities() {
        
        List<City> cities = sysAdmin.getCities();
        jComboBoxHouseCommunity.removeAllItems();
        for(City c : cities){
            for(Community community : c.getCommunityList()){
                jComboBoxHouseCommunity.addItem(community);
            }
        }
        
    }
}
