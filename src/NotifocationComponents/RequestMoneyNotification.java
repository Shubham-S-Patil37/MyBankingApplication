package NotifocationComponents;
import ExtraResources.Utilities;
import MainFramePkg.MainFrame;
public class RequestMoneyNotification extends javax.swing.JPanel {

    public RequestMoneyNotification() {
        initComponents();
    }
    
    void editComponents(){
        Utilities.editButton(requestedCloseBtn);
        Utilities.editButton(requestedSendMoneyBtn);
        Utilities.imageIcon(requestedCloseBtn, "src//images//close_btn.png");
        Utilities.imageIcon(requestedSendMoneyBtn, "");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        requestedCloseBtn = new javax.swing.JButton();
        requestdAmmountLeb = new javax.swing.JLabel();
        requestedTitleLeb = new javax.swing.JLabel();
        requestedSendMoneyBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        requestdAmmountLeb.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        requestdAmmountLeb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        requestdAmmountLeb.setText("RS. 30");

        requestedTitleLeb.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        requestedTitleLeb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        requestedTitleLeb.setText("admin requested for money");

        requestedSendMoneyBtn.setBackground(new java.awt.Color(255, 255, 255));
        requestedSendMoneyBtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        requestedSendMoneyBtn.setText("Send Money");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(requestdAmmountLeb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(requestedCloseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(requestedTitleLeb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(399, Short.MAX_VALUE)
                .addComponent(requestedSendMoneyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(385, 385, 385))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(requestedCloseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(requestedTitleLeb, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(requestdAmmountLeb, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(requestedSendMoneyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel requestdAmmountLeb;
    private javax.swing.JButton requestedCloseBtn;
    private javax.swing.JButton requestedSendMoneyBtn;
    private javax.swing.JLabel requestedTitleLeb;
    // End of variables declaration//GEN-END:variables
}
