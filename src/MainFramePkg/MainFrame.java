package MainFramePkg;
import MailVarification.ForgetPass;
import Database.ReLiveData;
import Database.DatabaseDriver;
import static Database.ReLiveData.con;
import TansectionPKG.SendMoney;
import ExtraResources.*;
import static ExtraResources.Imager.ImageManager;
import TansectionPKG.CardsConfiramation;
import TansectionPKG.QRCode;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.border.LineBorder;
import NotifocationComponents.NotificationPnl;
import ExtraResources.Utilities;
import LoginControllerPKG.AddNewUser;
import LoginControllerPKG.GetLogIn;
import static MainFramePkg.ViewMode.selectViewMode;
import TansectionPKG.MoneyRequst;
import LoginControllerPKG.LogInFrame;
import LoginControllerPKG.LogInFrame;
import MailVarification.SendMail;
import static MainFramePkg.ThreadManager.loan;
import NotifocationComponents.DoubleClickNotification;
import NotifocationComponents.NotificationCollector;
import NotifocationComponents.SingleClickNotification;
import TansectionPKG.ScanQR;
import java.awt.Desktop;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

public class MainFrame extends javax.swing.JFrame {
    char ch;
    public static int percentags,forI = 0 ,tableIndex = 0, Xpress, Ypress;
    public static Boolean mailFlage= true;
    public static String accountNo,accountNo1,img_path,get_block_flag,str="",str1,DarkMode="OFF",cardNo1,cardNo2,cardNo3,cardName,UniqueId;
    public static Utilities ut  = new Utilities();              public static ReLiveData rd = new ReLiveData(); public static ScanQR sqr;
    public static ThreadManager manager = new ThreadManager();  public static Visibility v = new Visibility();  public static loadingPnl lp;
    ServicesManagement sm = new ServicesManagement();           ServicesManagement.Cards cd = sm.new Cards();   public static ContactUSComponents cus;
    public static MainFrame frame ; // = new MainFrame();


    public MainFrame(){
/*
            icon delay problem arrvies due to
            initcomponents is not working in thread
            first initcomponents complete their construction then all thread stars working

                              btn pnl                   dynamic pnl
        Horizontal Size	 =      240                        1675
        Vertical Size	 =      966                        966
*/
        initComponents();
        setLocationRelativeTo(null);
        con = DatabaseDriver.Connect();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource(LogInFrame.img_path)));
        contactUSAddPnl.setBackground(new Color(0,0,0,0));
        menu_pnl.setSize(244, 970);
        dynamic_pnl.setSize(1657, 970);
        setSize(1897, 1000);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gender = new javax.swing.ButtonGroup();
        menu_pnl = new javax.swing.JPanel();
        profile_leb = new javax.swing.JLabel();
        profile_btn = new javax.swing.JButton();
        servese_btn = new javax.swing.JButton();
        tranzection_btn = new javax.swing.JButton();
        my_link_btn = new javax.swing.JButton();
        logout_btn = new javax.swing.JButton();
        setting_btn = new javax.swing.JButton();
        addUser_btn = new javax.swing.JButton();
        notificationBtn = new javax.swing.JButton();
        home_btn = new javax.swing.JButton();
        dynamic_pnl = new javax.swing.JPanel();
        front_pnl = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        acc_no_txt_leb = new javax.swing.JLabel();
        acc_no_leb = new javax.swing.JLabel();
        frontPnl_QRLeb = new javax.swing.JLabel();
        upi_leb = new javax.swing.JLabel();
        upi_txt_leb = new javax.swing.JLabel();
        bal_txt_leb = new javax.swing.JLabel();
        balance_leb = new javax.swing.JLabel();
        logoLeb = new javax.swing.JLabel();
        set_leb = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        profile_pnl = new javax.swing.JPanel();
        profile_cancle_btn = new javax.swing.JButton();
        profile_photo_leb = new javax.swing.JLabel();
        profile_upload_btn = new javax.swing.JButton();
        profile_name = new javax.swing.JLabel();
        profile_email = new javax.swing.JLabel();
        profile_upi = new javax.swing.JLabel();
        name_txt = new javax.swing.JTextField();
        email_txt = new javax.swing.JTextField();
        upi_txt = new javax.swing.JTextField();
        profile_id = new javax.swing.JLabel();
        user_id = new javax.swing.JTextField();
        profile_conatact_no = new javax.swing.JLabel();
        contact_txt = new javax.swing.JTextField();
        profile_save_btn = new javax.swing.JButton();
        profile_aadhar = new javax.swing.JLabel();
        aadhar_txt1 = new javax.swing.JTextField();
        aadhar_txt2 = new javax.swing.JTextField();
        aadhar_txt3 = new javax.swing.JTextField();
        d1 = new javax.swing.JTextField();
        d2 = new javax.swing.JTextField();
        m1 = new javax.swing.JTextField();
        m2 = new javax.swing.JTextField();
        y1 = new javax.swing.JTextField();
        y2 = new javax.swing.JTextField();
        y3 = new javax.swing.JTextField();
        y4 = new javax.swing.JTextField();
        profile_dob = new javax.swing.JLabel();
        error_leb = new javax.swing.JLabel();
        gender_leb = new javax.swing.JLabel();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        services_pnl = new javax.swing.JPanel();
        sub_services_pnl = new javax.swing.JPanel();
        services_pnl_cancle_btn = new javax.swing.JButton();
        cards_btn = new javax.swing.JButton();
        investment_btn = new javax.swing.JButton();
        loan_btn = new javax.swing.JButton();
        invite_btn = new javax.swing.JButton();
        my_app_sevices_btn = new javax.swing.JButton();
        insurance_btn = new javax.swing.JButton();
        imgLeb = new javax.swing.JLabel();
        services_loan_pnl = new javax.swing.JPanel();
        loanList = new javax.swing.JComboBox<>();
        typeOfLoanLeb = new javax.swing.JLabel();
        loanTittleLeb = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        loanListPnl = new javax.swing.JPanel();
        agriculaturLoanLeb = new javax.swing.JLabel();
        Agriculture_Loan_btn = new javax.swing.JButton();
        businessLoanLeb = new javax.swing.JLabel();
        Business_Loan_btn = new javax.swing.JButton();
        educationLoanLeb = new javax.swing.JLabel();
        Education_Loan_btn = new javax.swing.JButton();
        carLoanLeb = new javax.swing.JLabel();
        Car_Loan_btn = new javax.swing.JButton();
        propertyLoanLeb = new javax.swing.JLabel();
        Property_Loan_btn = new javax.swing.JButton();
        payPerDayLoanLeb = new javax.swing.JLabel();
        Pay_Per_Day_Loan_btn = new javax.swing.JButton();
        twoWheelerLoanLeb = new javax.swing.JLabel();
        Two_Wheeler_Loan_btn = new javax.swing.JButton();
        goldLoanLeb = new javax.swing.JLabel();
        Gold_Loan_btn = new javax.swing.JButton();
        constructionLoanLeb = new javax.swing.JLabel();
        Construction_Loan_btn = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        loan_status_TxtArea = new javax.swing.JTextArea();
        services_insurance_pnl = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        services_invesement_pnl = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        services_cards_pnl = new javax.swing.JPanel();
        sub_services_cards_pnl = new javax.swing.JPanel();
        myCardsBtn = new javax.swing.JButton();
        applyForCardsBtn = new javax.swing.JButton();
        cardsBackGround = new javax.swing.JLabel();
        applyforCardsPnl = new javax.swing.JPanel();
        subapplyforCardsPnl = new javax.swing.JPanel();
        cardfrontViewPnl = new javax.swing.JPanel();
        cardNameLeb = new javax.swing.JLabel();
        cardsNO1 = new javax.swing.JLabel();
        cardsNO2 = new javax.swing.JLabel();
        cardsNO3 = new javax.swing.JLabel();
        cardExpieryLeb = new javax.swing.JLabel();
        cardViewLeb = new javax.swing.JLabel();
        cardBackViewPnl = new javax.swing.JPanel();
        cvvLeb = new javax.swing.JLabel();
        cardBackViewLeb = new javax.swing.JLabel();
        jToggleButton4 = new javax.swing.JToggleButton();
        selectcardCB = new javax.swing.JComboBox<>();
        card_confirmBtn = new javax.swing.JButton();
        cardsTermsLeb = new javax.swing.JLabel();
        termsAndCondtionCardsCKB = new javax.swing.JCheckBox();
        myCardsPnl = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        myCardsTbl = new javax.swing.JTable();
        cardsViewLeb = new javax.swing.JLabel();
        viewCards_frontAndBackView = new javax.swing.JToggleButton();
        services_invite_pnl = new javax.swing.JPanel();
        whatsapp = new javax.swing.JButton();
        message = new javax.swing.JButton();
        mail = new javax.swing.JButton();
        facebook = new javax.swing.JButton();
        instagram = new javax.swing.JButton();
        twitter = new javax.swing.JButton();
        services_my_app_pnl = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        transection_pnl = new javax.swing.JPanel();
        qrLeb = new javax.swing.JLabel();
        transection_menu_pnl = new javax.swing.JPanel();
        send_mony_btn = new javax.swing.JButton();
        recive_mony_btn = new javax.swing.JButton();
        reward_btn = new javax.swing.JButton();
        history_btn = new javax.swing.JButton();
        tranzection_cancle_btn = new javax.swing.JButton();
        transactiont_qr_leb = new javax.swing.JLabel();
        sub_transaction_pnl = new javax.swing.JPanel();
        send_mony_pnl = new javax.swing.JPanel();
        transection_sendMoney_btn_pnl = new javax.swing.JPanel();
        scanOR_transecction = new javax.swing.JButton();
        enterUPI_transecction = new javax.swing.JButton();
        usecard_transecction = new javax.swing.JButton();
        transecction_sendMoney_ImgPnl = new javax.swing.JPanel();
        close_send_mony = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        recive_mony_pnl = new javax.swing.JPanel();
        btn_pnl1 = new javax.swing.JPanel();
        recive_mony_show_qr_btn = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        transecction_reciveMoney_ImgPnl = new javax.swing.JPanel();
        close_recive_mony1 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        reward_mony_pnl = new javax.swing.JPanel();
        close_rewards = new javax.swing.JButton();
        rewards_more_btn = new javax.swing.JButton();
        rewardsScrollPane = new javax.swing.JScrollPane();
        rewrdsTable = new javax.swing.JTable();
        jLabel23 = new javax.swing.JLabel();
        history_pnl = new javax.swing.JPanel();
        btn_pnl3 = new javax.swing.JPanel();
        close_history = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        transection_history_subPnl = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel22 = new javax.swing.JLabel();
        Setting_pnl = new javax.swing.JPanel();
        change_password_pnl = new javax.swing.JPanel();
        sub_change_password_pnl = new javax.swing.JPanel();
        setting_old_pass_leb = new javax.swing.JLabel();
        setting_new_password_leb = new javax.swing.JLabel();
        setting_confirm_password_leb = new javax.swing.JLabel();
        changePassTitleLeb = new javax.swing.JLabel();
        old_password_txt = new javax.swing.JPasswordField();
        new_password_txt = new javax.swing.JPasswordField();
        confirm_password_txt = new javax.swing.JPasswordField();
        setting_change_pass_cancel_btn = new javax.swing.JButton();
        setting_change_pass_btn = new javax.swing.JButton();
        password_strenth_bar = new javax.swing.JProgressBar();
        cpacha_btn = new javax.swing.JToggleButton();
        capcha_status_leb = new javax.swing.JLabel();
        password_strenth_bar1 = new javax.swing.JProgressBar();
        password_strenth_bar2 = new javax.swing.JProgressBar();
        change_address_pnl = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        change_address_perment_address_txt = new javax.swing.JTextArea();
        change_address_perment_address_leb = new javax.swing.JLabel();
        change_address_address1_leb = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        change_address_address1_txt = new javax.swing.JTextArea();
        change_address_address2_leb = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        change_address_address2_txt = new javax.swing.JTextArea();
        setting_change_address_cancel_btn = new javax.swing.JButton();
        setting_change_address_save_btn = new javax.swing.JButton();
        block_user_pnl = new javax.swing.JPanel();
        block_list_pnl = new javax.swing.JPanel();
        blockSearchtxt = new javax.swing.JTextField();
        setting_block_user_search_btn = new javax.swing.JButton();
        id_leb = new javax.swing.JLabel();
        setting_block_user_il_leb = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        blockBackbtn = new javax.swing.JButton();
        sub_block_pnl = new javax.swing.JPanel();
        block_user_btn = new javax.swing.JButton();
        block_list_btn = new javax.swing.JButton();
        sub_Setting_pnl = new javax.swing.JPanel();
        setting_save_btn = new javax.swing.JButton();
        setting_block_btn = new javax.swing.JButton();
        setting_select_language_leb = new javax.swing.JLabel();
        setting_profile_status_leb = new javax.swing.JLabel();
        setting_block_leb = new javax.swing.JLabel();
        setting_language_list = new javax.swing.JComboBox<>();
        setting_profile_status_list = new javax.swing.JComboBox<>();
        setting_mode_btn = new javax.swing.JToggleButton();
        setting_dark_leb = new javax.swing.JLabel();
        setting_change_password_leb = new javax.swing.JLabel();
        setting_change_password_btn = new javax.swing.JButton();
        setting_change_address_leb = new javax.swing.JLabel();
        setting_change_address_btn = new javax.swing.JButton();
        my_links_pnl = new javax.swing.JPanel();
        my_link_sub_pnl = new javax.swing.JPanel();
        my_investment_btn = new javax.swing.JButton();
        my_application_btn = new javax.swing.JButton();
        my_link_canel_btn = new javax.swing.JButton();
        my_doucount_btn = new javax.swing.JButton();
        contact_us = new javax.swing.JButton();
        terms_and_condiction = new javax.swing.JButton();
        myLinkBackLeb = new javax.swing.JLabel();
        terms_and_condition_pnl = new javax.swing.JPanel();
        accept_terms_and_condition_btn = new javax.swing.JToggleButton();
        inTermsandCondition = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        my_documents_pnl = new javax.swing.JPanel();
        subMyDoc_scrollPnl = new javax.swing.JScrollPane();
        subMyDocPnl = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        docListLeb1 = new javax.swing.JLabel();
        docListLeb2 = new javax.swing.JLabel();
        docListLeb3 = new javax.swing.JLabel();
        docListLeb4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        my_application_pnl = new javax.swing.JPanel();
        my_application_sub_pnl = new javax.swing.JPanel();
        pending_application_btn = new javax.swing.JButton();
        rejected_application_btn = new javax.swing.JButton();
        my_application_canel_btn = new javax.swing.JButton();
        approval_application_btn = new javax.swing.JButton();
        application_data_Pnl = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        applicationStatusTbl = new javax.swing.JTable();
        ContactUs_Pnl = new javax.swing.JPanel();
        contactUsSubPnl = new javax.swing.JPanel();
        contactUSAddPnl = new javax.swing.JPanel();
        mailBtn = new javax.swing.JButton();
        locBtn = new javax.swing.JButton();
        callBtn = new javax.swing.JButton();
        msgBtn = new javax.swing.JButton();
        contactUs_backLeb = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        menu_pnl.setBackground(new java.awt.Color(153, 0, 51));

        profile_leb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/profile.png"))); // NOI18N
        profile_leb.setToolTipText("");

        profile_btn.setBackground(new java.awt.Color(102, 102, 102));
        profile_btn.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        profile_btn.setForeground(new java.awt.Color(255, 255, 255));
        profile_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profile_btnActionPerformed(evt);
            }
        });

        servese_btn.setBackground(new java.awt.Color(102, 102, 102));
        servese_btn.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        servese_btn.setForeground(new java.awt.Color(204, 204, 204));
        servese_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                servese_btnActionPerformed(evt);
            }
        });

        tranzection_btn.setBackground(new java.awt.Color(102, 102, 102));
        tranzection_btn.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tranzection_btn.setForeground(new java.awt.Color(204, 204, 204));
        tranzection_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tranzection_btnActionPerformed(evt);
            }
        });

        my_link_btn.setBackground(new java.awt.Color(102, 102, 102));
        my_link_btn.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        my_link_btn.setForeground(new java.awt.Color(204, 204, 204));
        my_link_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                my_link_btnActionPerformed(evt);
            }
        });

        logout_btn.setBackground(new java.awt.Color(102, 102, 102));
        logout_btn.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        logout_btn.setForeground(new java.awt.Color(204, 204, 204));
        logout_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_btnActionPerformed(evt);
            }
        });

        setting_btn.setBackground(new java.awt.Color(102, 102, 102));
        setting_btn.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        setting_btn.setForeground(new java.awt.Color(204, 204, 204));
        setting_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setting_btnActionPerformed(evt);
            }
        });

        addUser_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addUser_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addUser_btnMouseExited(evt);
            }
        });
        addUser_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUser_btnActionPerformed(evt);
            }
        });

        notificationBtn.setBackground(new java.awt.Color(255, 255, 255));
        notificationBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/map.png"))); // NOI18N
        notificationBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                notificationBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                notificationBtnMouseExited(evt);
            }
        });
        notificationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notificationBtnActionPerformed(evt);
            }
        });

        home_btn.setBackground(new java.awt.Color(255, 255, 255));
        home_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home dark.png"))); // NOI18N
        home_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                home_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                home_btnMouseExited(evt);
            }
        });
        home_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menu_pnlLayout = new javax.swing.GroupLayout(menu_pnl);
        menu_pnl.setLayout(menu_pnlLayout);
        menu_pnlLayout.setHorizontalGroup(
            menu_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu_pnlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(menu_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(logout_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(my_link_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(setting_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tranzection_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(servese_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(profile_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu_pnlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(menu_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(profile_leb, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(menu_pnlLayout.createSequentialGroup()
                        .addComponent(addUser_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(notificationBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addComponent(home_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        menu_pnlLayout.setVerticalGroup(
            menu_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(profile_leb, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(menu_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addUser_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(home_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(notificationBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(profile_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(servese_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(tranzection_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(setting_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(my_link_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logout_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        dynamic_pnl.setBackground(new java.awt.Color(255, 255, 255));
        dynamic_pnl.setForeground(new java.awt.Color(255, 255, 255));
        dynamic_pnl.setPreferredSize(new java.awt.Dimension(874, 819));
        dynamic_pnl.setLayout(new java.awt.CardLayout());

        front_pnl.setLayout(new java.awt.CardLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        acc_no_txt_leb.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        acc_no_txt_leb.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        acc_no_txt_leb.setText("Account Number ");

        acc_no_leb.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        acc_no_leb.setText("*********");

        upi_leb.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        upi_leb.setText("*********@myApp");

        upi_txt_leb.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        upi_txt_leb.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        upi_txt_leb.setText("UPI ID");

        bal_txt_leb.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bal_txt_leb.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        bal_txt_leb.setText("Balance");

        balance_leb.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        balance_leb.setText("00.0/-");

        logoLeb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo2.png"))); // NOI18N

        set_leb.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        set_leb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jButton7.setBackground(new java.awt.Color(153, 153, 153));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mobile_recharge 1.png"))); // NOI18N
        jButton7.setAutoscrolls(true);
        jButton7.setBorder(null);
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton7MouseExited(evt);
            }
        });
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(153, 153, 153));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/light_bill.png"))); // NOI18N
        jButton8.setAutoscrolls(true);
        jButton8.setBorder(null);
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton8MouseExited(evt);
            }
        });
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(153, 153, 153));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mobile_recharge 1.png"))); // NOI18N
        jButton9.setAutoscrolls(true);
        jButton9.setBorder(null);
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton9MouseExited(evt);
            }
        });
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(153, 153, 153));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mobile_recharge 1.png"))); // NOI18N
        jButton10.setAutoscrolls(true);
        jButton10.setBorder(null);
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton10MouseExited(evt);
            }
        });
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(acc_no_txt_leb, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(upi_txt_leb, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bal_txt_leb, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(acc_no_leb, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(upi_leb, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(balance_leb, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(487, 487, 487)
                        .addComponent(frontPnl_QRLeb, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(608, 608, 608)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(set_leb, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(logoLeb, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(69, 69, 69)
                                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(75, 75, 75)
                                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(71, 71, 71)
                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(logoLeb, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(211, 211, 211)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(frontPnl_QRLeb, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(acc_no_txt_leb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(upi_txt_leb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bal_txt_leb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(acc_no_leb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(upi_leb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(balance_leb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 278, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(set_leb, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        front_pnl.add(jPanel3, "card2");

        dynamic_pnl.add(front_pnl, "card2");

        profile_pnl.setBackground(new java.awt.Color(255, 255, 255));
        profile_pnl.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                profile_pnlFocusGained(evt);
            }
        });

        profile_cancle_btn.setBackground(new java.awt.Color(255, 255, 255));
        profile_cancle_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        profile_cancle_btn.setText("Cancel");
        profile_cancle_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        profile_cancle_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profile_cancle_btnActionPerformed(evt);
            }
        });

        profile_photo_leb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        profile_photo_leb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/profile.png"))); // NOI18N
        profile_photo_leb.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        profile_upload_btn.setBackground(new java.awt.Color(255, 255, 255));
        profile_upload_btn.setText("Upload");
        profile_upload_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        profile_upload_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profile_upload_btnActionPerformed(evt);
            }
        });

        profile_name.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        profile_name.setText("Name");

        profile_email.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        profile_email.setText("E-Mail ID");

        profile_upi.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        profile_upi.setText("UPI ID");

        name_txt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        name_txt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        name_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_txtActionPerformed(evt);
            }
        });
        name_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                name_txtKeyTyped(evt);
            }
        });

        email_txt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        email_txt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        email_txt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                email_txtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                email_txtFocusLost(evt);
            }
        });
        email_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                email_txtMouseClicked(evt);
            }
        });
        email_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_txtActionPerformed(evt);
            }
        });
        email_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                email_txtKeyTyped(evt);
            }
        });

        upi_txt.setEditable(false);
        upi_txt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        upi_txt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        upi_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upi_txtActionPerformed(evt);
            }
        });
        upi_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                upi_txtKeyTyped(evt);
            }
        });

        profile_id.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        profile_id.setText("Your ID");

        user_id.setEditable(false);
        user_id.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        user_id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        user_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_idActionPerformed(evt);
            }
        });

        profile_conatact_no.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        profile_conatact_no.setText("Cotact Number");

        contact_txt.setEditable(false);
        contact_txt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        contact_txt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        contact_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contact_txtActionPerformed(evt);
            }
        });

        profile_save_btn.setBackground(new java.awt.Color(255, 255, 255));
        profile_save_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        profile_save_btn.setText("save");
        profile_save_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        profile_save_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profile_save_btnActionPerformed(evt);
            }
        });

        profile_aadhar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        profile_aadhar.setText("Adhar Number");

        aadhar_txt1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        aadhar_txt1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        aadhar_txt1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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

        aadhar_txt2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        aadhar_txt2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        aadhar_txt2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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

        aadhar_txt3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        aadhar_txt3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        aadhar_txt3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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

        d1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        d1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        d1.setText("D");
        d1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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

        d2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        d2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        d2.setText("D");
        d2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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

        m1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        m1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        m1.setText("M");
        m1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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

        m2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        m2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        m2.setText("M");
        m2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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

        y1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        y1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        y1.setText("Y");
        y1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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

        y2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        y2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        y2.setText("Y");
        y2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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

        y3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        y3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        y3.setText("Y");
        y3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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

        y4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        y4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        y4.setText("Y");
        y4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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

        profile_dob.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        profile_dob.setText("Date Of Birth");

        error_leb.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        error_leb.setForeground(new java.awt.Color(255, 51, 51));
        error_leb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        gender_leb.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        gender_leb.setText("Gender");

        male.setBackground(new java.awt.Color(255, 255, 255));
        gender.add(male);
        male.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        male.setText("Male");
        male.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        female.setBackground(new java.awt.Color(255, 255, 255));
        gender.add(female);
        female.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        female.setText("Female");
        female.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout profile_pnlLayout = new javax.swing.GroupLayout(profile_pnl);
        profile_pnl.setLayout(profile_pnlLayout);
        profile_pnlLayout.setHorizontalGroup(
            profile_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profile_pnlLayout.createSequentialGroup()
                .addGroup(profile_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(profile_pnlLayout.createSequentialGroup()
                        .addGap(644, 644, 644)
                        .addComponent(profile_name, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)
                        .addComponent(name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(profile_pnlLayout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addGroup(profile_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(profile_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(profile_photo_leb, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(profile_upload_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(error_leb, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(147, 147, 147)
                        .addGroup(profile_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(profile_pnlLayout.createSequentialGroup()
                                .addGroup(profile_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(profile_dob, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(gender_leb, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(87, 87, 87)
                                .addGroup(profile_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(profile_pnlLayout.createSequentialGroup()
                                        .addComponent(profile_cancle_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(111, 111, 111)
                                        .addComponent(profile_save_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(profile_pnlLayout.createSequentialGroup()
                                        .addComponent(male, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(69, 69, 69)
                                        .addComponent(female, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(profile_pnlLayout.createSequentialGroup()
                                        .addComponent(d1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(7, 7, 7)
                                        .addComponent(d2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(m1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(7, 7, 7)
                                        .addComponent(m2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(y1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(7, 7, 7)
                                        .addComponent(y2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(7, 7, 7)
                                        .addComponent(y3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(7, 7, 7)
                                        .addComponent(y4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(profile_pnlLayout.createSequentialGroup()
                                .addGroup(profile_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(profile_id, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(profile_email, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(profile_upi, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(profile_conatact_no, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(81, 81, 81)
                                .addGroup(profile_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(user_id, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(email_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(upi_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(contact_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(profile_pnlLayout.createSequentialGroup()
                                .addComponent(profile_aadhar, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(87, 87, 87)
                                .addComponent(aadhar_txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(aadhar_txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(aadhar_txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        profile_pnlLayout.setVerticalGroup(
            profile_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profile_pnlLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(profile_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(profile_pnlLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(profile_name, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(profile_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(profile_pnlLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(profile_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(profile_pnlLayout.createSequentialGroup()
                                .addComponent(user_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(email_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(upi_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(contact_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(profile_pnlLayout.createSequentialGroup()
                                .addComponent(profile_id, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(profile_email, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(profile_upi, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(profile_conatact_no, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(50, 50, 50)
                        .addGroup(profile_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(profile_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(aadhar_txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(aadhar_txt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(profile_aadhar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(aadhar_txt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profile_pnlLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(profile_photo_leb, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(profile_upload_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)))
                .addGroup(profile_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(error_leb, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(profile_pnlLayout.createSequentialGroup()
                        .addComponent(profile_dob, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addGroup(profile_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gender_leb, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(male, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(female, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(d1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(d2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(y1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(y2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(y3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(y4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(profile_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(profile_cancle_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(profile_save_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(103, 103, 103))
        );

        dynamic_pnl.add(profile_pnl, "card2");

        services_pnl.setBackground(new java.awt.Color(204, 204, 204));
        services_pnl.setLayout(new java.awt.CardLayout());

        sub_services_pnl.setBackground(new java.awt.Color(255, 255, 255));
        sub_services_pnl.setLayout(null);

        services_pnl_cancle_btn.setBackground(new java.awt.Color(255, 255, 255));
        services_pnl_cancle_btn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        services_pnl_cancle_btn.setText("Cancel");
        services_pnl_cancle_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                services_pnl_cancle_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                services_pnl_cancle_btnMouseExited(evt);
            }
        });
        services_pnl_cancle_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                services_pnl_cancle_btnActionPerformed(evt);
            }
        });
        sub_services_pnl.add(services_pnl_cancle_btn);
        services_pnl_cancle_btn.setBounds(130, 770, 280, 40);

        cards_btn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cards_btn.setText("Apply for Cards ");
        cards_btn.setBorder(null);
        cards_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cards_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cards_btnMouseExited(evt);
            }
        });
        cards_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cards_btnActionPerformed(evt);
            }
        });
        sub_services_pnl.add(cards_btn);
        cards_btn.setBounds(130, 480, 280, 40);

        investment_btn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        investment_btn.setText("Start Investment with our expert");
        investment_btn.setBorder(null);
        investment_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                investment_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                investment_btnMouseExited(evt);
            }
        });
        investment_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                investment_btnActionPerformed(evt);
            }
        });
        sub_services_pnl.add(investment_btn);
        investment_btn.setBounds(80, 370, 390, 40);

        loan_btn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        loan_btn.setText("LOAN");
        loan_btn.setBorder(null);
        loan_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loan_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loan_btnMouseExited(evt);
            }
        });
        loan_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loan_btnActionPerformed(evt);
            }
        });
        sub_services_pnl.add(loan_btn);
        loan_btn.setBounds(130, 180, 280, 40);

        invite_btn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        invite_btn.setText("Invite Friends ");
        invite_btn.setBorder(null);
        invite_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                invite_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                invite_btnMouseExited(evt);
            }
        });
        invite_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invite_btnActionPerformed(evt);
            }
        });
        sub_services_pnl.add(invite_btn);
        invite_btn.setBounds(130, 580, 280, 40);

        my_app_sevices_btn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        my_app_sevices_btn.setText("my_app_sevices");
        my_app_sevices_btn.setBorder(null);
        my_app_sevices_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                my_app_sevices_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                my_app_sevices_btnMouseExited(evt);
            }
        });
        my_app_sevices_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                my_app_sevices_btnActionPerformed(evt);
            }
        });
        sub_services_pnl.add(my_app_sevices_btn);
        my_app_sevices_btn.setBounds(130, 680, 280, 40);

        insurance_btn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        insurance_btn.setText("Insurance Policy");
        insurance_btn.setBorder(null);
        insurance_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                insurance_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                insurance_btnMouseExited(evt);
            }
        });
        insurance_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insurance_btnActionPerformed(evt);
            }
        });
        sub_services_pnl.add(insurance_btn);
        insurance_btn.setBounds(130, 280, 280, 40);

        imgLeb.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        imgLeb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/service1.png"))); // NOI18N
        sub_services_pnl.add(imgLeb);
        imgLeb.setBounds(0, 0, 1660, 990);

        services_pnl.add(sub_services_pnl, "card2");

        services_loan_pnl.setBackground(new java.awt.Color(255, 255, 255));
        services_loan_pnl.setPreferredSize(new java.awt.Dimension(893, 718));

        loanList.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        loanList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All Type", "Short    Term", "Medium Term", "Long      Term" }));
        loanList.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        typeOfLoanLeb.setBackground(new java.awt.Color(255, 255, 255));
        typeOfLoanLeb.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        typeOfLoanLeb.setText("Type Of Loan");

        loanTittleLeb.setBackground(new java.awt.Color(102, 255, 102));
        loanTittleLeb.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        loanTittleLeb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loanTittleLeb.setText("Fast Easy Online Loan");

        jScrollPane6.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane6.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        loanListPnl.setBackground(new java.awt.Color(255, 255, 255));

        Agriculture_Loan_btn.setBackground(new java.awt.Color(255, 255, 255));
        Agriculture_Loan_btn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Agriculture_Loan_btn.setText("Agriculture Loan");
        Agriculture_Loan_btn.setBorder(null);
        Agriculture_Loan_btn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Agriculture_Loan_btnFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Agriculture_Loan_btnFocusLost(evt);
            }
        });
        Agriculture_Loan_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Agriculture_Loan_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Agriculture_Loan_btnMouseExited(evt);
            }
        });

        Business_Loan_btn.setBackground(new java.awt.Color(255, 255, 255));
        Business_Loan_btn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Business_Loan_btn.setText("Business Loan");
        Business_Loan_btn.setBorder(null);
        Business_Loan_btn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Business_Loan_btnFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Business_Loan_btnFocusLost(evt);
            }
        });
        Business_Loan_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Business_Loan_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Business_Loan_btnMouseExited(evt);
            }
        });

        Education_Loan_btn.setBackground(new java.awt.Color(255, 255, 255));
        Education_Loan_btn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Education_Loan_btn.setText("Education Loan");
        Education_Loan_btn.setBorder(null);
        Education_Loan_btn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Education_Loan_btnFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Education_Loan_btnFocusLost(evt);
            }
        });
        Education_Loan_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Education_Loan_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Education_Loan_btnMouseExited(evt);
            }
        });

        Car_Loan_btn.setBackground(new java.awt.Color(255, 255, 255));
        Car_Loan_btn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Car_Loan_btn.setText("Car Loan");
        Car_Loan_btn.setBorder(null);
        Car_Loan_btn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Car_Loan_btnFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Car_Loan_btnFocusLost(evt);
            }
        });
        Car_Loan_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Car_Loan_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Car_Loan_btnMouseExited(evt);
            }
        });

        Property_Loan_btn.setBackground(new java.awt.Color(255, 255, 255));
        Property_Loan_btn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Property_Loan_btn.setText("Property Loan");
        Property_Loan_btn.setBorder(null);
        Property_Loan_btn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Property_Loan_btnFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Property_Loan_btnFocusLost(evt);
            }
        });
        Property_Loan_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Property_Loan_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Property_Loan_btnMouseExited(evt);
            }
        });
        Property_Loan_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Property_Loan_btnActionPerformed(evt);
            }
        });

        Pay_Per_Day_Loan_btn.setBackground(new java.awt.Color(255, 255, 255));
        Pay_Per_Day_Loan_btn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Pay_Per_Day_Loan_btn.setText("Pay Per Day Loan");
        Pay_Per_Day_Loan_btn.setBorder(null);
        Pay_Per_Day_Loan_btn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Pay_Per_Day_Loan_btnFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Pay_Per_Day_Loan_btnFocusLost(evt);
            }
        });
        Pay_Per_Day_Loan_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Pay_Per_Day_Loan_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Pay_Per_Day_Loan_btnMouseExited(evt);
            }
        });
        Pay_Per_Day_Loan_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pay_Per_Day_Loan_btnActionPerformed(evt);
            }
        });

        Two_Wheeler_Loan_btn.setBackground(new java.awt.Color(255, 255, 255));
        Two_Wheeler_Loan_btn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Two_Wheeler_Loan_btn.setText("Two Wheeler Loan");
        Two_Wheeler_Loan_btn.setBorder(null);
        Two_Wheeler_Loan_btn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Two_Wheeler_Loan_btnFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Two_Wheeler_Loan_btnFocusLost(evt);
            }
        });
        Two_Wheeler_Loan_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Two_Wheeler_Loan_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Two_Wheeler_Loan_btnMouseExited(evt);
            }
        });

        Gold_Loan_btn.setBackground(new java.awt.Color(255, 255, 255));
        Gold_Loan_btn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Gold_Loan_btn.setText("Gold Loan");
        Gold_Loan_btn.setBorder(null);
        Gold_Loan_btn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Gold_Loan_btnFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Gold_Loan_btnFocusLost(evt);
            }
        });
        Gold_Loan_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Gold_Loan_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Gold_Loan_btnMouseExited(evt);
            }
        });

        Construction_Loan_btn.setBackground(new java.awt.Color(255, 255, 255));
        Construction_Loan_btn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Construction_Loan_btn.setText("Construction Loan");
        Construction_Loan_btn.setBorder(null);
        Construction_Loan_btn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Construction_Loan_btnFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Construction_Loan_btnFocusLost(evt);
            }
        });
        Construction_Loan_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Construction_Loan_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Construction_Loan_btnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout loanListPnlLayout = new javax.swing.GroupLayout(loanListPnl);
        loanListPnl.setLayout(loanListPnlLayout);
        loanListPnlLayout.setHorizontalGroup(
            loanListPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loanListPnlLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(loanListPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(propertyLoanLeb, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(constructionLoanLeb, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(goldLoanLeb, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(twoWheelerLoanLeb, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(payPerDayLoanLeb, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(educationLoanLeb, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(businessLoanLeb, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agriculaturLoanLeb, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carLoanLeb, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(loanListPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Agriculture_Loan_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 777, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Car_Loan_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 777, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Gold_Loan_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 777, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Two_Wheeler_Loan_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 777, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Construction_Loan_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 777, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Property_Loan_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 777, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pay_Per_Day_Loan_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 777, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Business_Loan_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Education_Loan_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(301, Short.MAX_VALUE))
        );
        loanListPnlLayout.setVerticalGroup(
            loanListPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loanListPnlLayout.createSequentialGroup()
                .addGroup(loanListPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loanListPnlLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(agriculaturLoanLeb, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(loanListPnlLayout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(Agriculture_Loan_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(loanListPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loanListPnlLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(businessLoanLeb, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(loanListPnlLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(Business_Loan_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(loanListPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loanListPnlLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(educationLoanLeb, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(loanListPnlLayout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(Education_Loan_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(loanListPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loanListPnlLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(carLoanLeb, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(loanListPnlLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(Car_Loan_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(loanListPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loanListPnlLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(twoWheelerLoanLeb, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(loanListPnlLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(Two_Wheeler_Loan_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(loanListPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loanListPnlLayout.createSequentialGroup()
                        .addComponent(goldLoanLeb, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loanListPnlLayout.createSequentialGroup()
                        .addComponent(Gold_Loan_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)))
                .addGroup(loanListPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loanListPnlLayout.createSequentialGroup()
                        .addComponent(constructionLoanLeb, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loanListPnlLayout.createSequentialGroup()
                        .addComponent(Construction_Loan_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)))
                .addGroup(loanListPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loanListPnlLayout.createSequentialGroup()
                        .addComponent(payPerDayLoanLeb, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loanListPnlLayout.createSequentialGroup()
                        .addComponent(Pay_Per_Day_Loan_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)))
                .addGroup(loanListPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loanListPnlLayout.createSequentialGroup()
                        .addComponent(propertyLoanLeb, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(26, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loanListPnlLayout.createSequentialGroup()
                        .addComponent(Property_Loan_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91))))
        );

        jScrollPane6.setViewportView(loanListPnl);

        loan_status_TxtArea.setEditable(false);
        loan_status_TxtArea.setColumns(20);
        loan_status_TxtArea.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        loan_status_TxtArea.setRows(5);
        jScrollPane10.setViewportView(loan_status_TxtArea);

        javax.swing.GroupLayout services_loan_pnlLayout = new javax.swing.GroupLayout(services_loan_pnl);
        services_loan_pnl.setLayout(services_loan_pnlLayout);
        services_loan_pnlLayout.setHorizontalGroup(
            services_loan_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(services_loan_pnlLayout.createSequentialGroup()
                .addGroup(services_loan_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(services_loan_pnlLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(loanTittleLeb, javax.swing.GroupLayout.PREFERRED_SIZE, 965, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(typeOfLoanLeb, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, services_loan_pnlLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 1158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)))
                .addGroup(services_loan_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(services_loan_pnlLayout.createSequentialGroup()
                        .addComponent(loanList, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, services_loan_pnlLayout.createSequentialGroup()
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );
        services_loan_pnlLayout.setVerticalGroup(
            services_loan_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(services_loan_pnlLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(services_loan_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loanTittleLeb, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loanList, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(typeOfLoanLeb, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(services_loan_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(services_loan_pnlLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 786, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))
                    .addGroup(services_loan_pnlLayout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        services_pnl.add(services_loan_pnl, "card2");

        jLabel21.setText("POLICY");

        javax.swing.GroupLayout services_insurance_pnlLayout = new javax.swing.GroupLayout(services_insurance_pnl);
        services_insurance_pnl.setLayout(services_insurance_pnlLayout);
        services_insurance_pnlLayout.setHorizontalGroup(
            services_insurance_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(services_insurance_pnlLayout.createSequentialGroup()
                .addGap(237, 237, 237)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(967, Short.MAX_VALUE))
        );
        services_insurance_pnlLayout.setVerticalGroup(
            services_insurance_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(services_insurance_pnlLayout.createSequentialGroup()
                .addGap(227, 227, 227)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(639, Short.MAX_VALUE))
        );

        services_pnl.add(services_insurance_pnl, "card2");

        jToggleButton1.setText("INVESTMENT");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout services_invesement_pnlLayout = new javax.swing.GroupLayout(services_invesement_pnl);
        services_invesement_pnl.setLayout(services_invesement_pnlLayout);
        services_invesement_pnlLayout.setHorizontalGroup(
            services_invesement_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(services_invesement_pnlLayout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1175, Short.MAX_VALUE))
        );
        services_invesement_pnlLayout.setVerticalGroup(
            services_invesement_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(services_invesement_pnlLayout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(674, Short.MAX_VALUE))
        );

        services_pnl.add(services_invesement_pnl, "card2");

        services_cards_pnl.setBackground(new java.awt.Color(255, 255, 255));
        services_cards_pnl.setLayout(new java.awt.CardLayout());

        sub_services_cards_pnl.setBackground(new java.awt.Color(255, 255, 255));
        sub_services_cards_pnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        myCardsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myCardsBtnActionPerformed(evt);
            }
        });
        sub_services_cards_pnl.add(myCardsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 680, 220, 220));

        applyForCardsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyForCardsBtnActionPerformed(evt);
            }
        });
        sub_services_cards_pnl.add(applyForCardsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 670, 220, 220));
        sub_services_cards_pnl.add(cardsBackGround, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1680, 1080));

        services_cards_pnl.add(sub_services_cards_pnl, "card2");

        applyforCardsPnl.setBackground(new java.awt.Color(255, 255, 255));
        applyforCardsPnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        subapplyforCardsPnl.setLayout(new java.awt.CardLayout());

        cardfrontViewPnl.setBackground(new java.awt.Color(255, 255, 255));
        cardfrontViewPnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cardNameLeb.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        cardNameLeb.setText("Shubham Shashikant Patil");
        cardfrontViewPnl.add(cardNameLeb, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, 750, 50));

        cardsNO1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        cardsNO1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cardsNO1.setText("1111");
        cardfrontViewPnl.add(cardsNO1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 150, 50));

        cardsNO2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        cardsNO2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cardsNO2.setText("1111");
        cardfrontViewPnl.add(cardsNO2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 150, 50));

        cardsNO3.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        cardsNO3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cardsNO3.setText("1111");
        cardfrontViewPnl.add(cardsNO3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 300, 150, 50));

        cardExpieryLeb.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        cardExpieryLeb.setText("06/20");
        cardfrontViewPnl.add(cardExpieryLeb, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 390, 70, 40));
        cardfrontViewPnl.add(cardViewLeb, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1194, 534));

        subapplyforCardsPnl.add(cardfrontViewPnl, "card2");

        cardBackViewPnl.setBackground(new java.awt.Color(255, 255, 255));
        cardBackViewPnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cvvLeb.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        cvvLeb.setText("123");
        cardBackViewPnl.add(cvvLeb, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 220, 110, 40));
        cardBackViewPnl.add(cardBackViewLeb, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1194, 534));

        subapplyforCardsPnl.add(cardBackViewPnl, "card2");

        applyforCardsPnl.add(subapplyforCardsPnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 246, 1194, 534));

        jToggleButton4.setBackground(new java.awt.Color(255, 255, 255));
        jToggleButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jToggleButton4.setText("Front / Back");
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });
        applyforCardsPnl.add(jToggleButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 800, 210, 40));

        selectcardCB.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        selectcardCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Card Type", "ATM", "DEBIT", "CREDIT", "VISA" }));
        selectcardCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectcardCBActionPerformed(evt);
            }
        });
        applyforCardsPnl.add(selectcardCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 32, 230, 40));

        card_confirmBtn.setBackground(new java.awt.Color(255, 255, 255));
        card_confirmBtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        card_confirmBtn.setText("Next");
        card_confirmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card_confirmBtnActionPerformed(evt);
            }
        });
        applyforCardsPnl.add(card_confirmBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1360, 880, 130, 50));

        cardsTermsLeb.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cardsTermsLeb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cardsTermsLeb.setText("I have Accepted All terms and Condition");
        applyforCardsPnl.add(cardsTermsLeb, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 890, 450, 40));

        termsAndCondtionCardsCKB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                termsAndCondtionCardsCKBActionPerformed(evt);
            }
        });
        applyforCardsPnl.add(termsAndCondtionCardsCKB, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 900, 20, -1));

        services_cards_pnl.add(applyforCardsPnl, "card2");

        myCardsPnl.setBackground(new java.awt.Color(255, 255, 255));
        myCardsPnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        myCardsTbl.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        myCardsTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "Title 1"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        myCardsTbl.setRowHeight(60);
        myCardsTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                myCardsTblMouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(myCardsTbl);

        myCardsPnl.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 160, 610));
        myCardsPnl.add(cardsViewLeb, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, 1000, 410));

        viewCards_frontAndBackView.setBackground(new java.awt.Color(255, 255, 255));
        viewCards_frontAndBackView.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        viewCards_frontAndBackView.setText("Front / Back");
        viewCards_frontAndBackView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewCards_frontAndBackViewActionPerformed(evt);
            }
        });
        myCardsPnl.add(viewCards_frontAndBackView, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 750, 290, 40));

        services_cards_pnl.add(myCardsPnl, "card2");

        services_pnl.add(services_cards_pnl, "card2");

        services_invite_pnl.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout services_invite_pnlLayout = new javax.swing.GroupLayout(services_invite_pnl);
        services_invite_pnl.setLayout(services_invite_pnlLayout);
        services_invite_pnlLayout.setHorizontalGroup(
            services_invite_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(services_invite_pnlLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(whatsapp, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(message, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(mail, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(facebook, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(instagram, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(twitter, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        services_invite_pnlLayout.setVerticalGroup(
            services_invite_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, services_invite_pnlLayout.createSequentialGroup()
                .addContainerGap(692, Short.MAX_VALUE)
                .addGroup(services_invite_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(whatsapp, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(message, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mail, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(facebook, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(instagram, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(twitter, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(218, 218, 218))
        );

        services_pnl.add(services_invite_pnl, "card2");

        jLabel26.setText("MY APP");

        javax.swing.GroupLayout services_my_app_pnlLayout = new javax.swing.GroupLayout(services_my_app_pnl);
        services_my_app_pnl.setLayout(services_my_app_pnlLayout);
        services_my_app_pnlLayout.setHorizontalGroup(
            services_my_app_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(services_my_app_pnlLayout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(973, Short.MAX_VALUE))
        );
        services_my_app_pnlLayout.setVerticalGroup(
            services_my_app_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(services_my_app_pnlLayout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(574, Short.MAX_VALUE))
        );

        services_pnl.add(services_my_app_pnl, "card2");

        dynamic_pnl.add(services_pnl, "card2");

        transection_pnl.setBackground(new java.awt.Color(255, 255, 255));

        qrLeb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/qr_demo.png"))); // NOI18N

        transection_menu_pnl.setBackground(new java.awt.Color(51, 51, 51));

        send_mony_btn.setBackground(new java.awt.Color(255, 255, 255));
        send_mony_btn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        send_mony_btn.setForeground(new java.awt.Color(255, 255, 255));
        send_mony_btn.setText("Send Money");
        send_mony_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                send_mony_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                send_mony_btnMouseExited(evt);
            }
        });
        send_mony_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                send_mony_btnActionPerformed(evt);
            }
        });

        recive_mony_btn.setBackground(new java.awt.Color(255, 255, 255));
        recive_mony_btn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        recive_mony_btn.setForeground(new java.awt.Color(255, 255, 255));
        recive_mony_btn.setText("Recive Money");
        recive_mony_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                recive_mony_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                recive_mony_btnMouseExited(evt);
            }
        });
        recive_mony_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recive_mony_btnActionPerformed(evt);
            }
        });

        reward_btn.setBackground(new java.awt.Color(255, 255, 255));
        reward_btn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        reward_btn.setForeground(new java.awt.Color(255, 255, 255));
        reward_btn.setText("Rewards");
        reward_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reward_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reward_btnMouseExited(evt);
            }
        });
        reward_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reward_btnActionPerformed(evt);
            }
        });

        history_btn.setBackground(new java.awt.Color(255, 255, 255));
        history_btn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        history_btn.setForeground(new java.awt.Color(255, 255, 255));
        history_btn.setText("History");
        history_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                history_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                history_btnMouseExited(evt);
            }
        });
        history_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                history_btnActionPerformed(evt);
            }
        });

        tranzection_cancle_btn.setBackground(new java.awt.Color(255, 255, 255));
        tranzection_cancle_btn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tranzection_cancle_btn.setForeground(new java.awt.Color(255, 255, 255));
        tranzection_cancle_btn.setText("Cancel");
        tranzection_cancle_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tranzection_cancle_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tranzection_cancle_btnMouseExited(evt);
            }
        });
        tranzection_cancle_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tranzection_cancle_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout transection_menu_pnlLayout = new javax.swing.GroupLayout(transection_menu_pnl);
        transection_menu_pnl.setLayout(transection_menu_pnlLayout);
        transection_menu_pnlLayout.setHorizontalGroup(
            transection_menu_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transection_menu_pnlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(send_mony_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(recive_mony_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(reward_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(history_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tranzection_cancle_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        transection_menu_pnlLayout.setVerticalGroup(
            transection_menu_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, transection_menu_pnlLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(transection_menu_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(send_mony_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(recive_mony_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reward_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(history_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tranzection_cancle_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        transactiont_qr_leb.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        transactiont_qr_leb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        transactiont_qr_leb.setText("QR Code");

        sub_transaction_pnl.setBackground(new java.awt.Color(255, 255, 255));
        sub_transaction_pnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        sub_transaction_pnl.setLayout(new java.awt.CardLayout());

        send_mony_pnl.setBackground(new java.awt.Color(255, 255, 255));
        send_mony_pnl.setLayout(new java.awt.CardLayout());

        transection_sendMoney_btn_pnl.setBackground(new java.awt.Color(255, 255, 255));

        scanOR_transecction.setBackground(new java.awt.Color(255, 255, 255));
        scanOR_transecction.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        scanOR_transecction.setText("Scan QR code");
        scanOR_transecction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scanOR_transecctionActionPerformed(evt);
            }
        });

        enterUPI_transecction.setBackground(new java.awt.Color(255, 255, 255));
        enterUPI_transecction.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        enterUPI_transecction.setText("Enter UPI ID");
        enterUPI_transecction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterUPI_transecctionActionPerformed(evt);
            }
        });

        usecard_transecction.setBackground(new java.awt.Color(255, 255, 255));
        usecard_transecction.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        usecard_transecction.setText("Use card");
        usecard_transecction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usecard_transecctionActionPerformed(evt);
            }
        });

        transecction_sendMoney_ImgPnl.setBackground(new java.awt.Color(255, 255, 255));
        transecction_sendMoney_ImgPnl.setLayout(null);

        close_send_mony.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close_btn.png"))); // NOI18N
        close_send_mony.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                close_send_monyActionPerformed(evt);
            }
        });
        transecction_sendMoney_ImgPnl.add(close_send_mony);
        close_send_mony.setBounds(420, 0, 50, 40);

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/send_mony.png"))); // NOI18N
        transecction_sendMoney_ImgPnl.add(jLabel19);
        jLabel19.setBounds(0, 0, 430, 360);

        javax.swing.GroupLayout transection_sendMoney_btn_pnlLayout = new javax.swing.GroupLayout(transection_sendMoney_btn_pnl);
        transection_sendMoney_btn_pnl.setLayout(transection_sendMoney_btn_pnlLayout);
        transection_sendMoney_btn_pnlLayout.setHorizontalGroup(
            transection_sendMoney_btn_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transection_sendMoney_btn_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(transection_sendMoney_btn_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scanOR_transecction, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(enterUPI_transecction, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
                    .addComponent(usecard_transecction, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(transecction_sendMoney_ImgPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        transection_sendMoney_btn_pnlLayout.setVerticalGroup(
            transection_sendMoney_btn_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, transection_sendMoney_btn_pnlLayout.createSequentialGroup()
                .addComponent(transecction_sendMoney_ImgPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(scanOR_transecction, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(enterUPI_transecction, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(usecard_transecction, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        send_mony_pnl.add(transection_sendMoney_btn_pnl, "card2");

        sub_transaction_pnl.add(send_mony_pnl, "card2");

        recive_mony_pnl.setBackground(new java.awt.Color(255, 255, 255));
        recive_mony_pnl.setLayout(new java.awt.CardLayout());

        btn_pnl1.setBackground(new java.awt.Color(255, 255, 255));

        recive_mony_show_qr_btn.setBackground(new java.awt.Color(255, 255, 255));
        recive_mony_show_qr_btn.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        recive_mony_show_qr_btn.setText("Show QR code");
        recive_mony_show_qr_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recive_mony_show_qr_btnActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton6.setText("Request for Money");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        transecction_reciveMoney_ImgPnl.setBackground(new java.awt.Color(255, 255, 255));
        transecction_reciveMoney_ImgPnl.setLayout(null);

        close_recive_mony1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close_btn.png"))); // NOI18N
        close_recive_mony1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                close_recive_mony1ActionPerformed(evt);
            }
        });
        transecction_reciveMoney_ImgPnl.add(close_recive_mony1);
        close_recive_mony1.setBounds(420, 0, 50, 40);

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/send_mony.png"))); // NOI18N
        transecction_reciveMoney_ImgPnl.add(jLabel20);
        jLabel20.setBounds(0, 40, 470, 450);

        javax.swing.GroupLayout btn_pnl1Layout = new javax.swing.GroupLayout(btn_pnl1);
        btn_pnl1.setLayout(btn_pnl1Layout);
        btn_pnl1Layout.setHorizontalGroup(
            btn_pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_pnl1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btn_pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(recive_mony_show_qr_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(transecction_reciveMoney_ImgPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btn_pnl1Layout.setVerticalGroup(
            btn_pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_pnl1Layout.createSequentialGroup()
                .addComponent(transecction_reciveMoney_ImgPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(72, 72, 72)
                .addComponent(recive_mony_show_qr_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        recive_mony_pnl.add(btn_pnl1, "card2");

        sub_transaction_pnl.add(recive_mony_pnl, "card2");

        reward_mony_pnl.setBackground(new java.awt.Color(255, 255, 255));
        reward_mony_pnl.setLayout(null);

        close_rewards.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close_btn.png"))); // NOI18N
        close_rewards.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                close_rewardsActionPerformed(evt);
            }
        });
        reward_mony_pnl.add(close_rewards);
        close_rewards.setBounds(420, 0, 50, 40);

        rewards_more_btn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        rewards_more_btn.setText("MORE ");
        rewards_more_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rewards_more_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rewards_more_btnMouseExited(evt);
            }
        });
        reward_mony_pnl.add(rewards_more_btn);
        rewards_more_btn.setBounds(340, 680, 90, 30);

        rewrdsTable.setAutoCreateRowSorter(true);
        rewrdsTable.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        rewrdsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Rewards"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        rewrdsTable.setRowHeight(80);
        rewrdsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rewrdsTableMouseClicked(evt);
            }
        });
        rewardsScrollPane.setViewportView(rewrdsTable);

        reward_mony_pnl.add(rewardsScrollPane);
        rewardsScrollPane.setBounds(10, 90, 450, 520);

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rewards1.png"))); // NOI18N
        reward_mony_pnl.add(jLabel23);
        jLabel23.setBounds(0, 0, 470, 630);

        sub_transaction_pnl.add(reward_mony_pnl, "card2");

        history_pnl.setBackground(new java.awt.Color(255, 255, 255));
        history_pnl.setLayout(new java.awt.CardLayout());

        btn_pnl3.setBackground(new java.awt.Color(255, 255, 255));

        close_history.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close_btn.png"))); // NOI18N
        close_history.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                close_historyActionPerformed(evt);
            }
        });

        transection_history_subPnl.setBackground(new java.awt.Color(255, 255, 255));
        transection_history_subPnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable1.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "UPI id", "Ammount", "Date"
            }
        ));
        jTable1.setCellSelectionEnabled(true);
        jTable1.setRowHeight(50);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        transection_history_subPnl.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 444, 560));

        jScrollPane1.setViewportView(transection_history_subPnl);

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel22.setText("  History");

        javax.swing.GroupLayout btn_pnl3Layout = new javax.swing.GroupLayout(btn_pnl3);
        btn_pnl3.setLayout(btn_pnl3Layout);
        btn_pnl3Layout.setHorizontalGroup(
            btn_pnl3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_pnl3Layout.createSequentialGroup()
                .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(close_history, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(btn_pnl3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        btn_pnl3Layout.setVerticalGroup(
            btn_pnl3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_pnl3Layout.createSequentialGroup()
                .addGroup(btn_pnl3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(close_history, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
                .addContainerGap())
        );

        history_pnl.add(btn_pnl3, "card2");

        sub_transaction_pnl.add(history_pnl, "card2");

        javax.swing.GroupLayout transection_pnlLayout = new javax.swing.GroupLayout(transection_pnl);
        transection_pnl.setLayout(transection_pnlLayout);
        transection_pnlLayout.setHorizontalGroup(
            transection_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transection_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(transection_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(transection_pnlLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(sub_transaction_pnl, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(545, 545, 545)
                        .addGroup(transection_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(qrLeb, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(transection_pnlLayout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(transactiont_qr_leb, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(transection_menu_pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        transection_pnlLayout.setVerticalGroup(
            transection_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transection_pnlLayout.createSequentialGroup()
                .addGroup(transection_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(transection_pnlLayout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(qrLeb, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(transactiont_qr_leb, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 266, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, transection_pnlLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sub_transaction_pnl, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(transection_menu_pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112))
        );

        dynamic_pnl.add(transection_pnl, "card2");

        Setting_pnl.setBackground(new java.awt.Color(255, 255, 255));
        Setting_pnl.setLayout(new java.awt.CardLayout());

        change_password_pnl.setBackground(new java.awt.Color(255, 255, 255));
        change_password_pnl.setLayout(new java.awt.CardLayout());

        sub_change_password_pnl.setBackground(new java.awt.Color(255, 255, 255));

        setting_old_pass_leb.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        setting_old_pass_leb.setText("Old Password");

        setting_new_password_leb.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        setting_new_password_leb.setText("New Password");

        setting_confirm_password_leb.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        setting_confirm_password_leb.setText("Confirm Password");

        changePassTitleLeb.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        changePassTitleLeb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        changePassTitleLeb.setText("Change Passwords ?");

        old_password_txt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        old_password_txt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        old_password_txt.setEchoChar('*');
        old_password_txt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                old_password_txtFocusGained(evt);
            }
        });
        old_password_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                old_password_txtActionPerformed(evt);
            }
        });
        old_password_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                old_password_txtKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                old_password_txtKeyTyped(evt);
            }
        });

        new_password_txt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        new_password_txt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        new_password_txt.setEchoChar('*');
        new_password_txt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                new_password_txtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                new_password_txtFocusLost(evt);
            }
        });
        new_password_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                new_password_txtKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                new_password_txtKeyTyped(evt);
            }
        });

        confirm_password_txt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        confirm_password_txt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        confirm_password_txt.setEchoChar('*');
        confirm_password_txt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                confirm_password_txtFocusGained(evt);
            }
        });
        confirm_password_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                confirm_password_txtKeyPressed(evt);
            }
        });

        setting_change_pass_cancel_btn.setBackground(new java.awt.Color(255, 255, 255));
        setting_change_pass_cancel_btn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        setting_change_pass_cancel_btn.setText("Cancel");
        setting_change_pass_cancel_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setting_change_pass_cancel_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setting_change_pass_cancel_btnActionPerformed(evt);
            }
        });

        setting_change_pass_btn.setBackground(new java.awt.Color(255, 255, 255));
        setting_change_pass_btn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        setting_change_pass_btn.setText("Change Passwords");
        setting_change_pass_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setting_change_pass_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setting_change_pass_btnActionPerformed(evt);
            }
        });

        password_strenth_bar.setForeground(new java.awt.Color(255, 51, 51));

        cpacha_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/capcha_unclick.png"))); // NOI18N
        cpacha_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpacha_btnActionPerformed(evt);
            }
        });

        capcha_status_leb.setForeground(new java.awt.Color(255, 0, 0));

        password_strenth_bar1.setForeground(new java.awt.Color(102, 0, 255));

        password_strenth_bar2.setForeground(new java.awt.Color(0, 255, 0));

        javax.swing.GroupLayout sub_change_password_pnlLayout = new javax.swing.GroupLayout(sub_change_password_pnl);
        sub_change_password_pnl.setLayout(sub_change_password_pnlLayout);
        sub_change_password_pnlLayout.setHorizontalGroup(
            sub_change_password_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sub_change_password_pnlLayout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addGroup(sub_change_password_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(sub_change_password_pnlLayout.createSequentialGroup()
                        .addComponent(setting_change_pass_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101)
                        .addComponent(setting_change_pass_cancel_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cpacha_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(sub_change_password_pnlLayout.createSequentialGroup()
                        .addComponent(setting_new_password_leb, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addGroup(sub_change_password_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(sub_change_password_pnlLayout.createSequentialGroup()
                                .addComponent(password_strenth_bar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(password_strenth_bar1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(password_strenth_bar2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(new_password_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(sub_change_password_pnlLayout.createSequentialGroup()
                        .addGroup(sub_change_password_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(sub_change_password_pnlLayout.createSequentialGroup()
                                .addComponent(setting_old_pass_leb, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70))
                            .addGroup(sub_change_password_pnlLayout.createSequentialGroup()
                                .addComponent(setting_confirm_password_leb, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)))
                        .addGroup(sub_change_password_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(confirm_password_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(old_password_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(capcha_status_leb, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
            .addGroup(sub_change_password_pnlLayout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addComponent(changePassTitleLeb, javax.swing.GroupLayout.PREFERRED_SIZE, 751, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sub_change_password_pnlLayout.setVerticalGroup(
            sub_change_password_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sub_change_password_pnlLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(changePassTitleLeb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104)
                .addGroup(sub_change_password_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sub_change_password_pnlLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(capcha_status_leb, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(149, 149, 149))
                    .addGroup(sub_change_password_pnlLayout.createSequentialGroup()
                        .addGroup(sub_change_password_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(setting_old_pass_leb, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(old_password_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(sub_change_password_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(new_password_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(setting_new_password_leb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(20, 20, 20)
                        .addGroup(sub_change_password_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(password_strenth_bar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(password_strenth_bar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(password_strenth_bar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(sub_change_password_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(confirm_password_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(setting_confirm_password_leb, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                        .addGap(61, 61, 61)
                        .addComponent(cpacha_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(170, 170, 170)
                        .addGroup(sub_change_password_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(setting_change_pass_cancel_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(setting_change_pass_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        change_password_pnl.add(sub_change_password_pnl, "card2");

        Setting_pnl.add(change_password_pnl, "card2");

        change_address_pnl.setBackground(new java.awt.Color(255, 255, 255));
        change_address_pnl.setPreferredSize(new java.awt.Dimension(890, 718));

        change_address_perment_address_txt.setEditable(false);
        change_address_perment_address_txt.setColumns(20);
        change_address_perment_address_txt.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        change_address_perment_address_txt.setRows(5);
        change_address_perment_address_txt.setText("65 A laxmi narayan nagar karvand naka shirpur\ntal shirpur dist dhule ");
        jScrollPane3.setViewportView(change_address_perment_address_txt);

        change_address_perment_address_leb.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        change_address_perment_address_leb.setText("Permant  Address ");

        change_address_address1_leb.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        change_address_address1_leb.setText("Address 1");

        change_address_address1_txt.setColumns(20);
        change_address_address1_txt.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        change_address_address1_txt.setRows(5);
        jScrollPane4.setViewportView(change_address_address1_txt);

        change_address_address2_leb.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        change_address_address2_leb.setText("Address 2");

        change_address_address2_txt.setColumns(20);
        change_address_address2_txt.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        change_address_address2_txt.setRows(5);
        jScrollPane5.setViewportView(change_address_address2_txt);

        setting_change_address_cancel_btn.setBackground(new java.awt.Color(255, 255, 255));
        setting_change_address_cancel_btn.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        setting_change_address_cancel_btn.setText("Cancel");
        setting_change_address_cancel_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setting_change_address_cancel_btnActionPerformed(evt);
            }
        });

        setting_change_address_save_btn.setBackground(new java.awt.Color(255, 255, 255));
        setting_change_address_save_btn.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        setting_change_address_save_btn.setText("Save");
        setting_change_address_save_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setting_change_address_save_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout change_address_pnlLayout = new javax.swing.GroupLayout(change_address_pnl);
        change_address_pnl.setLayout(change_address_pnlLayout);
        change_address_pnlLayout.setHorizontalGroup(
            change_address_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, change_address_pnlLayout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addGroup(change_address_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(change_address_address1_leb, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(change_address_perment_address_leb, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(change_address_address2_leb, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(change_address_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1035, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, change_address_pnlLayout.createSequentialGroup()
                .addContainerGap(1015, Short.MAX_VALUE)
                .addComponent(setting_change_address_cancel_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(157, 157, 157)
                .addComponent(setting_change_address_save_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(181, 181, 181))
        );
        change_address_pnlLayout.setVerticalGroup(
            change_address_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(change_address_pnlLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(change_address_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(change_address_perment_address_leb, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(change_address_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(change_address_address1_leb, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(change_address_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(change_address_address2_leb, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 474, Short.MAX_VALUE)
                .addGroup(change_address_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(setting_change_address_cancel_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(setting_change_address_save_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(111, 111, 111))
        );

        Setting_pnl.add(change_address_pnl, "card2");

        block_user_pnl.setBackground(new java.awt.Color(255, 255, 255));
        block_user_pnl.setLayout(new java.awt.CardLayout());

        block_list_pnl.setBackground(new java.awt.Color(255, 255, 255));
        block_list_pnl.setLayout(null);

        blockSearchtxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        block_list_pnl.add(blockSearchtxt);
        blockSearchtxt.setBounds(1320, 40, 188, 35);

        setting_block_user_search_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search_icon.png"))); // NOI18N
        setting_block_user_search_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setting_block_user_search_btnActionPerformed(evt);
            }
        });
        block_list_pnl.add(setting_block_user_search_btn);
        setting_block_user_search_btn.setBounds(1530, 40, 51, 35);

        id_leb.setFont(new java.awt.Font("Sitka Banner", 0, 24)); // NOI18N
        id_leb.setText("shubham_patil");
        block_list_pnl.add(id_leb);
        id_leb.setBounds(390, 340, 229, 39);

        setting_block_user_il_leb.setFont(new java.awt.Font("Square721 BT", 0, 24)); // NOI18N
        setting_block_user_il_leb.setText("User Id");
        block_list_pnl.add(setting_block_user_il_leb);
        setting_block_user_il_leb.setBounds(390, 280, 229, 36);

        jLabel16.setFont(new java.awt.Font("Square721 BT", 0, 24)); // NOI18N
        jLabel16.setText("Block User");
        block_list_pnl.add(jLabel16);
        jLabel16.setBounds(790, 280, 192, 36);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/block.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        block_list_pnl.add(jLabel2);
        jLabel2.setBounds(810, 340, 70, 39);

        blockBackbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blockBackbtnActionPerformed(evt);
            }
        });
        block_list_pnl.add(blockBackbtn);
        blockBackbtn.setBounds(1540, 900, 70, 60);

        block_user_pnl.add(block_list_pnl, "card2");

        sub_block_pnl.setBackground(new java.awt.Color(255, 255, 255));

        block_user_btn.setBackground(new java.awt.Color(255, 255, 255));
        block_user_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/block_user.png"))); // NOI18N
        block_user_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        block_user_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                block_user_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                block_user_btnMouseExited(evt);
            }
        });
        block_user_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                block_user_btnActionPerformed(evt);
            }
        });

        block_list_btn.setBackground(new java.awt.Color(255, 255, 255));
        block_list_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/block_list.png"))); // NOI18N
        block_list_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        block_list_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                block_list_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                block_list_btnMouseExited(evt);
            }
        });
        block_list_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                block_list_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sub_block_pnlLayout = new javax.swing.GroupLayout(sub_block_pnl);
        sub_block_pnl.setLayout(sub_block_pnlLayout);
        sub_block_pnlLayout.setHorizontalGroup(
            sub_block_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sub_block_pnlLayout.createSequentialGroup()
                .addGap(697, 697, 697)
                .addGroup(sub_block_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(block_user_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(block_list_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sub_block_pnlLayout.setVerticalGroup(
            sub_block_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sub_block_pnlLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(block_user_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 299, Short.MAX_VALUE)
                .addComponent(block_list_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(193, 193, 193))
        );

        block_user_pnl.add(sub_block_pnl, "card2");

        Setting_pnl.add(block_user_pnl, "card2");

        sub_Setting_pnl.setBackground(new java.awt.Color(255, 255, 255));
        sub_Setting_pnl.setPreferredSize(new java.awt.Dimension(1902, 1040));

        setting_save_btn.setBackground(new java.awt.Color(255, 255, 255));
        setting_save_btn.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        setting_save_btn.setText("Save ");
        setting_save_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setting_save_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setting_save_btnActionPerformed(evt);
            }
        });

        setting_block_btn.setBackground(new java.awt.Color(255, 255, 255));
        setting_block_btn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        setting_block_btn.setText("Block ");
        setting_block_btn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        setting_block_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setting_block_btnActionPerformed(evt);
            }
        });

        setting_select_language_leb.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        setting_select_language_leb.setText("Select Language");

        setting_profile_status_leb.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        setting_profile_status_leb.setText("Profile Status");

        setting_block_leb.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        setting_block_leb.setText("Block User");

        setting_language_list.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        setting_language_list.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "English", "Hindi", "Marathi", "Gujrathi", "Telgu", "Tamil" }));
        setting_language_list.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        setting_profile_status_list.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        setting_profile_status_list.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Any one can see my profile", "no one can see my profile", "Selected person " }));
        setting_profile_status_list.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        setting_mode_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dark_off.png"))); // NOI18N
        setting_mode_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setting_mode_btnActionPerformed(evt);
            }
        });

        setting_dark_leb.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        setting_dark_leb.setText("Dark Mode");

        setting_change_password_leb.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        setting_change_password_leb.setText("Change Password");

        setting_change_password_btn.setBackground(new java.awt.Color(255, 255, 255));
        setting_change_password_btn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        setting_change_password_btn.setText("Change Password");
        setting_change_password_btn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        setting_change_password_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setting_change_password_btnActionPerformed(evt);
            }
        });

        setting_change_address_leb.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        setting_change_address_leb.setText("Change Address");

        setting_change_address_btn.setBackground(new java.awt.Color(255, 255, 255));
        setting_change_address_btn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        setting_change_address_btn.setText("Change Address");
        setting_change_address_btn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        setting_change_address_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setting_change_address_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sub_Setting_pnlLayout = new javax.swing.GroupLayout(sub_Setting_pnl);
        sub_Setting_pnl.setLayout(sub_Setting_pnlLayout);
        sub_Setting_pnlLayout.setHorizontalGroup(
            sub_Setting_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sub_Setting_pnlLayout.createSequentialGroup()
                .addGroup(sub_Setting_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sub_Setting_pnlLayout.createSequentialGroup()
                        .addGap(343, 343, 343)
                        .addGroup(sub_Setting_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(sub_Setting_pnlLayout.createSequentialGroup()
                                .addGroup(sub_Setting_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(setting_block_leb, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(setting_select_language_leb, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(77, 77, 77)
                                .addGroup(sub_Setting_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(setting_language_list, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(setting_block_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(setting_change_address_leb, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(sub_Setting_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(setting_change_address_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, sub_Setting_pnlLayout.createSequentialGroup()
                                    .addGroup(sub_Setting_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(setting_profile_status_leb, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(setting_dark_leb, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(setting_change_password_leb, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(77, 77, 77)
                                    .addGroup(sub_Setting_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(setting_profile_status_list, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(setting_change_password_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(setting_mode_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(sub_Setting_pnlLayout.createSequentialGroup()
                        .addGap(685, 685, 685)
                        .addComponent(setting_save_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sub_Setting_pnlLayout.setVerticalGroup(
            sub_Setting_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sub_Setting_pnlLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(sub_Setting_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(setting_select_language_leb, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(setting_language_list, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(sub_Setting_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(setting_profile_status_leb, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(setting_profile_status_list, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(sub_Setting_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(setting_change_password_leb, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(setting_change_password_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(sub_Setting_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(setting_change_address_leb, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(setting_change_address_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(sub_Setting_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(setting_block_leb, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(setting_block_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(sub_Setting_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(setting_mode_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(setting_dark_leb, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(194, 194, 194)
                .addComponent(setting_save_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(331, Short.MAX_VALUE))
        );

        Setting_pnl.add(sub_Setting_pnl, "card2");

        dynamic_pnl.add(Setting_pnl, "card2");

        my_links_pnl.setBackground(new java.awt.Color(255, 255, 255));
        my_links_pnl.setLayout(new java.awt.CardLayout());

        my_link_sub_pnl.setBackground(new java.awt.Color(255, 255, 255));
        my_link_sub_pnl.setPreferredSize(new java.awt.Dimension(874, 718));
        my_link_sub_pnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        my_investment_btn.setBackground(new java.awt.Color(255, 255, 255));
        my_investment_btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        my_investment_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        my_investment_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                my_investment_btnActionPerformed(evt);
            }
        });
        my_link_sub_pnl.add(my_investment_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 600, 231, 211));

        my_application_btn.setBackground(new java.awt.Color(255, 255, 255));
        my_application_btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        my_application_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        my_application_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                my_application_btnActionPerformed(evt);
            }
        });
        my_link_sub_pnl.add(my_application_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(403, 600, 231, 211));

        my_link_canel_btn.setBackground(new java.awt.Color(255, 255, 255));
        my_link_canel_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        my_link_canel_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                my_link_canel_btnActionPerformed(evt);
            }
        });
        my_link_sub_pnl.add(my_link_canel_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 70, 70));

        my_doucount_btn.setBackground(new java.awt.Color(255, 255, 255));
        my_doucount_btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        my_doucount_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        my_doucount_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                my_doucount_btnActionPerformed(evt);
            }
        });
        my_link_sub_pnl.add(my_doucount_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 600, 231, 211));

        contact_us.setBackground(new java.awt.Color(255, 255, 255));
        contact_us.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        contact_us.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        contact_us.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contact_usActionPerformed(evt);
            }
        });
        my_link_sub_pnl.add(contact_us, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 600, 231, 211));

        terms_and_condiction.setBackground(new java.awt.Color(255, 255, 255));
        terms_and_condiction.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        terms_and_condiction.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        terms_and_condiction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                terms_and_condictionActionPerformed(evt);
            }
        });
        my_link_sub_pnl.add(terms_and_condiction, new org.netbeans.lib.awtextra.AbsoluteConstraints(1360, 600, 231, 211));

        myLinkBackLeb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                myLinkBackLebMouseEntered(evt);
            }
        });
        my_link_sub_pnl.add(myLinkBackLeb, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1675, 970));

        my_links_pnl.add(my_link_sub_pnl, "card2");

        terms_and_condition_pnl.setBackground(new java.awt.Color(255, 255, 255));
        terms_and_condition_pnl.setPreferredSize(new java.awt.Dimension(874, 718));

        accept_terms_and_condition_btn.setBackground(new java.awt.Color(255, 255, 255));
        accept_terms_and_condition_btn.setText("accept terms and condition");

        inTermsandCondition.setBackground(new java.awt.Color(255, 255, 255));
        inTermsandCondition.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 204), 2), "Terms and Condition", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(153, 0, 204))); // NOI18N

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane7.setViewportView(jTextArea1);

        javax.swing.GroupLayout inTermsandConditionLayout = new javax.swing.GroupLayout(inTermsandCondition);
        inTermsandCondition.setLayout(inTermsandConditionLayout);
        inTermsandConditionLayout.setHorizontalGroup(
            inTermsandConditionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inTermsandConditionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7)
                .addContainerGap())
        );
        inTermsandConditionLayout.setVerticalGroup(
            inTermsandConditionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inTermsandConditionLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout terms_and_condition_pnlLayout = new javax.swing.GroupLayout(terms_and_condition_pnl);
        terms_and_condition_pnl.setLayout(terms_and_condition_pnlLayout);
        terms_and_condition_pnlLayout.setHorizontalGroup(
            terms_and_condition_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(terms_and_condition_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(inTermsandCondition, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, terms_and_condition_pnlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(accept_terms_and_condition_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(610, 610, 610))
        );
        terms_and_condition_pnlLayout.setVerticalGroup(
            terms_and_condition_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(terms_and_condition_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(inTermsandCondition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 344, Short.MAX_VALUE)
                .addComponent(accept_terms_and_condition_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        my_links_pnl.add(terms_and_condition_pnl, "card2");

        my_documents_pnl.setBackground(new java.awt.Color(255, 255, 255));
        my_documents_pnl.setPreferredSize(new java.awt.Dimension(874, 718));
        my_documents_pnl.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                my_documents_pnlFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                my_documents_pnlFocusLost(evt);
            }
        });

        subMyDoc_scrollPnl.setBackground(new java.awt.Color(255, 255, 255));

        subMyDocPnl.setBackground(new java.awt.Color(255, 255, 255));
        subMyDocPnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Leaving Certificate");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel5MousePressed(evt);
            }
        });
        subMyDocPnl.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 472, 290, 80));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Aadhar Card");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel6MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel6MouseReleased(evt);
            }
        });
        subMyDocPnl.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 92, 290, 80));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("PAN Card");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel8MousePressed(evt);
            }
        });
        subMyDocPnl.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 290, 80));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Address Proof");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel9MousePressed(evt);
            }
        });
        subMyDocPnl.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 345, 290, 80));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Education Certificate");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel13MousePressed(evt);
            }
        });
        subMyDocPnl.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, 290, 80));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Document 1");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        subMyDocPnl.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, 290, 80));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Aadhar Cards");
        subMyDocPnl.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 345, 290, 80));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Aadhar Cards");
        subMyDocPnl.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 472, 290, 80));

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Aadhar Cards");
        subMyDocPnl.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 90, 290, 80));

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Aadhar Cards");
        subMyDocPnl.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 220, 290, 80));

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Aadhar Cards");
        subMyDocPnl.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 345, 290, 80));

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Aadhar Cards");
        subMyDocPnl.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 345, 290, 80));

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("Aadhar Cards");
        subMyDocPnl.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 472, 290, 80));

        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Aadhar Cards");
        subMyDocPnl.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 220, 290, 80));

        jLabel40.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("Aadhar Cards");
        subMyDocPnl.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 90, 290, 80));

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Aadhar Cards");
        subMyDocPnl.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 472, 290, 80));

        docListLeb1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        docListLeb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/upload_doc_labeled.jpg"))); // NOI18N
        subMyDocPnl.add(docListLeb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 370, 580));

        docListLeb2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        docListLeb2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/upload_doc_labeled.jpg"))); // NOI18N
        subMyDocPnl.add(docListLeb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, 370, 580));

        docListLeb3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        docListLeb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/upload_doc_labeled.jpg"))); // NOI18N
        subMyDocPnl.add(docListLeb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 40, 370, 580));

        docListLeb4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        docListLeb4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/upload_doc_labeled.jpg"))); // NOI18N
        subMyDocPnl.add(docListLeb4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 40, 370, 580));

        subMyDoc_scrollPnl.setViewportView(subMyDocPnl);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout my_documents_pnlLayout = new javax.swing.GroupLayout(my_documents_pnl);
        my_documents_pnl.setLayout(my_documents_pnlLayout);
        my_documents_pnlLayout.setHorizontalGroup(
            my_documents_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(subMyDoc_scrollPnl, javax.swing.GroupLayout.DEFAULT_SIZE, 1657, Short.MAX_VALUE)
            .addGroup(my_documents_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        my_documents_pnlLayout.setVerticalGroup(
            my_documents_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(my_documents_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(subMyDoc_scrollPnl, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(349, Short.MAX_VALUE))
        );

        my_links_pnl.add(my_documents_pnl, "card2");

        my_application_pnl.setBackground(new java.awt.Color(255, 255, 255));
        my_application_pnl.setPreferredSize(new java.awt.Dimension(874, 718));
        my_application_pnl.setLayout(new java.awt.CardLayout());

        my_application_sub_pnl.setBackground(new java.awt.Color(255, 255, 255));
        my_application_sub_pnl.setPreferredSize(new java.awt.Dimension(874, 718));

        pending_application_btn.setBackground(new java.awt.Color(255, 255, 255));
        pending_application_btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pending_application_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pending_application_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pending_application_btnActionPerformed(evt);
            }
        });

        rejected_application_btn.setBackground(new java.awt.Color(255, 255, 255));
        rejected_application_btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rejected_application_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        rejected_application_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rejected_application_btnActionPerformed(evt);
            }
        });

        my_application_canel_btn.setBackground(new java.awt.Color(255, 255, 255));
        my_application_canel_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        my_application_canel_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                my_application_canel_btnActionPerformed(evt);
            }
        });

        approval_application_btn.setBackground(new java.awt.Color(255, 255, 255));
        approval_application_btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        approval_application_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        approval_application_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approval_application_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout my_application_sub_pnlLayout = new javax.swing.GroupLayout(my_application_sub_pnl);
        my_application_sub_pnl.setLayout(my_application_sub_pnlLayout);
        my_application_sub_pnlLayout.setHorizontalGroup(
            my_application_sub_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(my_application_sub_pnlLayout.createSequentialGroup()
                .addGroup(my_application_sub_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(my_application_sub_pnlLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(my_application_canel_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(my_application_sub_pnlLayout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(rejected_application_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(260, 260, 260)
                        .addComponent(pending_application_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(260, 260, 260)
                        .addComponent(approval_application_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        my_application_sub_pnlLayout.setVerticalGroup(
            my_application_sub_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(my_application_sub_pnlLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(my_application_canel_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(460, 460, 460)
                .addGroup(my_application_sub_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rejected_application_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pending_application_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(approval_application_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(330, Short.MAX_VALUE))
        );

        my_application_pnl.add(my_application_sub_pnl, "card2");

        application_data_Pnl.setBackground(new java.awt.Color(255, 255, 255));
        application_data_Pnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        application_data_Pnl.setPreferredSize(new java.awt.Dimension(874, 718));
        application_data_Pnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        applicationStatusTbl.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        applicationStatusTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Application Info", "Date of Applied", "Type", "Date of Rejected"
            }
        ));
        applicationStatusTbl.setToolTipText("");
        applicationStatusTbl.setRowHeight(40);
        applicationStatusTbl.setRowMargin(3);
        jScrollPane8.setViewportView(applicationStatusTbl);

        application_data_Pnl.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 1430, 710));

        my_application_pnl.add(application_data_Pnl, "card2");

        my_links_pnl.add(my_application_pnl, "card2");

        ContactUs_Pnl.setBackground(new java.awt.Color(255, 255, 255));
        ContactUs_Pnl.setLayout(new java.awt.CardLayout());

        contactUsSubPnl.setBackground(new java.awt.Color(255, 255, 255));
        contactUsSubPnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        contactUsSubPnl.setPreferredSize(new java.awt.Dimension(874, 718));
        contactUsSubPnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contactUSAddPnl.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contactUSAddPnlLayout = new javax.swing.GroupLayout(contactUSAddPnl);
        contactUSAddPnl.setLayout(contactUSAddPnlLayout);
        contactUSAddPnlLayout.setHorizontalGroup(
            contactUSAddPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1620, Short.MAX_VALUE)
        );
        contactUSAddPnlLayout.setVerticalGroup(
            contactUSAddPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );

        contactUsSubPnl.add(contactUSAddPnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 1620, 800));

        mailBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mailBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mailBtnMouseExited(evt);
            }
        });
        mailBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mailBtnActionPerformed(evt);
            }
        });
        contactUsSubPnl.add(mailBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 760, 90, 90));

        locBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                locBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                locBtnMouseExited(evt);
            }
        });
        locBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locBtnActionPerformed(evt);
            }
        });
        contactUsSubPnl.add(locBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 370, 90, 90));

        callBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                callBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                callBtnMouseExited(evt);
            }
        });
        callBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                callBtnActionPerformed(evt);
            }
        });
        contactUsSubPnl.add(callBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 610, 90, 90));

        msgBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                msgBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                msgBtnMouseExited(evt);
            }
        });
        msgBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                msgBtnActionPerformed(evt);
            }
        });
        contactUsSubPnl.add(msgBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 420, 90, 90));
        contactUsSubPnl.add(contactUs_backLeb, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1680, 1050));

        ContactUs_Pnl.add(contactUsSubPnl, "card2");

        my_links_pnl.add(ContactUs_Pnl, "card2");

        dynamic_pnl.add(my_links_pnl, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menu_pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(dynamic_pnl, javax.swing.GroupLayout.PREFERRED_SIZE, 1657, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dynamic_pnl, javax.swing.GroupLayout.PREFERRED_SIZE, 966, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menu_pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//    static void loading(){
//        lp = new loadingPnl("/images/GIF/loading2.gif");
//        jPanel3.add(lp,0);
//        lp.setSize(500, 500);
//        lp.setLocation(500,300);
//    }

    private void logout_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_btnActionPerformed
        manager.threadStopper();
        frame.dispose();
        LogInFrame.lf.show();
    }//GEN-LAST:event_logout_btnActionPerformed

    private void profile_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profile_btnActionPerformed
        v.mainPanesFalse();
        profile_pnl.setVisible(true);
        error_leb.setText("");
        ProfileData.getProfileData();
    }//GEN-LAST:event_profile_btnActionPerformed

    private void jButton7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseEntered
        set_leb.setText("Mobile Recharge");
    }//GEN-LAST:event_jButton7MouseEntered

    private void jButton7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseExited
        set_leb.setText("");
    }//GEN-LAST:event_jButton7MouseExited

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseEntered
        set_leb.setText("Eletricity Bill");
    }//GEN-LAST:event_jButton8MouseEntered

    private void jButton8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseExited
        set_leb.setText("");
    }//GEN-LAST:event_jButton8MouseExited

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseEntered
        set_leb.setText("Unknown1");
    }//GEN-LAST:event_jButton9MouseEntered

    private void jButton9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseExited
        set_leb.setText("");
    }//GEN-LAST:event_jButton9MouseExited

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseEntered
        set_leb.setText("Unknown2");
    }//GEN-LAST:event_jButton10MouseEntered

    private void jButton10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseExited
        set_leb.setText("");
    }//GEN-LAST:event_jButton10MouseExited

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
    }//GEN-LAST:event_jButton10ActionPerformed

    private void tranzection_cancle_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tranzection_cancle_btnActionPerformed
        transection_pnl.setVisible(false);
        front_pnl.setVisible(true);
    }//GEN-LAST:event_tranzection_cancle_btnActionPerformed

    private void profile_cancle_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profile_cancle_btnActionPerformed
        ProfileData.getProfileData();
        profile_pnl.setVisible(false);
        front_pnl.show();    
    }//GEN-LAST:event_profile_cancle_btnActionPerformed

    private void servese_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_servese_btnActionPerformed
       v.mainPanesFalse();
       v.servicePaneFalse();
       services_pnl.setVisible(true);
       sub_services_pnl.setVisible(true);
    }//GEN-LAST:event_servese_btnActionPerformed

    private void name_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_txtActionPerformed
    }//GEN-LAST:event_name_txtActionPerformed

    private void email_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_txtActionPerformed
    }//GEN-LAST:event_email_txtActionPerformed

    private void upi_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upi_txtActionPerformed
    }//GEN-LAST:event_upi_txtActionPerformed

    private void user_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_idActionPerformed
    }//GEN-LAST:event_user_idActionPerformed

    private void contact_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contact_txtActionPerformed
    }//GEN-LAST:event_contact_txtActionPerformed

    private void profile_save_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profile_save_btnActionPerformed
        ProfileData.updateProfile();
    }//GEN-LAST:event_profile_save_btnActionPerformed

    private void aadhar_txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aadhar_txt1ActionPerformed
    }//GEN-LAST:event_aadhar_txt1ActionPerformed

    private void aadhar_txt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aadhar_txt2ActionPerformed
    }//GEN-LAST:event_aadhar_txt2ActionPerformed

    private void aadhar_txt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aadhar_txt3ActionPerformed
    }//GEN-LAST:event_aadhar_txt3ActionPerformed

    private void profile_upload_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profile_upload_btnActionPerformed
         new ProfilePopUp().show();
    }//GEN-LAST:event_profile_upload_btnActionPerformed

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

    private void setting_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setting_btnActionPerformed
        v.mainPanesFalse();
        v.settingPaneFalse();
        Setting_pnl.setVisible(true);
        sub_Setting_pnl.setVisible(true);
    }//GEN-LAST:event_setting_btnActionPerformed

    private void tranzection_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tranzection_btnActionPerformed
        v.mainPanesFalse();
        transection_pnl.setVisible(true);
    }//GEN-LAST:event_tranzection_btnActionPerformed

    private void my_link_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_my_link_btnActionPerformed
        v.mainPanesFalse();
        v.mylinkPaneFalse();
        my_application_sub_pnl.setVisible(false);
        my_links_pnl.setVisible(true);
        my_link_sub_pnl.show();
    }//GEN-LAST:event_my_link_btnActionPerformed

    private void home_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home_btnActionPerformed
        v.mainPanesFalse();
        front_pnl.show();
    }//GEN-LAST:event_home_btnActionPerformed

    private void home_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_btnMouseEntered
    }//GEN-LAST:event_home_btnMouseEntered

    private void notificationBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_notificationBtnMouseEntered
    }//GEN-LAST:event_notificationBtnMouseEntered

    private void notificationBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_notificationBtnMouseExited
    }//GEN-LAST:event_notificationBtnMouseExited

    private void home_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_btnMouseExited
    }//GEN-LAST:event_home_btnMouseExited

    private void send_mony_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_send_mony_btnMouseEntered
        send_mony_btn.setForeground(Color.BLUE);
    }//GEN-LAST:event_send_mony_btnMouseEntered

    private void recive_mony_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recive_mony_btnMouseEntered
        recive_mony_btn.setForeground(Color.BLUE);
    }//GEN-LAST:event_recive_mony_btnMouseEntered

    private void reward_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reward_btnMouseEntered
        reward_btn.setForeground(Color.BLUE);
    }//GEN-LAST:event_reward_btnMouseEntered

    private void history_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_history_btnMouseEntered
        history_btn.setForeground(Color.BLUE);
    }//GEN-LAST:event_history_btnMouseEntered

    private void tranzection_cancle_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tranzection_cancle_btnMouseEntered
        tranzection_cancle_btn.setForeground(Color.BLUE);
    }//GEN-LAST:event_tranzection_cancle_btnMouseEntered

    private void send_mony_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_send_mony_btnMouseExited
        send_mony_btn.setForeground(Color.WHITE);
        ViewMode.transectionViewMode();
    }//GEN-LAST:event_send_mony_btnMouseExited

    private void recive_mony_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recive_mony_btnMouseExited
        recive_mony_btn.setForeground(Color.WHITE);
        ViewMode.transectionViewMode();
    }//GEN-LAST:event_recive_mony_btnMouseExited

    private void reward_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reward_btnMouseExited
        reward_btn.setForeground(Color.WHITE);
        ViewMode.transectionViewMode();
    }//GEN-LAST:event_reward_btnMouseExited

    private void history_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_history_btnMouseExited
        history_btn.setForeground(Color.WHITE);
        ViewMode.transectionViewMode();
    }//GEN-LAST:event_history_btnMouseExited

    private void tranzection_cancle_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tranzection_cancle_btnMouseExited
        tranzection_cancle_btn.setForeground(Color.WHITE);
        ViewMode.transectionViewMode();
    }//GEN-LAST:event_tranzection_cancle_btnMouseExited

    private void d1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_d1FocusLost
        if(d1.getText().equals(""))
            d1.setText("D");
    }//GEN-LAST:event_d1FocusLost

    private void d2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_d2FocusLost
        if(d2.getText().equals(""))
            d2.setText("D");
    }//GEN-LAST:event_d2FocusLost

    private void m1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_m1FocusLost
        if(m1.getText().equals(""))
            m1.setText("M");
    }//GEN-LAST:event_m1FocusLost

    private void m2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_m2FocusLost
        if(m2.getText().equals(""))
            m2.setText("M");
    }//GEN-LAST:event_m2FocusLost

    private void y1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_y1FocusLost
        if(y1.getText().equals(""))
            y1.setText("Y");
    }//GEN-LAST:event_y1FocusLost

    private void y2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_y2FocusLost
        if(y2.getText().equals(""))
            y2.setText("Y");
    }//GEN-LAST:event_y2FocusLost

    private void y3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_y3FocusLost
        if(y3.getText().equals(""))
            y3.setText("Y");
    }//GEN-LAST:event_y3FocusLost

    private void y4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_y4FocusLost
        if(y4.getText().equals(""))
            y4.setText("Y");
    }//GEN-LAST:event_y4FocusLost

    private void close_send_monyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close_send_monyActionPerformed
        sub_transaction_pnl.setVisible(false);
    }//GEN-LAST:event_close_send_monyActionPerformed

    private void send_mony_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_send_mony_btnActionPerformed
        v.transactionPaneFalse();
        send_mony_pnl.show();
    }//GEN-LAST:event_send_mony_btnActionPerformed

    private void close_recive_mony1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close_recive_mony1ActionPerformed
        sub_transaction_pnl.setVisible(false);
    }//GEN-LAST:event_close_recive_mony1ActionPerformed

    private void close_historyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close_historyActionPerformed
        sub_transaction_pnl.setVisible(false);
    }//GEN-LAST:event_close_historyActionPerformed

    private void recive_mony_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recive_mony_btnActionPerformed
        v.transactionPaneFalse();
        recive_mony_pnl.show();
    }//GEN-LAST:event_recive_mony_btnActionPerformed

    private void recive_mony_show_qr_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recive_mony_show_qr_btnActionPerformed
        new QRCode().show();
    }//GEN-LAST:event_recive_mony_show_qr_btnActionPerformed

    private void d1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_d1KeyTyped
        ut.isDigit(evt);
        ut.transferFocus(d1, 1);
    }//GEN-LAST:event_d1KeyTyped

    private void d2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_d2KeyTyped
        ut.isDigit(evt);
    }//GEN-LAST:event_d2KeyTyped

    private void m1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_m1KeyTyped
        ut.isDigit(evt);
        ut.transferFocus(m1, 1);
    }//GEN-LAST:event_m1KeyTyped

    private void m2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_m2KeyTyped
        ut.isDigit(evt);
    }//GEN-LAST:event_m2KeyTyped

    private void y1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_y1KeyTyped
        ut.isDigit(evt);
        ut.transferFocus(y1, 1);
    }//GEN-LAST:event_y1KeyTyped

    private void y2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_y2KeyTyped
        ut.isDigit(evt);
        ut.transferFocus(y2, 1);                    
    }//GEN-LAST:event_y2KeyTyped

    private void y3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_y3KeyTyped
        ut.isDigit(evt);
        ut.transferFocus(y3, 1);
    }//GEN-LAST:event_y3KeyTyped

    private void y4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_y4KeyTyped
        ut.isDigit(evt);
    }//GEN-LAST:event_y4KeyTyped

    private void aadhar_txt1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_aadhar_txt1KeyTyped
        Utilities.isDigit(evt);
        Utilities.transferFocus(aadhar_txt1, 4);
    }//GEN-LAST:event_aadhar_txt1KeyTyped

    private void aadhar_txt2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_aadhar_txt2KeyTyped
        Utilities.isDigit(evt);
        Utilities.transferFocus(aadhar_txt2, 4);
    }//GEN-LAST:event_aadhar_txt2KeyTyped

    private void aadhar_txt3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_aadhar_txt3KeyTyped
        Utilities.isDigit(evt);
        Utilities.transferFocus(aadhar_txt3, 4);
    }//GEN-LAST:event_aadhar_txt3KeyTyped

    private void name_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_name_txtKeyTyped
        ch = evt.getKeyChar();
        if(!(Character.isAlphabetic(ch)) && !(Character.isWhitespace(ch)))
            evt.consume();
    }//GEN-LAST:event_name_txtKeyTyped

    private void aadhar_txt1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_aadhar_txt1FocusGained
        aadhar_txt1.setText("");
    }//GEN-LAST:event_aadhar_txt1FocusGained

    private void aadhar_txt2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_aadhar_txt2FocusGained
        aadhar_txt2.setText("");
    }//GEN-LAST:event_aadhar_txt2FocusGained

    private void aadhar_txt3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_aadhar_txt3FocusGained
        aadhar_txt3.setText("");
    }//GEN-LAST:event_aadhar_txt3FocusGained

    private void reward_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reward_btnActionPerformed
        v.transactionPaneFalse();
        reward_mony_pnl.show();
        rd.getRelativeColumn("select Rewards from Transection where SenderAccountNo = '"+LogInFrame.account_no+"' and Rewards <> '"+0+"'");
        rewrdsTable.setModel(DbUtils.resultSetToTableModel(ReLiveData.rs));
    }//GEN-LAST:event_reward_btnActionPerformed

    private void history_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_history_btnActionPerformed
        v.transactionPaneFalse();
        history_pnl.show();
        rd.getRelativeColumn("select Ammount from Transection where SenderAccountNo = '"+LogInFrame.account_no+"' or ReciverAccountNo = '"+LogInFrame.account_no+"'");
        jTable1.setModel(DbUtils.resultSetToTableModel(ReLiveData.rs));
    }//GEN-LAST:event_history_btnActionPerformed

    private void close_rewardsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close_rewardsActionPerformed
        sub_transaction_pnl.setVisible(false);
    }//GEN-LAST:event_close_rewardsActionPerformed

    private void rewards_more_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rewards_more_btnMouseEntered
        rewards_more_btn.setForeground(Color.BLUE);
    }//GEN-LAST:event_rewards_more_btnMouseEntered

    private void rewards_more_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rewards_more_btnMouseExited
        rewards_more_btn.setForeground(Color.BLACK);
    }//GEN-LAST:event_rewards_more_btnMouseExited

    private void services_pnl_cancle_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_services_pnl_cancle_btnMouseEntered
        services_pnl_cancle_btn.setForeground(Color.BLUE);
    }//GEN-LAST:event_services_pnl_cancle_btnMouseEntered

    private void services_pnl_cancle_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_services_pnl_cancle_btnMouseExited
        services_pnl_cancle_btn.setForeground(Color.BLACK);
        ViewMode.servicesViewMode();
    }//GEN-LAST:event_services_pnl_cancle_btnMouseExited

    private void services_pnl_cancle_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_services_pnl_cancle_btnActionPerformed
        v.mainPanesFalse();
        front_pnl.show();
    }//GEN-LAST:event_services_pnl_cancle_btnActionPerformed

    private void cards_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cards_btnMouseEntered
        cards_btn.setForeground(Color.BLUE);
    }//GEN-LAST:event_cards_btnMouseEntered

    private void cards_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cards_btnMouseExited
        cards_btn.setForeground(Color.BLACK);
        ViewMode.servicesViewMode();
    }//GEN-LAST:event_cards_btnMouseExited

    private void investment_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_investment_btnMouseEntered
        investment_btn.setForeground(Color.BLUE);
    }//GEN-LAST:event_investment_btnMouseEntered

    private void investment_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_investment_btnMouseExited
        investment_btn.setForeground(Color.BLACK);
        ViewMode.servicesViewMode();
    }//GEN-LAST:event_investment_btnMouseExited

    private void loan_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loan_btnMouseEntered
        loan_btn.setForeground(Color.BLUE);
    }//GEN-LAST:event_loan_btnMouseEntered

    private void loan_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loan_btnMouseExited
        loan_btn.setForeground(Color.BLACK);
        ViewMode.servicesViewMode();
    }//GEN-LAST:event_loan_btnMouseExited

    private void invite_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_invite_btnMouseEntered
        invite_btn.setForeground(Color.BLUE);
    }//GEN-LAST:event_invite_btnMouseEntered

    private void invite_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_invite_btnMouseExited
        invite_btn.setForeground(Color.BLACK);
        ViewMode.servicesViewMode();
    }//GEN-LAST:event_invite_btnMouseExited

    private void my_app_sevices_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_my_app_sevices_btnMouseEntered
        my_app_sevices_btn.setForeground(Color.BLUE);
    }//GEN-LAST:event_my_app_sevices_btnMouseEntered

    private void my_app_sevices_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_my_app_sevices_btnMouseExited
        my_app_sevices_btn.setForeground(Color.BLACK);
        ViewMode.servicesViewMode();
    }//GEN-LAST:event_my_app_sevices_btnMouseExited

    private void my_app_sevices_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_my_app_sevices_btnActionPerformed
        v.servicePaneFalse();
        services_my_app_pnl.show();
    }//GEN-LAST:event_my_app_sevices_btnActionPerformed

    private void insurance_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insurance_btnMouseEntered
        insurance_btn.setForeground(Color.BLUE);
    }//GEN-LAST:event_insurance_btnMouseEntered

    private void insurance_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insurance_btnMouseExited
        insurance_btn.setForeground(Color.BLACK);
        ViewMode.servicesViewMode();
    }//GEN-LAST:event_insurance_btnMouseExited

    private void loan_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loan_btnActionPerformed
        v.servicePaneFalse();
        services_loan_pnl.show();
    }//GEN-LAST:event_loan_btnActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void insurance_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insurance_btnActionPerformed
        v.servicePaneFalse();
        services_insurance_pnl.show();
    }//GEN-LAST:event_insurance_btnActionPerformed

    private void investment_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_investment_btnActionPerformed
        v.servicePaneFalse();
        services_invesement_pnl.show();
    }//GEN-LAST:event_investment_btnActionPerformed

    private void cards_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cards_btnActionPerformed
        v.servicePaneFalse();
        services_cards_pnl.show();
    }//GEN-LAST:event_cards_btnActionPerformed

    private void invite_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invite_btnActionPerformed
        v.servicePaneFalse();
        services_invite_pnl.show();
    }//GEN-LAST:event_invite_btnActionPerformed

    private void my_investment_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_my_investment_btnActionPerformed
    }//GEN-LAST:event_my_investment_btnActionPerformed

    private void my_application_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_my_application_btnActionPerformed
        v.mylinkPaneFalse();
        my_link_sub_pnl.setVisible(false);
        my_application_pnl.setVisible(true);
        my_application_sub_pnl.setVisible(true);
    }//GEN-LAST:event_my_application_btnActionPerformed

    private void my_link_canel_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_my_link_canel_btnActionPerformed
        v.mainPanesFalse();
        v.mylinkPaneFalse();
        front_pnl.show();
        
    }//GEN-LAST:event_my_link_canel_btnActionPerformed

    private void my_doucount_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_my_doucount_btnActionPerformed
        v.mylinkPaneFalse();
        my_documents_pnl.show();
        ut.imageIcon(docListLeb4, "src//images//upload_doc_labeled.jpg");
        ut.imageIcon(docListLeb3, "src//images//upload_doc_labeled.jpg");
        ut.imageIcon(docListLeb1, "src//images//upload_doc_labeled.jpg");
        ut.imageIcon(docListLeb2, "src//images//upload_doc_labeled.jpg");
    }//GEN-LAST:event_my_doucount_btnActionPerformed

    private void setting_save_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setting_save_btnActionPerformed
        try {
            rd.pst = con.prepareStatement("update setting set select_language = ? , profile_status = ? , dark_mode = ? where AccNo = '"+LogInFrame.account_no+"'");
            rd.pst.setString(1, setting_language_list.getSelectedItem().toString());
            rd.pst.setString(2, setting_profile_status_list.getSelectedItem().toString());
            rd.pst.setString(3,DarkMode);
            rd.pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        v.mainPanesFalse();
        front_pnl.setVisible(true);
    }//GEN-LAST:event_setting_save_btnActionPerformed

    private void Agriculture_Loan_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Agriculture_Loan_btnMouseEntered
        loan_status_TxtArea.setText(loan.getLoanInfo("AGRICULTURE"));
        loan.loanBtnGain(Agriculture_Loan_btn);
    }//GEN-LAST:event_Agriculture_Loan_btnMouseEntered

    private void Business_Loan_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Business_Loan_btnMouseEntered
        loan_status_TxtArea.setText(loan.getLoanInfo("BUSINESS"));
        loan.loanBtnGain(Business_Loan_btn);
    }//GEN-LAST:event_Business_Loan_btnMouseEntered

    private void Car_Loan_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Car_Loan_btnMouseEntered
        loan_status_TxtArea.setText(loan.getLoanInfo("CAR"));
        loan.loanBtnGain(Car_Loan_btn);
    }//GEN-LAST:event_Car_Loan_btnMouseEntered

    private void Construction_Loan_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Construction_Loan_btnMouseEntered
        loan_status_TxtArea.setText(loan.getLoanInfo("CONSTRUCTION"));
        loan.loanBtnGain(Construction_Loan_btn);
    }//GEN-LAST:event_Construction_Loan_btnMouseEntered

    private void Gold_Loan_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Gold_Loan_btnMouseEntered
        loan_status_TxtArea.setText(loan.getLoanInfo("GOLD"));
        loan.loanBtnGain(Gold_Loan_btn);
    }//GEN-LAST:event_Gold_Loan_btnMouseEntered

    private void Education_Loan_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Education_Loan_btnMouseEntered
        loan_status_TxtArea.setText(loan.getLoanInfo("EDUCATION"));
        loan.loanBtnGain(Education_Loan_btn);
    }//GEN-LAST:event_Education_Loan_btnMouseEntered

    private void Property_Loan_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Property_Loan_btnMouseEntered
        loan_status_TxtArea.setText(loan.getLoanInfo("PROPERTY"));
        loan.loanBtnGain(Property_Loan_btn);
    }//GEN-LAST:event_Property_Loan_btnMouseEntered

    private void Pay_Per_Day_Loan_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pay_Per_Day_Loan_btnMouseEntered
        loan_status_TxtArea.setText(loan.getLoanInfo("PAY_PER_DAY"));
        loan.loanBtnGain(Pay_Per_Day_Loan_btn);
    }//GEN-LAST:event_Pay_Per_Day_Loan_btnMouseEntered

    private void Two_Wheeler_Loan_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Two_Wheeler_Loan_btnMouseEntered
        loan_status_TxtArea.setText(loan.getLoanInfo("TWO_WHEELER"));
        loan.loanBtnGain(Two_Wheeler_Loan_btn);
    }//GEN-LAST:event_Two_Wheeler_Loan_btnMouseEntered

    private void Agriculture_Loan_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Agriculture_Loan_btnMouseExited
//        loan_status_TxtArea.setText("");
        loan.loanBtnLost(Agriculture_Loan_btn);
        ViewMode.event_MouseExit_ViewMode(Agriculture_Loan_btn);
    }//GEN-LAST:event_Agriculture_Loan_btnMouseExited

    private void Business_Loan_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Business_Loan_btnMouseExited
//        loan_status_TxtArea.setText("");
        loan.loanBtnLost(Business_Loan_btn);
        ViewMode.event_MouseExit_ViewMode(Business_Loan_btn);
    }//GEN-LAST:event_Business_Loan_btnMouseExited

    private void Car_Loan_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Car_Loan_btnMouseExited
//        loan_status_TxtArea.setText("");
        loan.loanBtnLost(Car_Loan_btn);
        ViewMode.event_MouseExit_ViewMode(Car_Loan_btn);
    }//GEN-LAST:event_Car_Loan_btnMouseExited

    private void Construction_Loan_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Construction_Loan_btnMouseExited
//        loan_status_TxtArea.setText("");
        loan.loanBtnLost(Construction_Loan_btn);
        ViewMode.event_MouseExit_ViewMode(Construction_Loan_btn);
    }//GEN-LAST:event_Construction_Loan_btnMouseExited

    private void Gold_Loan_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Gold_Loan_btnMouseExited
//        loan_status_TxtArea.setText("");
        loan.loanBtnLost(Gold_Loan_btn);
        ViewMode.event_MouseExit_ViewMode(Gold_Loan_btn);
    }//GEN-LAST:event_Gold_Loan_btnMouseExited

    private void Education_Loan_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Education_Loan_btnMouseExited
//        loan_status_TxtArea.setText("");
        loan.loanBtnLost(Education_Loan_btn);
        ViewMode.event_MouseExit_ViewMode(Education_Loan_btn);
    }//GEN-LAST:event_Education_Loan_btnMouseExited

    private void Property_Loan_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Property_Loan_btnMouseExited
//        loan_status_TxtArea.setText("");
        loan.loanBtnLost(Property_Loan_btn);
        ViewMode.event_MouseExit_ViewMode(Property_Loan_btn);
    }//GEN-LAST:event_Property_Loan_btnMouseExited

    private void Pay_Per_Day_Loan_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pay_Per_Day_Loan_btnMouseExited
//        loan_status_TxtArea.setText("");
        loan.loanBtnLost(Pay_Per_Day_Loan_btn);
        ViewMode.event_MouseExit_ViewMode(Pay_Per_Day_Loan_btn);
    }//GEN-LAST:event_Pay_Per_Day_Loan_btnMouseExited

    private void Two_Wheeler_Loan_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Two_Wheeler_Loan_btnMouseExited
//        loan_status_TxtArea.setText("");
        loan.loanBtnLost(Two_Wheeler_Loan_btn);
        ViewMode.event_MouseExit_ViewMode(Two_Wheeler_Loan_btn);
    }//GEN-LAST:event_Two_Wheeler_Loan_btnMouseExited

    private void setting_change_password_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setting_change_password_btnActionPerformed
        v.settingPaneFalse();
        change_password_pnl.setVisible(true);
        cpacha_btn.setSelected(false);
        if(setting_mode_btn.isSelected())
             cpacha_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dark_capch_unclick.png")));
        else
            cpacha_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/capcha_unclick.png")));
    }//GEN-LAST:event_setting_change_password_btnActionPerformed

    private void setting_change_address_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setting_change_address_btnActionPerformed
        v.settingPaneFalse();
        change_address_pnl.setVisible(true);
    }//GEN-LAST:event_setting_change_address_btnActionPerformed

    private void setting_block_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setting_block_btnActionPerformed
        v.settingPaneFalse();
        block_user_pnl.setVisible(true);
    }//GEN-LAST:event_setting_block_btnActionPerformed

    private void new_password_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_new_password_txtKeyTyped
        ch = evt.getKeyChar();
        password_strenth_bar.setVisible(true);        
        percentags = ((new_password_txt.getText().length())/100)*40;
        if(!(new_password_txt.getText().length() <= 5)){
            password_strenth_bar.show();
            password_strenth_bar.setForeground(Color.RED);
            password_strenth_bar1.setVisible(false);
            password_strenth_bar2.setVisible(false);
        }
        if(!(new_password_txt.getText().length() <= 10)){
            password_strenth_bar2.setVisible(false);
            password_strenth_bar.setForeground(Color.BLUE);
            password_strenth_bar1.show();
            password_strenth_bar1.setForeground(Color.BLUE);
        }
        if(!(new_password_txt.getText().length() <= 15)){
            password_strenth_bar.setForeground(Color.GREEN);
            password_strenth_bar1.setForeground(Color.GREEN);
            password_strenth_bar2.show();
        }
    }//GEN-LAST:event_new_password_txtKeyTyped

    private void setting_change_pass_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setting_change_pass_btnActionPerformed
        if(old_password_txt.getText().equals(LogInFrame.password_get)){
            if(new_password_txt.getText().equals("")){
                new_password_txt.setForeground(Color.RED);
                new_password_txt.setEchoChar((char)0);
                new_password_txt.setText("Ener Passsword");
            }
            else if(new_password_txt.getText().equals(confirm_password_txt.getText())){                
                if(!(cpacha_btn.isSelected())){
                    capcha_status_leb.setText("Please Click Above Box");
                    capcha_status_leb.show();
                }
                else{
                    try {
                        rd.pst = con.prepareStatement("update log_in set password = ? where id = '"+LogInFrame.userID+"'");
                        rd.pst.setString(1, new_password_txt.getText());
                        rd.pst.executeUpdate();
                        LogInFrame.password_get = new_password_txt.getText();
                    } catch (SQLException ex) {
                        Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    password_strenth_bar.setVisible(false); password_strenth_bar1.setVisible(false); password_strenth_bar2.setVisible(false);
                    old_password_txt.setText(""); new_password_txt.setText(""); confirm_password_txt.setText("");
                    cpacha_btn.setSelected(true);
                    cpacha_btn.doClick();
                    v.settingPaneFalse();
                    sub_Setting_pnl.setVisible(true);
                }
            }
            else{
                new_password_txt.setForeground(Color.RED);
                confirm_password_txt.setForeground(Color.RED);
                new_password_txt.setEchoChar((char)0);
                confirm_password_txt.setEchoChar((char)0);
                new_password_txt.setText("Ener Passsword not match");
                confirm_password_txt.setText("Ener Passsword not match");
            }
        }
        else{
            old_password_txt.setForeground(Color.RED);
            old_password_txt.setEchoChar((char)0);
            old_password_txt.setText("Enter Valid Password");
        }
    }//GEN-LAST:event_setting_change_pass_btnActionPerformed

    private void old_password_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_old_password_txtKeyTyped
        old_password_txt.setForeground(Color.BLACK);
    }//GEN-LAST:event_old_password_txtKeyTyped

    private void cpacha_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpacha_btnActionPerformed
        if(setting_mode_btn.isSelected()){
            if(cpacha_btn.isSelected()){
                cpacha_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dark_capch_click.png")));
                capcha_status_leb.setVisible(false);
            }
            else
                cpacha_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dark_capch_unclick.png")));           
        }
        else{
            if(cpacha_btn.isSelected())
                cpacha_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/capcha_click.png")));
            else
                cpacha_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/capcha_unclick.png")));     
        }
    }//GEN-LAST:event_cpacha_btnActionPerformed

    private void old_password_txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_old_password_txtKeyPressed
        old_password_txt.setForeground(Color.BLACK);
    }//GEN-LAST:event_old_password_txtKeyPressed

    private void new_password_txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_new_password_txtKeyPressed
        new_password_txt.setForeground(Color.BLACK);
    }//GEN-LAST:event_new_password_txtKeyPressed

    private void confirm_password_txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_confirm_password_txtKeyPressed
        confirm_password_txt.setForeground(Color.BLACK);
    }//GEN-LAST:event_confirm_password_txtKeyPressed

    private void old_password_txtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_old_password_txtFocusGained
        old_password_txt.setText("");
        old_password_txt.setEchoChar('*');
    }//GEN-LAST:event_old_password_txtFocusGained

    private void new_password_txtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_new_password_txtFocusGained
        new_password_txt.setText("");
        new_password_txt.setEchoChar('*');
        password_strenth_bar.setVisible(false);
        password_strenth_bar1.setVisible(false);
        password_strenth_bar2.setVisible(false);
        password_strenth_bar.setForeground(Color.RED);
    }//GEN-LAST:event_new_password_txtFocusGained

    private void confirm_password_txtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confirm_password_txtFocusGained
        confirm_password_txt.setText("");
        confirm_password_txt.setEchoChar('*');
    }//GEN-LAST:event_confirm_password_txtFocusGained

    private void setting_change_pass_cancel_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setting_change_pass_cancel_btnActionPerformed
        v.settingPaneFalse();
        sub_Setting_pnl.show();
    }//GEN-LAST:event_setting_change_pass_cancel_btnActionPerformed

    private void contact_usActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contact_usActionPerformed
        v.mylinkPaneFalse();
        ContactUs_Pnl.setVisible(true);
    }//GEN-LAST:event_contact_usActionPerformed

    private void terms_and_condictionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_terms_and_condictionActionPerformed
        v.mylinkPaneFalse();
        terms_and_condition_pnl.show();
    }//GEN-LAST:event_terms_and_condictionActionPerformed

    private void setting_change_address_save_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setting_change_address_save_btnActionPerformed
        try {
            rd.pst = con.prepareStatement("UPDATE profile set address = ?, address1 = ?, address2 = ? where id = '"+LogInFrame.userID+"'");
            rd.pst.setString(1, change_address_perment_address_txt.getText());
            rd.pst.setString(2, change_address_address1_txt.getText());
            rd.pst.setString(3, change_address_address2_txt.getText());
            rd.pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        v.settingPaneFalse();
        sub_Setting_pnl.show();
        change_address_pnl.setVisible(false);
    }//GEN-LAST:event_setting_change_address_save_btnActionPerformed

    private void setting_change_address_cancel_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setting_change_address_cancel_btnActionPerformed
        v.settingPaneFalse();
        sub_Setting_pnl.show();
        change_address_pnl.setVisible(false);        
    }//GEN-LAST:event_setting_change_address_cancel_btnActionPerformed

    private void new_password_txtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_new_password_txtFocusLost
        if(new_password_txt.getText().equals("")){
            password_strenth_bar.setVisible(false);
            password_strenth_bar1.setVisible(false);
            password_strenth_bar2.setVisible(false);
        }
    }//GEN-LAST:event_new_password_txtFocusLost

    private void block_user_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_block_user_btnActionPerformed
        v.settingPaneFalse();
        block_user_pnl.show();
        block_list_pnl.show();
    }//GEN-LAST:event_block_user_btnActionPerformed

    private void block_list_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_block_list_btnActionPerformed
    }//GEN-LAST:event_block_list_btnActionPerformed

    private void block_user_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_block_user_btnMouseEntered
        block_user_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/block_user_blur.png")));
    }//GEN-LAST:event_block_user_btnMouseEntered

    private void block_user_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_block_user_btnMouseExited
        block_user_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/block_user.png")));
    }//GEN-LAST:event_block_user_btnMouseExited

    private void block_list_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_block_list_btnMouseExited
        block_list_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/block_list.png")));
    }//GEN-LAST:event_block_list_btnMouseExited

    private void block_list_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_block_list_btnMouseEntered
        block_list_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/block_list _blur.png")));
    }//GEN-LAST:event_block_list_btnMouseEntered

    private void my_application_canel_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_my_application_canel_btnActionPerformed
        v.mylinkPaneFalse();
        my_link_sub_pnl.setVisible(true);
    }//GEN-LAST:event_my_application_canel_btnActionPerformed

    private void pending_application_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pending_application_btnActionPerformed
        v.myApplicationPaneFalse();
        application_data_Pnl.setVisible(true);
        rd.getRelativeColumn("select ApplicationInfo,date_OF_apply ,type from application where accountNo = '"+LogInFrame.account_no+"' and type = 'pending'");
        applicationStatusTbl.setModel(DbUtils.resultSetToTableModel(ReLiveData.rs));
    }//GEN-LAST:event_pending_application_btnActionPerformed

    private void rejected_application_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rejected_application_btnActionPerformed
        v.myApplicationPaneFalse();
        application_data_Pnl.setVisible(true);
        rd.getRelativeColumn("select ApplicationInfo,date_OF_apply,date_OF_rejection,type from application where accountNo = '"+LogInFrame.account_no+"' and type = 'rejected'");
        applicationStatusTbl.setModel(DbUtils.resultSetToTableModel(ReLiveData.rs));
    }//GEN-LAST:event_rejected_application_btnActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        try {
            rd.stmt = con.createStatement();
            rd.rs = rd.stmt.executeQuery("select * from block_status where id = '"+id_leb.getText()+"'");
            if(rd.rs.next()){
                rd.pst = con.prepareStatement("update block_status set flag = ? where id = '"+id_leb.getText()+"'");
                rd.pst.setString(1,"1");
                rd.pst.executeUpdate();
            }
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void email_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_email_txtKeyTyped
//        mailFlage = false; 
        ch = evt.getKeyChar();
//        ascii_val = (int) ch;
        if(evt.getKeyChar() == KeyEvent.VK_BACK_SPACE){
            str = null;
            str = email_txt.getText();
        }
        if(!(Character.isSpace(ch)) && !(evt.getKeyChar() == KeyEvent.VK_BACK_SPACE)){
            str =""+str+""+ch;
            if(ch == '@'){
                mailFlage = true;
                upi_txt.setText(""+str+"MyBank");
                str1 = str;
            }            
        }
    }//GEN-LAST:event_email_txtKeyTyped

    private void email_txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_email_txtMouseClicked
        email_txt.setText("");
        upi_txt.setText("");
    }//GEN-LAST:event_email_txtMouseClicked

    private void email_txtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_email_txtFocusGained
        email_txt.setText("");
        upi_txt.setText("");
        str = "";
        mailFlage = false;
    }//GEN-LAST:event_email_txtFocusGained

    private void upi_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_upi_txtKeyTyped
    }//GEN-LAST:event_upi_txtKeyTyped

    private void email_txtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_email_txtFocusLost
        if(!mailFlage)
            JOptionPane.showMessageDialog(null,"Invalid Email ID");
    }//GEN-LAST:event_email_txtFocusLost

    private void enterUPI_transecctionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterUPI_transecctionActionPerformed
        new SendMoney("",0).show();
    }//GEN-LAST:event_enterUPI_transecctionActionPerformed

    private void old_password_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_old_password_txtActionPerformed
    }//GEN-LAST:event_old_password_txtActionPerformed

    private void blockBackbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blockBackbtnActionPerformed
        v.settingPaneFalse();
        sub_Setting_pnl.setVisible(true);
    }//GEN-LAST:event_blockBackbtnActionPerformed

    private void setting_block_user_search_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setting_block_user_search_btnActionPerformed
        if(blockSearchtxt.getText().equals(""))
            JOptionPane.showMessageDialog(null,"");       
    }//GEN-LAST:event_setting_block_user_search_btnActionPerformed

    private void usecard_transecctionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usecard_transecctionActionPerformed
        new CardsConfiramation().show();
    }//GEN-LAST:event_usecard_transecctionActionPerformed

    private void profile_pnlFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_profile_pnlFocusGained
    }//GEN-LAST:event_profile_pnlFocusGained

    private void notificationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notificationBtnActionPerformed
    }//GEN-LAST:event_notificationBtnActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        new MoneyRequst().show();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void addUser_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUser_btnActionPerformed
        new AddNewUser().show();
    }//GEN-LAST:event_addUser_btnActionPerformed

    private void addUser_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addUser_btnMouseEntered
    }//GEN-LAST:event_addUser_btnMouseEntered

    private void addUser_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addUser_btnMouseExited
    }//GEN-LAST:event_addUser_btnMouseExited

    private void scanOR_transecctionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scanOR_transecctionActionPerformed
        sqr = new ScanQR();
        sqr.show();
    }//GEN-LAST:event_scanOR_transecctionActionPerformed

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
        jScrollPane1.repaint();
        jTable1.repaint();
    }//GEN-LAST:event_jTable1MousePressed

    private void rewrdsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rewrdsTableMouseClicked
        rewardsScrollPane.repaint();
        rewrdsTable.repaint();
    }//GEN-LAST:event_rewrdsTableMouseClicked

    private void jLabel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MousePressed
        DocumentManager.varifyDocument(jLabel6.getText(),LogInFrame.account_no+"_AADHAR.png");
    }//GEN-LAST:event_jLabel6MousePressed

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        DocumentManager.varifyDocument(jLabel15.getText(),LogInFrame.account_no+"_DOC1.png");
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseReleased
    }//GEN-LAST:event_jLabel6MouseReleased

    private void jLabel8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MousePressed
        DocumentManager.varifyDocument(jLabel8.getText(),LogInFrame.account_no+"_PAN.png");
    }//GEN-LAST:event_jLabel8MousePressed

    private void jLabel9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MousePressed
        DocumentManager.varifyDocument(jLabel9.getText(),LogInFrame.account_no+"_ADDRESSPROOF.png");
    }//GEN-LAST:event_jLabel9MousePressed

    private void jLabel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MousePressed
        DocumentManager.varifyDocument(jLabel5.getText(),LogInFrame.account_no+"_LC.png");
    }//GEN-LAST:event_jLabel5MousePressed

    private void jLabel13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MousePressed
        DocumentManager.varifyDocument(jLabel13.getText(),LogInFrame.account_no+"_EDUCATIONCERTIFICATE.png");
    }//GEN-LAST:event_jLabel13MousePressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        my_documents_pnl.setVisible(false);
        my_link_sub_pnl.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void my_documents_pnlFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_my_documents_pnlFocusGained
    }//GEN-LAST:event_my_documents_pnlFocusGained

    private void my_documents_pnlFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_my_documents_pnlFocusLost
    }//GEN-LAST:event_my_documents_pnlFocusLost

    private void approval_application_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approval_application_btnActionPerformed
        v.myApplicationPaneFalse();
        application_data_Pnl.setVisible(true);
        rd.getRelativeColumn("select ApplicationInfo,date_OF_apply, date_OF_Accept, type from application where accountNo = '"+LogInFrame.account_no+"' and type = 'accepted'");
        applicationStatusTbl.setModel(DbUtils.resultSetToTableModel(ReLiveData.rs));
    }//GEN-LAST:event_approval_application_btnActionPerformed

    private void myLinkBackLebMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myLinkBackLebMouseEntered
    }//GEN-LAST:event_myLinkBackLebMouseEntered

    private void applyForCardsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applyForCardsBtnActionPerformed
        cd.applyForCards();
    }//GEN-LAST:event_applyForCardsBtnActionPerformed

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
        if(jToggleButton4.isSelected()){
            cardfrontViewPnl.setVisible(false);
            cardBackViewPnl.setVisible(true);
        }
        else{
            cardfrontViewPnl.setVisible(true);
            cardBackViewPnl.setVisible(false);
        }
    }//GEN-LAST:event_jToggleButton4ActionPerformed

    private void myCardsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myCardsBtnActionPerformed
        cd.myCards();
    }//GEN-LAST:event_myCardsBtnActionPerformed

    private void card_confirmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card_confirmBtnActionPerformed
        cd.cardConfirm();
    }//GEN-LAST:event_card_confirmBtnActionPerformed

    private void selectcardCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectcardCBActionPerformed
    }//GEN-LAST:event_selectcardCBActionPerformed

    private void termsAndCondtionCardsCKBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_termsAndCondtionCardsCKBActionPerformed
        if(termsAndCondtionCardsCKB.isSelected())
            card_confirmBtn.setEnabled(true);
        else
            card_confirmBtn.setEnabled(false);
    }//GEN-LAST:event_termsAndCondtionCardsCKBActionPerformed

    private void viewCards_frontAndBackViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewCards_frontAndBackViewActionPerformed
        if(viewCards_frontAndBackView.isSelected())
            ut.imageIcon(cardsViewLeb, "Documents//"+LogInFrame.account_no+"//"+LogInFrame.account_no+"_"+cardName+"_CardsFront.png");
        else
            ut.imageIcon(cardsViewLeb, "Documents//"+LogInFrame.account_no+"//"+LogInFrame.account_no+"_"+cardName+"_CardsBack.png");
    }//GEN-LAST:event_viewCards_frontAndBackViewActionPerformed

    private void myCardsTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myCardsTblMouseClicked
        tableIndex = myCardsTbl.getSelectedRow();
        ut.model = myCardsTbl.getModel();
        cardName = ut.model.getValueAt(tableIndex, 0).toString();
        viewCards_frontAndBackView.setSelected(true);
        ut.imageIcon(cardsViewLeb, "Documents//"+LogInFrame.account_no+"//"+LogInFrame.account_no+"_"+cardName+"_CardsFront.png");
    }//GEN-LAST:event_myCardsTblMouseClicked

    private void mailBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mailBtnMouseEntered
        ut.imageIcon(mailBtn, "src//images//Contact_icon//@_colour.png");
    }//GEN-LAST:event_mailBtnMouseEntered

    private void mailBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mailBtnMouseExited
        ut.imageIcon(mailBtn, "src//images//Contact_icon//@.png");
    }//GEN-LAST:event_mailBtnMouseExited

    private void mailBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mailBtnActionPerformed
        ExtraManagement.addContactUS(1626,800,0,0);
        cus.decomposePane(false);
        cus.mailPnl.setVisible(true);
    }//GEN-LAST:event_mailBtnActionPerformed

    private void locBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locBtnMouseEntered
        ut.imageIcon(locBtn, "src//images//Contact_icon//loc_colour.png");
    }//GEN-LAST:event_locBtnMouseEntered

    private void locBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locBtnMouseExited
        ut.imageIcon(locBtn, "src//images//Contact_icon//loc.png");
    }//GEN-LAST:event_locBtnMouseExited

    private void locBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locBtnActionPerformed
        if(!InternetConnection.checkConnnection())
            JOptionPane.showMessageDialog(null, "Check Active Internet Connection");
        else{
            try {
                Desktop.getDesktop().browse(new URL("https://www.google.com/maps/dir//Nextech+Infosystems,+Shirpur,+Pitreshwer+Colony,+Near,+Nimzari+Naka,+Shirpur,"
                +"+Maharashtra/@21.3584446,74.8451434,13z/data=!4m8!4m7!1m0!1m5!1m1!1s0x3bdf33cb7e2f88b5:0x7707d02394bd9c9!2m2!1d74.8802487!2d21.3584482").toURI());
            } catch (URISyntaxException ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (MalformedURLException ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
    }//GEN-LAST:event_locBtnActionPerformed

    private void callBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_callBtnMouseEntered
        ut.imageIcon(callBtn, "src//images//Contact_icon//call_colour.png");
    }//GEN-LAST:event_callBtnMouseEntered

    private void callBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_callBtnMouseExited
        ut.imageIcon(callBtn, "src//images//Contact_icon//call.png");
    }//GEN-LAST:event_callBtnMouseExited

    private void callBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_callBtnActionPerformed
        ExtraManagement.addContactUS(520,745,500,50);
        cus.decomposePane(false);
        cus.callPnl.setVisible(true);
        cus.callPnl.setBackground(new Color(255,255,255,60));
    }//GEN-LAST:event_callBtnActionPerformed

    private void msgBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_msgBtnMouseEntered
        ut.imageIcon(msgBtn, "src//images//Contact_icon//message_colour.png");
    }//GEN-LAST:event_msgBtnMouseEntered

    private void msgBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_msgBtnMouseExited
        ut.imageIcon(msgBtn, "src//images//Contact_icon//message.png");
    }//GEN-LAST:event_msgBtnMouseExited

    private void msgBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_msgBtnActionPerformed
        ExtraManagement.addContactUS(525,745,500,50);
        cus.decomposePane(false);
        cus.messagePnl.setVisible(true);
    }//GEN-LAST:event_msgBtnActionPerformed

    private void Property_Loan_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Property_Loan_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Property_Loan_btnActionPerformed

    private void setting_mode_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setting_mode_btnActionPerformed
        ModeResources.getDarkMode();
    }//GEN-LAST:event_setting_mode_btnActionPerformed

    private void Agriculture_Loan_btnFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Agriculture_Loan_btnFocusGained
        loan.loanBtnGain(Agriculture_Loan_btn);
    }//GEN-LAST:event_Agriculture_Loan_btnFocusGained

    private void Agriculture_Loan_btnFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Agriculture_Loan_btnFocusLost
        loan.loanBtnLost(Agriculture_Loan_btn);
    }//GEN-LAST:event_Agriculture_Loan_btnFocusLost

    private void Business_Loan_btnFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Business_Loan_btnFocusGained
        loan.loanBtnGain(Business_Loan_btn);
    }//GEN-LAST:event_Business_Loan_btnFocusGained

    private void Business_Loan_btnFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Business_Loan_btnFocusLost
        loan.loanBtnLost(Business_Loan_btn);
    }//GEN-LAST:event_Business_Loan_btnFocusLost

    private void Education_Loan_btnFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Education_Loan_btnFocusGained
        loan.loanBtnGain(Education_Loan_btn);
    }//GEN-LAST:event_Education_Loan_btnFocusGained

    private void Education_Loan_btnFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Education_Loan_btnFocusLost
        loan.loanBtnLost(Education_Loan_btn);
    }//GEN-LAST:event_Education_Loan_btnFocusLost

    private void Car_Loan_btnFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Car_Loan_btnFocusGained
        loan.loanBtnGain(Car_Loan_btn);
    }//GEN-LAST:event_Car_Loan_btnFocusGained

    private void Car_Loan_btnFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Car_Loan_btnFocusLost
        loan.loanBtnLost(Car_Loan_btn);
    }//GEN-LAST:event_Car_Loan_btnFocusLost

    private void Property_Loan_btnFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Property_Loan_btnFocusGained
        loan.loanBtnGain(Property_Loan_btn);
    }//GEN-LAST:event_Property_Loan_btnFocusGained

    private void Property_Loan_btnFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Property_Loan_btnFocusLost
        loan.loanBtnLost(Property_Loan_btn);
    }//GEN-LAST:event_Property_Loan_btnFocusLost

    private void Pay_Per_Day_Loan_btnFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Pay_Per_Day_Loan_btnFocusGained
        loan.loanBtnGain(Pay_Per_Day_Loan_btn);
    }//GEN-LAST:event_Pay_Per_Day_Loan_btnFocusGained

    private void Pay_Per_Day_Loan_btnFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Pay_Per_Day_Loan_btnFocusLost
        loan.loanBtnLost(Pay_Per_Day_Loan_btn);
    }//GEN-LAST:event_Pay_Per_Day_Loan_btnFocusLost

    private void Pay_Per_Day_Loan_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pay_Per_Day_Loan_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Pay_Per_Day_Loan_btnActionPerformed

    private void Two_Wheeler_Loan_btnFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Two_Wheeler_Loan_btnFocusGained
        loan.loanBtnGain(Two_Wheeler_Loan_btn);
    }//GEN-LAST:event_Two_Wheeler_Loan_btnFocusGained

    private void Two_Wheeler_Loan_btnFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Two_Wheeler_Loan_btnFocusLost
        loan.loanBtnLost(Two_Wheeler_Loan_btn);
    }//GEN-LAST:event_Two_Wheeler_Loan_btnFocusLost

    private void Gold_Loan_btnFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Gold_Loan_btnFocusGained
        loan.loanBtnGain(Gold_Loan_btn);
    }//GEN-LAST:event_Gold_Loan_btnFocusGained

    private void Construction_Loan_btnFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Construction_Loan_btnFocusGained
        loan.loanBtnGain(Construction_Loan_btn);
    }//GEN-LAST:event_Construction_Loan_btnFocusGained

    private void Construction_Loan_btnFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Construction_Loan_btnFocusLost
        loan.loanBtnLost(Construction_Loan_btn);
    }//GEN-LAST:event_Construction_Loan_btnFocusLost

    private void Gold_Loan_btnFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Gold_Loan_btnFocusLost
        loan.loanBtnLost(Gold_Loan_btn);
    }//GEN-LAST:event_Gold_Loan_btnFocusLost

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

        try {
            SwingUtilities.invokeLater(
                new Runnable() {
                    public void run() {
                        new MainFrame().setVisible(true);
                    }
                }
            );
            java.lang.Thread.sleep(100);
        } catch (InterruptedException e) {;}

    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton Agriculture_Loan_btn;
    public static javax.swing.JButton Business_Loan_btn;
    public static javax.swing.JButton Car_Loan_btn;
    public static javax.swing.JButton Construction_Loan_btn;
    public static javax.swing.JPanel ContactUs_Pnl;
    public static javax.swing.JButton Education_Loan_btn;
    public static javax.swing.JButton Gold_Loan_btn;
    public static javax.swing.JButton Pay_Per_Day_Loan_btn;
    public static javax.swing.JButton Property_Loan_btn;
    public static javax.swing.JPanel Setting_pnl;
    public static javax.swing.JButton Two_Wheeler_Loan_btn;
    public static javax.swing.JTextField aadhar_txt1;
    public static javax.swing.JTextField aadhar_txt2;
    public static javax.swing.JTextField aadhar_txt3;
    public static javax.swing.JLabel acc_no_leb;
    public static javax.swing.JLabel acc_no_txt_leb;
    private javax.swing.JToggleButton accept_terms_and_condition_btn;
    public static javax.swing.JButton addUser_btn;
    public static javax.swing.JLabel agriculaturLoanLeb;
    private javax.swing.JTable applicationStatusTbl;
    public static javax.swing.JPanel application_data_Pnl;
    private javax.swing.JButton applyForCardsBtn;
    public static javax.swing.JPanel applyforCardsPnl;
    public static javax.swing.JButton approval_application_btn;
    public static javax.swing.JLabel bal_txt_leb;
    public static javax.swing.JLabel balance_leb;
    public static javax.swing.JButton blockBackbtn;
    public static javax.swing.JTextField blockSearchtxt;
    public static javax.swing.JButton block_list_btn;
    public static javax.swing.JPanel block_list_pnl;
    public static javax.swing.JButton block_user_btn;
    public static javax.swing.JPanel block_user_pnl;
    private javax.swing.JPanel btn_pnl1;
    private javax.swing.JPanel btn_pnl3;
    public static javax.swing.JLabel businessLoanLeb;
    public static javax.swing.JButton callBtn;
    public static javax.swing.JLabel capcha_status_leb;
    public static javax.swing.JLabel carLoanLeb;
    public static javax.swing.JLabel cardBackViewLeb;
    public static javax.swing.JPanel cardBackViewPnl;
    public static javax.swing.JLabel cardExpieryLeb;
    public static javax.swing.JLabel cardNameLeb;
    public static javax.swing.JLabel cardViewLeb;
    private javax.swing.JButton card_confirmBtn;
    public static javax.swing.JPanel cardfrontViewPnl;
    public static javax.swing.JLabel cardsBackGround;
    public static javax.swing.JLabel cardsNO1;
    public static javax.swing.JLabel cardsNO2;
    public static javax.swing.JLabel cardsNO3;
    public static javax.swing.JLabel cardsTermsLeb;
    private javax.swing.JLabel cardsViewLeb;
    public static javax.swing.JButton cards_btn;
    public static javax.swing.JLabel changePassTitleLeb;
    public static javax.swing.JLabel change_address_address1_leb;
    public static javax.swing.JTextArea change_address_address1_txt;
    public static javax.swing.JLabel change_address_address2_leb;
    public static javax.swing.JTextArea change_address_address2_txt;
    public static javax.swing.JLabel change_address_perment_address_leb;
    public static javax.swing.JTextArea change_address_perment_address_txt;
    public static javax.swing.JPanel change_address_pnl;
    public static javax.swing.JPanel change_password_pnl;
    public static javax.swing.JButton close_history;
    public static javax.swing.JButton close_recive_mony1;
    public static javax.swing.JButton close_rewards;
    public static javax.swing.JButton close_send_mony;
    public static javax.swing.JPasswordField confirm_password_txt;
    public static javax.swing.JLabel constructionLoanLeb;
    public static javax.swing.JPanel contactUSAddPnl;
    public static javax.swing.JPanel contactUsSubPnl;
    public static javax.swing.JLabel contactUs_backLeb;
    public static javax.swing.JTextField contact_txt;
    public static javax.swing.JButton contact_us;
    public static javax.swing.JToggleButton cpacha_btn;
    public static javax.swing.JLabel cvvLeb;
    public static javax.swing.JTextField d1;
    public static javax.swing.JTextField d2;
    private javax.swing.JLabel docListLeb1;
    private javax.swing.JLabel docListLeb2;
    private javax.swing.JLabel docListLeb3;
    private javax.swing.JLabel docListLeb4;
    private javax.swing.JPanel dynamic_pnl;
    public static javax.swing.JLabel educationLoanLeb;
    public static javax.swing.JTextField email_txt;
    private javax.swing.JButton enterUPI_transecction;
    public static javax.swing.JLabel error_leb;
    public static javax.swing.JButton facebook;
    public static javax.swing.JRadioButton female;
    public static javax.swing.JLabel frontPnl_QRLeb;
    public static javax.swing.JPanel front_pnl;
    private javax.swing.ButtonGroup gender;
    public static javax.swing.JLabel gender_leb;
    public static javax.swing.JLabel goldLoanLeb;
    public static javax.swing.JButton history_btn;
    public static javax.swing.JPanel history_pnl;
    public static javax.swing.JButton home_btn;
    private javax.swing.JLabel id_leb;
    public static javax.swing.JLabel imgLeb;
    public static javax.swing.JPanel inTermsandCondition;
    public static javax.swing.JButton instagram;
    public static javax.swing.JButton insurance_btn;
    public static javax.swing.JButton investment_btn;
    public static javax.swing.JButton invite_btn;
    public static javax.swing.JButton jButton10;
    public static javax.swing.JButton jButton2;
    private javax.swing.JButton jButton6;
    public static javax.swing.JButton jButton7;
    public static javax.swing.JButton jButton8;
    public static javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    public static javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public static javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton4;
    public static javax.swing.JComboBox<String> loanList;
    public static javax.swing.JPanel loanListPnl;
    public static javax.swing.JLabel loanTittleLeb;
    public static javax.swing.JButton loan_btn;
    public static javax.swing.JTextArea loan_status_TxtArea;
    public static javax.swing.JButton locBtn;
    public static javax.swing.JLabel logoLeb;
    public static javax.swing.JButton logout_btn;
    public static javax.swing.JTextField m1;
    public static javax.swing.JTextField m2;
    public static javax.swing.JButton mail;
    public static javax.swing.JButton mailBtn;
    public static javax.swing.JRadioButton male;
    private javax.swing.JPanel menu_pnl;
    public static javax.swing.JButton message;
    public static javax.swing.JButton msgBtn;
    private javax.swing.JButton myCardsBtn;
    public static javax.swing.JPanel myCardsPnl;
    public static javax.swing.JTable myCardsTbl;
    public static javax.swing.JLabel myLinkBackLeb;
    public static javax.swing.JButton my_app_sevices_btn;
    public static javax.swing.JButton my_application_btn;
    public static javax.swing.JButton my_application_canel_btn;
    public static javax.swing.JPanel my_application_pnl;
    public static javax.swing.JPanel my_application_sub_pnl;
    public static javax.swing.JPanel my_documents_pnl;
    public static javax.swing.JButton my_doucount_btn;
    public static javax.swing.JButton my_investment_btn;
    public static javax.swing.JButton my_link_btn;
    public static javax.swing.JButton my_link_canel_btn;
    public static javax.swing.JPanel my_link_sub_pnl;
    public static javax.swing.JPanel my_links_pnl;
    public static javax.swing.JTextField name_txt;
    public static javax.swing.JPasswordField new_password_txt;
    public static javax.swing.JButton notificationBtn;
    public static javax.swing.JPasswordField old_password_txt;
    public static javax.swing.JProgressBar password_strenth_bar;
    public static javax.swing.JProgressBar password_strenth_bar1;
    public static javax.swing.JProgressBar password_strenth_bar2;
    public static javax.swing.JLabel payPerDayLoanLeb;
    public static javax.swing.JButton pending_application_btn;
    public static javax.swing.JLabel profile_aadhar;
    public static javax.swing.JButton profile_btn;
    public static javax.swing.JButton profile_cancle_btn;
    public static javax.swing.JLabel profile_conatact_no;
    public static javax.swing.JLabel profile_dob;
    public static javax.swing.JLabel profile_email;
    public static javax.swing.JLabel profile_id;
    public static javax.swing.JLabel profile_leb;
    public static javax.swing.JLabel profile_name;
    public static javax.swing.JLabel profile_photo_leb;
    public static javax.swing.JPanel profile_pnl;
    public static javax.swing.JButton profile_save_btn;
    public static javax.swing.JLabel profile_upi;
    public static javax.swing.JButton profile_upload_btn;
    public static javax.swing.JLabel propertyLoanLeb;
    public static javax.swing.JLabel qrLeb;
    public static javax.swing.JButton recive_mony_btn;
    public static javax.swing.JPanel recive_mony_pnl;
    private javax.swing.JButton recive_mony_show_qr_btn;
    public static javax.swing.JButton rejected_application_btn;
    public static javax.swing.JButton reward_btn;
    public static javax.swing.JPanel reward_mony_pnl;
    public static javax.swing.JScrollPane rewardsScrollPane;
    public static javax.swing.JButton rewards_more_btn;
    public static javax.swing.JTable rewrdsTable;
    private javax.swing.JButton scanOR_transecction;
    public static javax.swing.JComboBox<String> selectcardCB;
    public static javax.swing.JButton send_mony_btn;
    public static javax.swing.JPanel send_mony_pnl;
    public static javax.swing.JButton servese_btn;
    public static javax.swing.JPanel services_cards_pnl;
    public static javax.swing.JPanel services_insurance_pnl;
    public static javax.swing.JPanel services_invesement_pnl;
    public static javax.swing.JPanel services_invite_pnl;
    public static javax.swing.JPanel services_loan_pnl;
    public static javax.swing.JPanel services_my_app_pnl;
    public static javax.swing.JPanel services_pnl;
    public static javax.swing.JButton services_pnl_cancle_btn;
    public static javax.swing.JLabel set_leb;
    public static javax.swing.JButton setting_block_btn;
    public static javax.swing.JLabel setting_block_leb;
    private javax.swing.JLabel setting_block_user_il_leb;
    public static javax.swing.JButton setting_block_user_search_btn;
    public static javax.swing.JButton setting_btn;
    public static javax.swing.JButton setting_change_address_btn;
    public static javax.swing.JButton setting_change_address_cancel_btn;
    public static javax.swing.JLabel setting_change_address_leb;
    public static javax.swing.JButton setting_change_address_save_btn;
    public static javax.swing.JButton setting_change_pass_btn;
    public static javax.swing.JButton setting_change_pass_cancel_btn;
    public static javax.swing.JButton setting_change_password_btn;
    public static javax.swing.JLabel setting_change_password_leb;
    public static javax.swing.JLabel setting_confirm_password_leb;
    public static javax.swing.JLabel setting_dark_leb;
    public static javax.swing.JComboBox<String> setting_language_list;
    public static javax.swing.JToggleButton setting_mode_btn;
    public static javax.swing.JLabel setting_new_password_leb;
    public static javax.swing.JLabel setting_old_pass_leb;
    public static javax.swing.JLabel setting_profile_status_leb;
    public static javax.swing.JComboBox<String> setting_profile_status_list;
    public static javax.swing.JButton setting_save_btn;
    public static javax.swing.JLabel setting_select_language_leb;
    public static javax.swing.JPanel subMyDocPnl;
    private javax.swing.JScrollPane subMyDoc_scrollPnl;
    public static javax.swing.JPanel sub_Setting_pnl;
    public static javax.swing.JPanel sub_block_pnl;
    public static javax.swing.JPanel sub_change_password_pnl;
    public static javax.swing.JPanel sub_services_cards_pnl;
    public static javax.swing.JPanel sub_services_pnl;
    public static javax.swing.JPanel sub_transaction_pnl;
    private javax.swing.JPanel subapplyforCardsPnl;
    public static javax.swing.JCheckBox termsAndCondtionCardsCKB;
    public static javax.swing.JButton terms_and_condiction;
    public static javax.swing.JPanel terms_and_condition_pnl;
    public static javax.swing.JLabel transactiont_qr_leb;
    private javax.swing.JPanel transecction_reciveMoney_ImgPnl;
    private javax.swing.JPanel transecction_sendMoney_ImgPnl;
    private javax.swing.JPanel transection_history_subPnl;
    public static javax.swing.JPanel transection_menu_pnl;
    public static javax.swing.JPanel transection_pnl;
    private javax.swing.JPanel transection_sendMoney_btn_pnl;
    public static javax.swing.JButton tranzection_btn;
    public static javax.swing.JButton tranzection_cancle_btn;
    public static javax.swing.JButton twitter;
    public static javax.swing.JLabel twoWheelerLoanLeb;
    public static javax.swing.JLabel typeOfLoanLeb;
    public static javax.swing.JLabel upi_leb;
    public static javax.swing.JTextField upi_txt;
    public static javax.swing.JLabel upi_txt_leb;
    private javax.swing.JButton usecard_transecction;
    public static javax.swing.JTextField user_id;
    public static javax.swing.JToggleButton viewCards_frontAndBackView;
    public static javax.swing.JButton whatsapp;
    public static javax.swing.JTextField y1;
    public static javax.swing.JTextField y2;
    public static javax.swing.JTextField y3;
    public static javax.swing.JTextField y4;
    // End of variables declaration//GEN-END:variables

}
