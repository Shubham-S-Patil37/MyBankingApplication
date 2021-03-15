
package TansectionPKG;
import Database.DatabaseDriver;
import Database.ReLiveData;
import ExtraResources.TransactionManager;
import LoginControllerPKG.LogInFrame;
import static TansectionPKG.CalculateRewards.getRewards;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static MainFramePkg.MainFrame.rd;
import static MainFramePkg.MainFrame.ut;

public class SendMoney extends javax.swing.JFrame {
    
    public static int senderBalance,conditions;
    char ch;

    public SendMoney(String upi , int condition) {
        initComponents();
        TransactionManager.editComponents();
        setLocationRelativeTo(null);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource(LogInFrame.img_path)));
        setSize(1850, 900);
        conditions = condition;
        rd.upi_id = upi;
//        setExtendedState(this.MAXIMIZED_BOTH);
    }

    public String getUpiPin(){
        return pin1Txt.getText()+""+pin2Txt.getText()+""+pin3Txt.getText()+""+pin4Txt.getText();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        upiTxt = new javax.swing.JTextField();
        ammountTxt = new javax.swing.JTextField();
        send_btn = new javax.swing.JButton();
        pin3Txt = new javax.swing.JPasswordField();
        pin1Txt = new javax.swing.JPasswordField();
        pin4Txt = new javax.swing.JPasswordField();
        pin2Txt = new javax.swing.JPasswordField();
        resonTxt = new javax.swing.JTextField();
        resonLeb = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ammountInfo = new javax.swing.JLabel();
        upiInfo = new javax.swing.JLabel();
        imgLeb = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                formWindowLostFocus(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        upiTxt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        upiTxt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        upiTxt.setText("UPI ID");
        upiTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                upiTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                upiTxtFocusLost(evt);
            }
        });
        jPanel1.add(upiTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 190, 400, 40));

        ammountTxt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ammountTxt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        ammountTxt.setText("Ammount");
        ammountTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ammountTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ammountTxtFocusLost(evt);
            }
        });
        ammountTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ammountTxtKeyTyped(evt);
            }
        });
        jPanel1.add(ammountTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 310, 400, 40));

        send_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                send_btnActionPerformed(evt);
            }
        });
        jPanel1.add(send_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1520, 670, 110, 100));

        pin3Txt.setBackground(new java.awt.Color(0, 0, 0));
        pin3Txt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        pin3Txt.setForeground(new java.awt.Color(255, 255, 255));
        pin3Txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pin3Txt.setText("p");
        pin3Txt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pin3Txt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pin3TxtFocusGained(evt);
            }
        });
        pin3Txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pin3TxtKeyTyped(evt);
            }
        });
        jPanel1.add(pin3Txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1570, 450, 40, 40));

        pin1Txt.setBackground(new java.awt.Color(0, 0, 0));
        pin1Txt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        pin1Txt.setForeground(new java.awt.Color(255, 255, 255));
        pin1Txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pin1Txt.setText("p");
        pin1Txt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pin1Txt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pin1TxtFocusGained(evt);
            }
        });
        pin1Txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pin1TxtKeyTyped(evt);
            }
        });
        jPanel1.add(pin1Txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 450, 40, 40));

        pin4Txt.setBackground(new java.awt.Color(0, 0, 0));
        pin4Txt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        pin4Txt.setForeground(new java.awt.Color(255, 255, 255));
        pin4Txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pin4Txt.setText("p");
        pin4Txt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pin4Txt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pin4TxtFocusGained(evt);
            }
        });
        pin4Txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pin4TxtActionPerformed(evt);
            }
        });
        pin4Txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pin4TxtKeyTyped(evt);
            }
        });
        jPanel1.add(pin4Txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1660, 450, 40, 40));

        pin2Txt.setBackground(new java.awt.Color(0, 0, 0));
        pin2Txt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        pin2Txt.setForeground(new java.awt.Color(255, 255, 255));
        pin2Txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pin2Txt.setText("p");
        pin2Txt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pin2Txt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pin2TxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pin2TxtFocusLost(evt);
            }
        });
        pin2Txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pin2TxtKeyTyped(evt);
            }
        });
        jPanel1.add(pin2Txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1480, 450, 40, 40));

        resonTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        resonTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        resonTxt.setText("What is this for?");
        resonTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                resonTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                resonTxtFocusLost(evt);
            }
        });
        jPanel1.add(resonTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1360, 592, 390, 40));

        resonLeb.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel1.add(resonLeb, new org.netbeans.lib.awtextra.AbsoluteConstraints(1360, 556, 180, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Enter PIN");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1360, 530, 360, -1));

        ammountInfo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ammountInfo.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(ammountInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 280, 140, 30));

        upiInfo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        upiInfo.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(upiInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 160, 140, 30));
        jPanel1.add(imgLeb, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1850, 910));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1849, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
        dispose();
    }//GEN-LAST:event_formWindowLostFocus

    private void pin4TxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pin4TxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pin4TxtActionPerformed

    private void ammountTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ammountTxtKeyTyped
        ch = evt.getKeyChar();
        if(!Character.isDigit(ch))
            evt.consume();
//        if(ammountTxt.getText().length() == 1)
//            ammountTxt.transferFocus();
    }//GEN-LAST:event_ammountTxtKeyTyped

    private void pin1TxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pin1TxtKeyTyped
        ch = evt.getKeyChar();
        if(!Character.isDigit(ch))
            evt.consume();
        if(pin1Txt.getText().length() <= 1)
            pin1Txt.transferFocus();
    }//GEN-LAST:event_pin1TxtKeyTyped

    private void pin1TxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pin1TxtFocusGained
        pin1Txt.setText("");
    }//GEN-LAST:event_pin1TxtFocusGained

    private void pin2TxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pin2TxtFocusLost
    }//GEN-LAST:event_pin2TxtFocusLost

    private void pin2TxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pin2TxtFocusGained
        pin2Txt.setText("");
    }//GEN-LAST:event_pin2TxtFocusGained

    private void pin3TxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pin3TxtFocusGained
        pin3Txt.setText("");
    }//GEN-LAST:event_pin3TxtFocusGained

    private void pin4TxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pin4TxtFocusGained
        pin4Txt.setText("");
    }//GEN-LAST:event_pin4TxtFocusGained

    private void pin2TxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pin2TxtKeyTyped
        ch = evt.getKeyChar();
        if(!Character.isDigit(ch))
            evt.consume();
        if(pin2Txt.getText().length() <= 1)
            pin2Txt.transferFocus();
    }//GEN-LAST:event_pin2TxtKeyTyped

    private void pin3TxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pin3TxtKeyTyped
        ch = evt.getKeyChar();
        if(!Character.isDigit(ch))
            evt.consume();
        if(pin3Txt.getText().length() <= 1)
            pin3Txt.transferFocus();
    }//GEN-LAST:event_pin3TxtKeyTyped

    private void pin4TxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pin4TxtKeyTyped
        ch = evt.getKeyChar();
        if(!Character.isDigit(ch))
            evt.consume();
        if(pin4Txt.getText().length() <= 1)
            pin4Txt.transferFocus();
    }//GEN-LAST:event_pin4TxtKeyTyped

    private void ammountTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ammountTxtFocusGained
        ammountTxt.setText("");
        ammountInfo.setText("Ammount");
    }//GEN-LAST:event_ammountTxtFocusGained

    private void upiTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_upiTxtFocusGained
        switch(conditions){
            case 0:
                upiTxt.setText("");
                upiInfo.setText("UPI ID");
                break;
            case 1:
                upiTxt.setText(rd.upi_id);
                break;
        }
    }//GEN-LAST:event_upiTxtFocusGained

    private void upiTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_upiTxtFocusLost
        if(upiTxt.getText().equals("")){
            upiTxt.setText("UPI ID");
            upiInfo.setText("");
        }
    }//GEN-LAST:event_upiTxtFocusLost

    private void ammountTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ammountTxtFocusLost
        if(ammountTxt.getText().equals("")){
            ammountTxt.setText("Ammount");
            ammountInfo.setText("");
        }
    }//GEN-LAST:event_ammountTxtFocusLost

    private void send_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_send_btnActionPerformed
        rd.reLiveProfileData("acc_no",LogInFrame.account_no);
        senderBalance = Integer.parseInt(ReLiveData.balance);
        if (getUpiPin().equals(ReLiveData.upipin)) {
            if(rd.reLiveProfileData("upi_id",upiTxt.getText())){
                if(senderBalance > Integer.parseInt(ammountTxt.getText())){
                        ReLiveData.balance = ""+(Integer.parseInt(ReLiveData.balance)+ Integer.parseInt(ammountTxt.getText()));
                    try {
                        rd.pst = rd.con.prepareStatement("UPDATE profile set balance = '"+ReLiveData.balance +"' where upi_id = '"+upiTxt.getText()+"'");
                        rd.pst.executeUpdate();
                        senderBalance = senderBalance - Integer.parseInt(ammountTxt.getText());
                        rd.pst = rd.con.prepareStatement("UPDATE profile set balance = '"+senderBalance+"' where id = '"+LogInFrame.userID+"'");
                        rd.pst.executeUpdate();
                        System.out.println(""+senderBalance+"\n"+LogInFrame.userID);
                        getRewards(Integer.parseInt(ammountTxt.getText()));
                        rd.insertORupdateDataBase("insert into Transection(SenderAccountNo,SenderUserID,SenderUPI,ReciverAccountNo,ReciverUserID,ReciverUPI,Date,Ammount,SenderTransectionType,ReciverTransectionType,Rewards,TransactionID) "
                            + "values('"+LogInFrame.account_no+"','"+LogInFrame.userID+"','"+LogInFrame.upi_id+"','"+ReLiveData.accno+"','"+ReLiveData.userid+"','"+ReLiveData.upi_id+"','"+LogInFrame.date+"','"+ammountTxt.getText()+"','send','recive','"+CalculateRewards.getNumber+"','"+TransactionManager.transactionID()+"')");
                        dispose();
                    } catch (SQLException ex) {
                        Logger.getLogger(SendMoney.class.getName()).log(Level.SEVERE, null, ex);
                    }            
                }
                else
                    JOptionPane.showMessageDialog(null,"Insufficient Balance");
            }
        }
        else
            JOptionPane.showMessageDialog(null,"Invalid UPI PIN");
    }//GEN-LAST:event_send_btnActionPerformed

    private void resonTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_resonTxtFocusGained
        ut.textFocusGain(resonLeb, resonTxt, "What is this for?");
    }//GEN-LAST:event_resonTxtFocusGained

    private void resonTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_resonTxtFocusLost
        ut.textFocusLost(resonLeb, resonTxt, "What is this for?");
    }//GEN-LAST:event_resonTxtFocusLost

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
            java.util.logging.Logger.getLogger(SendMoney.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SendMoney.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SendMoney.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SendMoney.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SendMoney(null,0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ammountInfo;
    public static javax.swing.JTextField ammountTxt;
    public static javax.swing.JLabel imgLeb;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JPasswordField pin1Txt;
    public static javax.swing.JPasswordField pin2Txt;
    public static javax.swing.JPasswordField pin3Txt;
    public static javax.swing.JPasswordField pin4Txt;
    private javax.swing.JLabel resonLeb;
    private javax.swing.JTextField resonTxt;
    public static javax.swing.JButton send_btn;
    private javax.swing.JLabel upiInfo;
    public static javax.swing.JTextField upiTxt;
    // End of variables declaration//GEN-END:variables
}
