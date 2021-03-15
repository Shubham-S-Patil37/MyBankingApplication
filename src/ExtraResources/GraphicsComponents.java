
package ExtraResources;
import Database.ReLiveData;
import static ExtraResources.Utilities.editButton;
import static ExtraResources.Utilities.editComboBox;
import static ExtraResources.Utilities.imageIcon;
import static ExtraResources.Utilities.editTextField;
import static ExtraResources.Utilities.imageIcon;
import LoginControllerPKG.LogInFrame;
import MainFramePkg.MainFrame;
import TansectionPKG.CardsInfo;
import WebCam.TakeShot;

public class GraphicsComponents {
    public static void graphicsField(){
        /*
                TextField also change form darkmode
        */
        editTextField(MainFrame.name_txt,0,0,0);
        editTextField(MainFrame.user_id,0,0,0);
        editTextField(MainFrame.email_txt,0,0,0);
        editTextField(MainFrame.upi_txt,0,0,0);
        editTextField(MainFrame.contact_txt,0,0,0);
        editTextField(MainFrame.aadhar_txt1,0,0,0);
        editTextField(MainFrame.aadhar_txt2,0,0,0);
        editTextField(MainFrame.aadhar_txt3,0,0,0);
        editTextField(MainFrame.d1,0,0,0);
        editTextField(MainFrame.d2,0,0,0);
        editTextField(MainFrame.m1,0,0,0);
        editTextField(MainFrame.m2,0,0,0);
        editTextField(MainFrame.y1,0,0,0);
        editTextField(MainFrame.y2,0,0,0);
        editTextField(MainFrame.y3,0,0,0);
        editTextField(MainFrame.y4,0,0,0);
        editTextField(MainFrame.blockSearchtxt, 0, 0, 0);
    }
    
    public static void graphicsButton(){
        editButton(MainFrame.loan_btn);
        editButton(MainFrame.insurance_btn);
        editButton(MainFrame.investment_btn);
        editButton(MainFrame.cards_btn);
        editButton(MainFrame.invite_btn);
        editButton(MainFrame.my_app_sevices_btn);
        editButton(MainFrame.services_pnl_cancle_btn);
        editButton(MainFrame.notificationBtn);
        editButton(MainFrame.home_btn);
        editButton(MainFrame.blockBackbtn);
        editButton(MainFrame.addUser_btn);
        editButton(MainFrame.profile_btn);
        editButton(MainFrame.servese_btn);
        editButton(MainFrame.tranzection_btn);
        editButton(MainFrame.setting_btn);
        editButton(MainFrame.my_link_btn);
        editButton(MainFrame.logout_btn);
        editButton(MainFrame.jButton7);
        editButton(MainFrame.jButton8);
        editButton(MainFrame.jButton9);
        editButton(MainFrame.jButton10);
// *********************************************  Share App with *********************************************************************************
        editButton(MainFrame.whatsapp);
        editButton(MainFrame.message);
        editButton(MainFrame.mail);
        editButton(MainFrame.facebook);
        editButton(MainFrame.instagram);
        editButton(MainFrame.twitter);
// *********************************************  Upload Documents Panel *************************************************************************
        editButton(MainFrame.jButton2);
        editButton(MainFrame.my_investment_btn);
        editButton(MainFrame.my_application_btn);
        editButton(MainFrame.my_doucount_btn);
        editButton(MainFrame.contact_us);
        editButton(MainFrame.terms_and_condiction);
        editButton(MainFrame.my_link_canel_btn);
// *********************************************  Application pending Panel **********************************************************************
        editButton(MainFrame.pending_application_btn);
        editButton(MainFrame.rejected_application_btn);
        editButton(MainFrame.approval_application_btn);
        editButton(MainFrame.my_application_canel_btn);
//*********************************************** ContactUs Panel ********************************************************************************
        editButton(MainFrame.mailBtn);
        editButton(MainFrame.locBtn);
        editButton(MainFrame.callBtn);
        editButton(MainFrame.msgBtn);
    }
    public static void graphicsComboBox(){
        editComboBox(MainFrame.loanList);
        editComboBox(MainFrame.setting_language_list);
        editComboBox(MainFrame.setting_profile_status_list);
        editComboBox(MainFrame.selectcardCB);
    }
    public static void graphicsLabel(){
        imageIcon(MainFrame.jLabel23, "src//images//rewards1.png");
        ReLiveData.reLiveProfileData("acc_no",LogInFrame.account_no);
        imageIcon(MainFrame.profile_leb, ReLiveData.imgpath);
        imageIcon(MainFrame.qrLeb, ReLiveData.QR_path);
        imageIcon(MainFrame.frontPnl_QRLeb, ReLiveData.QR_path);
        imageIcon(MainFrame.cardsBackGround, "src//images//cards//b41.jpg");
        imageIcon(MainFrame.myLinkBackLeb, "src//images//myLinkBackground.jpg");
        imageIcon(MainFrame.cardViewLeb, "src//images//cards//card_front.png");
        imageIcon(MainFrame.cardBackViewLeb, "src//images//cards//card_back.png");
        imageIcon(MainFrame.contactUs_backLeb, "src//images//worldMap copy.jpg");
        imageIcon(MainFrame.logoLeb, "src//images//logo2.png");
    }
    public static void graphicsTable(){
        Utilities.editTable(MainFrame.rewrdsTable, MainFrame.rewardsScrollPane, 0, 0, 0);
    }
    
    public static void getImageButton(){
        ReLiveData.reLiveProfileData("acc_no",LogInFrame.account_no);
        
        imageIcon(MainFrame.home_btn, "src//images//home white.png");
        imageIcon(MainFrame.notificationBtn, "src//images//map.png");
        imageIcon(MainFrame.addUser_btn, "src//images//addUser.png");
        imageIcon(MainFrame.blockBackbtn, "src//images//back_btn.png");
        
        imageIcon(MainFrame.servese_btn, "src//images//Menubtn//services.png");
        imageIcon(MainFrame.tranzection_btn, "src//images//Menubtn//transaction.png");
        imageIcon(MainFrame.setting_btn, "src//images//Menubtn//setting.png");
        imageIcon(MainFrame.my_link_btn, "src//images//Menubtn//link.png");
        imageIcon(MainFrame.logout_btn, "src//images//Menubtn//logout.png");
        if(ReLiveData.Gender.equals("FEMAIL"))
            imageIcon(MainFrame.profile_btn, "src//images//Menubtn//gender_f.png");
        else
            imageIcon(MainFrame.profile_btn, "src//images//Menubtn//gender_m.png");
// ********************************************** Services *************************************************
// ********************************************** share app with *******************************************
    
// ********************************************** JToggleButton ********************************************
        if(MainFrame.setting_mode_btn.isSelected())
            imageIcon(MainFrame.setting_mode_btn, "src//images//dark_on.png");
        else
            imageIcon(MainFrame.setting_mode_btn, "src//images//dark_off.png");
// *********************************************  Upload Documents Panel   ***********************************
        imageIcon(MainFrame.jButton2, "src//images//back_btn.png");
// *********************************************       MY Link Panel       ***********************************
        imageIcon(MainFrame.my_investment_btn, "src//images//My_Investment.png");
        imageIcon(MainFrame.my_application_btn, "src//images//My_Application.png");
        imageIcon(MainFrame.my_doucount_btn, "src//images//documents.png");
        imageIcon(MainFrame.contact_us, "src//images//contactUS.png");
        imageIcon(MainFrame.terms_and_condiction, "src//images//terms_and_conditions.png");
        imageIcon(MainFrame.my_link_canel_btn, "src//images//back_btn.png");
//*********************************************  Application pending Panel ***********************************
        imageIcon(MainFrame.pending_application_btn, "src//images//application_pending.png");
        imageIcon(MainFrame.my_application_canel_btn, "src//images//back_btn.png");
        imageIcon(MainFrame.rejected_application_btn, "src//images//reject_Doc.png");
        imageIcon(MainFrame.approval_application_btn, "src//images//approaved_application.png");
//*********************************************       ContactUs Panel      ***********************************
        imageIcon(MainFrame.mailBtn, "src//images//Contact_icon//@.png");
        imageIcon(MainFrame.locBtn , "src//images//Contact_icon//loc.png");
        imageIcon(MainFrame.callBtn, "src//images//Contact_icon//call.png");
        imageIcon(MainFrame.msgBtn , "src//images//Contact_icon//message.png");
    }
}
