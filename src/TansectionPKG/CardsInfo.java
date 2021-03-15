package TansectionPKG;
import Database.ReLiveData;
import static Database.ReLiveData.insertORupdateDataBase;
import ExtraResources.GraphicsComponents;
import ExtraResources.TransactionManager;
import ExtraResources.Utilities;
import static ExtraResources.Utilities.getDataKeyTyped;
import static ExtraResources.Utilities.transferFocus;
import static ExtraResources.Utilities.isDigit;
import LoginControllerPKG.LogInFrame;
import NotifocationComponents.SingleClickNotification;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CardsInfo extends javax.swing.JFrame {

    public static CardsInfo ci ;
    char ch;
    ReLiveData rd = new ReLiveData();
//     String str = null;
    public CardsInfo() {
        initComponents();
        setExtendedState(this.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource(LogInFrame.img_path)));
        TransactionManager.componentsManager();
        jLabel4.setText("");
        jPanel1.setOpaque(true);
        jLabel5.setText("");
        jPanel2.setVisible(true);
        jPanel4.setVisible(false);
        jLabel6.setText("");
        jLabel10.setText("");
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        nameLeb = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        no1 = new javax.swing.JTextField();
        no2 = new javax.swing.JTextField();
        no3 = new javax.swing.JTextField();
        no4 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        MonthCB = new javax.swing.JComboBox<>();
        yearTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        ContinueBtn = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        MoblieNo1 = new javax.swing.JTextField();
        otpTxt1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        ContinueBtn1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        refreshBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cardsImgLeb = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setVerifyInputWhenFocusTarget(false);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.CardLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Enter Card Details");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Full Name");

        nameTxt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        nameTxt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        nameTxt.setText("Full Name");
        nameTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nameTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nameTxtFocusLost(evt);
            }
        });
        nameTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameTxtKeyTyped(evt);
            }
        });

        no1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        no1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        no1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                no1KeyTyped(evt);
            }
        });

        no2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        no2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        no2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no2ActionPerformed(evt);
            }
        });
        no2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                no2KeyTyped(evt);
            }
        });

        no3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        no3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        no3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                no3KeyTyped(evt);
            }
        });

        no4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        no4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        no4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                no4KeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Card Number");

        MonthCB.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        MonthCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jan", "Feb", "March", "April", "May", "June", "July", "Aug", "Sept", "Oct", "Nov", "Dec" }));

        yearTxt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        yearTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        yearTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                yearTxtKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Expiery Date");

        ContinueBtn.setBackground(new java.awt.Color(255, 255, 255));
        ContinueBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContinueBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(179, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nameLeb, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(no1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(no2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(no3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(no4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameTxt)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(209, 209, 209)
                                .addComponent(ContinueBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(MonthCB, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(yearTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(156, 156, 156))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(nameLeb, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(no1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(no2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(no3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(no4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(MonthCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(yearTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 155, Short.MAX_VALUE)
                        .addComponent(ContinueBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))))
        );

        jPanel3.add(jPanel2, "card2");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        MoblieNo1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        MoblieNo1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        MoblieNo1.setText("Mobile Number");
        MoblieNo1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                MoblieNo1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                MoblieNo1FocusLost(evt);
            }
        });
        MoblieNo1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                MoblieNo1KeyTyped(evt);
            }
        });

        otpTxt1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        otpTxt1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        otpTxt1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                otpTxt1KeyTyped(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel15.setText("OTP");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("20");

        ContinueBtn1.setBackground(new java.awt.Color(255, 255, 255));
        ContinueBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContinueBtn1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Enter Register Mobile Number");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("OTP is arleady send to your register Mobile Number");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Varify");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        refreshBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                refreshBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                refreshBtnMouseExited(evt);
            }
        });
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setText("Resend OTP");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Moblie Number");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(73, 73, 73)
                                .addComponent(otpTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(71, 71, 71)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(MoblieNo1)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(209, 209, 209)
                                .addComponent(refreshBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(189, 189, 189)
                                .addComponent(ContinueBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(148, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(87, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MoblieNo1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(otpTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(refreshBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(ContinueBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );

        jPanel3.add(jPanel4, "card2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(cardsImgLeb, javax.swing.GroupLayout.PREFERRED_SIZE, 1060, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(cardsImgLeb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

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

    String cardNumber(){
        return no1.getText()+""+no2.getText()+""+no3.getText()+""+no4.getText();
    }
    
    int reciverBalance(){
        rd.reLiveProfileData("acc_no", CardsConfiramation.Accno);
        int Balance = Integer.parseInt(ReLiveData.balance) + Integer.parseInt(CardsConfiramation.ammount);
        return Balance;
    }
    int senderBalance(){
        rd.reLiveProfileData("id", LogInFrame.userID);
        int balance = Integer.parseInt(ReLiveData.balance) - Integer.parseInt(CardsConfiramation.ammount);
        return balance;
    }
    private void nameTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameTxtFocusGained
        nameTxt.setText("");
        jLabel4.setText("Full Name");
    }//GEN-LAST:event_nameTxtFocusGained

    private void nameTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameTxtFocusLost
        if(nameTxt.getText().equals("")){
            nameTxt.setText("Full Name");
            jLabel4.setText("");
        }
    }//GEN-LAST:event_nameTxtFocusLost

    private void no1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_no1KeyTyped
        isDigit(evt);
        Utilities.transferFocus(no1, 4);
    }//GEN-LAST:event_no1KeyTyped

    private void no2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_no2KeyTyped
        isDigit(evt);
        Utilities.transferFocus(no2, 4);
    }//GEN-LAST:event_no2KeyTyped

    private void no3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_no3KeyTyped
        isDigit(evt);
        Utilities.transferFocus(no3, 4);
    }//GEN-LAST:event_no3KeyTyped

    private void no4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_no4KeyTyped
        isDigit(evt);
        Utilities.transferFocus(no4, 4);
    }//GEN-LAST:event_no4KeyTyped

    private void yearTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_yearTxtKeyTyped
        Utilities.isDigit(evt);
        Utilities.transferFocus(yearTxt, 4);
    }//GEN-LAST:event_yearTxtKeyTyped

    private void nameTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameTxtKeyTyped
        Utilities.isChar(evt);
        try {
            getDataKeyTyped(nameTxt, nameLeb);
        } catch (InterruptedException ex) {
            Logger.getLogger(CardsInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_nameTxtKeyTyped

    private void ContinueBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContinueBtnActionPerformed
        ReLiveData.reLiveCardsData("AccountNo", LogInFrame.account_no);
        if(!nameTxt.getText().equals(ReLiveData.name))
            JOptionPane.showMessageDialog(null, "Invalid Name");
        else if(!cardNumber().equals(ReLiveData.cardNumber))
            JOptionPane.showMessageDialog(null, "Invalid Card Number");
        else if(!TransactionManager.getGeneratedExpiery().equals(ReLiveData.expiery))
            JOptionPane.showMessageDialog(null, "Invalid Expiery Date");
        else{
            jPanel2.setVisible(false);
            jPanel4.setVisible(true);
        }
    }//GEN-LAST:event_ContinueBtnActionPerformed

    private void MoblieNo1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MoblieNo1FocusGained
        jLabel6.setText("Moblie Number");
        MoblieNo1.setText("");
    }//GEN-LAST:event_MoblieNo1FocusGained

    private void MoblieNo1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MoblieNo1FocusLost
        Utilities.textFocusLost(jLabel6, MoblieNo1, "Moblie Number");
    }//GEN-LAST:event_MoblieNo1FocusLost

    private void ContinueBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContinueBtn1ActionPerformed
        if(!MoblieNo1.getText().equals(ReLiveData.mobileno))
            JOptionPane.showMessageDialog(null, "Invalid OTP Check your Entered OTP");
        else if(!otpTxt1.getText().equals(OtpManager.OTP))
            JOptionPane.showMessageDialog(null, "Invalid OTP Check your Entered OTP");
        else{
            insertORupdateDataBase("update profile set balance = '"+reciverBalance()+"' where '"+ReLiveData.accno+"' = '"+CardsConfiramation.Accno+"' ");
            insertORupdateDataBase("update profile set balance = '"+senderBalance()+"' where AccountNo = '"+LogInFrame.account_no+"' ");
            rd.reLiveProfileData("acc_no", CardsConfiramation.Accno);
            insertORupdateDataBase("insert into Transection(SenderAccountNo,SenderUserID,SenderUPI,ReciverAccountNo,ReciverUserID,ReciverUPI,Date,Ammount,SenderTransectionType,ReciverTransectionType,Rewards,TransactionID) "
                + "values('"+LogInFrame.account_no+"','"+LogInFrame.userID+"','"+LogInFrame.upi_id+"','"+ReLiveData.accno+"','"+ReLiveData.userid+"','"+ReLiveData.upi_id+"','"+LogInFrame.date+"','"+CardsConfiramation.ammount+"','send','recive','"+CalculateRewards.getNumber+"','"+TransactionManager.transactionID()+"')");
            CalculateRewards.getRewards(Integer.parseInt(CardsConfiramation.ammount));
            new SingleClickNotification("Your Tranzection Completed successfully", "Done") {
                @Override
                public void getButtonAction() {
                    dispose();
                    ci.dispose();
                }
                public void getCloseAction() {
                    dispose();
                    ci.dispose();
                }
            }.show();
        }
    }//GEN-LAST:event_ContinueBtn1ActionPerformed

    private void refreshBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshBtnMouseEntered
        jLabel5.setText("Resend OTP");
    }//GEN-LAST:event_refreshBtnMouseEntered

    private void refreshBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshBtnMouseExited
        jLabel5.setText("");
    }//GEN-LAST:event_refreshBtnMouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        rd.reLiveProfileData("id", LogInFrame.userID);
        if(MoblieNo1.getText().equals(ReLiveData.mobileno)){
            new OtpManager().show();
            jLabel10.setText("OTP is arleady send to your register Mobile Number");
        }
        else{
            JOptionPane.showMessageDialog(null, "Invalid Mobile Number");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void MoblieNo1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MoblieNo1KeyTyped
        Utilities.isDigit(evt);
    }//GEN-LAST:event_MoblieNo1KeyTyped

    private void otpTxt1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_otpTxt1KeyTyped
        Utilities.isDigit(evt);
    }//GEN-LAST:event_otpTxt1KeyTyped

    private void no2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_no2ActionPerformed

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        new OtpManager().show();
    }//GEN-LAST:event_refreshBtnActionPerformed

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
            java.util.logging.Logger.getLogger(CardsInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CardsInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CardsInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CardsInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ci = new CardsInfo();
                ci.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton ContinueBtn;
    public static javax.swing.JButton ContinueBtn1;
    public static javax.swing.JTextField MoblieNo1;
    public static javax.swing.JComboBox<String> MonthCB;
    public static javax.swing.JLabel cardsImgLeb;
    public static javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    public static javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    public static javax.swing.JLabel nameLeb;
    public static javax.swing.JTextField nameTxt;
    public static javax.swing.JTextField no1;
    public static javax.swing.JTextField no2;
    public static javax.swing.JTextField no3;
    public static javax.swing.JTextField no4;
    public static javax.swing.JTextField otpTxt1;
    public static javax.swing.JButton refreshBtn;
    public static javax.swing.JTextField yearTxt;
    // End of variables declaration//GEN-END:variables

}
