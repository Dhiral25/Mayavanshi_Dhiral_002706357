/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.SignUp;

import Business.Customer.Customer;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Role.CustomerRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import userinterface.Login.LoginPage;

/**
 *
 * @author shikha
 */
public class SignUp extends javax.swing.JPanel {

    /**
     * Creates new form SignUp
     */
    JPanel container;
    EcoSystem ecosystem;
    private ArrayList<Customer> customerList = new ArrayList<Customer>();
    JButton logoutJButton;
    
    public SignUp(JPanel container,  EcoSystem system, JButton logoutJButton) {
        this.container = container;
        this.ecosystem = system;
        this.logoutJButton = logoutJButton;
        for (int i = 0; i < ecosystem.getCustomerDirectory().getCustomerList().size(); i++) {
            customerList.add(ecosystem.getCustomerDirectory().getCustomerList().get(i));
        }
        initComponents();
        for (int i = 0; i < ecosystem.getcreateNetwork().getNetwork().size(); i++) {
             System.out.println(ecosystem.getcreateNetwork().getNetwork().get(i));
            jComboBox1.addItem(ecosystem.getcreateNetwork().getNetwork().get(i));
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        AddBtn1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        updateRestManagerLabel = new javax.swing.JLabel();
        nameText = new javax.swing.JTextField();
        restPwdLabel1 = new javax.swing.JLabel();
        usernameText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        restPwdText = new javax.swing.JPasswordField();
        phoneLabel = new javax.swing.JLabel();
        phoneText = new javax.swing.JTextField();
        addressLabel = new javax.swing.JLabel();
        AddressText = new javax.swing.JTextField();
        Email = new javax.swing.JLabel();
        EmailTxt = new javax.swing.JTextField();
        AddBtn = new javax.swing.JButton();
        Email1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/signup.gif"))); // NOI18N

        AddBtn1.setBackground(new java.awt.Color(204, 255, 0));
        AddBtn1.setText("Back");
        AddBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtn1ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Enter your details");

        updateRestManagerLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        updateRestManagerLabel.setForeground(new java.awt.Color(72, 72, 72));
        updateRestManagerLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        updateRestManagerLabel.setText("Name");

        nameText.setForeground(new java.awt.Color(72, 72, 72));
        nameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextActionPerformed(evt);
            }
        });

        restPwdLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        restPwdLabel1.setForeground(new java.awt.Color(72, 72, 72));
        restPwdLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        restPwdLabel1.setText("Username");

        usernameText.setForeground(new java.awt.Color(72, 72, 72));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(72, 72, 72));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText("Password");

        restPwdText.setForeground(new java.awt.Color(72, 72, 72));

        phoneLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        phoneLabel.setForeground(new java.awt.Color(72, 72, 72));
        phoneLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        phoneLabel.setText("Phone");

        phoneText.setForeground(new java.awt.Color(72, 72, 72));

        addressLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        addressLabel.setForeground(new java.awt.Color(72, 72, 72));
        addressLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        addressLabel.setText("Address");

        AddressText.setForeground(new java.awt.Color(72, 72, 72));

        Email.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Email.setForeground(new java.awt.Color(72, 72, 72));
        Email.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Email.setText("Email");

        EmailTxt.setForeground(new java.awt.Color(72, 72, 72));

        AddBtn.setBackground(new java.awt.Color(0, 83, 170));
        AddBtn.setForeground(new java.awt.Color(255, 255, 255));
        AddBtn.setText("Add");
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });

        Email1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Email1.setForeground(new java.awt.Color(72, 72, 72));
        Email1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Email1.setText("Location");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 92, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameText, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(phoneLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(updateRestManagerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(restPwdLabel1))
                            .addComponent(addressLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Email, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Email1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(EmailTxt)
                            .addComponent(AddressText)
                            .addComponent(phoneText)
                            .addComponent(restPwdText)
                            .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, 0, 151, Short.MAX_VALUE))))
                .addGap(68, 68, 68))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateRestManagerLabel)
                    .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameText, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(restPwdLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(restPwdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneLabel)
                    .addComponent(phoneText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressLabel)
                    .addComponent(AddressText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Email)
                    .addComponent(EmailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Email1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(177, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 177, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(177, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(AddBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(AddBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(1036, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextActionPerformed

    public Boolean validateFields(String username, String address, String phone, String name, char[] pwd, String email) {
        String passregex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
        Pattern pattern = Pattern.compile(passregex);
        Matcher matcher = pattern.matcher(String.valueOf(pwd));
        
        if(username.isEmpty() || phone.isEmpty() || name.isEmpty() || address.isEmpty() || email.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Fields cannot be empty","Error message", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (pwd.length < 8) {
            JOptionPane.showMessageDialog(null,"Password cannot be less than 8","Error message", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if(phone.length() != 10) {
            JOptionPane.showMessageDialog(null, "PhoneNumber must be of 10 digits","Error message", JOptionPane.ERROR_MESSAGE);
            return false;
        }else if(!phone.matches("^[0-9]+$")) {
            JOptionPane.showMessageDialog(null, "Phone Number must have digits only","Error message", JOptionPane.ERROR_MESSAGE);
            return false;
        }else if(!email.matches("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?")){
             JOptionPane.showMessageDialog(null, "Email is invalid","Error message", JOptionPane.ERROR_MESSAGE);
            return false;
        }else if(!matcher.matches()){
            JOptionPane.showMessageDialog(null, "Enter valid password with atleast on number, one lowercase letter, one uppercase letter,one special char and atleast 8 digits");
            return false;
        }
        return true;
    }
    
    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        // TODO add your handling code here:
        Boolean isValid = validateFields(usernameText.getText(), AddressText.getText(), phoneText.getText(), nameText.getText(), restPwdText.getPassword(), EmailTxt.getText());
        if (!isValid) {
            return;
        }
        for (int i = 0; i < customerList.size(); i++) {
            if("customerAdmin".equals(customerList.get(i).getAccountDetails().getRoleName()) && customerList.get(i).getAccountDetails().getUsername().equals(usernameText.getText())){
                JOptionPane.showMessageDialog(null,"Username Already Present", "Error message" ,JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        char[] ch = restPwdText.getPassword();
        String pwd = new String(ch);
        String name = (String) jComboBox1.getSelectedItem();
        Employee employee = ecosystem.getEmployeeDirectory().createEmployee(nameText.getText());
        UserAccount ua = ecosystem.getUserAccountDirectory().createUserAccount(usernameText.getText(), pwd, employee, new CustomerRole(), "customerAdmin");
        Customer cust = ecosystem.getCustomerDirectory().createCustomer(nameText.getText(), ua, phoneText.getText(), AddressText.getText(), EmailTxt.getText(), name);
        customerList.add(cust);
        JOptionPane.showMessageDialog(this, "Customer added successfully");
        CardLayout layout=(CardLayout)container.getLayout();
        LoginPage su = new LoginPage(container, ecosystem, logoutJButton);
        container.add("workArea",su);
        layout.next(container);
        nameText.setText("");
        usernameText.setText("");
        restPwdText.setText("");
        phoneText.setText("");
        AddressText.setText("");
        EmailTxt.setText("");
    }//GEN-LAST:event_AddBtnActionPerformed

    private void AddBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtn1ActionPerformed
        // TODO add your handling code here:
        CardLayout layout=(CardLayout)container.getLayout();
        LoginPage su = new LoginPage(container, ecosystem, logoutJButton);
        container.add("workArea",su);
        layout.next(container);
    }//GEN-LAST:event_AddBtn1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JButton AddBtn1;
    private javax.swing.JTextField AddressText;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel Email1;
    private javax.swing.JTextField EmailTxt;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nameText;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JTextField phoneText;
    private javax.swing.JLabel restPwdLabel1;
    private javax.swing.JPasswordField restPwdText;
    private javax.swing.JLabel updateRestManagerLabel;
    private javax.swing.JTextField usernameText;
    // End of variables declaration//GEN-END:variables
}
