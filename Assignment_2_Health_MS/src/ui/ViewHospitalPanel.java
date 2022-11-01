/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.City;
import model.Community;
import model.Hospital;
import model.HospitalDirectory;
import model.SystemAdmin;

/**
 *
 * @author DhiralM
 */
public class ViewHospitalPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewHospitalPanel
     */
    SystemAdmin sysAdmin;
    public ViewHospitalPanel(SystemAdmin sysAdmin) {
        initComponents();
        this.sysAdmin = sysAdmin;
        populateCommunities();
        populateTable();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHospitals = new javax.swing.JTable();
        btnViewHospital = new javax.swing.JButton();
        btnUpdateHospital = new javax.swing.JButton();
        jComboBoxHospitalCommunity = new javax.swing.JComboBox<>();
        btnSaveHospital = new javax.swing.JButton();
        lblHospitalName = new javax.swing.JLabel();
        lblHospitalphoneNumber = new javax.swing.JLabel();
        lblHospitalCommunity = new javax.swing.JLabel();
        txtHospitalName = new javax.swing.JTextField();
        txtHospitalPhone = new javax.swing.JTextField();
        lblHospitalId = new javax.swing.JLabel();
        txtHospitalId = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel1.setText("View Hospitals List");

        tblHospitals.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Hospital Id", "Hospital Name", "Hospital Phone", "Hospital Community"
            }
        ));
        jScrollPane1.setViewportView(tblHospitals);

        btnViewHospital.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnViewHospital.setText("View Hospital");
        btnViewHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewHospitalActionPerformed(evt);
            }
        });

        btnUpdateHospital.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnUpdateHospital.setText("Update Hospital");
        btnUpdateHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateHospitalActionPerformed(evt);
            }
        });

        btnSaveHospital.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnSaveHospital.setText("Save Hospital");
        btnSaveHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveHospitalActionPerformed(evt);
            }
        });

        lblHospitalName.setText("Hospital Name");

        lblHospitalphoneNumber.setText("Hospital Phone Number");

        lblHospitalCommunity.setText("Hospital Community");

        lblHospitalId.setText("Hospital Id");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(376, 376, 376)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(68, 68, 68)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 771, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(109, 109, 109)
                                            .addComponent(lblHospitalId))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addContainerGap()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblHospitalName, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(lblHospitalphoneNumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lblHospitalCommunity, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGap(34, 34, 34)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtHospitalName, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtHospitalId, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtHospitalPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBoxHospitalCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(128, 128, 128)
                                    .addComponent(btnSaveHospital)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnViewHospital, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnUpdateHospital, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(113, 113, 113))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btnUpdateHospital)
                        .addGap(31, 31, 31)
                        .addComponent(btnViewHospital))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHospitalId)
                            .addComponent(txtHospitalId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHospitalName)
                            .addComponent(txtHospitalName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHospitalphoneNumber)
                            .addComponent(txtHospitalPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHospitalCommunity)
                            .addComponent(jComboBoxHospitalCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(btnSaveHospital)
                .addContainerGap(121, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveHospitalActionPerformed
        // TODO add your handling code here:

        
        Community c = (Community) jComboBoxHospitalCommunity.getSelectedItem();
        if(c==null || txtHospitalName.getText().length()==0 || txtHospitalPhone.getText().length()==0){
            JOptionPane.showMessageDialog(this, "Enter All fields");
            return;
        }
        Hospital h = sysAdmin.getHospitalDirectory().getHospital(txtHospitalId.getText());
        h.setHospitalName(String.valueOf(txtHospitalName.getText()));
        h.setPhoneNumber(String.valueOf(txtHospitalPhone.getText()));
        
        JOptionPane.showMessageDialog(this, "Hospital Info Updated");
        
        txtHospitalId.setText("");
        txtHospitalName.setText("");
        txtHospitalPhone.setText("");
        jComboBoxHospitalCommunity.setSelectedItem(null);
        populateTable();
        

    }//GEN-LAST:event_btnSaveHospitalActionPerformed

    private void btnViewHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewHospitalActionPerformed
        // TODO add your handling code here:
        /*
        int selectedrowIndex = tblCommunities.getSelectedRow();
        if(selectedrowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select row to view the details");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblCommunities.getModel();
        Community c = (Community) model.getValueAt(selectedrowIndex, 1);
        txtCommunityId.setText(String.valueOf(c.getCommunityId()));
        txtCommunityId.setEditable(false);
        txtCommunityName.setText(String.valueOf(c.getCommunityName()));
        txtCommunityName.setEditable(false);
        jComboBoxCities.setSelectedItem(c.getCity());
        jComboBoxCities.setEditable(false);
        */
        int selectedrowIndex = tblHospitals.getSelectedRow();
        if(selectedrowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select row to view the details");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblHospitals.getModel();
        Hospital h = (Hospital) model.getValueAt(selectedrowIndex, 1);
        txtHospitalId.setText(String.valueOf(h.getHospitalId()));
        txtHospitalId.setEditable(false);
        txtHospitalName.setText(String.valueOf(h.getHospitalName()));
        txtHospitalName.setEditable(false);
        txtHospitalPhone.setText(String.valueOf(h.getPhoneNumber()));
        txtHospitalPhone.setEditable(false);
        jComboBoxHospitalCommunity.setSelectedItem(h.getCommunity());
        jComboBoxHospitalCommunity.setEditable(false);
        
        
    }//GEN-LAST:event_btnViewHospitalActionPerformed

    private void btnUpdateHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateHospitalActionPerformed
        // TODO add your handling code here:
        int selectedrowIndex = tblHospitals.getSelectedRow();
        if(selectedrowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select row to view the details");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblHospitals.getModel();
        Hospital h = (Hospital) model.getValueAt(selectedrowIndex, 1);
        txtHospitalId.setText(String.valueOf(h.getHospitalId()));
        txtHospitalId.setEditable(false);
        txtHospitalName.setText(String.valueOf(h.getHospitalName()));
        txtHospitalName.setEditable(true);
        txtHospitalPhone.setText(String.valueOf(h.getPhoneNumber()));
        txtHospitalPhone.setEditable(true);
        jComboBoxHospitalCommunity.setSelectedItem(h.getCommunity());
        jComboBoxHospitalCommunity.setEditable(false);
    }//GEN-LAST:event_btnUpdateHospitalActionPerformed

    private void populateCommunities() {
        List<City> cities = sysAdmin.getCities();
        jComboBoxHospitalCommunity.removeAllItems();
        for(City c : cities){
            for(Community community : c.getCommunityList()){
                jComboBoxHospitalCommunity.addItem(community);
            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSaveHospital;
    private javax.swing.JButton btnUpdateHospital;
    private javax.swing.JButton btnViewHospital;
    private javax.swing.JComboBox<Object> jComboBoxHospitalCommunity;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHospitalCommunity;
    private javax.swing.JLabel lblHospitalId;
    private javax.swing.JLabel lblHospitalName;
    private javax.swing.JLabel lblHospitalphoneNumber;
    private javax.swing.JTable tblHospitals;
    private javax.swing.JTextField txtHospitalId;
    private javax.swing.JTextField txtHospitalName;
    private javax.swing.JTextField txtHospitalPhone;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        
        DefaultTableModel model = (DefaultTableModel) tblHospitals.getModel();
        model.setRowCount(0);
        HospitalDirectory h = sysAdmin.getHospitalDirectory();
        List<Hospital> hospitals = h.getHospitalDirectory();
        for(Hospital ho : hospitals){
            Object[] row = new Object[4];
            row[0] = ho.getHospitalId();
            row[1] = ho;
            row[2] = ho.getPhoneNumber();
            row[3] = ho.getCommunity();
            model.addRow(row);
        }
    }
}
