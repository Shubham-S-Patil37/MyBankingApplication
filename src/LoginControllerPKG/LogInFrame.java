package LoginControllerPKG;
import MailVarification.ForgetPass;
import static ExtraResources.ManageResources.JMusicPlayer;
import ExtraResources.Utilities;
import static ExtraResources.Utilities.imageIcon;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import Database.ReLiveData;
import ExtraResources.ArriveDate;
import MainFramePkg.MainFrame;
import MainFramePkg.ThreadManager;
public class LogInFrame extends javax.swing.JFrame {
public static ThreadManager manager = new ThreadManager(); 
    public static int Xpress,Ypress;
    public static ForgetPass fp;
    public static String userID , password_get,img_path = "/images/logo2.png";
    public static String account_no,balance,upi_id,upi_pin,date;
    public static LogInFrame lf = new LogInFrame();
    ReLiveData rd = new ReLiveData();
    Utilities utlity = new Utilities();
    public static Thread popupthd,mainFrmthd,connectionthd,notificationthd;

    public LogInFrame() {
        initComponents();
        editComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource(img_path)));
        setLocationRelativeTo(null);
        MainFrame.frame = new MainFrame();
    }
    
    public void editComponents(){
        utlity.editTextField(LogInFrame.id_txt, 255, 255, 255);
        utlity.editTextField(LogInFrame.pass_txt, 255, 255, 255);
        LogInFrame.pass_txt.setEchoChar((char)0);
        imageIcon(login_btn, "src//images//lock.png");
        utlity.editButton(login_btn);
        utlity.editButton(show_pass_btn);
        utlity.editButton(forget_pass_btn); 
        utlity.imageIcon(imgLeb, "src//images//login.jpg");
        
        jLabel1.setText("");
        jLabel6.setText("");
        
        date = ArriveDate.getTodaysDate();
    }
    
    void getLogIn(){
            if(id_txt.getText().equals("")){
                pass_status.setText("Enter ID");
            }
            else if(GetLogIn.getProfile(id_txt.getText(),pass_txt.getText())){                
                    mainFrmthd.start();
                    popupthd.start();
                    connectionthd.start();
                    notificationthd.start();
                    manager.threadStater();
            }
            else{
                pass_status.setText("User Id or password is not found");
                JMusicPlayer("music//errorSound.mp3");
            }    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        id_txt = new javax.swing.JTextField();
        show_pass_btn = new javax.swing.JButton();
        pass_txt = new javax.swing.JPasswordField();
        pass_status = new javax.swing.JLabel();
        forget_pass_btn = new javax.swing.JButton();
        login_btn = new javax.swing.JButton();
        exitLeb = new javax.swing.JLabel();
        minimizeLeb = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        imgLeb = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1377, 730));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        id_txt.setBackground(new java.awt.Color(0, 0, 0));
        id_txt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        id_txt.setForeground(new java.awt.Color(255, 255, 255));
        id_txt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        id_txt.setText("USER ID");
        id_txt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                id_txtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                id_txtFocusLost(evt);
            }
        });
        id_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                id_txtMouseClicked(evt);
            }
        });
        jPanel1.add(id_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 380, 50));

        show_pass_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/eye3 - Copy .png"))); // NOI18N
        show_pass_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                show_pass_btnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                show_pass_btnMouseReleased(evt);
            }
        });
        show_pass_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_pass_btnActionPerformed(evt);
            }
        });
        jPanel1.add(show_pass_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 300, 40, 40));

        pass_txt.setBackground(new java.awt.Color(0, 0, 0));
        pass_txt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        pass_txt.setForeground(new java.awt.Color(255, 255, 255));
        pass_txt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        pass_txt.setText("PASSWORD");
        pass_txt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pass_txtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pass_txtFocusLost(evt);
            }
        });
        pass_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pass_txtActionPerformed(evt);
            }
        });
        pass_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pass_txtKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pass_txtKeyTyped(evt);
            }
        });
        jPanel1.add(pass_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 380, 60));

        pass_status.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(pass_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 190, 20));

        forget_pass_btn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        forget_pass_btn.setText("Forget Password ?");
        forget_pass_btn.setBorder(null);
        forget_pass_btn.setOpaque(false);
        forget_pass_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                forget_pass_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                forget_pass_btnMouseExited(evt);
            }
        });
        forget_pass_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forget_pass_btnActionPerformed(evt);
            }
        });
        jPanel1.add(forget_pass_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 510, 220, 30));

        login_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lock.png"))); // NOI18N
        login_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_btnActionPerformed(evt);
            }
        });
        jPanel1.add(login_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, 90, 80));

        exitLeb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitLeb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitLebMouseClicked(evt);
            }
        });
        jPanel1.add(exitLeb, new org.netbeans.lib.awtextra.AbsoluteConstraints(1820, 0, 60, 60));

        minimizeLeb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimizeLeb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeLebMouseClicked(evt);
            }
        });
        jPanel1.add(minimizeLeb, new org.netbeans.lib.awtextra.AbsoluteConstraints(1750, 0, 55, 60));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("     LOG IN");
        jLabel4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel4MouseDragged(evt);
            }
        });
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel4MousePressed(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1720, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Dont have Account ? Rejister now");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 570, 380, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("User ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 132, 200, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Passwords");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 246, 210, 30));

        imgLeb.setBackground(new java.awt.Color(255, 255, 255));
        imgLeb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login.jpg"))); // NOI18N
        imgLeb.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                imgLebFocusGained(evt);
            }
        });
        jPanel1.add(imgLeb, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1890, 1000));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1890, 1010));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void imgLebFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_imgLebFocusGained
        pass_status.setText("");
    }//GEN-LAST:event_imgLebFocusGained

    private void login_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_btnActionPerformed
        getLogIn();
    }//GEN-LAST:event_login_btnActionPerformed

    private void id_txtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_id_txtFocusGained
        id_txt.setText("");
        jLabel1.setText("User ID");
    }//GEN-LAST:event_id_txtFocusGained

    private void pass_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pass_txtActionPerformed
    }//GEN-LAST:event_pass_txtActionPerformed

    private void pass_txtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pass_txtFocusGained
        pass_status.setText("");
        pass_txt.setText("");
        pass_txt.setEchoChar('*');
        jLabel6.setText("Passwords");
    }//GEN-LAST:event_pass_txtFocusGained

    private void id_txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_id_txtMouseClicked
//        id_txt.setText("");
    }//GEN-LAST:event_id_txtMouseClicked

    private void id_txtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_id_txtFocusLost
        if(id_txt.getText().equals("")){
            id_txt.setText("USER ID");
            jLabel1.setText("");
        }
    }//GEN-LAST:event_id_txtFocusLost

    private void pass_txtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pass_txtFocusLost
        if(pass_txt.getText().equals("")){
            pass_txt.setText("PASSWORD");
            pass_txt.setEchoChar((char)0);
            jLabel6.setText("");
        }
    }//GEN-LAST:event_pass_txtFocusLost

    private void show_pass_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_pass_btnActionPerformed
    }//GEN-LAST:event_show_pass_btnActionPerformed

    private void show_pass_btnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_show_pass_btnMouseReleased
        pass_txt.setEchoChar('*');
    }//GEN-LAST:event_show_pass_btnMouseReleased

    private void show_pass_btnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_show_pass_btnMousePressed
        pass_txt.setEchoChar((char)0);
    }//GEN-LAST:event_show_pass_btnMousePressed

    private void exitLebMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLebMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitLebMouseClicked

    private void minimizeLebMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeLebMouseClicked
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_minimizeLebMouseClicked

    private void jLabel4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseDragged
        this.setLocation(evt.getXOnScreen() - Xpress, evt.getYOnScreen() - Ypress);
    }//GEN-LAST:event_jLabel4MouseDragged

    private void jLabel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MousePressed
        Xpress = evt.getX();
        Ypress = evt.getY();
    }//GEN-LAST:event_jLabel4MousePressed

    private void forget_pass_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forget_pass_btnActionPerformed
        fp = new ForgetPass();
        fp.show();
    }//GEN-LAST:event_forget_pass_btnActionPerformed

    private void forget_pass_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forget_pass_btnMouseExited
        forget_pass_btn.setForeground(Color.BLACK);
    }//GEN-LAST:event_forget_pass_btnMouseExited

    private void forget_pass_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forget_pass_btnMouseEntered
        forget_pass_btn.setForeground(Color.WHITE);
    }//GEN-LAST:event_forget_pass_btnMouseEntered

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        jLabel5.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        jLabel5.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabel5MouseExited

    private void pass_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pass_txtKeyTyped
    }//GEN-LAST:event_pass_txtKeyTyped

    private void pass_txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pass_txtKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
                getLogIn();
        }
    }//GEN-LAST:event_pass_txtKeyPressed

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ForgetPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForgetPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForgetPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForgetPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               lf.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel exitLeb;
    private javax.swing.JButton forget_pass_btn;
    public static javax.swing.JTextField id_txt;
    public static javax.swing.JLabel imgLeb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JButton login_btn;
    private javax.swing.JLabel minimizeLeb;
    public static javax.swing.JLabel pass_status;
    public static javax.swing.JPasswordField pass_txt;
    private javax.swing.JButton show_pass_btn;
    // End of variables declaration//GEN-END:variables

}

