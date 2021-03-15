package Splash;
import ExtraResources.Imager;
import static ExtraResources.Imager.url;
import ExtraResources.ThareadUtilities;
import ExtraResources.Utilities;
import LoginControllerPKG.LogInFrame;
import MainFramePkg.MainFrame;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
public class SplashScreen extends javax.swing.JFrame {

    static SplashScreen sp;
    Imager imge = new Imager();
    public SplashScreen() {
        initComponents();
        editComponents();
//        new ClassLoader("Load_at_beginning").startLoder().start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        loding_bar = new javax.swing.JProgressBar();
        nameLeb = new javax.swing.JLabel();
        logoLeb = new javax.swing.JLabel();
        nameLeb1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(null);

        loding_bar.setForeground(new java.awt.Color(255, 153, 0));
        jPanel1.add(loding_bar);
        loding_bar.setBounds(160, 1020, 1620, 10);
        jPanel1.add(nameLeb);
        nameLeb.setBounds(610, 880, 720, 90);

        logoLeb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoLeb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.jpg"))); // NOI18N
        jPanel1.add(logoLeb);
        logoLeb.setBounds(560, 0, 800, 760);

        nameLeb1.setText("jLabel1");
        jPanel1.add(nameLeb1);
        nameLeb1.setBounds(690, 780, 560, 80);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(900, 1020, 120, 70);

        getContentPane().add(jPanel1, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

public static void updateBar(int newValue) throws InterruptedException {
    if(newValue == 100){
        java.lang.Thread.sleep(1000);
//        new LogInFrame().show();
        LogInFrame.lf.show();
        sp.dispose();
//        System.exit(0);
    }
    else{
        loding_bar.setValue(newValue);
    }
    
}    

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
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        sp = new SplashScreen();
        sp.show();
        for (int i = 0; i <= 100; i++) {
            final int percent=i;
            try {
                SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                   try {
//                       loding_bar.setValue(percent);
                        updateBar(percent);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(SplashScreen.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
             });
             java.lang.Thread.sleep(50);
            } catch (InterruptedException e) {;}
        }
    }

    void editComponents(){
        setLocationRelativeTo(null);
        setExtendedState(this.MAXIMIZED_BOTH);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource(LogInFrame.img_path)));
        Utilities.imageIcon(logoLeb, "src//images//logo.jpg");
        Utilities.imageIcon(nameLeb1, "src//images//warriors 1.png");
        Utilities.imageIcon(nameLeb, "src//images//warriors.png");
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/GIF/horse.gif")));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JPanel jPanel1;
    public static javax.swing.JProgressBar loding_bar;
    public static javax.swing.JLabel logoLeb;
    public static javax.swing.JLabel nameLeb;
    public static javax.swing.JLabel nameLeb1;
    // End of variables declaration//GEN-END:variables
}
