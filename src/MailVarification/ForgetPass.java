package MailVarification;
import Database.DatabaseDriver;
import ExtraResources.InternetConnection;
import static ExtraResources.ManageResources.JMusicPlayer;
import ExtraResources.ThareadUtilities;
import ExtraResources.Utilities;
import LoginControllerPKG.LogInFrame;
import java.awt.Color;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import NotifocationComponents.SingleClickNotification;

public class ForgetPass extends javax.swing.JFrame {
    
    ThareadUtilities tu = new ThareadUtilities();
    char ch,ch1;
    int i=0;
    int x_drag,y_drag,x_press,y_press;
    public static String date,aadhar_no,name,user_id,e_mail,mob_no,aadhar_no1,aadhar_no2,aadhar_no3,date1,month,year1,OTP;
    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    public ForgetPass() {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource(LogInFrame.img_path)));
        con = DatabaseDriver.Connect();

        set_btn_editable_false();
        set_panel_visible_false();
        
        step2_otp_varification.setEditable(false);
        step2_otp_varification_btn.setEnabled(false);
        
        step1_pnl.setVisible(true);
        step1_btn.setEnabled(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        step1_btn = new javax.swing.JButton();
        step2_btn = new javax.swing.JButton();
        step3_btn = new javax.swing.JButton();
        step4_btn = new javax.swing.JButton();
        step5_btn = new javax.swing.JButton();
        step6_btn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        main_pnl = new javax.swing.JPanel();
        step1_pnl = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        step1_userid_txt = new javax.swing.JTextField();
        step1_status_leb = new javax.swing.JLabel();
        check_btn = new javax.swing.JButton();
        step2_pnl = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        step2_email_txt = new javax.swing.JTextField();
        step2_status_leb = new javax.swing.JLabel();
        email_varify_step2 = new javax.swing.JButton();
        step2_otp_varification = new javax.swing.JTextField();
        step2_otp_varification_btn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        step2_counting_leb = new javax.swing.JLabel();
        step2_otp_status_leb = new javax.swing.JLabel();
        step2_status_leb2 = new javax.swing.JLabel();
        step3_pnl = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        step3_mobileno_txt = new javax.swing.JTextField();
        step3_status_leb = new javax.swing.JLabel();
        step3_mobno_varification_btn = new javax.swing.JButton();
        step3_otp_varification = new javax.swing.JTextField();
        step3_otp_varification_btn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        step2_counting_leb1 = new javax.swing.JLabel();
        step3_otp_status_leb = new javax.swing.JLabel();
        step4_pnl = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        step5_pnl1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        d1 = new javax.swing.JTextField();
        d2 = new javax.swing.JTextField();
        m1 = new javax.swing.JTextField();
        m2 = new javax.swing.JTextField();
        y1 = new javax.swing.JTextField();
        y2 = new javax.swing.JTextField();
        y3 = new javax.swing.JTextField();
        y4 = new javax.swing.JTextField();
        ste5_varification_btn = new javax.swing.JButton();
        aadhar_txt1 = new javax.swing.JTextField();
        aadhar_txt2 = new javax.swing.JTextField();
        aadhar_txt3 = new javax.swing.JTextField();
        step5_name_txt = new javax.swing.JTextField();
        step5_status_leb = new javax.swing.JLabel();
        step6_pnl = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        step6_pss_txt = new javax.swing.JPasswordField();
        step6_confirm_pss_txt = new javax.swing.JPasswordField();
        step6_pass_status_leb = new javax.swing.JLabel();
        step6_cpacha_leb = new javax.swing.JLabel();
        step6_capcha_txt = new javax.swing.JTextField();
        step6_change_pass_btn = new javax.swing.JButton();
        title_pnl = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        minimise = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                formWindowLostFocus(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        step1_btn.setBackground(new java.awt.Color(255, 255, 255));
        step1_btn.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        step1_btn.setText("Step 1");
        step1_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                step1_btnActionPerformed(evt);
            }
        });

        step2_btn.setBackground(new java.awt.Color(255, 255, 255));
        step2_btn.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        step2_btn.setText("Step 2");

        step3_btn.setBackground(new java.awt.Color(255, 255, 255));
        step3_btn.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        step3_btn.setText("Step 3");

        step4_btn.setBackground(new java.awt.Color(255, 255, 255));
        step4_btn.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        step4_btn.setText("Step 4");

        step5_btn.setBackground(new java.awt.Color(255, 255, 255));
        step5_btn.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        step5_btn.setText("Step 5");

        step6_btn.setBackground(new java.awt.Color(255, 255, 255));
        step6_btn.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        step6_btn.setText("Step 6");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/6_1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(step1_btn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(step2_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(step3_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(step4_btn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(step5_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(step6_btn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(step1_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(step2_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(step3_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(step4_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(step5_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(step6_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        main_pnl.setBackground(new java.awt.Color(255, 255, 255));
        main_pnl.setLayout(new java.awt.CardLayout());

        step1_pnl.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("User ID varification");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Enter Your User ID ");

        step1_userid_txt.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        step1_userid_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        step1_userid_txt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                step1_userid_txtFocusGained(evt);
            }
        });
        step1_userid_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                step1_userid_txtActionPerformed(evt);
            }
        });

        step1_status_leb.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        check_btn.setBackground(new java.awt.Color(255, 255, 255));
        check_btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        check_btn.setText("Varify");
        check_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout step1_pnlLayout = new javax.swing.GroupLayout(step1_pnl);
        step1_pnl.setLayout(step1_pnlLayout);
        step1_pnlLayout.setHorizontalGroup(
            step1_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, step1_pnlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(check_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(step1_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(step1_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(step1_userid_txt, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(step1_status_leb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        step1_pnlLayout.setVerticalGroup(
            step1_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(step1_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(step1_userid_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(step1_status_leb, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(check_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        main_pnl.add(step1_pnl, "card2");

        step2_pnl.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("E - Mail Verification");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Enter Your Register E - Mail ID ");

        step2_email_txt.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        step2_email_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        step2_email_txt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                step2_email_txtFocusGained(evt);
            }
        });
        step2_email_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                step2_email_txtActionPerformed(evt);
            }
        });

        step2_status_leb.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        email_varify_step2.setBackground(new java.awt.Color(255, 255, 255));
        email_varify_step2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        email_varify_step2.setText("Varify");
        email_varify_step2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_varify_step2ActionPerformed(evt);
            }
        });

        step2_otp_varification.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        step2_otp_varification.setText("Check OTP on E-mail ");
        step2_otp_varification.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                step2_otp_varificationFocusGained(evt);
            }
        });
        step2_otp_varification.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                step2_otp_varificationKeyTyped(evt);
            }
        });

        step2_otp_varification_btn.setBackground(new java.awt.Color(255, 255, 255));
        step2_otp_varification_btn.setText("Varify");
        step2_otp_varification_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                step2_otp_varification_btnActionPerformed(evt);
            }
        });

        jLabel7.setText("G-80559223");

        step2_counting_leb.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        step2_counting_leb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        step2_otp_status_leb.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        step2_status_leb2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout step2_pnlLayout = new javax.swing.GroupLayout(step2_pnl);
        step2_pnl.setLayout(step2_pnlLayout);
        step2_pnlLayout.setHorizontalGroup(
            step2_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(step2_pnlLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(step2_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(step2_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(step2_email_txt, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(step2_status_leb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, step2_pnlLayout.createSequentialGroup()
                        .addGroup(step2_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(step2_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(email_varify_step2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(step2_otp_varification, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(step2_otp_status_leb, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(step2_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(step2_counting_leb, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(step2_otp_varification_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)))
                .addContainerGap())
            .addGroup(step2_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(step2_pnlLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(step2_status_leb2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        step2_pnlLayout.setVerticalGroup(
            step2_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(step2_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(step2_email_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(email_varify_step2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(step2_status_leb, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(step2_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(step2_otp_varification, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(step2_otp_varification_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(step2_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(step2_counting_leb, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(step2_otp_status_leb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(47, 47, 47)
                .addComponent(jLabel7)
                .addContainerGap())
            .addGroup(step2_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, step2_pnlLayout.createSequentialGroup()
                    .addContainerGap(295, Short.MAX_VALUE)
                    .addComponent(step2_status_leb2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(202, 202, 202)))
        );

        main_pnl.add(step2_pnl, "card2");

        step3_pnl.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Mobile Number Verification");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Enter Your Register Mobile Number");

        step3_mobileno_txt.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        step3_mobileno_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        step3_mobileno_txt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                step3_mobileno_txtFocusGained(evt);
            }
        });
        step3_mobileno_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                step3_mobileno_txtActionPerformed(evt);
            }
        });
        step3_mobileno_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                step3_mobileno_txtKeyTyped(evt);
            }
        });

        step3_status_leb.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        step3_mobno_varification_btn.setBackground(new java.awt.Color(255, 255, 255));
        step3_mobno_varification_btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        step3_mobno_varification_btn.setText("Varify");
        step3_mobno_varification_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                step3_mobno_varification_btnActionPerformed(evt);
            }
        });

        step3_otp_varification.setEditable(false);
        step3_otp_varification.setBackground(new java.awt.Color(255, 255, 255));
        step3_otp_varification.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        step3_otp_varification.setText("Check OTP on Mobile Number");
        step3_otp_varification.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                step3_otp_varificationFocusGained(evt);
            }
        });
        step3_otp_varification.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                step3_otp_varificationKeyTyped(evt);
            }
        });

        step3_otp_varification_btn.setBackground(new java.awt.Color(255, 255, 255));
        step3_otp_varification_btn.setText("Varify");
        step3_otp_varification_btn.setEnabled(false);
        step3_otp_varification_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                step3_otp_varification_btnActionPerformed(evt);
            }
        });

        jLabel10.setText("G-80559223");

        step2_counting_leb1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        step2_counting_leb1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        step3_otp_status_leb.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout step3_pnlLayout = new javax.swing.GroupLayout(step3_pnl);
        step3_pnl.setLayout(step3_pnlLayout);
        step3_pnlLayout.setHorizontalGroup(
            step3_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(step3_pnlLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(step3_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(step3_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(step3_pnlLayout.createSequentialGroup()
                        .addGroup(step3_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(step3_pnlLayout.createSequentialGroup()
                                .addComponent(step3_otp_varification)
                                .addGap(61, 61, 61))
                            .addGroup(step3_pnlLayout.createSequentialGroup()
                                .addComponent(step3_otp_status_leb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(29, 29, 29)))
                        .addGroup(step3_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(step2_counting_leb1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(step3_otp_varification_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27))
                    .addGroup(step3_pnlLayout.createSequentialGroup()
                        .addComponent(step3_mobileno_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(step3_mobno_varification_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(step3_pnlLayout.createSequentialGroup()
                        .addComponent(step3_status_leb, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        step3_pnlLayout.setVerticalGroup(
            step3_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(step3_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(step3_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(step3_mobileno_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(step3_mobno_varification_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(step3_status_leb, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(step3_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(step3_otp_varification, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(step3_otp_varification_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(step3_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(step3_pnlLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addComponent(step2_counting_leb1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))
                    .addGroup(step3_pnlLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(step3_otp_status_leb, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabel10)
                .addContainerGap())
        );

        main_pnl.add(step3_pnl, "card2");

        step4_pnl.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton1.setText("Varify");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel11.setText("Step 4");

        javax.swing.GroupLayout step4_pnlLayout = new javax.swing.GroupLayout(step4_pnl);
        step4_pnl.setLayout(step4_pnlLayout);
        step4_pnlLayout.setHorizontalGroup(
            step4_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(step4_pnlLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(163, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, step4_pnlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        step4_pnlLayout.setVerticalGroup(
            step4_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, step4_pnlLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 365, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        main_pnl.add(step4_pnl, "card5");

        step5_pnl1.setBackground(new java.awt.Color(255, 255, 255));
        step5_pnl1.setPreferredSize(new java.awt.Dimension(536, 531));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Information Varification");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel15.setText("Name");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel16.setText("Adhar Number");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel17.setText("Date Of Birth");

        d1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        d1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        d1.setText("D");
        d1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                d1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                d1FocusLost(evt);
            }
        });
        d1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                d1KeyTyped(evt);
            }
        });

        d2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        d2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        d2.setText("D");
        d2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                d2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                d2FocusLost(evt);
            }
        });
        d2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                d2KeyTyped(evt);
            }
        });

        m1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        m1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        m1.setText("M");
        m1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                m1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                m1FocusLost(evt);
            }
        });
        m1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                m1KeyTyped(evt);
            }
        });

        m2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        m2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        m2.setText("M");
        m2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                m2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                m2FocusLost(evt);
            }
        });
        m2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                m2KeyTyped(evt);
            }
        });

        y1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        y1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        y1.setText("Y");
        y1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                y1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                y1FocusLost(evt);
            }
        });
        y1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                y1KeyTyped(evt);
            }
        });

        y2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        y2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        y2.setText("Y");
        y2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                y2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                y2FocusLost(evt);
            }
        });
        y2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                y2KeyTyped(evt);
            }
        });

        y3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        y3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        y3.setText("Y");
        y3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                y3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                y3FocusLost(evt);
            }
        });
        y3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                y3KeyTyped(evt);
            }
        });

        y4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        y4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        y4.setText("Y");
        y4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                y4FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                y4FocusLost(evt);
            }
        });
        y4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                y4KeyTyped(evt);
            }
        });

        ste5_varification_btn.setBackground(new java.awt.Color(255, 255, 255));
        ste5_varification_btn.setText("Varify");
        ste5_varification_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ste5_varification_btnActionPerformed(evt);
            }
        });

        aadhar_txt1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        aadhar_txt1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        aadhar_txt1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                aadhar_txt1FocusGained(evt);
            }
        });
        aadhar_txt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aadhar_txt1ActionPerformed(evt);
            }
        });
        aadhar_txt1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                aadhar_txt1KeyTyped(evt);
            }
        });

        aadhar_txt2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        aadhar_txt2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        aadhar_txt2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                aadhar_txt2FocusGained(evt);
            }
        });
        aadhar_txt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aadhar_txt2ActionPerformed(evt);
            }
        });
        aadhar_txt2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                aadhar_txt2KeyTyped(evt);
            }
        });

        aadhar_txt3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        aadhar_txt3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        aadhar_txt3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                aadhar_txt3FocusGained(evt);
            }
        });
        aadhar_txt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aadhar_txt3ActionPerformed(evt);
            }
        });
        aadhar_txt3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                aadhar_txt3KeyTyped(evt);
            }
        });

        step5_name_txt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                step5_name_txtFocusGained(evt);
            }
        });
        step5_name_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                step5_name_txtActionPerformed(evt);
            }
        });
        step5_name_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                step5_name_txtKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout step5_pnl1Layout = new javax.swing.GroupLayout(step5_pnl1);
        step5_pnl1.setLayout(step5_pnl1Layout);
        step5_pnl1Layout.setHorizontalGroup(
            step5_pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, step5_pnl1Layout.createSequentialGroup()
                .addGroup(step5_pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(step5_pnl1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(step5_pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(step5_pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(step5_pnl1Layout.createSequentialGroup()
                                .addGroup(step5_pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(step5_pnl1Layout.createSequentialGroup()
                                        .addComponent(d1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(d2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(m1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(aadhar_txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(step5_pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(step5_pnl1Layout.createSequentialGroup()
                                        .addComponent(aadhar_txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(aadhar_txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(step5_pnl1Layout.createSequentialGroup()
                                        .addComponent(m2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(y1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(y2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(y3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(y4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(step5_name_txt)))
                    .addGroup(step5_pnl1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(step5_status_leb, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ste5_varification_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        step5_pnl1Layout.setVerticalGroup(
            step5_pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(step5_pnl1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(step5_pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(step5_name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(step5_pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aadhar_txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aadhar_txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aadhar_txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(step5_pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(d1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(d2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(y1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(y2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(y3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(y4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(step5_pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(step5_pnl1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(step5_status_leb, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(step5_pnl1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(ste5_varification_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(89, Short.MAX_VALUE))
        );

        main_pnl.add(step5_pnl1, "card7");

        step6_pnl.setBackground(new java.awt.Color(255, 255, 255));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Changing Password");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Confirm Password");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setText("New Password");

        step6_pss_txt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        step6_confirm_pss_txt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        step6_cpacha_leb.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        step6_cpacha_leb.setText("w12Xy12w");

        step6_capcha_txt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        step6_capcha_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        step6_capcha_txt.setToolTipText("");

        step6_change_pass_btn.setBackground(new java.awt.Color(255, 255, 255));
        step6_change_pass_btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        step6_change_pass_btn.setText("Change Password");
        step6_change_pass_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                step6_change_pass_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout step6_pnlLayout = new javax.swing.GroupLayout(step6_pnl);
        step6_pnl.setLayout(step6_pnlLayout);
        step6_pnlLayout.setHorizontalGroup(
            step6_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
            .addGroup(step6_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(step6_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(step6_pnlLayout.createSequentialGroup()
                        .addGroup(step6_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, step6_pnlLayout.createSequentialGroup()
                        .addComponent(step6_cpacha_leb, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGroup(step6_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(step6_pnlLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(step6_capcha_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(step6_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(step6_change_pass_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(step6_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(step6_pss_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(step6_confirm_pss_txt)
                            .addComponent(step6_pass_status_leb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        step6_pnlLayout.setVerticalGroup(
            step6_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(step6_pnlLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(step6_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(step6_pss_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(step6_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(step6_confirm_pss_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(step6_pass_status_leb, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(step6_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(step6_cpacha_leb, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(step6_capcha_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addComponent(step6_change_pass_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        main_pnl.add(step6_pnl, "card7");

        title_pnl.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Forget Password ?");

        javax.swing.GroupLayout title_pnlLayout = new javax.swing.GroupLayout(title_pnl);
        title_pnl.setLayout(title_pnlLayout);
        title_pnlLayout.setHorizontalGroup(
            title_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        title_pnlLayout.setVerticalGroup(
            title_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel21.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel21MouseDragged(evt);
            }
        });
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel21MousePressed(evt);
            }
        });
        jPanel2.add(jLabel21);
        jLabel21.setBounds(0, 0, 660, 30);

        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        jPanel2.add(close);
        close.setBounds(730, 0, 30, 30);

        minimise.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimiseMouseClicked(evt);
            }
        });
        jPanel2.add(minimise);
        minimise.setBounds(680, 0, 30, 30);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/forget_pass_title_bar 1.png"))); // NOI18N
        jPanel2.add(jLabel19);
        jLabel19.setBounds(0, 0, 770, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(main_pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(title_pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 772, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(title_pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addComponent(main_pnl, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    void set_panel_visible_false(){
        step1_pnl.setVisible(false);
        step2_pnl.setVisible(false);
        step3_pnl.setVisible(false);
        step4_pnl.setVisible(false);
        step5_pnl1.setVisible(false);
        step6_pnl.setVisible(false);
    }
    
    void set_btn_editable_false(){
        step1_btn.setEnabled(false);
        step2_btn.setEnabled(false);
        step3_btn.setEnabled(false);
        step4_btn.setEnabled(false);
        step5_btn.setEnabled(false);
        step6_btn.setEnabled(false);        
        step6_change_pass_btn.setEnabled(false);
    }

    void get_data() throws SQLException{
        user_id = rs.getString("id");
        name = rs.getString("name");
        e_mail = rs.getString("e_mail_id");
        mob_no = rs.getString("mobile_no");
        aadhar_no1 = rs.getString("aadhar1");
        aadhar_no2 = rs.getString("aadhar2");
        aadhar_no3 = rs.getString("aadhar3");
        date1 = rs.getString("date");
        month = rs.getString("month");
        year1 = rs.getString("year");
    }
    private void step1_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_step1_btnActionPerformed
    }//GEN-LAST:event_step1_btnActionPerformed

    private void step1_userid_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_step1_userid_txtActionPerformed
    }//GEN-LAST:event_step1_userid_txtActionPerformed

    private void step1_userid_txtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_step1_userid_txtFocusGained
        step1_status_leb.setText("");
        step1_userid_txt.setText("");
    }//GEN-LAST:event_step1_userid_txtFocusGained

    private void check_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_btnActionPerformed
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery("select * from profile where id = '"+step1_userid_txt.getText()+"'");

            if(step1_userid_txt.getText().equals("")){
                step1_status_leb.setForeground(Color.BLACK);
                step1_status_leb.setText("Enter User ID");
            }
            else if(rs.next()){
                
                get_data();
                step1_status_leb.setForeground(Color.GREEN);
                step1_status_leb.setText("User ID Varification Successfully");

                set_panel_visible_false();
                set_btn_editable_false();

                step2_pnl.setVisible(true);
                step2_btn.setEnabled(true);
            }
            else{
                step1_status_leb.setForeground(Color.RED);
                step1_status_leb.setText("User ID is not Found");        
            }            
        } catch (SQLException ex) {
            Logger.getLogger(ForgetPass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_check_btnActionPerformed

    private void step2_email_txtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_step2_email_txtFocusGained
        step2_status_leb.setText("");
        step2_email_txt.setText("");
    }//GEN-LAST:event_step2_email_txtFocusGained

    private void step2_email_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_step2_email_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_step2_email_txtActionPerformed

    private void email_varify_step2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_varify_step2ActionPerformed
        if(step2_email_txt.getText().equals("")){
            step2_status_leb.setForeground(Color.BLACK);
            step2_status_leb.setText("Enter Email Id");
        }
        else if(step2_email_txt.getText().equals(e_mail)){
            step2_status_leb.setForeground(Color.GREEN);
            step2_status_leb.setText("Email ID Varification Successfully");
            step2_otp_varification.setEditable(true);
            step2_otp_varification_btn.setEnabled(true);
            step2_email_txt.setEditable(false);
            email_varify_step2.setEnabled(false);
            
            OTP = Utilities.randomNumber();
            
            if(InternetConnection.checkConnnection()){ // check your active Internet
                VarificationResources.varifyEmail(step2_email_txt.getText(), "MyBankingApplication for E-Mail Varification", 
                "Dear User Your Request for Email ID Varifiction is Accepted "
                + "\n\n Your OTP is "+ForgetPass.OTP+   // ForgetPass.OTP is a satatic String , that is contain Randome no generator
                "\n Please Do not share OTP with any other "
                + "\n Your OTP is Valid Upto 30 minutes "
                + "\n\n stay safe and stay home");//  otp sending on your given email 
                JOptionPane.showMessageDialog(null,"Check Your Email OTP IS send");
            }    
            else
                JOptionPane.showMessageDialog(null, "Check Active Internet Connection");
            
            jLabel7.setText(OTP);
            ThareadUtilities.NoVarification nv = tu.new NoVarification();
            nv.start();
        }
        else{
            step2_status_leb.setForeground(Color.RED);
            step2_status_leb.setText("Email ID is not Found");                    
        }
    }//GEN-LAST:event_email_varify_step2ActionPerformed

    private void step2_otp_varification_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_step2_otp_varification_btnActionPerformed
        if(step2_otp_varification.getText().equals("")){
            step2_otp_status_leb.setForeground(Color.BLACK);
            step2_otp_status_leb.setText("Enter OTP");
        }
        else if(step2_otp_varification.getText().equals(jLabel7.getText())){
            
            step2_otp_status_leb.setForeground(Color.GREEN);
            step2_otp_status_leb.setText("OTP is CORRECT");        
            
            set_btn_editable_false();
            set_panel_visible_false();
            
            step3_btn.setEnabled(true);
            step3_pnl.setVisible(true);
            
        }
        else {
            step2_otp_status_leb.setForeground(Color.RED);
            step2_otp_status_leb.setText("OTP is INCORRECT");
        }
    }//GEN-LAST:event_step2_otp_varification_btnActionPerformed

    private void step2_otp_varificationFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_step2_otp_varificationFocusGained
        step2_otp_varification.setText("");
    }//GEN-LAST:event_step2_otp_varificationFocusGained

    private void step3_mobileno_txtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_step3_mobileno_txtFocusGained
        step3_mobileno_txt.setText("");
    }//GEN-LAST:event_step3_mobileno_txtFocusGained

    private void step3_mobileno_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_step3_mobileno_txtActionPerformed

    }//GEN-LAST:event_step3_mobileno_txtActionPerformed

    private void step3_mobno_varification_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_step3_mobno_varification_btnActionPerformed
        
        if(step3_mobileno_txt.getText().equals("")){
            step3_status_leb.setForeground(Color.BLACK);
            step3_status_leb.setText("Enter Mobile Number");
        }
        else if(step3_mobileno_txt.getText().equals(mob_no)){
            
            step3_status_leb.setForeground(Color.GREEN);
            step3_status_leb.setText("Mobile Number Varification Successfully");
            
            step3_otp_varification.setEditable(true);
            step3_otp_varification_btn.setEnabled(true);
            step3_mobileno_txt.setEditable(false);
            step3_mobno_varification_btn.setEnabled(false);
            
        }
        else{
            
            step3_status_leb.setForeground(Color.RED);
            step3_status_leb.setText("Mobile Number Not Found");
            
        }
    }//GEN-LAST:event_step3_mobno_varification_btnActionPerformed

    private void step3_otp_varificationFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_step3_otp_varificationFocusGained
        step3_otp_varification.setText("");
    }//GEN-LAST:event_step3_otp_varificationFocusGained

    private void step3_otp_varification_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_step3_otp_varification_btnActionPerformed
        if(step3_otp_varification.getText().equals("")){
            
            step3_otp_varification.setForeground(Color.BLACK);
            step3_otp_status_leb.setText("Enter OTP");
        }
        if(step3_otp_varification.getText().equals("G80559223")){
            
            step3_otp_varification.setForeground(Color.GREEN);
            step3_otp_status_leb.setText("OTP Varification Successfully");
            
            set_panel_visible_false();
            set_btn_editable_false();
            
            step4_btn.setEnabled(true);
            step4_pnl.setVisible(true);
        }
        else{
            step3_otp_status_leb.setForeground(Color.RED);
            step3_otp_status_leb.setText("Enter Valid OTP ");
        }
    }//GEN-LAST:event_step3_otp_varification_btnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            set_panel_visible_false();
            set_btn_editable_false();
            
            step5_btn.setEnabled(true);
            step5_pnl1.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void d1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_d1FocusGained
        d1.setText("");
    }//GEN-LAST:event_d1FocusGained

    private void d2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_d2FocusGained
        d2.setText("");
    }//GEN-LAST:event_d2FocusGained

    private void m1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_m1FocusGained
        m1.setText("");
    }//GEN-LAST:event_m1FocusGained

    private void m2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_m2FocusGained
        m2.setText("");
    }//GEN-LAST:event_m2FocusGained

    private void y1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_y1FocusGained
        y1.setText("");
    }//GEN-LAST:event_y1FocusGained

    private void y2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_y2FocusGained
        y2.setText("");
    }//GEN-LAST:event_y2FocusGained

    private void y3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_y3FocusGained
        y3.setText("");
    }//GEN-LAST:event_y3FocusGained

    private void y4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_y4FocusGained
        y4.setText("");
    }//GEN-LAST:event_y4FocusGained

    private void ste5_varification_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ste5_varification_btnActionPerformed

        date = ""+y1.getText()+""+y2.getText()+""+y3.getText()+""+y4.getText();
        aadhar_no = ""+aadhar_txt1.getText()+""+aadhar_txt2.getText()+""+aadhar_txt3.getText();
        
        if(step5_name_txt.getText().equals("")){
            
            step5_status_leb.setForeground(Color.BLACK);
            step5_status_leb.setText("Enter Name");
            
        }
        else if(step5_name_txt.getText().equals(name)){
            step5_status_leb.setText("");
            
            if(aadhar_no.equals("")){            
                step5_status_leb.setForeground(Color.BLACK);
                step5_status_leb.setText("Enter Aadhar Number");
            }
            else if(aadhar_txt1.getText().equals(aadhar_no1) && aadhar_txt2.getText().equals(aadhar_no2) && aadhar_txt3.getText().equals(aadhar_no3)){
                step5_status_leb.setText("");
                
                if(date.equals("")){                
                    step5_status_leb.setForeground(Color.BLACK);
                    step5_status_leb.setText("Enter Date");                
                }
                else if(date1.equals(""+d1.getText()+""+d2.getText()) && month.equals(""+m1.getText()+""+m2.getText()) && year1.equals(date)){
                    step5_status_leb.setText("");
                    
                    set_panel_visible_false();
                    set_btn_editable_false();
                    
                    step6_change_pass_btn.setEnabled(true);
                    step6_pnl.setVisible(true);
                    step6_btn.setEnabled(true);
                }
                else{
                    step5_status_leb.setForeground(Color.RED);
                    step5_status_leb.setText("Invalid Date");   
                    
                }                
            }
            else{
                step5_status_leb.setForeground(Color.RED);
                step5_status_leb.setText("Invalid Addhar Number");
            }
        }
        else{
            step5_status_leb.setForeground(Color.RED);
            step5_status_leb.setText("Invalid Name");
        }
    }//GEN-LAST:event_ste5_varification_btnActionPerformed

    private void aadhar_txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aadhar_txt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aadhar_txt1ActionPerformed

    private void aadhar_txt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aadhar_txt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aadhar_txt2ActionPerformed

    private void aadhar_txt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aadhar_txt3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aadhar_txt3ActionPerformed

    private void step5_name_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_step5_name_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_step5_name_txtActionPerformed

    private void step5_name_txtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_step5_name_txtFocusGained
        step5_name_txt.setText("");
    }//GEN-LAST:event_step5_name_txtFocusGained

    private void aadhar_txt1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_aadhar_txt1FocusGained
        aadhar_txt1.setText("");
    }//GEN-LAST:event_aadhar_txt1FocusGained

    private void aadhar_txt2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_aadhar_txt2FocusGained
        aadhar_txt2.setText("");
    }//GEN-LAST:event_aadhar_txt2FocusGained

    private void aadhar_txt3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_aadhar_txt3FocusGained
        aadhar_txt3.setText("");
    }//GEN-LAST:event_aadhar_txt3FocusGained

    private void step6_change_pass_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_step6_change_pass_btnActionPerformed
         if(step6_pss_txt.getText().equals(step6_confirm_pss_txt.getText())){
            
            if(step6_capcha_txt.getText().equals("w12Xy12w")){
                try {
                    pst = con.prepareStatement("update log_in set password = ? where id = '"+step1_userid_txt.getText()+"'");
                    pst.setString(1,step6_confirm_pss_txt.getText());
                    pst.executeUpdate();
                } catch (SQLException ex) {
                    Logger.getLogger(ForgetPass.class.getName()).log(Level.SEVERE, null, ex);
                }
               new SingleClickNotification("Passwords Change Successfully","Close") {
                    @Override
                    public void getButtonAction() { dispose(); }

                    @Override
                    public void getCloseAction() { dispose(); }
                }; 
            }
            else{
                step6_capcha_txt.setText("Invalid Insertion");
            }
        }
        else{
            step6_pass_status_leb.setForeground(Color.RED);
            step6_pass_status_leb.setText("Password is not match");            
        }
    }//GEN-LAST:event_step6_change_pass_btnActionPerformed

    private void step3_mobileno_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_step3_mobileno_txtKeyTyped
        ch = evt.getKeyChar();
        if(!(Character.isDigit(ch))){
            evt.consume();
        }
        
        if(step3_mobileno_txt.getText().length() >= 9){
//            evt.consume();
            step3_mobileno_txt.transferFocus();
        }
    }//GEN-LAST:event_step3_mobileno_txtKeyTyped

    private void step5_name_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_step5_name_txtKeyTyped
        ch = evt.getKeyChar();
        if(!(Character.isAlphabetic(ch)) && !(Character.isWhitespace(ch))){
            evt.consume();
        } 
    }//GEN-LAST:event_step5_name_txtKeyTyped

    private void aadhar_txt1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_aadhar_txt1KeyTyped
        ch = evt.getKeyChar();
        if(!(Character.isDigit(ch))){
            evt.consume();            
        }
        if((aadhar_txt1.getText().length() >= 3)){
            aadhar_txt1.transferFocus();
        }
        
    }//GEN-LAST:event_aadhar_txt1KeyTyped

    private void aadhar_txt2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_aadhar_txt2KeyTyped
        ch = evt.getKeyChar();
        if(!(Character.isDigit(ch))){
            evt.consume();
        }
        if((aadhar_txt2.getText().length() >= 3)){
            aadhar_txt2.transferFocus();
        }        
    }//GEN-LAST:event_aadhar_txt2KeyTyped

    private void aadhar_txt3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_aadhar_txt3KeyTyped
        ch = evt.getKeyChar();
        if(!(Character.isDigit(ch))){
            evt.consume();
        }
        if((aadhar_txt3.getText().length() >= 3)){
            aadhar_txt3.transferFocus();
        }
    }//GEN-LAST:event_aadhar_txt3KeyTyped

    private void d1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_d1KeyTyped
        ch = evt.getKeyChar();
        if(!(Character.isDigit(ch))){
            evt.consume();
        }
        if((d1.getText().length() >= 0)){
            d1.transferFocus();
        }
    }//GEN-LAST:event_d1KeyTyped

    private void d2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_d2KeyTyped
        ch = evt.getKeyChar();
        if(!(Character.isDigit(ch))){
            evt.consume();
        }
        if((d2.getText().length() >= 0)){
            d2.transferFocus();
        }        
    }//GEN-LAST:event_d2KeyTyped

    private void m1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_m1KeyTyped
        ch = evt.getKeyChar();
        if(!(Character.isDigit(ch))){
            evt.consume();
        }
        if((m1.getText().length() >= 0)){
            m1.transferFocus();
        }
    }//GEN-LAST:event_m1KeyTyped

    private void m2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_m2KeyTyped
        ch = evt.getKeyChar();
        if(!(Character.isDigit(ch))){
            evt.consume();
        }
        if((m2.getText().length() >= 0)){
            m2.transferFocus();
        }        
    }//GEN-LAST:event_m2KeyTyped

    private void y1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_y1KeyTyped
        ch = evt.getKeyChar();
        if(!(Character.isDigit(ch))){
            evt.consume();
        }
        if((y1.getText().length() >= 0)){
            y1.transferFocus();
        }        
    }//GEN-LAST:event_y1KeyTyped

    private void y2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_y2KeyTyped
        ch = evt.getKeyChar();
        if(!(Character.isDigit(ch))){
            evt.consume();
        }
        if((y2.getText().length() >= 0)){
            y2.transferFocus();
        }        
    }//GEN-LAST:event_y2KeyTyped

    private void y3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_y3KeyTyped
        ch = evt.getKeyChar();
        if(!(Character.isDigit(ch))){
            evt.consume();
        }
        if((y3.getText().length() >= 0)){
            y3.transferFocus();
        }        
    }//GEN-LAST:event_y3KeyTyped

    private void y4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_y4KeyTyped
        ch = evt.getKeyChar();
        if(!(Character.isDigit(ch))){
            evt.consume();
        }
        if((y4.getText().length() >= 0)){
            y4.transferFocus();
        }        
    }//GEN-LAST:event_y4KeyTyped

    private void d1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_d1FocusLost
        if(d1.getText().equals("")){
            d1.setText("D");
        }
    }//GEN-LAST:event_d1FocusLost

    private void d2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_d2FocusLost
        if(d2.getText().equals("")){
            d2.setText("D");
        }
    }//GEN-LAST:event_d2FocusLost

    private void m1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_m1FocusLost
        if(m1.getText().equals("")){
            m1.setText("M");
        }
    }//GEN-LAST:event_m1FocusLost

    private void m2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_m2FocusLost
        if(m2.getText().equals("")){
            m2.setText("M");
        }
    }//GEN-LAST:event_m2FocusLost

    private void y1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_y1FocusLost
        if(y1.getText().equals("")){
            y1.setText("Y");
        }
    }//GEN-LAST:event_y1FocusLost

    private void y2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_y2FocusLost
        if(y2.getText().equals("")){
            y2.setText("Y");
        }
    }//GEN-LAST:event_y2FocusLost

    private void y3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_y3FocusLost
        if(y3.getText().equals("")){
            y3.setText("Y");
        }
    }//GEN-LAST:event_y3FocusLost

    private void y4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_y4FocusLost
        if(y4.getText().equals("")){
            y4.setText("Y");
        }
    }//GEN-LAST:event_y4FocusLost

    private void step2_otp_varificationKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_step2_otp_varificationKeyTyped
        ch = evt.getKeyChar();
        ch1 = '-';
        if(!(step2_otp_varification.getText().length() >= 10) && !(Character.isAlphabetic(ch)) && !(Character.isDigit(ch))){
            evt.consume();
        }
    }//GEN-LAST:event_step2_otp_varificationKeyTyped

    private void step3_otp_varificationKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_step3_otp_varificationKeyTyped
        ch = evt.getKeyChar();
        if(step3_otp_varification.getText().length() == 10 && Character.isWhitespace(ch)){
            evt.consume();
        }
    }//GEN-LAST:event_step3_otp_varificationKeyTyped

    private void minimiseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimiseMouseClicked
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_minimiseMouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        this.dispose();
    }//GEN-LAST:event_closeMouseClicked

    private void jLabel21MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseDragged
        x_drag = evt.getXOnScreen();
        y_drag = evt.getYOnScreen();
        
        this.setLocation(x_drag - x_press, y_drag - y_press);
    }//GEN-LAST:event_jLabel21MouseDragged

    private void jLabel21MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MousePressed
        x_press = evt.getX();
        y_press = evt.getY();
    }//GEN-LAST:event_jLabel21MousePressed

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
        JMusicPlayer("music//errorSound.mp3");
        dispose();
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
            java.util.logging.Logger.getLogger(ForgetPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForgetPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForgetPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForgetPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        
//        for (int i = 0; i <= 5; i++) {
//            final String percent=""+i;
//            try {
//                SwingUtilities.invokeLater(new Runnable() {
//                public void run() {
//                    step2_counting_leb.setText(percent);
//                }
//             });
//             java.lang.Thread.sleep(100);
//            } catch (InterruptedException e) {;}
//        }         
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForgetPass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aadhar_txt1;
    private javax.swing.JTextField aadhar_txt2;
    private javax.swing.JTextField aadhar_txt3;
    private javax.swing.JButton check_btn;
    private javax.swing.JLabel close;
    private javax.swing.JTextField d1;
    private javax.swing.JTextField d2;
    private javax.swing.JButton email_varify_step2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField m1;
    private javax.swing.JTextField m2;
    private javax.swing.JPanel main_pnl;
    private javax.swing.JLabel minimise;
    private javax.swing.JButton ste5_varification_btn;
    private javax.swing.JButton step1_btn;
    private javax.swing.JPanel step1_pnl;
    private javax.swing.JLabel step1_status_leb;
    private javax.swing.JTextField step1_userid_txt;
    private javax.swing.JButton step2_btn;
    public static javax.swing.JLabel step2_counting_leb;
    private javax.swing.JLabel step2_counting_leb1;
    public static javax.swing.JTextField step2_email_txt;
    private javax.swing.JLabel step2_otp_status_leb;
    private javax.swing.JTextField step2_otp_varification;
    private javax.swing.JButton step2_otp_varification_btn;
    private javax.swing.JPanel step2_pnl;
    private javax.swing.JLabel step2_status_leb;
    private javax.swing.JLabel step2_status_leb2;
    private javax.swing.JButton step3_btn;
    private javax.swing.JTextField step3_mobileno_txt;
    private javax.swing.JButton step3_mobno_varification_btn;
    private javax.swing.JLabel step3_otp_status_leb;
    private javax.swing.JTextField step3_otp_varification;
    private javax.swing.JButton step3_otp_varification_btn;
    private javax.swing.JPanel step3_pnl;
    private javax.swing.JLabel step3_status_leb;
    private javax.swing.JButton step4_btn;
    private javax.swing.JPanel step4_pnl;
    private javax.swing.JButton step5_btn;
    private javax.swing.JTextField step5_name_txt;
    private javax.swing.JPanel step5_pnl1;
    private javax.swing.JLabel step5_status_leb;
    private javax.swing.JButton step6_btn;
    private javax.swing.JTextField step6_capcha_txt;
    private javax.swing.JButton step6_change_pass_btn;
    private javax.swing.JPasswordField step6_confirm_pss_txt;
    private javax.swing.JLabel step6_cpacha_leb;
    private javax.swing.JLabel step6_pass_status_leb;
    private javax.swing.JPanel step6_pnl;
    private javax.swing.JPasswordField step6_pss_txt;
    private javax.swing.JPanel title_pnl;
    private javax.swing.JTextField y1;
    private javax.swing.JTextField y2;
    private javax.swing.JTextField y3;
    private javax.swing.JTextField y4;
    // End of variables declaration//GEN-END:variables
}
