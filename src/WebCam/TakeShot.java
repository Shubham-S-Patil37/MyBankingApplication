package WebCam;
import static LoginControllerPKG.LogInFrame.Xpress;
import static LoginControllerPKG.LogInFrame.Ypress;
import ExtraResources.Imager;
import ExtraResources.ThareadUtilities;
import ExtraResources.Utilities;
import static ExtraResources.Utilities.imageIcon;
import static ExtraResources.Utilities.image;
import static ExtraResources.Utilities.imageIcon;
import MainFramePkg.MainFrame;
import com.github.sarxos.webcam.Webcam;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import static ExtraResources.ManageResources.JMusicPlayer;
import LoginControllerPKG.LogInFrame;
import java.awt.Toolkit;

public class TakeShot extends javax.swing.JFrame {

    public static Webcam webcam;
    public static Boolean isRunning = false;

    public TakeShot() {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource(LogInFrame.img_path)));
        getEdited();
        webcam = Webcam.getDefault();
        webcam.setViewSize(new Dimension(640, 480));
//        webcam.open();
        SaveBtn.setEnabled(false);
    }

    public void getEdited(){
        Utilities.imageIcon(CloseLabel, "src//images//close_btn.png");
        Utilities.imageIcon(backGround, "src//images//takeShot.jpg");
        Utilities.editButton(takePhoto);
        Utilities.imageIcon(TakeShot.takePhoto, "src//images//camera-TakePhoto.png");
        Utilities.editButton(SaveBtn);
        Utilities.imageIcon(TakeShot.SaveBtn, "src//images//UploadImg.png");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        imgLabel = new javax.swing.JLabel();
        takePhoto = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        CloseLabel = new javax.swing.JLabel();
        SaveBtn = new javax.swing.JButton();
        backGround = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                formWindowLostFocus(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(imgLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 38, 998, 900));

        takePhoto.setBackground(new java.awt.Color(0, 0, 0));
        takePhoto.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        takePhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                takePhotoActionPerformed(evt);
            }
        });
        jPanel1.add(takePhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 960, 80, 63));

        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel1MouseDragged(evt);
            }
        });
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 960, 40));

        CloseLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseLabelMouseClicked(evt);
            }
        });
        jPanel1.add(CloseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(979, 1, 40, 40));

        SaveBtn.setBackground(new java.awt.Color(0, 0, 0));
        SaveBtn.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        SaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBtnActionPerformed(evt);
            }
        });
        jPanel1.add(SaveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 960, 60, 63));
        jPanel1.add(backGround, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 1040));

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

    private void takePhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_takePhotoActionPerformed
        if(!isRunning){
            webcam.open();
            isRunning = true;
            TakePhoto tp = new TakePhoto();
            tp.start();
//            TakePhoto.takePhoto(imgLabel);
            imageIcon(TakeShot.takePhoto, "src//images//camera-TakePhoto.png");
            SaveBtn.setEnabled(false);
        }
        else{
            JMusicPlayer("music//Camera shutter.mp3");
            isRunning = false;
            webcam.close();
            Utilities.imageIcon(TakeShot.takePhoto, "src//images//camera-ReTake.png");
            SaveBtn.setEnabled(true);
        }
    }//GEN-LAST:event_takePhotoActionPerformed

    private void CloseLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseLabelMouseClicked
        dispose();
        webcam.close();
    }//GEN-LAST:event_CloseLabelMouseClicked

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        Xpress = evt.getX();
        Ypress  = evt.getY();
    }//GEN-LAST:event_jLabel1MousePressed

    private void jLabel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseDragged
        this.setLocation(evt.getXOnScreen() - Xpress, evt.getYOnScreen() - Ypress);
    }//GEN-LAST:event_jLabel1MouseDragged

    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnActionPerformed
        image = Imager.getlabelImage(imgLabel);
        image = image.getScaledInstance(MainFrame.profile_photo_leb.getWidth(), MainFrame.profile_photo_leb.getHeight(),Image.SCALE_SMOOTH);
        MainFrame.profile_photo_leb.setIcon(new ImageIcon(image));
    }//GEN-LAST:event_SaveBtnActionPerformed

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
        dispose();
        webcam.close();
    }//GEN-LAST:event_formWindowLostFocus

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
            java.util.logging.Logger.getLogger(TakeShot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TakeShot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TakeShot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TakeShot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TakeShot().setVisible(true);
            }
        });
    }

    public class TakePhoto extends Thread{
        public void run(){
            while(isRunning){
                try {
                    image = webcam.getImage();
//                    imageIcon = new ImageIcon(image);
                    image = image.getScaledInstance(imgLabel.getWidth(), imgLabel.getHeight(),Image.SCALE_SMOOTH);
                    TakeShot.imgLabel.setIcon(new ImageIcon(image));
//                    Profile_PopUp.jLabel3.setIcon(new ImageIcon(image));
                    Thread.sleep(50);
                } catch (InterruptedException ex) {
                    Logger.getLogger(TakePhoto.class.getName()).log(Level.SEVERE, null, ex);
                }            
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CloseLabel;
    public static javax.swing.JButton SaveBtn;
    private javax.swing.JLabel backGround;
    public static javax.swing.JLabel imgLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JButton takePhoto;
    // End of variables declaration//GEN-END:variables
}
