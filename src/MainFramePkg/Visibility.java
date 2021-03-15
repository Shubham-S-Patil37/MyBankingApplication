package MainFramePkg;

public class Visibility {
    static void mainPanesFalse(){
        MainFrame.front_pnl.setVisible(false);
        MainFrame.profile_pnl.setVisible(false);
        MainFrame.services_pnl.setVisible(false);
        MainFrame.transection_pnl.setVisible(false);
        MainFrame.Setting_pnl.setVisible(false);
        MainFrame.my_links_pnl.setVisible(false);
        MainFrame.sub_transaction_pnl.setVisible(false);
//        set_pnl_visible_false_for_transaction();
//        set_pnl_visible_false_for_service();
    }

    static void servicePaneFalse(){
        MainFrame.services_pnl.show();
        MainFrame.sub_services_pnl.setVisible(false);
        MainFrame.services_loan_pnl.setVisible(false);
        MainFrame.services_insurance_pnl.setVisible(false);
        MainFrame.services_invesement_pnl.setVisible(false);
        MainFrame.services_cards_pnl.setVisible(false);
        MainFrame.services_invite_pnl.setVisible(false);
        MainFrame.services_my_app_pnl.setVisible(false);
        cardsPaneFalse();
    }

    static void transactionPaneFalse(){
        MainFrame.sub_transaction_pnl.setVisible(true);
        MainFrame.send_mony_pnl.setVisible(false);
        MainFrame.recive_mony_pnl.setVisible(false);
        MainFrame.reward_mony_pnl.setVisible(false);
        MainFrame.history_pnl.setVisible(false);
    }

    static void cardsPaneFalse(){
        MainFrame.sub_services_cards_pnl.setVisible(false);
        MainFrame.applyforCardsPnl.setVisible(false);
        MainFrame.myCardsPnl.setVisible(false);
    }

    static void settingPaneFalse(){
        MainFrame.sub_Setting_pnl.setVisible(false);
        MainFrame.change_password_pnl.setVisible(false);
            MainFrame.sub_change_password_pnl.setVisible(false);
        MainFrame.change_address_pnl.setVisible(false);
        MainFrame.block_user_pnl.setVisible(false);
            MainFrame.sub_block_pnl.setVisible(false);
            MainFrame.block_list_pnl.setVisible(false);
    }

    static void mylinkPaneFalse(){
        MainFrame.my_link_sub_pnl.setVisible(false);
        MainFrame.my_application_pnl.setVisible(false);
        MainFrame.my_documents_pnl.setVisible(false);
        MainFrame.terms_and_condition_pnl.setVisible(false);
        MainFrame.ContactUs_Pnl.setVisible(false);
        myApplicationPaneFalse();
    }

    static void myApplicationPaneFalse(){
        MainFrame.my_application_sub_pnl.setVisible(false);
        MainFrame.application_data_Pnl.setVisible(false);
    }
}
