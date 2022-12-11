/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.CustomerRole;

import Business.Customer.Customer;
import Business.EcoSystem;

import Business.Legal.Legal;
import Business.Orders.OrderDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JSplitPane;

/**
 *
 * @author DhiralM
 */
public class CustomerOrderLegalPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    EcoSystem ecosystem;
    private UserAccount userAccount;
    DefaultTableModel model;
    DefaultTableModel model1;
    Customer cust;
    JSplitPane screen;

    /**
     * Creates new form CustomerSelectLegalPanel
     */
    public CustomerOrderLegalPanel(JPanel userProcessContainer, UserAccount account, EcoSystem system, JSplitPane screen) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        ecosystem = system;
        this.screen = screen;
        cust = findCustomer();
        model = new DefaultTableModel();
        model1 = new DefaultTableModel();
        legaltable.setModel(model);
        pastorderstable.setModel(model1);
        model.addColumn("Legal Company Name");
        model.addColumn("Location");
        model.addColumn("Phone");
        
        model1.addColumn("Id");
        model1.addColumn("Status");
        model1.addColumn("Legal Company Name");
        
        populateRequestTable();
        populateCustomerOrders();
        
        ImageIcon icon6 =  new ImageIcon("./src/images/Standalone_birdie.png");
        Image image6 = icon6.getImage().getScaledInstance(394, 350, Image.SCALE_SMOOTH);
        jLabel4.setIcon(new ImageIcon(image6));
        
        
        
        
    }
    
     public void populateCustomerOrders() {
        for (int i = model1.getRowCount() - 1; i >= 0; i--) {
            model1.removeRow(i);
        }
        for (int i = 0; i < cust.getLegalorderDirectoryList().size();i++) {
            model1.addRow(new Object[]{
                i+1,
                cust.getLegalorderDirectoryList().get(i).getStatus(),
                cust.getLegalorderDirectoryList().get(i).getLegal().getName()
            });
        }

    }
     public Customer findCustomer() {
        for (int i = 0; i < ecosystem.getCustomerDirectory().getCustomerList().size(); i++) {
            if (ecosystem.getCustomerDirectory().getCustomerList().get(i).getAccountDetails().getUsername().equals(this.userAccount.getUsername())) {
                return ecosystem.getCustomerDirectory().getCustomerList().get(i);
            }
        }
        return null;
    }
    
   public void populateRequestTable() {
        for (int i = 0; i < ecosystem.getLegalDirectory().getLegalList().size(); i++) {
            if(ecosystem.getLegalDirectory().getLegalList().get(i).getNetwork().equals(cust.getNetwork())){
             model.addRow(new Object[]{
                ecosystem.getLegalDirectory().getLegalList().get(i).getName(),
                ecosystem.getLegalDirectory().getLegalList().get(i).getAddress(),
                ecosystem.getLegalDirectory().getLegalList().get(i).getPhone(),});
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        pastorderstable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        legaltable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        pastorderstable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        pastorderstable.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        pastorderstable.setModel(new javax.swing.table.DefaultTableModel(
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
        pastorderstable.setGridColor(new java.awt.Color(0, 0, 0));
        pastorderstable.setRowHeight(25);
        pastorderstable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pastorderstableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(pastorderstable);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Your Past Orders with us!");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(144, 144, 144))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(658, 19, -1, -1));

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton2.setBackground(new java.awt.Color(204, 255, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jButton2.setText("Select");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        legaltable.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        legaltable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        legaltable.setRowHeight(25);
        jScrollPane1.setViewportView(legaltable);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Select one of your choice");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 19, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("<html><h2>Hey!!! It's your Birdie here! <br>\nIf you don't find your preferred agency up there email us at <b>addservice@helpinghand.com</b>");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, -1, -1));
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 440, 340));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/helpinghand.gif"))); // NOI18N
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 440, 300, 270));
    }// </editor-fold>//GEN-END:initComponents

    private void pastorderstableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pastorderstableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_pastorderstableMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        System.out.println(legaltable.getSelectedRow() + " row ");
        if (legaltable.getSelectedRow() >= 0) {
            CustomerSelectLegalPanel mm = new CustomerSelectLegalPanel(userProcessContainer, this.userAccount, ecosystem,  ecosystem.getLegalDirectory().getLegalList().get(legaltable.getSelectedRow()), screen);
            //            userProcessContainer.add("manageNetworkJPanel", mm);
            //            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            //            layout.next(userProcessContainer);
            screen.setRightComponent(mm);
            System.out.println("Legal Service Selected");
        } else {
            JOptionPane.showMessageDialog(this, "Please select a Legal Service");
        }

    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable legaltable;
    private javax.swing.JTable pastorderstable;
    // End of variables declaration//GEN-END:variables
}
