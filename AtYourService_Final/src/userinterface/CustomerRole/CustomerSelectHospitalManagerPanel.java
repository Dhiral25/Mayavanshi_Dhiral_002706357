/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.CustomerRole;

import Business.Customer.Customer;
import Business.EcoSystem;

import Business.Orders.TherapistOrder;
import Business.Orders.TherapistDirectory;
import Business.HospitalManager.HospitalManager;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shikha
 */
public class CustomerSelectHospitalManagerPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    EcoSystem ecosystem;
    private UserAccount userAccount;
    HospitalManager hospitalManager;
    DefaultTableModel model;
    DefaultTableModel model1;
    private String selectedItem;
    private String selectedPrice;
    JSplitPane screen;
    Double Total = 0.0;
     
    private TherapistDirectory therapistOrderDirectory;


    /**
     * Creates new form CustomerSelectLegalPanel
     */
    public CustomerSelectHospitalManagerPanel(JPanel userProcessContainer, UserAccount account, EcoSystem system, HospitalManager hospitalManager, JSplitPane screen) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.hospitalManager = hospitalManager;
        this.screen = screen;
        ecosystem = system;
        model = new DefaultTableModel();
        model1 = new DefaultTableModel();
        LegalserviceTable.setModel(model);
        cartTable.setModel(model1);
        
        
        therapistOrderDirectory = new TherapistDirectory();
        
        model.addColumn("Service Name");
        model.addColumn("Price/hrs");
        
        model1.addColumn("Service Name");
        model1.addColumn("Date");
        model1.addColumn("Price");
        model1.addColumn("Hrs");
        model1.addColumn("Total");
        
        title.setText("Welcome to:"+ hospitalManager.getName() + " we offer best service");
        showMenuTable();
        
        jPanel2.setVisible(false);
        

    }
    
    public void showMenuTable() {
        HashMap<String, String> menu = hospitalManager.getMenu();
        if (menu.size() > 0) {
            for (Map.Entry<String, String> e : menu.entrySet()) {
                model.addRow(new Object[]{
                    e.getKey(),
                    e.getValue()
                });
            }
        }
    }
        public void showCartTable() {
        if (therapistOrderDirectory.getOrderList().size() > 0) {
            for (int i = 0; i < therapistOrderDirectory.getOrderList().size(); i++) {
                model1.addRow(new Object[]{
                    therapistOrderDirectory.getOrderList().get(i).getItem(),
                    therapistOrderDirectory.getOrderList().get(i).getDate(),
                    therapistOrderDirectory.getOrderList().get(i).getPrice(),
                    therapistOrderDirectory.getOrderList().get(i).getTime(),
                    therapistOrderDirectory.getOrderList().get(i).getTotal()
                });
            }
        }
    }
        
    public Customer findCustomer() {
        for(int i = 0; i < ecosystem.getCustomerDirectory().getCustomerList().size(); i ++) {
            if(ecosystem.getCustomerDirectory().getCustomerList().get(i).getAccountDetails().getUsername().equals(this.userAccount.getUsername())) {
                return ecosystem.getCustomerDirectory().getCustomerList().get(i);
            }
        }
        return null;
    }                           
    
        public int CheckTherpaistAvailibilty(String Date) {
            int a = 0;
           System.out.println(hospitalManager.getOrderList().size());
        if (hospitalManager.getOrderList().size() > 0) {
            for (int i = 0; i < hospitalManager.getOrderList().size(); i++) {
                 System.out.println(i);
                 System.out.println(hospitalManager.getOrderList().get(i).getDate());
                if(Date.equals(hospitalManager.getOrderList().get(i).getDate()))
                {a = a + 1;}
                
            }
        }
        return a;}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        cartTable = new javax.swing.JTable();
        Backbutton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        LegalserviceTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        itemText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        itemText1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        AddButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        BookAppointment = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 204, 204));

        title.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        title.setText("Welcome");

        cartTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(cartTable);

        Backbutton.setBackground(new java.awt.Color(204, 255, 0));
        Backbutton.setText("Back");
        Backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackbuttonActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        LegalserviceTable.setModel(new javax.swing.table.DefaultTableModel(
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
        LegalserviceTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LegalserviceTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(LegalserviceTable);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(72, 72, 72));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("Consultation Type");
        jLabel3.setAutoscrolls(true);

        itemText.setForeground(new java.awt.Color(72, 72, 72));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(72, 72, 72));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("Number of hours");
        jLabel4.setAutoscrolls(true);

        itemText1.setForeground(new java.awt.Color(72, 72, 72));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Select Date");

        AddButton.setBackground(new java.awt.Color(204, 255, 0));
        AddButton.setText("Add");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(itemText1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(itemText, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(42, 42, 42))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(itemText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(itemText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Your Quick Cart View");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Quick checkout?  Click Below");

        BookAppointment.setBackground(new java.awt.Color(204, 255, 0));
        BookAppointment.setText("Book an Appointment");
        BookAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookAppointmentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BookAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(BookAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Backbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(125, 125, 125)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(716, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Backbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(202, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void LegalserviceTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LegalserviceTableMouseClicked
        // TODO add your handling code here:
        System.out.println(model.getValueAt(LegalserviceTable.getSelectedRow(), 0) +" selected added list ");
        selectedItem = String.valueOf(model.getValueAt(LegalserviceTable.getSelectedRow(), 0));
        selectedPrice = String.valueOf(model.getValueAt(LegalserviceTable.getSelectedRow(), 1));
        itemText.setText(selectedItem);
    }//GEN-LAST:event_LegalserviceTableMouseClicked

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        // TODO add your handling code here:
         // TODO add your handling code here:
        if(jDateChooser1.getDate() == null || itemText.getText().isEmpty() || itemText1.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Kindly select service and select dates");
            jDateChooser1.setDate(null);
            return;
        }else if(jDateChooser1.getDate().before(new Date()))
                {JOptionPane.showMessageDialog(this, "Kindly select date after today's date");
                jDateChooser1.setDate(null);
                return;}
         Date date = jDateChooser1.getDate();
         SimpleDateFormat format1 = new SimpleDateFormat("MM-dd-yyyy");
         String time = itemText1.getText();
         double total = Integer.parseInt(time) * Integer.parseInt(selectedPrice);
         String date1 = format1.format(date);
         System.out.println(date1);
         
         int a = CheckTherpaistAvailibilty(date1);
         
         String mes = "We are Sorry, " + hospitalManager.getName() +" is not Available on this date!" ;
         
         if(a > 0){JOptionPane.showMessageDialog(this, mes);
         itemText.setText("");
        jDateChooser1.setDate(null);
        itemText1.setText("");
         return ;}
        
        therapistOrderDirectory.createOrder(selectedItem, selectedPrice, date1,String.valueOf(total), time, hospitalManager, userAccount);
        model1.addRow(new Object[]{
            selectedItem,
            date1,
            selectedPrice,
            time,
            String.valueOf(total)
        });
        itemText.setText("");
        jDateChooser1.setDate(null);
        itemText1.setText("");
        JOptionPane.showMessageDialog(this, "Item added to cart");
        jPanel2.setVisible(true);

    }//GEN-LAST:event_AddButtonActionPerformed

    private void BackbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackbuttonActionPerformed
        // TODO add your handling code here:
        CustomerOrderTherapistPanel dm= new CustomerOrderTherapistPanel(userProcessContainer, userAccount, ecosystem, screen);
//        userProcessContainer.add("manageNetworkJPanel",dm);
//        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
//        layout.next(userProcessContainer);
           screen.setRightComponent(dm);
    }//GEN-LAST:event_BackbuttonActionPerformed
 
    public void setOrderListLegal(Customer cust) {
         for(int i = 0; i <  therapistOrderDirectory.getOrderList().size(); i ++) {
               hospitalManager.getOrderList().add(therapistOrderDirectory.getOrderList().get(i));
               cust.gettherapistorderList().add(therapistOrderDirectory.getOrderList().get(i));

        }
//        legal.getOrders().put(String.valueOf(legal.getOrders().size()), legalOrderDirectory.getOrderList());
        hospitalManager.getOrders().put(String.valueOf(hospitalManager.getOrders().size()), therapistOrderDirectory.getOrderList());
        cust.getTherapistorderDirectoryList().add(therapistOrderDirectory);
        hospitalManager.getOrderDirectoryList().add(therapistOrderDirectory);
    }
    private void BookAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookAppointmentActionPerformed
        Customer cust = findCustomer();
        
          System.out.println(model1.getRowCount());
          if(model1.getRowCount() > 0){
              if("Credit".equals(cust.getCardType())){
            
         setOrderListLegal(cust);
         for(int i = 0; i < therapistOrderDirectory.getOrderList().size(); i ++) {
            Total+= (Double.parseDouble(therapistOrderDirectory.getOrderList().get(i).getTotal()));
        }
        CustomerPaymentPanels mm = new CustomerPaymentPanels(screen, cust, Total, "We have received your order. We will update as soon as you have appointment is scheduled.");
        screen.setRightComponent(mm);
        }else {JOptionPane.showMessageDialog(this, "Sorry Cannot place Direct Order, Add A Credit Card");}

               
          }else{
              JOptionPane.showMessageDialog(this, "Placed select service from the table and add in cart", "Error message", JOptionPane.ERROR_MESSAGE);
          }
    }//GEN-LAST:event_BookAppointmentActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton Backbutton;
    private javax.swing.JButton BookAppointment;
    private javax.swing.JTable LegalserviceTable;
    private javax.swing.JTable cartTable;
    private javax.swing.JTextField itemText;
    private javax.swing.JTextField itemText1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
