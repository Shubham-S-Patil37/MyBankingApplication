package MainFramePkg;
import ExtraResources.Utilities;
import LoginControllerPKG.GetLogIn;
import MailVarification.MailGenarator;
import static MainFramePkg.MainFrame.cus;
import NotifocationComponents.DoubleClickNotification;
import NotifocationComponents.SingleClickNotification;
import static MainFramePkg.MainFrame.ut;

public class ContactUSComponents extends javax.swing.JPanel {
    SingleClickNotification scn;
    DoubleClickNotification dcn;
    MailGenarator mg;
    String path = null;

    public ContactUSComponents(String mail) {
        initComponents();
        componentsTitle(mail);
        editComponents();
    }

    void editComponents(){
        ut.editButton(attachmentBtn);
        ut.editButton(mailCloseBtn);
        ut.editButton(cutBtn);
        ut.editButton(messageCloseBtn);
        ut.editButton(sendMessageBtn);
        ut.editTextField(mailTxt, 0, 0, 0);
        ut.editTextField(subjectTxt, 0, 0, 0);
        callGIFLeb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/GIF/call1.gif")));
    }

    void componentsTitle(String mailID){
        mailTxt.setText(mailID);
    }
    
    void getClose(){
        MainFrame.contactUSAddPnl.setVisible(false);
//        GetLogIn.dEnableButton(true);
        ExtraManagement.dEnableButton(true);
        decomposePane(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mailPnl = new javax.swing.JPanel();
        mailTxt = new javax.swing.JTextField();
        subjectTxt = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        bodyTxtA = new javax.swing.JTextArea();
        sendBtn = new javax.swing.JButton();
        attachmentBtn = new javax.swing.JButton();
        mailCloseBtn = new javax.swing.JButton();
        callPnl = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        callGIFLeb = new javax.swing.JLabel();
        cutBtn = new javax.swing.JButton();
        messagePnl = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        sendMessageBtn = new javax.swing.JButton();
        messageCloseBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.CardLayout());

        mailPnl.setBackground(new java.awt.Color(255, 255, 255));

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
        jScrollPane3.setViewportView(bodyTxtA);

        sendBtn.setBackground(new java.awt.Color(255, 255, 255));
        sendBtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        sendBtn.setText("Send");
        sendBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendBtnActionPerformed(evt);
            }
        });

        attachmentBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mailUploadImg.png"))); // NOI18N
        attachmentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attachmentBtnActionPerformed(evt);
            }
        });

        mailCloseBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close_btn.png"))); // NOI18N
        mailCloseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mailCloseBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mailPnlLayout = new javax.swing.GroupLayout(mailPnl);
        mailPnl.setLayout(mailPnlLayout);
        mailPnlLayout.setHorizontalGroup(
            mailPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mailPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mailPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mailPnlLayout.createSequentialGroup()
                        .addGroup(mailPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3)
                            .addGroup(mailPnlLayout.createSequentialGroup()
                                .addComponent(subjectTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 818, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 586, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mailPnlLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(attachmentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(514, 514, 514)
                        .addComponent(sendBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95))
                    .addGroup(mailPnlLayout.createSequentialGroup()
                        .addComponent(mailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 818, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mailCloseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))))
        );
        mailPnlLayout.setVerticalGroup(
            mailPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mailPnlLayout.createSequentialGroup()
                .addGroup(mailPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mailPnlLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(mailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mailPnlLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(mailCloseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(56, 56, 56)
                .addComponent(subjectTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(mailPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sendBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(attachmentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        add(mailPnl, "card5");

        callPnl.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        callGIFLeb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        cutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/GIF/cutCall.gif"))); // NOI18N
        cutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(callGIFLeb, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(172, 172, 172))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(callGIFLeb, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(cutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout callPnlLayout = new javax.swing.GroupLayout(callPnl);
        callPnl.setLayout(callPnlLayout);
        callPnlLayout.setHorizontalGroup(
            callPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(callPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(730, Short.MAX_VALUE))
        );
        callPnlLayout.setVerticalGroup(
            callPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(callPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(159, Short.MAX_VALUE))
        );

        add(callPnl, "card2");

        messagePnl.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        sendMessageBtn.setText("jButton1");
        sendMessageBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendMessageBtnActionPerformed(evt);
            }
        });

        messageCloseBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close_btn.png"))); // NOI18N
        messageCloseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messageCloseBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout messagePnlLayout = new javax.swing.GroupLayout(messagePnl);
        messagePnl.setLayout(messagePnlLayout);
        messagePnlLayout.setHorizontalGroup(
            messagePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(messagePnlLayout.createSequentialGroup()
                .addGroup(messagePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(messagePnlLayout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(sendMessageBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(messagePnlLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(messagePnlLayout.createSequentialGroup()
                        .addGap(469, 469, 469)
                        .addComponent(messageCloseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(890, Short.MAX_VALUE))
        );
        messagePnlLayout.setVerticalGroup(
            messagePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(messagePnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(messageCloseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(sendMessageBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(257, Short.MAX_VALUE))
        );

        add(messagePnl, "card4");
    }// </editor-fold>//GEN-END:initComponents

    private void cutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutBtnActionPerformed
        getClose();
    }//GEN-LAST:event_cutBtnActionPerformed

    private void sendMessageBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendMessageBtnActionPerformed
        
    }//GEN-LAST:event_sendMessageBtnActionPerformed

    private void messageCloseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messageCloseBtnActionPerformed
        getClose();
    }//GEN-LAST:event_messageCloseBtnActionPerformed

    private void subjectTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_subjectTxtFocusGained
        subjectTxt.setText("");
    }//GEN-LAST:event_subjectTxtFocusGained

    private void subjectTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_subjectTxtFocusLost
        if(subjectTxt.getText().equals(""))
            subjectTxt.setText("Subject");
    }//GEN-LAST:event_subjectTxtFocusLost

    private void sendBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendBtnActionPerformed
        MailGenarator.getGenaratedMail(mailTxt.getText(), path, subjectTxt.getText(), bodyTxtA.getText());
    }//GEN-LAST:event_sendBtnActionPerformed

    private void attachmentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attachmentBtnActionPerformed
        path = ut.myFileChooser();
    }//GEN-LAST:event_attachmentBtnActionPerformed

    private void mailCloseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mailCloseBtnActionPerformed
        getClose();
    }//GEN-LAST:event_mailCloseBtnActionPerformed
    
    public static void decomposePane(boolean bolean){
        mailPnl.setVisible(bolean);
        callPnl.setVisible(bolean);
        messagePnl.setVisible(bolean);
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
    private javax.swing.JLabel callGIFLeb;
    public static javax.swing.JPanel callPnl;
    private javax.swing.JButton cutBtn;
    public static javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton mailCloseBtn;
    public static javax.swing.JPanel mailPnl;
    private javax.swing.JTextField mailTxt;
    private javax.swing.JButton messageCloseBtn;
    public static javax.swing.JPanel messagePnl;
    private javax.swing.JButton sendBtn;
    private javax.swing.JButton sendMessageBtn;
    private javax.swing.JTextField subjectTxt;
    // End of variables declaration//GEN-END:variables
}
