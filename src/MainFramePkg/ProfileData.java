package MainFramePkg;

import Database.ReLiveData;
import ExtraResources.GraphicsComponents;
import static ExtraResources.Imager.ImageManager;
import ExtraResources.QRGenarator;
import LoginControllerPKG.LogInFrame;
import static MainFramePkg.MainFrame.female;
import static MainFramePkg.MainFrame.front_pnl;
import static MainFramePkg.MainFrame.male;
import static MainFramePkg.MainFrame.rd;
import static MainFramePkg.MainFrame.v;
import static MainFramePkg.MainFrame.ut;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ProfileData {
    static int count;
    public static void getProfileData(){
        if(rd.reLiveProfileData("acc_no", LogInFrame.account_no)){
            MainFrame.name_txt.setText(rd.name);
            MainFrame.user_id.setText(rd.userid);
            MainFrame.email_txt.setText(rd.email);
            MainFrame.upi_txt.setText(rd.upi_id);
            MainFrame.contact_txt.setText(rd.mobileno);
            MainFrame.aadhar_txt1.setText(rd.aadhar1);
            MainFrame.aadhar_txt2.setText(rd.aadhar2);
            MainFrame.aadhar_txt3.setText(rd.aadhar3);
            MainFrame.d1.setText(rd.date.substring(0,1));
            MainFrame.d2.setText(rd.date.substring(1));
            MainFrame.m1.setText(rd.month.substring(0,1));
            MainFrame.m2.setText(rd.month.substring(1));
            MainFrame.y1.setText(rd.year.substring(0,1));
            MainFrame.y2.setText(rd.year.substring(1,2));
            MainFrame.y3.setText(rd.year.substring(2,3));
            MainFrame.y4.setText(rd.year.substring(3));
            MainFrame.ut.imageIcon(MainFrame.profile_photo_leb, rd.imgpath);
            MainFrame.ut.imageIcon(MainFrame.profile_leb, rd.imgpath);
            MainFrame.change_address_perment_address_txt.setText(rd.address1);
            MainFrame.change_address_address1_txt.setText(rd.address2);
            MainFrame.change_address_address2_txt.setText(rd.address3);
            if(Boolean.valueOf(rd.Gender))
                male.setSelected(true);
            else
                female.setSelected(true);
        }    
    }

    public static void updateProfile(){
        if(nullField(MainFrame.name_txt))
            MainFrame.error_leb.setText("Enter Name");
        else if(nullField(MainFrame.user_id))
            MainFrame.error_leb.setText("Enter User ID");
        else if(nullField(MainFrame.email_txt)  && !MainFrame.mailFlage ||getCount() != 1)
            MainFrame.error_leb.setText("Enter Valid E-mail ID");
        else if(nullField(MainFrame.aadhar_txt1) || nullField(MainFrame.aadhar_txt2) || nullField(MainFrame.aadhar_txt3)){
            MainFrame.error_leb.setText("Enter AADHR CARD NUMBER ");
            MainFrame.aadhar_txt1.setText("");
            MainFrame.aadhar_txt2.setText("");
            MainFrame.aadhar_txt3.setText("");
        }
        else if(conditionField(MainFrame.d1,"D") || conditionField(MainFrame.d2,"D") || conditionField(MainFrame.m1,"M") || conditionField(MainFrame.m2,"M") && conditionField(MainFrame.y1,"Y") || conditionField(MainFrame.y2,"Y") || conditionField(MainFrame.y3,"Y") || conditionField(MainFrame.y4,"Y")){
            MainFrame.error_leb.setText("Enter Date Of Birth");
            MainFrame.d1.setText("D"); MainFrame.d2.setText("D");
            MainFrame.m1.setText("M"); MainFrame.m2.setText("M");
            MainFrame.y1.setText("Y"); MainFrame.y2.setText("Y");
            MainFrame.y3.setText("Y"); MainFrame.y4.setText("Y");
        }
        else
            if(MainFrame.mailFlage)
                updateProfileData();
            else
                JOptionPane.showMessageDialog(null,"Invalid E - Mail ID");
    }
    
    static int getCount(){
        count = 0;
        for(MainFrame.forI = 0 ; MainFrame.forI < MainFrame.email_txt.getText().length(); MainFrame.forI++)
            if(MainFrame.email_txt.getText().charAt(MainFrame.forI) == '@')
                count++;
        return count;
    }
    
    static void updateProfileData(){
        profileImage();
        try {
            rd.pst = rd.con.prepareStatement("UPDATE profile set name = ?, id = ?, e_mail_id = ?, upi_id = ?, mobile_no = ?, aadhar1 = ?, aadhar2 = ?, aadhar3 = ?, date = ?, month = ?, year =  ?, img_path = ? where acc_no = '"+LogInFrame.account_no+"'");
            rd.pst.setString(1, MainFrame.name_txt.getText());                        rd.pst.setString(2, MainFrame.user_id.getText());
            rd.pst.setString(3, MainFrame.email_txt.getText());                       rd.pst.setString(4, MainFrame.upi_txt.getText());
            rd.pst.setString(5, MainFrame.contact_txt.getText());                     rd.pst.setString(6, MainFrame.aadhar_txt1.getText());
            rd.pst.setString(7, MainFrame.aadhar_txt2.getText());                     rd.pst.setString(8, MainFrame.aadhar_txt3.getText());
            rd.pst.setString(9, ""+MainFrame.d1.getText()+""+MainFrame.d2.getText()); rd.pst.setString(10, ""+MainFrame.m1.getText()+""+MainFrame.m2.getText()); 
            rd.pst.setString(11, ""+MainFrame.y1.getText()+""+MainFrame.y2.getText()+""+MainFrame.y3.getText()+""+MainFrame.y4.getText());
            System.out.println(""+MainFrame.y1.getText()+""+MainFrame.y2.getText()+""+MainFrame.y3.getText()+""+MainFrame.y4.getText());
            rd.pst.setString(12,"Documents//"+LogInFrame.account_no+"//"+LogInFrame.account_no+"_profileImg.png");
            rd.pst.executeUpdate();
            rd.insertORupdateDataBase("update transection set SenderUPI = '"+MainFrame.upi_txt.getText()+"' where SenderAccountNo = '"+LogInFrame.account_no+"'");
            LogInFrame.upi_id = MainFrame.upi_txt.getText();
            MainFrame.upi_leb.setText(MainFrame.upi_txt.getText());
            rd.reLiveProfileData("id", LogInFrame.userID);
            ut.imageIcon(MainFrame.profile_leb, ReLiveData.imgpath);
            QRGenarator.getQR(MainFrame.upi_txt.getText(), ReLiveData.QR_path);
            GraphicsComponents.graphicsLabel();// for refresh the label
            v.mainPanesFalse();
            front_pnl.show();
        } catch (SQLException ex) {
            Logger.getLogger(ProfileData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    static void profileImage(){
        ImageManager(MainFrame.profile_photo_leb,LogInFrame.account_no+"_profileImg.png","Documents//"+LogInFrame.account_no);
        ut.imageIcon(MainFrame.profile_leb, "Documents//"+LogInFrame.account_no+"//"+LogInFrame.account_no+"_profileImg.png");
//        System.out.println("Documents//"+LogInFrame.account_no+"//"+LogInFrame.account_no+"_profileImg.png");
    }
    
    public static boolean nullField(JTextField textfield){
        if(textfield.getText().equals(""))
            return true;
        else
            return false;
    }
    
    static boolean conditionField(JTextField textfield, String string){
        if(textfield.getText().equals(string))
            return true;
        else
            return false;
    }
}
