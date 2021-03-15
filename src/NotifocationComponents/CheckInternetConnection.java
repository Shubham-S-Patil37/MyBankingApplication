package NotifocationComponents;
import ExtraResources.InternetConnection;
import ExtraResources.ThareadUtilities;
import LoginControllerPKG.GetLogIn;
import static LoginControllerPKG.GetLogIn.gli;
import MainFramePkg.MainFrame;
import static MainFramePkg.MainFrame.ut;
import static MainFramePkg.MainFrame.Xpress;
import static MainFramePkg.MainFrame.Ypress;
import static MainFramePkg.MainFrame.forI;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.SwingUtilities;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.swing.Timer;

public class CheckInternetConnection extends javax.swing.JFrame {
    public static CheckInternetConnection cic = new CheckInternetConnection();
    
    final ExecutorService service = Executors.newCachedThreadPool();
    ThareadUtilities tu = new ThareadUtilities();
    public static Thread loading;
    final int percent = 0;
    Timer timer;
    ActionListener al;
    public CheckInternetConnection() {
        initComponents();
        editComponents();
    }
    
    void editComponents(){
        setLocationRelativeTo(null);
        ut.editButton(internetConnectionCloseBtn);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/GIF/wifi.gif")));
        ut.imageIcon(internetConnectionCloseBtn, "src//images//close_btn.png");
        connectionBtn();
        ut.editProgressBar(jProgressBar1, 0);
        jProgressBar1.setVisible(false);
        progresser();
        gli.startThread = false;
        System.out.println(""+gli.startThread);
    }
    
    void connectionBtn(){
        checkInternet.setContentAreaFilled(false);
        checkInternet.setOpaque(false);
        checkInternet.setForeground(new Color(255, 206, 57));
        checkInternet.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(255, 206, 57)));
        checkInternet.setFocusable(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        checkInternet = new javax.swing.JButton();
        internetConnectionCloseBtn = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        checkInternet.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        checkInternet.setForeground(new java.awt.Color(255, 255, 255));
        checkInternet.setText("Check Internet Connection");
        checkInternet.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        checkInternet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkInternetActionPerformed(evt);
            }
        });
        jPanel1.add(checkInternet, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 440, 320, 50));

        internetConnectionCloseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                internetConnectionCloseBtnActionPerformed(evt);
            }
        });
        jPanel1.add(internetConnectionCloseBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 40, 40));

        jProgressBar1.setForeground(new java.awt.Color(255, 206, 57));
        jPanel1.add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 544, 440, 7));

        jLabel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel2MouseDragged(evt);
            }
        });
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 600));

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

    private void internetConnectionCloseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_internetConnectionCloseBtnActionPerformed
        gli.startThread = true;
        GetLogIn.cic.dispose();
        service.shutdown();
        gli.threadConnection.submit(gli.new CheckInternet());
    }//GEN-LAST:event_internetConnectionCloseBtnActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
   
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseDragged
        this.setLocation(evt.getXOnScreen() - Xpress, evt.getYOnScreen() - Ypress);
    }//GEN-LAST:event_jLabel2MouseDragged

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        Xpress = evt.getX();
        Ypress = evt.getY();
    }//GEN-LAST:event_jLabel2MousePressed

    private void checkInternetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkInternetActionPerformed
        jProgressBar1.setVisible(true);
        service.submit(tu.new GetProgressBarProgress());
    }//GEN-LAST:event_checkInternetActionPerformed

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
            java.util.logging.Logger.getLogger(CheckInternetConnection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckInternetConnection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckInternetConnection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckInternetConnection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckInternetConnection().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkInternet;
    private javax.swing.JButton internetConnectionCloseBtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables

    public void progresser(){
        loading = new Thread(new Runnable() {
            @Override
            public void run() {
                for(forI = 0 ; forI <= 100 ; forI++){
                    ThareadUtilities.getDelayTime(100);
                    jProgressBar1.setValue(forI);
                    checker(forI);
                }
            }
        });
    }
    
    public void checker(int value){
        if(value == 100){
            System.out.println("in");
            jProgressBar1.setVisible(false);
            loading.stop();
            if(InternetConnection.checkConnnection())
                dispose();
        }
    }
}
