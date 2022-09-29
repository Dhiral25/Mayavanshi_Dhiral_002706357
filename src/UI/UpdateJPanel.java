/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

/**
 *
 * @author DhiralM
 */
public class UpdateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form UpdateJPanel
     */
    public UpdateJPanel() {
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

        jTitle = new javax.swing.JLabel();
        JEmpteaminfo = new javax.swing.JLabel();
        jtxtgender = new javax.swing.JTextField();
        JEmpPosTitle = new javax.swing.JLabel();
        jtxtstartdate = new javax.swing.JTextField();
        JEmpID = new javax.swing.JLabel();
        JEmpPhNo = new javax.swing.JLabel();
        jtxtlevel = new javax.swing.JTextField();
        JEmpEmail = new javax.swing.JLabel();
        jtxtlteaminfo = new javax.swing.JTextField();
        JEmpPhoto = new javax.swing.JLabel();
        jtxtlpostitle = new javax.swing.JTextField();
        jtxtphno = new javax.swing.JTextField();
        JEmpName2 = new javax.swing.JLabel();
        jtxtphno1 = new javax.swing.JTextField();
        JEmpAge = new javax.swing.JLabel();
        JEmpGender = new javax.swing.JLabel();
        jtxtname = new javax.swing.JTextField();
        JEmpStartdate = new javax.swing.JLabel();
        jtxtempid = new javax.swing.JTextField();
        JEmpLevel = new javax.swing.JLabel();
        jtxtempage = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTxtpic = new javax.swing.JTextPane();

        jTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTitle.setText("Employee Data");

        JEmpteaminfo.setText("Employee's TeamInfo");

        jtxtgender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtgenderActionPerformed(evt);
            }
        });

        JEmpPosTitle.setText("Employee's PositionTitle");

        jtxtstartdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtstartdateActionPerformed(evt);
            }
        });

        JEmpID.setText("Employee ID");

        JEmpPhNo.setText("Employee's Phone No.");

        jtxtlevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtlevelActionPerformed(evt);
            }
        });

        JEmpEmail.setText("Employee's Email");

        jtxtlteaminfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtlteaminfoActionPerformed(evt);
            }
        });

        JEmpPhoto.setText("Employee's Picture");

        jtxtlpostitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtlpostitleActionPerformed(evt);
            }
        });

        jtxtphno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtphnoActionPerformed(evt);
            }
        });

        JEmpName2.setText("Employee Name");

        jtxtphno1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtphno1ActionPerformed(evt);
            }
        });

        JEmpAge.setText("Employee's Age");

        JEmpGender.setText("Employee's Gender");

        JEmpStartdate.setText("Employee's StartDate");

        JEmpLevel.setText("Employee's Level");

        jScrollPane2.setViewportView(jTxtpic);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JEmpPosTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtxtlpostitle, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JEmpteaminfo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtxtlteaminfo, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JEmpLevel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtxtlevel, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JEmpStartdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtxtstartdate, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(JEmpGender)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtxtgender, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JEmpAge)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtxtempage, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JEmpID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtxtempid, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JEmpName2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addComponent(jtxtname, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JEmpPhNo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtxtphno, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JEmpEmail)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(JEmpPhoto)
                                .addGap(84, 84, 84)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtxtphno1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JEmpName2)
                    .addComponent(jtxtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JEmpID)
                    .addComponent(jtxtempid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JEmpAge)
                    .addComponent(jtxtempage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JEmpGender)
                    .addComponent(jtxtgender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JEmpStartdate)
                    .addComponent(jtxtstartdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JEmpLevel)
                    .addComponent(jtxtlevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JEmpteaminfo)
                    .addComponent(jtxtlteaminfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JEmpPosTitle)
                    .addComponent(jtxtlpostitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JEmpPhNo)
                    .addComponent(jtxtphno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JEmpEmail)
                    .addComponent(jtxtphno1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JEmpPhoto)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtgenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtgenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtgenderActionPerformed

    private void jtxtstartdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtstartdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtstartdateActionPerformed

    private void jtxtlevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtlevelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtlevelActionPerformed

    private void jtxtlteaminfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtlteaminfoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtlteaminfoActionPerformed

    private void jtxtlpostitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtlpostitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtlpostitleActionPerformed

    private void jtxtphnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtphnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtphnoActionPerformed

    private void jtxtphno1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtphno1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtphno1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JEmpAge;
    private javax.swing.JLabel JEmpEmail;
    private javax.swing.JLabel JEmpGender;
    private javax.swing.JLabel JEmpID;
    private javax.swing.JLabel JEmpLevel;
    private javax.swing.JLabel JEmpName2;
    private javax.swing.JLabel JEmpPhNo;
    private javax.swing.JLabel JEmpPhoto;
    private javax.swing.JLabel JEmpPosTitle;
    private javax.swing.JLabel JEmpStartdate;
    private javax.swing.JLabel JEmpteaminfo;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jTitle;
    private javax.swing.JTextPane jTxtpic;
    private javax.swing.JTextField jtxtempage;
    private javax.swing.JTextField jtxtempid;
    private javax.swing.JTextField jtxtgender;
    private javax.swing.JTextField jtxtlevel;
    private javax.swing.JTextField jtxtlpostitle;
    private javax.swing.JTextField jtxtlteaminfo;
    private javax.swing.JTextField jtxtname;
    private javax.swing.JTextField jtxtphno;
    private javax.swing.JTextField jtxtphno1;
    private javax.swing.JTextField jtxtstartdate;
    // End of variables declaration//GEN-END:variables
}
