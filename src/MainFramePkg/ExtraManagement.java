package MainFramePkg;
import ExtraResources.ManageResources;
import LoginControllerPKG.GetLogIn;
import LoginControllerPKG.LogInFrame;
import static MainFramePkg.MainFrame.rd;
import static MainFramePkg.MainFrame.ut;
import NotifocationComponents.NotificationCollector;
import NotifocationComponents.NotificationPnl;
import NotifocationComponents.SingleClickNotification;

public class ExtraManagement {
    static NotificationPnl notify;
    public static ContactUSComponents cus;

    static void extraCostum(){
        MainFrame.accountNo = LogInFrame.account_no.substring(0, Math.min(LogInFrame.account_no.length(), 6));
        MainFrame.accountNo1 = LogInFrame.account_no;
        for(MainFrame.forI = 0 ; MainFrame.forI < MainFrame.accountNo.length(); MainFrame.forI++)
            MainFrame.accountNo1 = MainFrame.accountNo1.replace(""+MainFrame.accountNo.charAt(MainFrame.forI), "*");
        MainFrame.front_pnl.setVisible(true);        
        MainFrame.acc_no_leb.setText(MainFrame.accountNo1);
        MainFrame.upi_leb.setText(LogInFrame.upi_id);
        MainFrame.balance_leb.setText(LogInFrame.balance);
        MainFrame.capcha_status_leb.setVisible(false);
        MainFrame.termsAndCondtionCardsCKB.setSelected(true);
        MainFrame.viewCards_frontAndBackView.enable(false);
        MainFrame.contactUSAddPnl.setVisible(false);
        
//        menu_pnl.set
    }
    
    static void strength_of_passsword_bar(){
        ut.editProgressBar(MainFrame.password_strenth_bar, 100);
        ut.editProgressBar(MainFrame.password_strenth_bar1, 100);
        ut.editProgressBar(MainFrame.password_strenth_bar2, 100);
        MainFrame.password_strenth_bar.setVisible(false);
        MainFrame.password_strenth_bar1.setVisible(false);
        MainFrame.password_strenth_bar2.setVisible(false);
    }
    
    static void invisible_btn(){
        ut.editButton(MainFrame.send_mony_btn);
        ut.editButton(MainFrame.recive_mony_btn);
        ut.editButton(MainFrame.reward_btn);
        ut.editButton(MainFrame.history_btn);
        ut.editButton(MainFrame.tranzection_cancle_btn);
        ut.editButton(MainFrame.close_send_mony);
        ut.editButton(MainFrame.close_recive_mony1);
        ut.editButton(MainFrame.rewards_more_btn);
        ut.editButton(MainFrame.close_rewards);
        ut.editButton(MainFrame.close_history);
        ut.editButton(MainFrame.setting_block_user_search_btn);
        ut.editButton(MainFrame.block_user_btn);
        ut.editButton(MainFrame.block_list_btn);
        
        ut.editButton(MainFrame.setting_mode_btn);
        ut.editButton(MainFrame.cpacha_btn);
    }
    
    public static void dEnableButton(boolean bolean){
        MainFrame.mailBtn.setEnabled(bolean);
        MainFrame.locBtn.setEnabled(bolean);
        MainFrame.callBtn.setEnabled(bolean);
        MainFrame.msgBtn.setEnabled(bolean);
    }
    
    public static void disposeSingle(String LebTitle, String BtnTitle){
        new SingleClickNotification(LebTitle,BtnTitle) {
            @Override
            public void getButtonAction() {
                dispose();
            }
            public void getCloseAction() {
                dispose();
            }
        }.show();
    }

    public static void addNotification(){
//        rd.insertORupdateDataBase("update Notification set status = 'added'");
        ManageResources.JMusicPlayer("music//notification.mp3");
        notify = new NotificationPnl("Notifications !","See") {
            @Override
            public void actionBtn() {
                new NotificationCollector().show();
                notify.setVisible(false);
            }

            @Override
            public void closeBtn() {
                notify.setVisible(false);
            }
        };
        MainFrame.jPanel3.add(notify,1);
        notify.setSize(650, 170);
        notify.setLocation(1000,640);
    }
    
    static void addContactUS(int l, int w, int x, int y){
        MainFrame.contactUSAddPnl.setVisible(true);
        cus = new ContactUSComponents(rd.email);
        MainFrame.contactUSAddPnl.add(cus,0);
        cus.setSize(l, w);
        cus.setLocation(x,y);
        cus.decomposePane(false);
        ExtraManagement.dEnableButton(false);
    }
}
