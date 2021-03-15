package LoginControllerPKG;
import Database.DatabaseDriver;
import Database.ReLiveData;
import static Database.ReLiveData.rs;
import ExtraResources.InternetConnection;
import ExtraResources.QRReader;
import ExtraResources.ThareadUtilities;
import static ExtraResources.Utilities.imageIcon;
import static LoginControllerPKG.LogInFrame.account_no;
import static LoginControllerPKG.LogInFrame.balance;
import static LoginControllerPKG.LogInFrame.id_txt;
import static LoginControllerPKG.LogInFrame.lf;
import static LoginControllerPKG.LogInFrame.mainFrmthd;
import static LoginControllerPKG.LogInFrame.pass_txt;
import static LoginControllerPKG.LogInFrame.password_get;
import static LoginControllerPKG.LogInFrame.upi_id;
import static LoginControllerPKG.LogInFrame.upi_pin;
import static LoginControllerPKG.LogInFrame.userID;
import static LoginControllerPKG.LogInFrame.popupthd;
import static LoginControllerPKG.LogInFrame.notificationthd;
import static LoginControllerPKG.LogInFrame.connectionthd;
import MainFramePkg.ExtraManagement;
import MainFramePkg.GenerateUserType;
import MainFramePkg.MainFrame;
import static MainFramePkg.MainFrame.forI;
import NotifocationComponents.CheckInternetConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class GetLogIn {

    public static CheckInternetConnection cic;
    public static ExecutorService threadConnection = Executors.newCachedThreadPool();
    public static GetLogIn gli = new GetLogIn();
    public static Boolean startThread = true;

    public static Boolean logIn(String id, String password){
        if(ReLiveData.reliveLoginData("id", id)){
            if(password.equals(ReLiveData.password)){
                userID = id_txt.getText();
                password_get = pass_txt.getText();
                imageIcon(LogInFrame.login_btn, "src//images//unlock.png");
                return true;
            }
            else
                return false;
        }
        else
            return false;
    }
    
    public static Boolean getProfile(String id, String password){
        if(logIn(id,password)){
            ReLiveData.reLiveProfileData("id", id);
            account_no = ReLiveData.accno;
            upi_id = ReLiveData.upi_id;
            balance = ReLiveData.balance;
            upi_pin = ReLiveData.upipin;
            getThreaded();
            return true;
        }
        else
            return false;
    }
    
    public static void getThreaded(){
        popupthd = new Thread(new Runnable() {
            public void run() {
                JOptionPane.showMessageDialog(null,"Login Successfully");
            }
        });

        mainFrmthd = new Thread(new Runnable() {
            public void run() {
                MainFrame.frame.show();
                imageIcon(lf.login_btn, "src//images//lock.png");
                lf.dispose();
            }
        });
        
        connectionthd = new Thread(new Runnable() {
            public void run() {
//                threadConnection.submit(gli.new CheckInternet());
            }
        });

        notificationthd = new Thread(new Runnable() {                
            public void run() {
                // added update in addNotification() of ExtraManagement
                try {
//                    ThareadUtilities.getDelayTime(1000);
//                    for(i = 0 ; i <= i+10 ; i++){
//                        ReLiveData.getRelativeColumn("select * from Notification where (ForUserType = '"+GenerateUserType.getUser()+"' or ForUserType = 'public') and (ForUser = 'public' or ForUser = '"+LogInFrame.account_no+"') and flag = 'notseen' and status = 'notadded'");
//                        if(ReLiveData.rs.next())   
//                            ExtraManagement.addNotification();
//                    }
                    for(forI = 0 ; forI <= forI +10 ; forI++){
                        ReLiveData.pst = ReLiveData.con.prepareStatement("select * from Notification where (ForUserType = '"+GenerateUserType.getUser()+"' or ForUserType = 'public') and (ForUser = 'public' or ForUser = '"+LogInFrame.account_no+"') and flag = 'notseen' and status = 'notadded'");
                        rs = ReLiveData.pst.executeQuery();
                        if(rs.next()){
                            ExtraManagement.addNotification();
                        }
                    }
                } catch (SQLException ex) { Logger.getLogger(GetLogIn.class.getName()).log(Level.SEVERE, null, ex); }
            }
        });
    }

    final public class CheckInternet implements Runnable {
        @Override
        public void run() {
            for(forI = 0 ; forI <= forI +10 ; forI++){
                ThareadUtilities.getDelayTime(100);
                if(!InternetConnection.checkConnnection()){
                    if(startThread){
                        System.out.println("in");
                        cic = new CheckInternetConnection();
                        cic.show();
                    }
                }
            }
        }
    }
}
