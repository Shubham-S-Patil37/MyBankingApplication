package TansectionPKG;
import Database.DatabaseDriver;
import Database.ReLiveData;
import ExtraResources.QRReader;
import ExtraResources.ThareadUtilities;
import ExtraResources.TransactionManager;
import LoginControllerPKG.LogInFrame;
import static MainFramePkg.MainFrame.rd;
import java.awt.Toolkit;
import static MainFramePkg.MainFrame.ut;
import NotifocationComponents.SingleClickNotification;
import static TansectionPKG.CalculateRewards.getRewards;
import static TansectionPKG.SendMoney.senderBalance;
import java.awt.Color;
import java.sql.SQLException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UnsupportedLookAndFeelException;

public class PaymentGateWay extends javax.swing.JFrame {

    SingleClickNotification scn ;
    ExecutorService threadConnection = Executors.newCachedThreadPool();
    static PaymentGateWay gateWay = new PaymentGateWay("");

    public PaymentGateWay(String upi) {
        initComponents();
        editComponents();
        getData(upi);
        ReLiveData.clearSqlComponents();
    }

    void editComponents(){
        setLocationRelativeTo(null);
        frontPnl.setVisible(true);
        pinPnl.setVisible(false);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource(LogInFrame.img_path)));
        ut.editTextField(upiTxt,255, 102, 0);
        ut.editTextField(nameTxt, 255, 255, 255);
        ut.editTextField(transactionIDTxt,255, 102, 0);
        ut.editTextField(ammountTxt,255, 102, 0);
        ut.editTextField(pin1Txt,255, 102, 0);
        ut.editTextField(pin2Txt,255, 102, 0);
        ut.editTextField(pin3Txt,255, 102, 0);
        ut.editTextField(pin4Txt,255, 102, 0);
        ut.editTextField(resonTxt,255, 102, 0);
        ut.editButton(nextBtn);
        ut.editButton(copyBtn);
        ut.editButton(payBtn);
        ut.imageIcon(rsSymbol, "src//images//rs.png");
        ut.imageIcon(nextBtn, "src//images//payButton.png");
        ut.imageIcon(payBtn, "src//images//payBtn.png");
        ut.imageIcon(copyBtn, "src//images//copy.png");
        ut.imageIcon(senderImgCircleLeb, "src//images//circulerborder.png");
        ut.imageIcon(reciverImgCircleLeb, "src//images//circulerborder.png");
        ut.imageIcon(arrowLeb, "src//images//arrow.png");
    }

    void getData(String upiID){
        upiID = "patil.shubham1212@myBank";
        upiTxt.setText(upiID);
        transactionIDTxt.setText(TransactionManager.transactionID());
        rd.reLiveProfileData("upi_id", upiID);
        ut.imageIcon(profileLeb, rd.imgpath);
        ut.imageIcon(reciverImgLeb, rd.imgpath);
        rd.reLiveProfileData("acc_no", LogInFrame.account_no);
        ut.imageIcon(senderImgLeb, rd.imgpath);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPnl = new javax.swing.JPanel();
        introPnl = new javax.swing.JPanel();
        profileLeb = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        dynamicPnl = new javax.swing.JPanel();
        frontPnl = new javax.swing.JPanel();
        rsSymbol = new javax.swing.JLabel();
        upiTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        nextBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        transactionIDTxt = new javax.swing.JTextField();
        ammountTxt = new javax.swing.JTextField();
        copyBtn = new javax.swing.JToggleButton();
        pinPnl = new javax.swing.JPanel();
        pin1Txt = new javax.swing.JPasswordField();
        pin2Txt = new javax.swing.JPasswordField();
        pin3Txt = new javax.swing.JPasswordField();
        pin4Txt = new javax.swing.JPasswordField();
        resonTxt = new javax.swing.JTextField();
        senderImgCircleLeb = new javax.swing.JLabel();
        reciverImgCircleLeb = new javax.swing.JLabel();
        arrowLeb = new javax.swing.JLabel();
        payBtn = new javax.swing.JButton();
        reciverImgLeb = new javax.swing.JLabel();
        senderImgLeb = new javax.swing.JLabel();
        resonLeb = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        mainPnl.setBackground(new java.awt.Color(255, 255, 255));

        introPnl.setBackground(new java.awt.Color(255, 102, 0));

        profileLeb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        nameTxt.setEditable(false);
        nameTxt.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        nameTxt.setForeground(new java.awt.Color(255, 255, 255));
        nameTxt.setText("Shubham S Patil");
        nameTxt.setBorder(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Paying To");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout introPnlLayout = new javax.swing.GroupLayout(introPnl);
        introPnl.setLayout(introPnlLayout);
        introPnlLayout.setHorizontalGroup(
            introPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(introPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(introPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameTxt)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, introPnlLayout.createSequentialGroup()
                        .addGap(0, 15, Short.MAX_VALUE)
                        .addComponent(profileLeb, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 15, Short.MAX_VALUE))
                    .addGroup(introPnlLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        introPnlLayout.setVerticalGroup(
            introPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(introPnlLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(profileLeb, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(240, Short.MAX_VALUE))
        );

        dynamicPnl.setBackground(new java.awt.Color(255, 255, 255));
        dynamicPnl.setLayout(new java.awt.CardLayout());

        frontPnl.setBackground(new java.awt.Color(255, 255, 255));

        upiTxt.setEditable(false);
        upiTxt.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("UPI ID");

        nextBtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        nextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Transaction ID");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        transactionIDTxt.setEditable(false);
        transactionIDTxt.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        transactionIDTxt.setText("abcd12-34343-123dfg-12dfg532-sdg1");

        ammountTxt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ammountTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ammountTxt.setText("50");

        copyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout frontPnlLayout = new javax.swing.GroupLayout(frontPnl);
        frontPnl.setLayout(frontPnlLayout);
        frontPnlLayout.setHorizontalGroup(
            frontPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frontPnlLayout.createSequentialGroup()
                .addGroup(frontPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frontPnlLayout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(frontPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(frontPnlLayout.createSequentialGroup()
                                .addComponent(transactionIDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(copyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(upiTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(frontPnlLayout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addGroup(frontPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(frontPnlLayout.createSequentialGroup()
                                .addComponent(rsSymbol, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(ammountTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        frontPnlLayout.setVerticalGroup(
            frontPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frontPnlLayout.createSequentialGroup()
                .addContainerGap(125, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(upiTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(frontPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(transactionIDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(copyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(106, 106, 106)
                .addGroup(frontPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rsSymbol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ammountTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75)
                .addComponent(nextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );

        dynamicPnl.add(frontPnl, "card2");

        pinPnl.setBackground(new java.awt.Color(255, 255, 255));
        pinPnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pin1Txt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        pin1Txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pin1Txt.setText("p");
        pin1Txt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pin1Txt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pin1TxtFocusGained(evt);
            }
        });
        pin1Txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pin1TxtKeyTyped(evt);
            }
        });
        pinPnl.add(pin1Txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, 40, 40));

        pin2Txt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        pin2Txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pin2Txt.setText("p");
        pin2Txt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pin2Txt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pin2TxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pin2TxtFocusLost(evt);
            }
        });
        pin2Txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pin2TxtKeyTyped(evt);
            }
        });
        pinPnl.add(pin2Txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 400, 40, 40));

        pin3Txt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        pin3Txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pin3Txt.setText("p");
        pin3Txt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pin3Txt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pin3TxtFocusGained(evt);
            }
        });
        pin3Txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pin3TxtKeyTyped(evt);
            }
        });
        pinPnl.add(pin3Txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 400, 40, 40));

        pin4Txt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        pin4Txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pin4Txt.setText("p");
        pin4Txt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pin4Txt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pin4TxtFocusGained(evt);
            }
        });
        pin4Txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pin4TxtActionPerformed(evt);
            }
        });
        pin4Txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pin4TxtKeyTyped(evt);
            }
        });
        pinPnl.add(pin4Txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 400, 40, 40));

        resonTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        resonTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        resonTxt.setText("What is this for? 1");
        resonTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                resonTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                resonTxtFocusLost(evt);
            }
        });
        pinPnl.add(resonTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 530, 529, 34));
        pinPnl.add(senderImgCircleLeb, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 100, 100));
        pinPnl.add(reciverImgCircleLeb, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, 100, 100));
        pinPnl.add(arrowLeb, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 100, 60));

        payBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payBtnActionPerformed(evt);
            }
        });
        pinPnl.add(payBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 640, 280, 80));
        pinPnl.add(reciverImgLeb, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, 100, 100));
        pinPnl.add(senderImgLeb, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 100, 100));

        resonLeb.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pinPnl.add(resonLeb, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 496, 290, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("UPI PIN");
        pinPnl.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 800, 50));

        dynamicPnl.add(pinPnl, "card2");

        javax.swing.GroupLayout mainPnlLayout = new javax.swing.GroupLayout(mainPnl);
        mainPnl.setLayout(mainPnlLayout);
        mainPnlLayout.setHorizontalGroup(
            mainPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPnlLayout.createSequentialGroup()
                .addComponent(introPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(dynamicPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainPnlLayout.setVerticalGroup(
            mainPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPnlLayout.createSequentialGroup()
                .addGroup(mainPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(introPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dynamicPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void copyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyBtnActionPerformed
        ut.copyText(transactionIDTxt.getText());
        copyBtn.setToolTipText("Copied");
    }//GEN-LAST:event_copyBtnActionPerformed

    private void pin1TxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pin1TxtFocusGained
        pin1Txt.setText("");
    }//GEN-LAST:event_pin1TxtFocusGained

    private void pin1TxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pin1TxtKeyTyped
        ut.isDigit(evt);
        if(pin1Txt.getText().length() <= 1)
            pin1Txt.transferFocus();
    }//GEN-LAST:event_pin1TxtKeyTyped

    private void pin2TxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pin2TxtFocusGained
        pin2Txt.setText("");
    }//GEN-LAST:event_pin2TxtFocusGained

    private void pin2TxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pin2TxtFocusLost

    }//GEN-LAST:event_pin2TxtFocusLost

    private void pin2TxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pin2TxtKeyTyped
        ut.isDigit(evt);
        if(pin2Txt.getText().length() <= 1)
            pin2Txt.transferFocus();
    }//GEN-LAST:event_pin2TxtKeyTyped

    private void pin3TxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pin3TxtFocusGained
        pin3Txt.setText("");
    }//GEN-LAST:event_pin3TxtFocusGained

    private void pin3TxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pin3TxtKeyTyped
        ut.isDigit(evt);
        if(pin3Txt.getText().length() <= 1)
            pin3Txt.transferFocus();
    }//GEN-LAST:event_pin3TxtKeyTyped

    private void pin4TxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pin4TxtFocusGained
        pin4Txt.setText("");
    }//GEN-LAST:event_pin4TxtFocusGained

    private void pin4TxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pin4TxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pin4TxtActionPerformed

    private void pin4TxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pin4TxtKeyTyped
        ut.isDigit(evt);
        if(pin4Txt.getText().length() <= 1)
            pin4Txt.transferFocus();
    }//GEN-LAST:event_pin4TxtKeyTyped

    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnActionPerformed
        if(upiTxt.getText().equals(""))
            JOptionPane.showMessageDialog(null, "Invalid Upi ID");
        else if(transactionIDTxt.getText().equals(""))
            JOptionPane.showMessageDialog(null, "Invalid Transaction ID");
        else if(ammountTxt.getText().equals("") || ammountTxt.getText().equals("0")){
            scn = new SingleClickNotification("Enter Valid Ammount", "Close") {
                @Override
                public void getButtonAction() {
                    scn.dispose();
                }

                @Override
                public void getCloseAction() {
                    scn.dispose();
                }
            };
            scn.show();
        }
        else{
            frontPnl.setVisible(false);
            pinPnl.setVisible(true);
        }
    }//GEN-LAST:event_nextBtnActionPerformed

    private void resonTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_resonTxtFocusGained
        ut.textFocusGain(resonLeb, resonTxt, "What is this for?");
    }//GEN-LAST:event_resonTxtFocusGained

    private void resonTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_resonTxtFocusLost
//        ut.textFocusLost(resonLeb, resonTxt, "What is this for?");
        System.out.println("textFocusLost :- "+resonTxt.getText());
    }//GEN-LAST:event_resonTxtFocusLost

    private void payBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payBtnActionPerformed
        payBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/GIF/payBtn.gif")));
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        threadConnection.submit(gateWay.new ThreadExecutor());
    }//GEN-LAST:event_payBtnActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
//        threadConnection.shutdown();
    }//GEN-LAST:event_formWindowClosing

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(PaymentGateWay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaymentGateWay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaymentGateWay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaymentGateWay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaymentGateWay(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ammountTxt;
    private javax.swing.JLabel arrowLeb;
    private javax.swing.JToggleButton copyBtn;
    private javax.swing.JPanel dynamicPnl;
    private javax.swing.JPanel frontPnl;
    private javax.swing.JPanel introPnl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel mainPnl;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JButton nextBtn;
    private javax.swing.JButton payBtn;
    public static javax.swing.JPasswordField pin1Txt;
    public static javax.swing.JPasswordField pin2Txt;
    public static javax.swing.JPasswordField pin3Txt;
    public static javax.swing.JPasswordField pin4Txt;
    private javax.swing.JPanel pinPnl;
    private javax.swing.JLabel profileLeb;
    private javax.swing.JLabel reciverImgCircleLeb;
    private javax.swing.JLabel reciverImgLeb;
    private javax.swing.JLabel resonLeb;
    private javax.swing.JTextField resonTxt;
    private javax.swing.JLabel rsSymbol;
    private javax.swing.JLabel senderImgCircleLeb;
    private javax.swing.JLabel senderImgLeb;
    private javax.swing.JTextField transactionIDTxt;
    private javax.swing.JTextField upiTxt;
    // End of variables declaration//GEN-END:variables

    public String getUpiPin(){
        return pin1Txt.getText()+""+pin2Txt.getText()+""+pin3Txt.getText()+""+pin4Txt.getText();
    }

    public class ThreadExecutor implements Runnable{

        @Override
        public void run() {
        rd.reLiveProfileData("acc_no",LogInFrame.account_no);
        senderBalance = Integer.parseInt(ReLiveData.balance);   
        if (getUpiPin().equals(ReLiveData.upipin)) {
            if(rd.reLiveProfileData("upi_id",upiTxt.getText())){
                if(senderBalance > Integer.parseInt(ammountTxt.getText())){
                        ReLiveData.balance = ""+(Integer.parseInt(ReLiveData.balance)+ Integer.parseInt(ammountTxt.getText()));
                    try {
                        System.out.println("Receiver Balance "+ReLiveData.balance);                  //************
                        rd.pst = rd.con.prepareStatement("UPDATE profile set balance = '"+ReLiveData.balance +"' where upi_id = '"+upiTxt.getText()+"'");
                        rd.pst.executeUpdate();

                        senderBalance = senderBalance - Integer.parseInt(ammountTxt.getText());
                        rd.pst = rd.con.prepareStatement("UPDATE profile set balance = '"+senderBalance+"' where id = '"+LogInFrame.userID+"'");
                        rd.pst.executeUpdate();
                        System.out.println("Sender Balance "+senderBalance);                        //************

                        getRewards(Integer.parseInt(ammountTxt.getText()));

                        rd.reLiveProfileData("upi_id", upiTxt.getText());
                        rd.insertORupdateDataBase("insert into Transection(SenderAccountNo  ,SenderUserID  ,SenderUPI  ,ReciverAccountNo        ,ReciverUserID          ,ReciverUPI              ,Date                 ,Ammount                   ,SenderTransectionType,ReciverTransectionType,Rewards                         ,TransactionID                            ,Reson) "
                            + "values('"+LogInFrame.account_no+"'  ,'"+LogInFrame.userID+"' ,'"+LogInFrame.upi_id+"'   ,'"+ReLiveData.accno+"'  ,'"+ReLiveData.userid+"','"+ReLiveData.upi_id+"' ,'"+LogInFrame.date+"','"+ammountTxt.getText()+"','send'               ,'recive'              ,'"+CalculateRewards.getNumber+"','"+TransactionManager.transactionID()+"','"+getReson()+"')");
                        getReson1();
                    } catch (SQLException ex) {
                        Logger.getLogger(SendMoney.class.getName()).log(Level.SEVERE, null, ex);
                    }            
                }
                else
                    JOptionPane.showMessageDialog(null,"Insufficient Balance");
            }
        }
        else
            JOptionPane.showMessageDialog(null,"Invalid UPI PIN");

            ThareadUtilities.getDelayTime(8000);
            QRReader.gateWay.dispose();
//            getRewards(Integer.parseInt(ammountTxt.getText()));
        }
    }
    
    String getReson(){
        return (resonTxt.getText().equals("") || resonTxt.getText().equals("What is this for?") ? "no reson found" : resonTxt.getText());
    }
    
    void getReson1(){
        if(resonTxt.getText().equals("") || resonTxt.getText().equals("What is this for?"))
            System.out.println(resonTxt.getText());
        else
            System.out.println(resonTxt.getText());
    }
}
