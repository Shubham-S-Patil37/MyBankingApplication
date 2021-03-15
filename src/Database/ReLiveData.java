package Database;
import LoginControllerPKG.LogInFrame;
import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ReLiveData {

    public static ResultSet rs = null;
    public static Connection con = DatabaseDriver.Connect();
    public static Statement stmt = null;
    public static PreparedStatement pst = null;
    public static int count = 0;
    public static String password = "",userType = "",Information = "",doneBy = "",number = "",viewBy = "",viewDate = "",forUser = "";
    public static String accno = "",balance = "",name = "",userid = "",email = "",upi_id = "",mobileno = "",aadhar1 = "",aadhar2 = "",aadhar3 = "",date = "",month = "",year = "",imgpath = "",address1 = "",address2 = "",address3 = "",upipin = "",Ammount = "",status = "",QR_path = "",Gender = "";    
    public static String cardType = "",cardNumber = "",expiery = "",bankName = "",cvv = "";
    public static String SenderAccountNo = "",SenderUserID = "",SenderUPI = "",ReciverAccountNo = "",ReciverUserID = "",ReciverUPI = "",SenderTransectionType = "",ReciverTransectionType = "",rewards = "",transactionID = "";
    public static String TotalTransection = "",flag = "",Language = "",ProfileStatus = "",DarkMode = "";
    public static String aadharcard = "",pancard = "",addressProof = "",lc = "",ec = "",dc1 = "",directoryPath = "";
    
    public ReLiveData(){}

    void functionList(){
        clearSqlComponents();
        resultSet("");
        insertORupdateDataBase("");
        getRelativeColumn("");
        reliveLoginData("","");
        reLiveProfileData("", "");
        reLiveTransectionData("","");
        reLiveStaticTransection("","");
        reLiveCardsData("","");
        reliveSettingData("","");
        reliveDocumentData("","");
        reliveCardsNotificationData("","");
        reliveNotificationData("","");
    }

    public static void clearSqlComponents(){
        rs = null;
        stmt = null;
        pst = null;
    }

    public static ResultSet resultSet(String Querry){
        try {
            stmt = con.createStatement();
            return stmt.executeQuery(Querry);
        } catch (SQLException ex) {
            Logger.getLogger(ReLiveData.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public static void insertORupdateDataBase(String Querry){
        try {
            pst = con.prepareStatement(Querry);
            pst.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ReLiveData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void getRelativeColumn(String Querry){
        try {
            /*
                to get column of table 

                here not compulasory to get all column only selected column be displays

                simple querry to get table data

                ***** select id, upi_id , status from profile *****

                generally use for get data for table 
            */
            pst = con.prepareStatement(Querry);
            rs = pst.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(ReLiveData.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }

    public static int getEntryCount(String Querry){
        try {
            pst=con.prepareStatement(Querry);
            rs=pst.executeQuery();
            while(rs.next()){
                count++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ReLiveData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    }

    public static Boolean reliveLoginData(String ConditionColumn, String Condition){
        rs = resultSet("select * from log_in where "+ConditionColumn+" = '"+Condition+"'");
        try {
            if(rs.next()){
                userid = rs.getString("id"); password = rs.getString("password"); userType = rs.getString("user_type");
                return true;
            }
            else
                return false; 
        } catch (SQLException ex) {
            Logger.getLogger(ReLiveData.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public static Boolean reLiveProfileData(String Column, String condition){  
        try {
                rs = resultSet("select * from profile where "+Column+" = '"+condition+"'");
                if(rs.next()){
                       accno = rs.getString("acc_no");      balance = rs.getString("balance");      name = rs.getString("name");         
                      userid = rs.getString("id");            email = rs.getString("e_mail_id");  upi_id = rs.getString("upi_id");    
                    mobileno = rs.getString("mobile_no");   aadhar1 = rs.getString("aadhar1");   aadhar2 = rs.getString("aadhar2");   
                     aadhar3 = rs.getString("aadhar3");      Gender = rs.getString("Gender");       date = rs.getString("date");         
                       month = rs.getString("month");          year = rs.getString("year");      imgpath = rs.getString("img_path");  
                     QR_path = rs.getString("QR_path");    address1 = rs.getString("address");  address2 = rs.getString("address1"); 
                    address3 = rs.getString("address2");     upipin = rs.getString("upi_pin");    status = rs.getString("status");
                    return true;
                }
                else{
                    return false;
                }
        } catch (SQLException ex) {
            Logger.getLogger(ReLiveData.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }

    public static Boolean reLiveTransectionData(String Column, String condition){
        try {
                rs = resultSet("select * from Transection where "+Column+" = '"+condition+"'");
                if(rs.next()){
                        SenderAccountNo = rs.getString("SenderAccountNo");
                           SenderUserID = rs.getString("SenderUserID");
                              SenderUPI = rs.getString("SenderUPI");
                       ReciverAccountNo = rs.getString("ReciverAccountNo");
                          ReciverUserID = rs.getString("ReciverUserID");
                             ReciverUPI = rs.getString("ReciverUPI");
                                   date = rs.getString("Date");
                                Ammount = rs.getString("Ammount");
                 ReciverTransectionType = rs.getString("ReciverTransectionType");
                  SenderTransectionType = rs.getString("SenderTransectionType");
                                rewards = rs.getString("Rewards");
                          transactionID = rs.getString("TransactionID");
                    return true;
                }
                else{
                    return false;
                }
        } catch (SQLException ex) {
            Logger.getLogger(ReLiveData.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }        
    }

    public static Boolean reLiveStaticTransection(String column, String condition){
        try {
            rs = resultSet("select * from staticTransection where "+column+" = '"+condition+"'");
            if(rs.next()){
                           accno = rs.getString("acc_no");
                          userid = rs.getString("id");
                         rewards = rs.getString("TotalRewards");
                TotalTransection = rs.getString("TotalTransection");
                            flag = rs.getString("RewardsFlage");
                return true;
            }else
                return false;
        } catch (SQLException ex) {
            Logger.getLogger(ReLiveData.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }    
    }

    public static Boolean reLiveCardsData(String column, String condition){
        try {
            rs = resultSet("select * from Cards where "+column+" = '"+condition+"'");
            if(rs.next()){
                     accno = rs.getString("AccountNo");
                  cardType = rs.getString("CardsType");
                    userid = rs.getString("UserID");
                      name = rs.getString("Name");
                cardNumber = rs.getString("CardNumber");
                   expiery = rs.getString("Expiery");
                       cvv = rs.getString("CVV");
                  bankName = rs.getString("BankName");
                    status = rs.getString("Status");
                    number = rs.getString("NotificationNo");
                return true;
            }else{ return false; }
        } catch (SQLException ex) {
            Logger.getLogger(ReLiveData.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public static Boolean reliveSettingData(String column, String condition){
        try {
            rs = resultSet("select * from setting where "+column+" = '"+condition+"'");
            if(rs.next()){
                       accno = rs.getString("AccNo");
                     Language = rs.getString("select_language");
                ProfileStatus = rs.getString("profile_status");
                     DarkMode = rs.getString("dark_mode");
                return true;
            }
            else
                return false;
        } catch (SQLException ex) {
            Logger.getLogger(ReLiveData.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public static Boolean reliveDocumentData(String column, String condition){
        try {
            rs = resultSet("select * from Documents where "+column+" = '"+condition+"'");
            if(rs.next()){
                       accno = rs.getString("Accountno");
                  aadharcard = rs.getString("AadharCard");
                     pancard = rs.getString("PANCard");
                addressProof = rs.getString("AddressProof");
                          lc = rs.getString("LeavingCertificate");
                          ec = rs.getString("EducationCertificate");
                         dc1 = rs.getString("Document1");
               directoryPath = rs.getString("DirectoryPath");
                return true;
            }
            else
                return false;
        } catch (SQLException ex) {
            Logger.getLogger(ReLiveData.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }    
    }

    public static Boolean reliveCardsNotificationData(String column, String condition){
        try {
            rs = resultSet("select * from CardsNotification where "+column+" = '"+condition+"'");
            if(rs.next()){
                      accno = rs.getString("Accountno");
                     userid = rs.getString("UserID");
                Information = rs.getString("NotiInfo");
                       date = rs.getString("Date");
                     status = rs.getString("Status");
                       flag = rs.getString("flag");
                doneBy = rs.getString("doneBy");
                number = rs.getString("NotificationNo");
                return true;
            }
            else
                return false;
        } catch (SQLException ex) {
            Logger.getLogger(ReLiveData.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public static Boolean reliveNotificationData(String column, String condition) {
        try {
            rs = resultSet("select * from Notification where "+column+" = '"+condition+"'");
            if(rs.next()){
                Information = rs.getString("NotificationInfo");
                       date = rs.getString("ApplyDate");
                       flag = rs.getString("flag");
                   userType = rs.getString("ForUserType");
                   viewDate = rs.getString("ViewDate");
                     viewBy = rs.getString("ViewDate");
                    forUser = rs.getString("ForUser"); // account number
                     status = rs.getString("status");
                return true;
            }
            else
                return false;
        } catch (SQLException ex) {
            Logger.getLogger(ReLiveData.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public static void main(String args[]){
        try {
            rs = resultSet("select * from Notification where (ForUserType = 'admin' or ForUserType = 'public') and (ForUser = 'public' or ForUser = '111222333' )");
            if(rs.next()){
                Information = rs.getString("NotificationInfo");
                       date = rs.getString("ApplyDate");
                       flag = rs.getString("flag");
                   userType = rs.getString("ForUserType");
                   viewDate = rs.getString("ViewDate");
                     viewBy = rs.getString("ViewDate");
                    forUser = rs.getString("ForUser"); // account number
                     status = rs.getString("status");
                System.out.println(Information);
            }
            else{
                System.out.println("else");
            }
                
        } catch (SQLException ex) {
            Logger.getLogger(ReLiveData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}        