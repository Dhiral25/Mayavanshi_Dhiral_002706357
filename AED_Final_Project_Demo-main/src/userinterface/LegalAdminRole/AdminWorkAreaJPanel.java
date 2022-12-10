/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.LegalAdminRole;

import Business.EcoSystem;
import Business.Grocery.Grocery;
import Business.Legal.Legal;    
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import userinterface.GroceryAdminRole.ManageGroceryInventoryPanel;

/**
 *
 * @author DhiralM
 */
public class AdminWorkAreaJPanel extends javax.swing.JPanel {
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    DefaultTableModel model;
    UserAccount ua;
    Legal legal;

    /**
     * Creates new form AdminWorkAreaJPanel
     */
    public AdminWorkAreaJPanel(JPanel userProcessContainer, UserAccount ua, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ua = ua;
        ecosystem = system;
        legal = findManageGrocery();
        jLabel1.setText("Admin Work Area: "+legal.getName());
    }
    
   public Legal findManageGrocery() {
        for(int i = 0; i < ecosystem.getLegalDirectory().getLegalList().size(); i++) {
            if(ecosystem.getLegalDirectory().getLegalList().get(i).getAccountDetails().getUsername().equals(this.ua.getUsername())){
                System.out.println(ecosystem.getLegalDirectory().getLegalList().get(i));
                return ecosystem.getLegalDirectory().getLegalList().get(i);
            }
        }
        return null;
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ManageServicesButton = new javax.swing.JButton();
        ManageOrdersButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        updatestorepanel = new javax.swing.JPanel();
        nameText = new javax.swing.JTextField();
        phoneText = new javax.swing.JTextField();
        phoneLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        updateButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ManageServicesButton.setBackground(new java.awt.Color(0, 83, 170));
        ManageServicesButton.setForeground(new java.awt.Color(255, 255, 255));
        ManageServicesButton.setText("Manage Services");
        ManageServicesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageServicesButtonActionPerformed(evt);
            }
        });
        add(ManageServicesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 151, 139, 49));

        ManageOrdersButton.setBackground(new java.awt.Color(0, 83, 170));
        ManageOrdersButton.setForeground(new java.awt.Color(255, 255, 255));
        ManageOrdersButton.setText("Manage Orders");
        ManageOrdersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageOrdersButtonActionPerformed(evt);
            }
        });
        add(ManageOrdersButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(441, 151, 143, 49));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Admin Work Area: ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 15, 560, 40));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("Welcome:");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 60, 120, 30));

        updatestorepanel.setBackground(new java.awt.Color(204, 255, 255));

        nameText.setForeground(new java.awt.Color(72, 72, 72));

        phoneText.setForeground(new java.awt.Color(72, 72, 72));

        phoneLabel.setForeground(new java.awt.Color(72, 72, 72));
        phoneLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        phoneLabel.setText("Phone");

        nameLabel.setForeground(new java.awt.Color(72, 72, 72));
        nameLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        nameLabel.setText("Company Name");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Update Legal Information");

        updateButton.setBackground(new java.awt.Color(0, 0, 0));
        updateButton.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        updateButton.setForeground(new java.awt.Color(255, 255, 255));
        updateButton.setText("Update");
        updateButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout updatestorepanelLayout = new javax.swing.GroupLayout(updatestorepanel);
        updatestorepanel.setLayout(updatestorepanelLayout);
        updatestorepanelLayout.setHorizontalGroup(
            updatestorepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updatestorepanelLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(updatestorepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nameLabel)
                    .addComponent(phoneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(updatestorepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneText, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updatestorepanelLayout.createSequentialGroup()
                .addGap(0, 61, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updatestorepanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(166, 166, 166))
        );
        updatestorepanelLayout.setVerticalGroup(
            updatestorepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updatestorepanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(updatestorepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(updatestorepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneLabel)
                    .addComponent(phoneText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        add(updatestorepanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Scale-4-1.gif"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1510, 820));
    }// </editor-fold>//GEN-END:initComponents

    private void ManageServicesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageServicesButtonActionPerformed
        // TODO add your handling code here:
        ManageLegalServicesPanel mm = new ManageLegalServicesPanel(userProcessContainer, ecosystem, legal, ua);
        userProcessContainer.add("manageNetworkJPanel",mm);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_ManageServicesButtonActionPerformed

    private void ManageOrdersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageOrdersButtonActionPerformed
        // TODO add your handling code here:
         ManageLegalOrdersPanel mm = new ManageLegalOrdersPanel(userProcessContainer, ecosystem, legal, ua);
        userProcessContainer.add("manageNetworkJPanel",mm);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_ManageOrdersButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:

        if(phoneText.getText().isEmpty() || nameText.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null,"Fields cannot be empty");
            return;
        }else if(phoneText.getText().length() != 10) {
            JOptionPane.showMessageDialog(null, "PhoneNumber must be of 10 digits");
            return;
        }else if(!phoneText.getText().matches("^[0-9]+$")) {
            JOptionPane.showMessageDialog(null, "Phone Number must have digits only");
            return;
        } else {
            legal.setName(nameText.getText());
            legal.setPhone(phoneText.getText());
            JOptionPane.showMessageDialog(null, "Comapany details updated successfully");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_updateButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ManageOrdersButton;
    private javax.swing.JButton ManageServicesButton;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameText;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JTextField phoneText;
    private javax.swing.JButton updateButton;
    private javax.swing.JPanel updatestorepanel;
    // End of variables declaration//GEN-END:variables
}
