package TansectionPKG;
import ExtraResources.QRReader;
import static ExtraResources.Utilities.image;
import LoginControllerPKG.LogInFrame;
import static WebCam.TakeShot.isRunning;
import static WebCam.TakeShot.webcam;
import com.github.sarxos.webcam.Webcam;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;

public class ScanQR extends javax.swing.JFrame {

    Thread scanning;
    TakePhoto tp = new TakePhoto();

    public ScanQR() {
        initComponents();
        editComponents();
        setLocationRelativeTo(null);
    }
    
    void editComponents(){
        isRunning = false;
        rightPnl.setBackground(color());
        bottomPnl.setBackground(color());
        topPnl.setBackground(color());
        leftPnl.setBackground(color());
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource(LogInFrame.img_path)));
        topPnl.setBorder(BorderFactory.createMatteBorder   (1, 0, 0, 1, Color.BLACK));
        rightPnl.setBorder(BorderFactory.createMatteBorder (0, 1, 0, 0, Color.BLACK));
        bottomPnl.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
        leftPnl.setBorder(BorderFactory.createMatteBorder  (0, 0, 0, 1, Color.BLACK));
        webcam = Webcam.getDefault();
        webcam.setViewSize(new Dimension(640, 480));
        start();
    }
    
    
    Color color(){    
        return new Color(0,0,0,70);
    }

    void start(){
        if(!isRunning){
            System.out.println("\n\n\n\n\n\n");
            webcam.open();
            isRunning = true;
            tp.start();
        }
        else{
            isRunning = false;
            webcam.close();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bottomPnl = new javax.swing.JPanel();
        topPnl = new javax.swing.JPanel();
        rightPnl = new javax.swing.JPanel();
        leftPnl = new javax.swing.JPanel();
        scanLeb = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bottomPnl.setBackground(new java.awt.Color(255, 255, 255));
        bottomPnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout bottomPnlLayout = new javax.swing.GroupLayout(bottomPnl);
        bottomPnl.setLayout(bottomPnlLayout);
        bottomPnlLayout.setHorizontalGroup(
            bottomPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1168, Short.MAX_VALUE)
        );
        bottomPnlLayout.setVerticalGroup(
            bottomPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 158, Short.MAX_VALUE)
        );

        jPanel1.add(bottomPnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 640, 1170, 160));

        topPnl.setBackground(new java.awt.Color(255, 255, 255));
        topPnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout topPnlLayout = new javax.swing.GroupLayout(topPnl);
        topPnl.setLayout(topPnlLayout);
        topPnlLayout.setHorizontalGroup(
            topPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1168, Short.MAX_VALUE)
        );
        topPnlLayout.setVerticalGroup(
            topPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 158, Short.MAX_VALUE)
        );

        jPanel1.add(topPnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 160));

        rightPnl.setBackground(new java.awt.Color(255, 255, 255));
        rightPnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout rightPnlLayout = new javax.swing.GroupLayout(rightPnl);
        rightPnl.setLayout(rightPnlLayout);
        rightPnlLayout.setHorizontalGroup(
            rightPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 298, Short.MAX_VALUE)
        );
        rightPnlLayout.setVerticalGroup(
            rightPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 478, Short.MAX_VALUE)
        );

        jPanel1.add(rightPnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 160, 300, 480));

        leftPnl.setBackground(new java.awt.Color(255, 255, 255));
        leftPnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout leftPnlLayout = new javax.swing.GroupLayout(leftPnl);
        leftPnl.setLayout(leftPnlLayout);
        leftPnlLayout.setHorizontalGroup(
            leftPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 298, Short.MAX_VALUE)
        );
        leftPnlLayout.setVerticalGroup(
            leftPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 478, Short.MAX_VALUE)
        );

        jPanel1.add(leftPnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 300, 480));
        jPanel1.add(scanLeb, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 800));

        getContentPane().add(jPanel1, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        webcam.close();
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(ScanQR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ScanQR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ScanQR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ScanQR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ScanQR().setVisible(true);
            }
        });
    }
    
    public class TakePhoto extends Thread{
        public void run(){
            while(isRunning){
                try {
                    image = webcam.getImage();
                    image = image.getScaledInstance(scanLeb.getWidth(), scanLeb.getHeight(),Image.SCALE_SMOOTH);
                    scanLeb.setIcon(new ImageIcon(image));
                    new QRReader(image);
                    Thread.sleep(10);
                } catch (InterruptedException ex) {
                    Logger.getLogger(TakePhoto.class.getName()).log(Level.SEVERE, null, ex);
                }            
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bottomPnl;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel leftPnl;
    private javax.swing.JPanel rightPnl;
    private javax.swing.JLabel scanLeb;
    private javax.swing.JPanel topPnl;
    // End of variables declaration//GEN-END:variables
}
