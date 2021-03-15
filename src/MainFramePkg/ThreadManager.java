package MainFramePkg;

import LoginControllerPKG.LogInFrame;
import static MainFramePkg.MainFrame.ut;
import LoginControllerPKG.GetLogIn;
import static MainFramePkg.MainFrame.cus;
import java.awt.Color;
import javax.swing.JButton;
public class ThreadManager {

    static ServicesManagement sm = new ServicesManagement();
    static ServicesManagement.Loan loan = sm.new Loan();
    static Thread t1,t2,t3,t4,t5,t6,t7,t8,t9,varifyDOCTHD,notiFicationTHD;

    void threadStopper(){
        LogInFrame.mainFrmthd.stop();
        t1.stop(); t2.stop(); t3.stop(); t4.stop(); 
        t5.stop(); t6.stop(); t7.stop(); t8.stop();
        t9.stop(); LogInFrame.popupthd.stop();
        ut.editT1.stop();  ut.editT2.stop();
        ut.editT3.stop();  ut.editT4.stop();
    }

    public void threadStater(){ // call in LOG IN FRAME 
        getMethod();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
    }

    void getMethod(){
        t1 = new Thread(new Runnable() {
            public void run() {
                ut.editComponents();
                ProfileData.getProfileData();
            }
        });
        t2 = new Thread(new Runnable() {
            public void run() {
                ExtraManagement.extraCostum();
            }
        });
        t3 = new Thread(new Runnable() {
            public void run() {
                ExtraManagement.invisible_btn();
            }
        });
        t4 = new Thread(new Runnable() {
            public void run() {
//                MainFrame.loading();
//              GetLogIn.dEnableButton(false);
            }
        });
        t5 = new Thread(new Runnable() {
            public void run() {
                MainFrame.v.mainPanesFalse();
            }
        });
        t6 = new Thread(new Runnable() {
            public void run() {
                GenerateUserType.userSpefication();
            }
        });
        t7 = new Thread(new Runnable() {
            public void run() {
                ModeResources.getSelectedMode();
            }
        });
        t8 = new Thread(new Runnable() {
            public void run() {
                ExtraManagement.strength_of_passsword_bar();
            }
        });
        t9 = new Thread(new Runnable() {
            @Override
            public void run() {
                loan.getGIFLebel();
                loan.editButton();
            }
        });
        MainFrame.front_pnl.setVisible(true);
    }
}
