package NotifocationComponents;
import ExtraResources.Utilities;
import LoginControllerPKG.LogInFrame;
import MainFramePkg.MainFrame;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

public abstract class NotificationPnl extends javax.swing.JPanel {
    String Message = "";
    public static int condition;
    public NotificationPnl(String Message, String actionLeb) {
        initComponents();
        msgLabel.setText(Message);
        closeBtn.setSize(43, 34);
        this.actionBtn.setText(actionLeb);
        Utilities.imageIcon(closeBtn,"src//images//close_btn.png");
        Utilities.editButton(actionBtn);
        Utilities.editButton(closeBtn);
    }
    
    public abstract void actionBtn();
    public abstract void closeBtn();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        msgLabel = new javax.swing.JLabel();
        actionBtn = new javax.swing.JButton();
        closeBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 0));

        msgLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        msgLabel.setForeground(new java.awt.Color(255, 255, 255));
        msgLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        msgLabel.setText("Notification ");

        actionBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        actionBtn.setForeground(new java.awt.Color(0, 0, 255));
        actionBtn.setText("see");
        actionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionBtnActionPerformed(evt);
            }
        });

        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(actionBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
                .addGap(86, 86, 86))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(msgLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(closeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(closeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(msgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(actionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void actionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actionBtnActionPerformed
        actionBtn();
    }//GEN-LAST:event_actionBtnActionPerformed

    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
        closeBtn();
    }//GEN-LAST:event_closeBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton actionBtn;
    public static javax.swing.JButton closeBtn;
    private javax.swing.JLabel msgLabel;
    // End of variables declaration//GEN-END:variables
}
