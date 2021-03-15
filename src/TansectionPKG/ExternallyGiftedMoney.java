
package TansectionPKG;
import ExtraResources.ManageResources;
import static ExtraResources.ManageResources.JMusicPlayer;
import ExtraResources.ThareadUtilities;
import static ExtraResources.Utilities.editButton;
import static ExtraResources.Utilities.imageIcon;
import LoginControllerPKG.LogInFrame;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JPanel;

public class ExternallyGiftedMoney extends javax.swing.JFrame {
    int XPress,yPress,flage=0;
    public static int AmmountGain;
    ThareadUtilities util = new ThareadUtilities();
    public ExternallyGiftedMoney() {
        initComponents();
        getExtra();
    }
    
    public void getExtra(){
        setLocationRelativeTo(null);
        setBackground(new Color(0,0,0,40));
        jPanel1.setBackground(new Color(0,0,0,0));
        setSize(1707, 1000);
        editButton(closeBtn);
        imageIcon(closeBtn, "src//images//close_btn.png");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource(LogInFrame.img_path)));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        rewardLeb = new javax.swing.JLabel();
        titleLeb = new javax.swing.JLabel();
        closeBtn = new javax.swing.JButton();
        showBtn = new javax.swing.JButton();
        backGroundLeb = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Claim Now");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 280, 190));

        rewardLeb.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        rewardLeb.setForeground(new java.awt.Color(255, 255, 255));
        rewardLeb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rewardLeb.setText("98");
        jPanel1.add(rewardLeb, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 300));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 400, 300, 300));

        titleLeb.setFont(new java.awt.Font("Tahoma", 0, 80)); // NOI18N
        titleLeb.setForeground(new java.awt.Color(255, 255, 255));
        titleLeb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLeb.setText("Claim Your Rewards");
        getContentPane().add(titleLeb, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1710, 80));

        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });
        getContentPane().add(closeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1627, 13, 60, 60));

        showBtn.setBackground(new java.awt.Color(255, 255, 255));
        showBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showBtnActionPerformed(evt);
            }
        });
        getContentPane().add(showBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 400, 300, 300));

        backGroundLeb.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                backGroundLebMouseDragged(evt);
            }
        });
        backGroundLeb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                backGroundLebMousePressed(evt);
            }
        });
        getContentPane().add(backGroundLeb, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, -4, 1710, 1010));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backGroundLebMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backGroundLebMousePressed
        XPress = evt.getX();
        yPress = evt.getY();
    }//GEN-LAST:event_backGroundLebMousePressed

    private void backGroundLebMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backGroundLebMouseDragged
        setLocation(evt.getXOnScreen() - XPress, evt.getYOnScreen() - yPress);
    }//GEN-LAST:event_backGroundLebMouseDragged

    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
        dispose();
//        System.exit(0);
    }//GEN-LAST:event_closeBtnActionPerformed

    private void showBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showBtnActionPerformed
    }//GEN-LAST:event_showBtnActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        jLabel1.setText("");
        if(flage == 0){
            JMusicPlayer("music//Coins.mp3");
            ThareadUtilities.OpaticyCashBackPane button = util.new OpaticyCashBackPane();
            button.start();
            flage++;
        }
    }//GEN-LAST:event_jPanel1MouseClicked

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
            java.util.logging.Logger.getLogger(ExternallyGiftedMoney.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExternallyGiftedMoney.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExternallyGiftedMoney.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExternallyGiftedMoney.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExternallyGiftedMoney().setVisible(true);
            }
        });
    }
    
    void setPaneFalse(JPanel pane){
        pane.setVisible(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backGroundLeb;
    private javax.swing.JButton closeBtn;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JPanel jPanel1;
    public static javax.swing.JLabel rewardLeb;
    private javax.swing.JButton showBtn;
    private javax.swing.JLabel titleLeb;
    // End of variables declaration//GEN-END:variables
}
