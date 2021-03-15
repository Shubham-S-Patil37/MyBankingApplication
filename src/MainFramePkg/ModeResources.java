package MainFramePkg;
import Database.ReLiveData;
import LoginControllerPKG.LogInFrame;
import static MainFramePkg.MainFrame.rd;
import static MainFramePkg.MainFrame.ut;
import static MainFramePkg.ViewMode.selectViewMode;
import java.awt.Color;
import javax.swing.JButton;

public class ModeResources {
    static void getResources(){
        getChangedButton();
        getChangedLabel();
        getChangedPane();
        getChangedTextField();
        getChangedComboBox();
        getChangedRadioButton();
    }

    //LoadExteraCollection
    static void getChangedPane(){
        selectViewMode(MainFrame.sub_Setting_pnl);
        selectViewMode(MainFrame.change_password_pnl);
        selectViewMode(MainFrame.sub_change_password_pnl);
        selectViewMode(MainFrame.change_address_pnl);
        selectViewMode(MainFrame.front_pnl);
        selectViewMode(MainFrame.jPanel3);
        selectViewMode(MainFrame.profile_pnl);
        selectViewMode(MainFrame.services_pnl);
            selectViewMode(MainFrame.sub_services_pnl);
            selectViewMode(MainFrame.applyforCardsPnl);
        selectViewMode(MainFrame.services_loan_pnl);
            selectViewMode(MainFrame.loanListPnl);
        selectViewMode(MainFrame.transection_pnl);
//        selectViewMode(tranzection_menu_pnl); not allow here ,it has apposite colour combination
        selectViewMode(MainFrame.my_links_pnl);
            selectViewMode(MainFrame.my_link_sub_pnl);    
        selectViewMode(MainFrame.subMyDocPnl);
        selectViewMode(MainFrame.my_documents_pnl);
        selectViewMode(MainFrame.my_application_pnl);
            selectViewMode(MainFrame.my_application_sub_pnl);
    }

    static void getChangedButton(){
        selectViewMode(MainFrame.setting_change_password_btn);
        selectViewMode(MainFrame.setting_change_address_btn);
        selectViewMode(MainFrame.setting_block_btn);
        selectViewMode(MainFrame.setting_save_btn);
        selectViewMode(MainFrame.setting_change_pass_btn);
        selectViewMode(MainFrame.setting_change_pass_cancel_btn);
        selectViewMode(MainFrame.setting_change_address_save_btn);
        selectViewMode(MainFrame.setting_change_address_cancel_btn);
        selectViewMode(MainFrame.profile_upload_btn);
        selectViewMode(MainFrame.profile_cancle_btn);
        selectViewMode(MainFrame.profile_save_btn);
        selectViewMode(MainFrame.Agriculture_Loan_btn);
        selectViewMode(MainFrame.Business_Loan_btn);
        selectViewMode(MainFrame.Car_Loan_btn);
        selectViewMode(MainFrame.Construction_Loan_btn);
        selectViewMode(MainFrame.Gold_Loan_btn);
        selectViewMode(MainFrame.Education_Loan_btn);
        selectViewMode(MainFrame.Education_Loan_btn);
        selectViewMode(MainFrame.Property_Loan_btn);
        selectViewMode(MainFrame.Pay_Per_Day_Loan_btn);
        selectViewMode(MainFrame.Two_Wheeler_Loan_btn);
        selectViewMode(MainFrame.pending_application_btn);
        selectViewMode(MainFrame.rejected_application_btn);
        selectViewMode(MainFrame.my_link_canel_btn);
        changeButtonMode(MainFrame.send_mony_btn);
        changeButtonMode(MainFrame.recive_mony_btn);
        changeButtonMode(MainFrame.reward_btn);
        changeButtonMode(MainFrame.history_btn);
        changeButtonMode(MainFrame.tranzection_cancle_btn);
        ViewMode.transectionViewMode();       
        changeButtonMode(MainFrame.loan_btn);
        changeButtonMode(MainFrame.insurance_btn);
        changeButtonMode(MainFrame.investment_btn);
        changeButtonMode(MainFrame.cards_btn);
        changeButtonMode(MainFrame.invite_btn);
        changeButtonMode(MainFrame.my_app_sevices_btn);
        changeButtonMode(MainFrame.services_pnl_cancle_btn);
    }

    static void getChangedLabel(){
        selectViewMode(MainFrame.setting_select_language_leb);
        selectViewMode(MainFrame.setting_block_leb);
        selectViewMode(MainFrame.setting_profile_status_leb);
        selectViewMode(MainFrame.setting_change_password_leb);
        selectViewMode(MainFrame.setting_dark_leb);
        selectViewMode(MainFrame.setting_change_address_leb);
        selectViewMode(MainFrame.setting_old_pass_leb);
        selectViewMode(MainFrame.setting_new_password_leb);
        selectViewMode(MainFrame.setting_confirm_password_leb);
        selectViewMode(MainFrame.change_address_perment_address_leb);
        selectViewMode(MainFrame.change_address_address1_leb);
        selectViewMode(MainFrame.change_address_address2_leb);
        selectViewMode(MainFrame.acc_no_txt_leb);
        selectViewMode(MainFrame.acc_no_leb);
        selectViewMode(MainFrame.upi_txt_leb);
        selectViewMode(MainFrame.upi_leb);
        selectViewMode(MainFrame.bal_txt_leb);
        selectViewMode(MainFrame.balance_leb);
        selectViewMode(MainFrame.profile_name);
        selectViewMode(MainFrame.profile_id);
        selectViewMode(MainFrame.profile_email);
        selectViewMode(MainFrame.profile_upi);
        selectViewMode(MainFrame.profile_conatact_no);
        selectViewMode(MainFrame.profile_aadhar);
        selectViewMode(MainFrame.profile_dob);
        selectViewMode(MainFrame.gender_leb);
        selectViewMode(MainFrame.setting_new_password_leb);
        selectViewMode(MainFrame.changePassTitleLeb);
        selectViewMode(MainFrame.transactiont_qr_leb);
        selectViewMode(MainFrame.cardsTermsLeb);
        
        selectViewMode(MainFrame.loanTittleLeb);
        selectViewMode(MainFrame.typeOfLoanLeb);
    }

    static void getChangedTextField(){
        selectViewMode(MainFrame.old_password_txt);
        selectViewMode(MainFrame.new_password_txt);
        selectViewMode(MainFrame.confirm_password_txt);
        selectViewMode(MainFrame.name_txt);
        selectViewMode(MainFrame.user_id);
        selectViewMode(MainFrame.email_txt);
        selectViewMode(MainFrame.upi_txt);
        selectViewMode(MainFrame.contact_txt);
        selectViewMode(MainFrame.aadhar_txt1);
        selectViewMode(MainFrame.aadhar_txt2);
        selectViewMode(MainFrame.aadhar_txt3);
        selectViewMode(MainFrame.d1);
        selectViewMode(MainFrame.d2);
        selectViewMode(MainFrame.m1);
        selectViewMode(MainFrame.m2);
        selectViewMode(MainFrame.y1);
        selectViewMode(MainFrame.y2);
        selectViewMode(MainFrame.y3);
        selectViewMode(MainFrame.y4);
    }

    static void getChangedTextArea(){
         selectViewMode(MainFrame.loan_status_TxtArea);
     }

    static void getChangedRadioButton(){
        selectViewMode(MainFrame.male);
        selectViewMode(MainFrame.female);
    }

    static void getChangedComboBox(){
        selectViewMode(MainFrame.loanList);
        selectViewMode(MainFrame.setting_language_list);
        selectViewMode(MainFrame.setting_profile_status_list);
        selectViewMode(MainFrame.selectcardCB);
    }

    static void changeButtonMode(JButton button){
        if(MainFrame.setting_mode_btn.isSelected())
            button.setForeground(Color.WHITE);
        else
            button.setForeground(Color.BLACK);
    }

    static void getDarkMode(){
        getResources();
        if(MainFrame.setting_mode_btn.isSelected())
            MainFrame.DarkMode = "ON";
        else
            MainFrame.DarkMode = "OFF";
        if(MainFrame.DarkMode.equals("ON")){
            MainFrame.transection_menu_pnl.setBackground(Color.WHITE);
            ut.imageIcon(MainFrame.setting_mode_btn, "src//images//dark_on.png");
        }
        else{
            ut.imageIcon(MainFrame.setting_mode_btn, "src//images//dark_off.png");
            MainFrame.transection_menu_pnl.setBackground(new Color(51,51,51));
        }        
    }

    static void getSelectedMode(){
        rd.DarkMode = "null";
        rd.reliveSettingData("AccNo", LogInFrame.account_no);
        System.out.println(""+rd.DarkMode);
        if(ReLiveData.DarkMode.equals("ON")){
            MainFrame.setting_mode_btn.setSelected(true);
            getDarkMode();
        }
    }
}
