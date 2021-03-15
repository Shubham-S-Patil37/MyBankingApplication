package ExtraResources;
import Database.ReLiveData;
import TansectionPKG.CardsInfo;
import TansectionPKG.SendMoney;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import static MainFramePkg.MainFrame.rd;
import static MainFramePkg.MainFrame.ut;

public class TransactionManager {
    public static UUID uuid;
    
    public static void editComponents(){
        Utilities.editTextField(SendMoney.upiTxt, 255, 255, 255);
        Utilities.editTextField(SendMoney.ammountTxt, 255, 255, 255);
        Utilities.editTextField(SendMoney.pin1Txt, 255, 255, 255);
        Utilities.editTextField(SendMoney.pin2Txt, 255, 255, 255);
        Utilities.editTextField(SendMoney.pin3Txt, 255, 255, 255);
        Utilities.editTextField(SendMoney.pin4Txt, 255, 255, 255);
        Utilities.editButton(SendMoney.send_btn);
        Utilities.imageIcon(SendMoney.imgLeb, "src//images//SendMoney.jpg");
        Utilities.imageIcon(SendMoney.send_btn, "src//images//payMoney.png");
    }
    
    public static void componentsManager(){
        Utilities.imageIcon(CardsInfo.cardsImgLeb,"src//images//cards.png");
        Utilities.editTextField(CardsInfo.nameTxt, 0, 0, 0);
        Utilities.editTextField(CardsInfo.no1, 0, 0, 0);
        Utilities.editTextField(CardsInfo.no2, 0, 0, 0);
        Utilities.editTextField(CardsInfo.no3, 0, 0, 0);
        Utilities.editTextField(CardsInfo.no4, 0, 0, 0);
        Utilities.editTextField(CardsInfo.yearTxt, 0, 0, 0);
        Utilities.editTextField(CardsInfo.MoblieNo1, 0, 0, 0);
        Utilities.editTextField(CardsInfo.otpTxt1, 0, 0, 0);
        Utilities.editComboBox(CardsInfo.MonthCB);
        Utilities.editButton(CardsInfo.ContinueBtn);
        Utilities.imageIcon(CardsInfo.ContinueBtn, "src//images//nextbtn.png");
        Utilities.editButton(CardsInfo.refreshBtn);
        Utilities.imageIcon(CardsInfo.refreshBtn, "src//images//refresh.png");
        Utilities.editButton(CardsInfo.ContinueBtn1);
        Utilities.imageIcon(CardsInfo.ContinueBtn1, "src//images//unnamed copy.png");        
    }
    
    public static String getGeneratedExpiery(){
        return ""+CardsInfo.MonthCB.getSelectedItem().toString()+""+CardsInfo.yearTxt.getText();
    }
    
    public static String transactionID(){
        try {
            rd.transactionID = getUUId().toString();
            rd.reLiveTransectionData("TransactionID", rd.transactionID);
            return (!rd.rs.next()) ? rd.transactionID : getCheckedID();
        } catch (SQLException ex) {
            Logger.getLogger(TransactionManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public static UUID getUUId(){
        return uuid = UUID.randomUUID();
    }
    
    public static String getCheckedID(){
        try {
            while(!rd.rs.next()){
                rd.transactionID = getUUId().toString();
                rd.reLiveTransectionData("TransactionID", rd.transactionID);                
            }
        } catch (SQLException ex) {
            Logger.getLogger(TransactionManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rd.transactionID;
    }
    
    public static void main(String args[]) {
        try {
            int count = 0;
            int i = 1;
            while(count == 0)
                System.out.println(transactionID());
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(TransactionManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
