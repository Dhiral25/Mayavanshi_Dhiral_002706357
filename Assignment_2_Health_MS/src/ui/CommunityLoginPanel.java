/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

/**
 *
 * @author DhiralM
 */
public class CommunityLoginPanel extends javax.swing.JPanel {

    /**
     * Creates new form CommunityLoginPanel
     */
    public CommunityLoginPanel() {
        initComponents();
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
        lblCommunityAdminUsername = new javax.swing.JLabel();
        lblCommunityAdminPassword = new javax.swing.JLabel();
        txtCommunityAdminUsername = new javax.swing.JTextField();
        txtCommunityAdminPassword = new javax.swing.JTextField();
        btnCommunityAdminLogin = new javax.swing.JButton();

        jLabel1.setText("Community Login");

        lblCommunityAdminUsername.setText("Username");

        lblCommunityAdminPassword.setText("Password");

        btnCommunityAdminLogin.setText("Login");
        btnCommunityAdminLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCommunityAdminLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCommunityAdminPassword)
                            .addComponent(lblCommunityAdminUsername))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCommunityAdminUsername)
                            .addComponent(txtCommunityAdminPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(btnCommunityAdminLogin)))
                .addContainerGap(418, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel1)
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCommunityAdminUsername)
                    .addComponent(txtCommunityAdminUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCommunityAdminPassword)
                    .addComponent(txtCommunityAdminPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addComponent(btnCommunityAdminLogin)
                .addContainerGap(384, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCommunityAdminLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCommunityAdminLoginActionPerformed
        // TODO add your handling code here:
        String username = txtCommunityAdminUsername.getText();
        String password = txtCommunityAdminPassword.getText();
        if(username.equals("cadmin") && password.equals("12345")){
            
        }
    }//GEN-LAST:event_btnCommunityAdminLoginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCommunityAdminLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCommunityAdminPassword;
    private javax.swing.JLabel lblCommunityAdminUsername;
    private javax.swing.JTextField txtCommunityAdminPassword;
    private javax.swing.JTextField txtCommunityAdminUsername;
    // End of variables declaration//GEN-END:variables
}
