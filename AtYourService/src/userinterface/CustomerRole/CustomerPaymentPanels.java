/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.CustomerRole;

import Business.Customer.Customer;
import Business.Customer.SendMail;
import javax.swing.JOptionPane;
import javax.swing.JSplitPane;

/**
 *
 * @author DhiralM
 */
public class CustomerPaymentPanels extends javax.swing.JPanel {

    /**
     * Creates new form CustomerPaymentPanels
     */
    Double Total;
    JSplitPane screen;
    Customer cust;
    String message;
    public CustomerPaymentPanels(JSplitPane screen, Customer cust, Double Total, String message) {
        this.Total = Total;
        this.screen = screen;
        this.cust = cust;
        this.message = message;
        initComponents();
        jLabel2.setText(String.valueOf(Total));
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
        jLabel2 = new javax.swing.JLabel();
        FeedbackBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("Total Amount : $");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 280, 32));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 74, 220, 30));

        FeedbackBtn.setBackground(new java.awt.Color(204, 255, 0));
        FeedbackBtn.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        FeedbackBtn.setText("Pay");
        FeedbackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FeedbackBtnActionPerformed(evt);
            }
        });
        add(FeedbackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 130, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mobile_payment.gif"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 670, 500));
    }// </editor-fold>//GEN-END:initComponents

    private void FeedbackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FeedbackBtnActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Payment Done, We have Sent you your Reciept");
        CustomerStaticRight adminPanel = new CustomerStaticRight();
        screen.setRightComponent(adminPanel);
        SendMail sm = new SendMail(cust.getEmail(),"Order Confirmation","Your Order has been Confirmed with Us. \n Your oder of" + Total + " is in our bank accounts");
    }//GEN-LAST:event_FeedbackBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton FeedbackBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
