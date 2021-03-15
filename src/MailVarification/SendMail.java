package MailVarification;
import ExtraResources.Utilities;
import NotifocationComponents.SingleClickNotification;
import NotifocationComponents.DoubleClickNotification;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
public class SendMail extends javax.swing.JFrame {
    Utilities utilies = new Utilities();
    SingleClickNotification scn,scn1;
    DoubleClickNotification dcn;
    MailGenarator mg;
    String path = null;
    public SendMail(String mail) {
        initComponents();
        setLocationRelativeTo(null);
        componentsTitle(mail);
        utilies.editButton(attachmentBtn);
        utilies.imageIcon(attachmentBtn,"src//images//mailUploadImg.png");
    }

    void componentsTitle(String mailID){
        mailTxt.setText(mailID);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        mailTxt = new javax.swing.JTextField();
        subjectTxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        bodyTxtA = new javax.swing.JTextArea();
        sendBtn = new javax.swing.JButton();
        attachmentBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        mailTxt.setEditable(false);
        mailTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mailTxt.setText("Mail");

        subjectTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        subjectTxt.setText("Subject");
        subjectTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                subjectTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                subjectTxtFocusLost(evt);
            }
        });

        bodyTxtA.setColumns(20);
        bodyTxtA.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bodyTxtA.setRows(5);
        jScrollPane1.setViewportView(bodyTxtA);

        sendBtn.setBackground(new java.awt.Color(255, 255, 255));
        sendBtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        sendBtn.setText("Send");
        sendBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendBtnActionPerformed(evt);
            }
        });

        attachmentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attachmentBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 818, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(subjectTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 818, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 552, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(attachmentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(514, 514, 514)
                .addComponent(sendBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(mailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(subjectTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sendBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(attachmentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void subjectTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_subjectTxtFocusLost
        if(subjectTxt.getText().equals(""))
            subjectTxt.setText("Subject");
    }//GEN-LAST:event_subjectTxtFocusLost

    private void subjectTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_subjectTxtFocusGained
        subjectTxt.setText("");
    }//GEN-LAST:event_subjectTxtFocusGained

    private void sendBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendBtnActionPerformed
        if(mailTxt.getText().equals(""))
            error("Enter Valid Email ID");
        else{
            if(subjectTxt.getText().equals("") || subjectTxt.getText().equals("Subject"))
                Notification("Your mail not contain Valid Subject");
            else{
                mg.getGenaratedMail(mailTxt.getText(), path, subjectTxt.getText(), bodyTxtA.getText());
                error("Your Mail Send Successful");
            }
        }

    }//GEN-LAST:event_sendBtnActionPerformed

    private void attachmentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attachmentBtnActionPerformed
        path = utilies.myFileChooser();
    }//GEN-LAST:event_attachmentBtnActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SendMail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SendMail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SendMail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SendMail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SendMail(null).setVisible(true);
            }
        });
    }

    void error(String title){
        scn = new SingleClickNotification(title, "Close") {
            @Override
            public void getButtonAction() {
                scn.dispose();
            }
            
            @Override
            public void getCloseAction() {
                scn.dispose();
            }
        };
        scn.show();
    }
    
    void Notification(String Title){
        dcn = new DoubleClickNotification(Title, "Cancel", "Send") {
            @Override
            public void setOnFirstClick() {
                dcn.dispose();
            }
            
            @Override
            public void setOnSecondClick() {
                mg.getGenaratedMail(mailTxt.getText(), path, subjectTxt.getText(), bodyTxtA.getText());
            }
            
            @Override
            public void setOnCloseClick() {
                dcn.dispose();
            }
        };
        dcn.show();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton attachmentBtn;
    private javax.swing.JTextArea bodyTxtA;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mailTxt;
    private javax.swing.JButton sendBtn;
    private javax.swing.JTextField subjectTxt;
    // End of variables declaration//GEN-END:variables
}
