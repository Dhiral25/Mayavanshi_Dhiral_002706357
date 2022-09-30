/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package uir;

import empprofile.empinfo;

/**
 *
 * @author DhiralM
 */
public class CreateJPanel extends javax.swing.JPanel {
    
    empinfo empinfo;

    /**
     * Creates new form CreateJPanel
     */
    public CreateJPanel(empinfo empinfo) {
        initComponents();
        
        this.empinfo = empinfo;
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
        EmpID = new javax.swing.JLabel();
        EmpName2 = new javax.swing.JLabel();
        EmpAge = new javax.swing.JLabel();
        EmpGender = new javax.swing.JLabel();
        EmpStartdate = new javax.swing.JLabel();
        EmpLevel = new javax.swing.JLabel();
        Empteaminfo = new javax.swing.JLabel();
        EmpPosTitle = new javax.swing.JLabel();
        EmpPhNo = new javax.swing.JLabel();
        EmpEmail = new javax.swing.JLabel();
        EmpPhoto = new javax.swing.JLabel();
        jtxtname = new javax.swing.JTextField();
        jtxtempid = new javax.swing.JTextField();
        jtxtempage = new javax.swing.JTextField();
        jtxtgender = new javax.swing.JTextField();
        jtxtstartdate = new javax.swing.JTextField();
        jtxtlevel = new javax.swing.JTextField();
        jtxtlteaminfo = new javax.swing.JTextField();
        jtxtlpostitle = new javax.swing.JTextField();
        jtxtphno = new javax.swing.JTextField();
        jtxtphno1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTxtpic = new javax.swing.JTextPane();
        jBtnSave = new javax.swing.JButton();

        jTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTitle.setText("Employee Data");

        EmpID.setText("Employee ID");

        EmpName2.setText("Employee Name");

        EmpAge.setText("Employee's Age");

        EmpGender.setText("Employee's Gender");

        EmpStartdate.setText("Employee's StartDate");

        EmpLevel.setText("Employee's Level");

        Empteaminfo.setText("Employee's TeamInfo");

        EmpPosTitle.setText("Employee's PositionTitle");

        EmpPhNo.setText("Employee's Phone No.");

        EmpEmail.setText("Employee's Email");

        EmpPhoto.setText("Employee's Picture");

        jtxtgender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtgenderActionPerformed(evt);
            }
        });

        jtxtstartdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtstartdateActionPerformed(evt);
            }
        });

        jtxtlevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtlevelActionPerformed(evt);
            }
        });

        jtxtlteaminfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtlteaminfoActionPerformed(evt);
            }
        });

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

        jtxtphno1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtphno1ActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(jTxtpic);

        jBtnSave.setText("Save");
        jBtnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(EmpPosTitle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtxtlpostitle, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Empteaminfo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtxtlteaminfo, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(EmpLevel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtxtlevel, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(EmpStartdate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtxtstartdate, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(EmpGender)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtxtgender, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(EmpAge)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtxtempage, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(EmpID)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtxtempid, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(EmpName2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72)
                                .addComponent(jtxtname, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(EmpPhNo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtxtphno, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(EmpEmail)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(EmpPhoto)
                                        .addGap(84, 84, 84)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jtxtphno1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(jBtnSave)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmpName2)
                    .addComponent(jtxtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmpID)
                    .addComponent(jtxtempid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmpAge)
                    .addComponent(jtxtempage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmpGender)
                    .addComponent(jtxtgender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmpStartdate)
                    .addComponent(jtxtstartdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmpLevel)
                    .addComponent(jtxtlevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Empteaminfo)
                    .addComponent(jtxtlteaminfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmpPosTitle)
                    .addComponent(jtxtlpostitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmpPhNo)
                    .addComponent(jtxtphno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmpEmail)
                    .addComponent(jtxtphno1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EmpPhoto)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBtnSave))
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

    private void jBtnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSaveActionPerformed
        // TODO add your handling code here:
        
        empinfo.setName(jtxtname.getText());
        empinfo.setEmpid(jtxtempid.getText());
        empinfo.setAge(jtxtempage.getText());
        empinfo.setGender(jtxtgender.getText());
        empinfo.setTeaminfo(jtxtlteaminfo.getText());
        empinfo.setPositiontitle(jtxtlpostitle.getText());
        empinfo.setPhno(jtxtphno.getText());
        empinfo.setEmailadd(jtxtphno1.getText());
        empinfo.setPic(jTxtpic.getText());
        
    }//GEN-LAST:event_jBtnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EmpAge;
    private javax.swing.JLabel EmpEmail;
    private javax.swing.JLabel EmpGender;
    private javax.swing.JLabel EmpID;
    private javax.swing.JLabel EmpLevel;
    private javax.swing.JLabel EmpName2;
    private javax.swing.JLabel EmpPhNo;
    private javax.swing.JLabel EmpPhoto;
    private javax.swing.JLabel EmpPosTitle;
    private javax.swing.JLabel EmpStartdate;
    private javax.swing.JLabel Empteaminfo;
    private javax.swing.JButton jBtnSave;
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
