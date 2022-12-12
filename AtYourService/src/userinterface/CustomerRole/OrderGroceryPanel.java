/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.CustomerRole;

import Business.Customer.Customer;
import Business.EcoSystem;
import Business.Orders.OrderDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shikha
 */
public class OrderGroceryPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    EcoSystem ecosystem;
    DefaultTableModel model1;
    private UserAccount userAccount;
    private OrderDirectory orderDirectory;
    DefaultTableModel model;
    Customer cust;
    JSplitPane screen;

    /**
     * Creates new form OrderGroceryPanel
     */
    public OrderGroceryPanel(JPanel userProcessContainer, UserAccount account,EcoSystem system, JSplitPane screen) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.screen = screen;
        ecosystem = system;
        model = new DefaultTableModel();
        model1 = new DefaultTableModel();
        restListTable.setModel(model);
        orderDirectory = new OrderDirectory();
        cartTable.setModel(model1);
        cust = findCustomer();
        model.addColumn("Grocery Store Name");
        model.addColumn("Location");
        model.addColumn("Phone");
        model1.addColumn("Id");
        model1.addColumn("Status");
        model1.addColumn("Grocery store Name");
        
        populateRequestTable();
        populateCustomerOrders();
        
        ImageIcon icon6 =  new ImageIcon("./src/images/Standalone_birdie.png");
        Image image6 = icon6.getImage().getScaledInstance(210, 190, Image.SCALE_SMOOTH);
        jLabel1.setIcon(new ImageIcon(image6));
        
        ImageIcon icon7 =  new ImageIcon("./src/images/customer_panel_grocery.png");
        Image image7 = icon7.getImage().getScaledInstance(394, 350, Image.SCALE_SMOOTH);
        jLabel4.setIcon(new ImageIcon(image7));
        
        

    }
   public Customer findCustomer() {
        for (int i = 0; i < ecosystem.getCustomerDirectory().getCustomerList().size(); i++) {
            if (ecosystem.getCustomerDirectory().getCustomerList().get(i).getAccountDetails().getUsername().equals(this.userAccount.getUsername())) {
                return ecosystem.getCustomerDirectory().getCustomerList().get(i);
            }
        }
        return null;
    }
 
   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        restListTable = new javax.swing.JTable();
        enterpriseLabel = new javax.swing.JLabel();
        showMenuButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        cartTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        restListTable.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        restListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Message", "Receiver", "Status", "Result"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        restListTable.setGridColor(new java.awt.Color(0, 0, 0));
        restListTable.setRowHeight(25);
        jScrollPane1.setViewportView(restListTable);

        enterpriseLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        enterpriseLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        enterpriseLabel.setText("Grocery Store List");
        enterpriseLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        showMenuButton.setBackground(new java.awt.Color(204, 255, 0));
        showMenuButton.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        showMenuButton.setText("Show Menu");
        showMenuButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        showMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showMenuButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(showMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(showMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 35, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("View Orders");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cartTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        cartTable.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cartTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Message", "Receiver", "Status", "Result"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        cartTable.setGridColor(new java.awt.Color(0, 0, 0));
        cartTable.setRowHeight(25);
        cartTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cartTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(cartTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(143, 143, 143))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(592, 35, -1, 305));
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 440, 340));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 460, 210, 191));
    }// </editor-fold>//GEN-END:initComponents

    private void showMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showMenuButtonActionPerformed
        System.out.println(restListTable.getSelectedRow() + " row ");
        if (restListTable.getSelectedRow() >= 0) {
            CustomerSelectGrocery mm = new CustomerSelectGrocery(userProcessContainer, this.userAccount, ecosystem, ecosystem.getGroceryDirectory().getGroceryList().get(restListTable.getSelectedRow()), screen);
//            userProcessContainer.add("manageNetworkJPanel", mm);
//            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//            layout.next(userProcessContainer);
            screen.setRightComponent(mm);
        } else {
            JOptionPane.showMessageDialog(this, "Please select a Store");
        }
       
    }//GEN-LAST:event_showMenuButtonActionPerformed

    private void cartTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartTableMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_cartTableMouseClicked
    public void populateCustomerOrders() {
        for (int i = model1.getRowCount() - 1; i >= 0; i--) {
            model1.removeRow(i);
        }
        for (int i = 0; i < cust.getOrderDirectoryList().size(); i++) {
//                    System.out.println(cust.getOrderDirectoryList().get(i).getD);
            model1.addRow(new Object[]{
                i+1,
                cust.getOrderDirectoryList().get(i).getStatus(),
                cust.getOrderDirectoryList().get(i).getRestaurant().getName()
            });
        }

    }

    public void populateRequestTable() {
        for (int i = 0; i < ecosystem.getGroceryDirectory().getGroceryList().size(); i++) {
            model.addRow(new Object[]{
                ecosystem.getGroceryDirectory().getGroceryList().get(i).getName(),
                ecosystem.getGroceryDirectory().getGroceryList().get(i).getLocation(),
                ecosystem.getGroceryDirectory().getGroceryList().get(i).getPhone(),});
        }
    }
    
        public void populateCustomerCart() {
        Customer cust = findCustomer();
        System.out.println(cust.getName() + " name " + cust.getOrderList().size() + " size ");
        for (int i = model1.getRowCount() - 1; i >= 0; i--) {
            model1.removeRow(i);
        }
        if (cust.getOrderList().size() > 0) {
            for (int i = 0; i < cust.getOrderList().size(); i++) {
                model1.addRow(new Object[]{
                    cust.getOrderList().get(i).getItem(),
                    cust.getOrderList().get(i).getPrice(),
                    cust.getOrderList().get(i).getQuantity(),});
            }
        }
    }
  public void setCustomerStatus(String status) {
        Customer cust = findCustomer();
            for (int i = 0; i < cust.getOrderDirectoryList().size(); i++) {
                if (cust.getOrderDirectoryList().get(i).getId() == (orderDirectory.getId())) {
                    cust.getOrderDirectoryList().get(i).setFeedbackComment(status);
                }
            }
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable cartTable;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable restListTable;
    private javax.swing.JButton showMenuButton;
    // End of variables declaration//GEN-END:variables
}
