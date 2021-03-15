package MainFramePkg;
import ExtraResources.ArriveDate;
import ExtraResources.ManageResources;
import ExtraResources.Utilities;
import LoginControllerPKG.LogInFrame;
import static MainFramePkg.MainFrame.UniqueId;
import static MainFramePkg.MainFrame.cardNo1;
import static MainFramePkg.MainFrame.cardNo2;
import static MainFramePkg.MainFrame.cardNo3;
import static MainFramePkg.MainFrame.myCardsPnl;
import static MainFramePkg.MainFrame.rd;
import static MainFramePkg.MainFrame.ut;
import static MainFramePkg.MainFrame.v;
import NotifocationComponents.SingleClickNotification;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.scripts.JO;
import net.proteanit.sql.DbUtils;

public class ServicesManagement {

    static ArriveDate ad = new ArriveDate();

    public class Cards{
        public void cardConfirm(){
            rd.reLiveProfileData("acc_no", LogInFrame.account_no);
            if(Integer.parseInt(rd.balance) > 420){
                try {
                    rd.rs = rd.resultSet("select * from Cards where AccountNo = '"+LogInFrame.account_no+"' and CardsType = '"+MainFrame.selectcardCB.getSelectedItem().toString()+"'");
                    if(MainFrame.selectcardCB.getSelectedItem().toString().equals("Select Card Type"))
                        ExtraManagement.disposeSingle("Select Valid Card Type", "Close");
                    else if(rd.rs.next())
                        ExtraManagement.disposeSingle("You arleady Apply for that card", "Close");
                    else{
                        UniqueId = ut.randomNumber();
                        while(rd.reLiveCardsData("NotificationNo", UniqueId))
                            UniqueId = ut.randomNumber();

                        rd.insertORupdateDataBase("insert into Cards(AccountNo,CardsType,UserID,Name,CardNumber,Expiery,CVV,BankName,Status,NotificationNo)"
                                + "values('"+LogInFrame.account_no+"','"+MainFrame.selectcardCB.getSelectedItem().toString()+"','"+LogInFrame.userID+"','"+MainFrame.cardNameLeb.getText()+"','"+MainFrame.cardNo1+MainFrame.cardNo2+MainFrame.cardNo3+"','"+MainFrame.cardExpieryLeb.getText()+"','"+MainFrame.cvvLeb.getText()+"','myBank','pending','"+UniqueId+"')");
                        rd.insertORupdateDataBase("insert into CardsNotification (Accountno,UserID,NotiInfo,Date,Status,flag,doneBy,NotificationNo) "
                                + "values('"+LogInFrame.account_no+"','"+LogInFrame.userID+"','Apply for "+MainFrame.selectcardCB.getSelectedItem().toString()+" Card','"+ad.getTodaysDate()+"','pending','notview','','"+UniqueId+"')");
                        rd.insertORupdateDataBase("insert into application (accountNo, ApplicationInfo, date_OF_apply, type , applicationNo) "
                                + "values('"+LogInFrame.account_no+"', 'Apply for "+MainFrame.selectcardCB.getSelectedItem().toString()+" Card', '"+ad.getTodaysDate()+"', 'pending', '"+UniqueId+"')");
                        rd.reliveNotificationData("NotificationInfo", "Apply For Cards");
                        if(!rd.rs.next())
                            rd.insertORupdateDataBase("insert into Notification(NotificationInfo,ApplyDate,flag,ForUserType,ForUser,status) values('Apply For Cards','"+ad.getTodaysDate()+"','notseen','admin','public','notadded')");
                        else
                            rd.insertORupdateDataBase("update Notification set flag = 'notseen', status = 'notadded' where NotificationInfo = 'Apply For Cards'");
    //*********************************************************************************************************************************************************
                        ManageResources.paneSaver(MainFrame.cardfrontViewPnl,"Documents//"+LogInFrame.account_no+"//"+LogInFrame.account_no+"_"+MainFrame.selectcardCB.getSelectedItem().toString()+"_CardsFront.png");
                        ManageResources.paneSaver(MainFrame.cardBackViewPnl, "Documents//"+LogInFrame.account_no+"//"+LogInFrame.account_no+"_"+MainFrame.selectcardCB.getSelectedItem().toString()+"_CardsBack.png");
    //*********************************************************************************************************************************************************
                        rd.reLiveProfileData("acc_no", "37373737");
                        rd.insertORupdateDataBase("update profile set balance = '"+(Integer.parseInt(rd.balance) + 420)+"' where acc_no = '37373737'");

                        new SingleClickNotification("Your Application will be Varified by our Expert","OK") {
                                @Override
                                public void getButtonAction() {
                                    rd.reLiveProfileData("acc_no", LogInFrame.account_no);
                                    ExtraManagement.disposeSingle("Your Balance "+(Integer.parseInt(rd.balance) - 420), "OK");
                                }
                                public void getCloseAction() {
                                    rd.reLiveProfileData("acc_no", LogInFrame.account_no);
                                    ExtraManagement.disposeSingle("Your Balance "+(Integer.parseInt(rd.balance) - 420), "OK");
                                }
                            }.show();
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else
                ExtraManagement.disposeSingle("Insufficiant Balance in your Account !", "Close");
        }

        public void myCards(){
            v.cardsPaneFalse();
            myCardsPnl.setVisible(true);
            rd.getRelativeColumn("select CardsType from cards where AccountNo = '"+LogInFrame.account_no+"' and Status = 'accept'");
            try {
                if(rd.rs.next()){
                    rd.getRelativeColumn("select CardsType from cards where AccountNo = '"+LogInFrame.account_no+"' and Status = 'accept'");
                    MainFrame.myCardsTbl.setModel(DbUtils.resultSetToTableModel(rd.rs));
                }
                else{
                    new SingleClickNotification("No cards Found !","Close") {
                        @Override
                        public void getButtonAction() {
                            dispose();
                            v.cardsPaneFalse();
                            MainFrame.sub_services_cards_pnl.setVisible(true);
                        }
                        public void getCloseAction() {
                            dispose();
                            v.cardsPaneFalse();
                            MainFrame.sub_services_cards_pnl.setVisible(true);
                        }                    
                    }.show();
                }   
            } catch (SQLException ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        public void applyForCards(){
            v.cardsPaneFalse();
            MainFrame.applyforCardsPnl.setVisible(true);
            MainFrame.cardNameLeb.setVisible(true);
            MainFrame.cardBackViewPnl.setVisible(false);
            rd.reLiveProfileData("acc_no", LogInFrame.account_no);
            MainFrame.cardNameLeb.setText(rd.name);
            MainFrame.cardExpieryLeb.setText(ArriveDate.getArrivemonthAndYear(ArriveDate.getArriveDate(12)));
            MainFrame.cardNo1 = Utilities.randomNumber().substring(0, 4);
            MainFrame.cardNo2 = Utilities.randomNumber().substring(0, 4);
            MainFrame.cardNo3 = Utilities.randomNumber().substring(0, 4);
            while(rd.reLiveCardsData("CardNumber", cardNo1+""+cardNo2+""+cardNo3)){
                cardNo1 = Utilities.randomNumber().substring(0, 4);
                cardNo2 = Utilities.randomNumber().substring(0, 4);
                cardNo3 = Utilities.randomNumber().substring(0, 4);
            }
            MainFrame.cardsNO1.setText(cardNo1);
            MainFrame.cardsNO2.setText(cardNo2);
            MainFrame.cardsNO3.setText(cardNo3);
            MainFrame.cvvLeb.setText(ut.randomNumber().substring(0, 3));
        }
    }
    
    public class Loan{
        public Loan(){}
        
        public void getGIFLebel(){
//            MainFrame.agriculaturLoanLeb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/GIF/agricultureloan.gif")));
            ut.getGifIcon(MainFrame.agriculaturLoanLeb , "agricultureloan.gif");
            ut.getGifIcon(MainFrame.businessLoanLeb    , "bussinessloan.gif");
            ut.getGifIcon(MainFrame.educationLoanLeb   , "edcationloan.gif");
            ut.getGifIcon(MainFrame.carLoanLeb         , "carloan.gif");
            ut.getGifIcon(MainFrame.twoWheelerLoanLeb  , "twoWheeler.gif");
            ut.getGifIcon(MainFrame.goldLoanLeb        , "goldloan.gif");
            ut.getGifIcon(MainFrame.constructionLoanLeb, "constructionloan.gif");
            ut.getGifIcon(MainFrame.payPerDayLoanLeb   , "payperdayloan.gif");
            ut.getGifIcon(MainFrame.propertyLoanLeb    , "propertyloan.gif");
        }
        
        public void editButton(){
            ut.editButton(MainFrame.Agriculture_Loan_btn);
            ut.editButton(MainFrame.Business_Loan_btn);
            ut.editButton(MainFrame.Education_Loan_btn);
            ut.editButton(MainFrame.Car_Loan_btn);
            ut.editButton(MainFrame.Gold_Loan_btn);
            ut.editButton(MainFrame.Two_Wheeler_Loan_btn);
            ut.editButton(MainFrame.Construction_Loan_btn);
            ut.editButton(MainFrame.Pay_Per_Day_Loan_btn);
            ut.editButton(MainFrame.Property_Loan_btn);
        }
        
        public void loanBtnLost(JButton button){
            button.setForeground(Color.BLACK);
        }

        public void loanBtnGain(JButton button){
            button.setForeground(Color.BLUE);
        }
        
        public String getLoanInfo(String loanInfo){
            switch(loanInfo){
                case "AGRICULTURE":
                    return "Agricultural Loans "
                        + "\n \t Agricultural loans  are availed by a farmer to fund seasonal agricultural "
                        + "\n operations or related activities like animal  farming, pisci-culture  or purchase "
                        + "\n of land  or agricultural  tools. This type of  loan also helps buying inputs such "
                        + "\n as fertilizers, seeds, insecticides  etc. and engaging labour for cultivating and "
                        + "\n harvesting the crops. "
                        + "\n\t In  addition, purchasing  of  land, or  purchasing of  agricultural tools, "
                        + "\n storage of produce and transport, cost of ploughing land  for sowing, weeding, and "
                        + "\n transplantation also are included under purview of agricultural loans. ";
                case "BUSINESS":
                    return "Business Loans "
                        + "\n \t A business loan is  a kind  of financing you can avail to meet  the  urgent "
                        + "\n needs of your growing business. If  you need funding  to expand your existing busi- "
                        + "\n ness , buy machinery, or boost  production , look  no further than  a Bajaj Finserv "
                        + "\n Business Loan. Avail financing  at attractive  interest rates, borrow capital with- "
                        + "\n out pledging any of your assets, and get access  to credit that can  be repaid over "
                        + "\n a specific period of time. "
                        + "\n\t A business loan  is a loan specifically intended  for business purposes. As "
                        + "\n with all loans, it involves the creation of a debt, which will be repaid with added "
                        + "\n interest. There are  a number of different types  of business loans, including bank "
                        + "\n loans, mezzanine financing , asset- based financing , invoice financing , microloa- "
                        + "\n ns, business cash advances and cash flow loans. ";
                case "EDUCATION":
                    return "Education Loan"
                        + "\n\t Quality education  is must for a complete and successful life. For many, it "
                        + "\n is equivalent to graduating from a top institution. The cost of education is, howe- "
                        + "\n ver increasing rapidly.In fact, the cost of studying at reputed institutions is al- "
                        + "\n ready quite high. Keeping this in mind, parents, who want to provide their children "
                        + "\n with the  best possible education, invest their money in  mutual funds (MFs), fixed "
                        + "\n deposits (FDs), unit-linked insurance plans (ULIPs), etc. , for  the long term. But "
                        + "\n despite all this, one may still encounter shortage of funds. An education loan, th- "
                        + "\n erefore, plays a vital role in such a scenario by helping to bridge the gap between "
                        + "\n the shortfall and the required amount."
                        + "\n\t According to studies, the cost of education is  increasing at an average of "
                        + "\n 15% per annum. The tentative cost  of an  MBA is up from  Rs 2.5 lakh to RS 20 lakh "
                        + "\n in 15 years. So if  a couple  starts saving Rs 2,000  per month for 15 years, at an "
                        + "\n average rate of 12% , they  will be able to save  approximately Rs 9.5 lakh.";
                case "CAR":
                    return "Car Loan"
                        + "\n\tMany lending  companies currently  offer online sourcing  for vehicle loans. "
                        + "\n Today's driver can find a way to finance a car, truck, motorcycle, or other vehicle "
                        + "\n without leaving the comfort of home. But where should you get a loan?"
                        + "\n\t Most buyers will arrange financing through a car dealership. In this case "
                        + "\n the car loan is granted for the full amount plus an agreed upon service charge. The "
                        + "\n loan may be arranged by  the dealership, which then assigns  the car loan  to third "
                        + "\n party (usually a bank or credit union) for management and collection. The buyer may "
                        + "\n also take direct lending deal, receiving a loan from a financial institution like a "
                        + "\n bank. In these  agreements, the buyer  consents to pay back the total  loan plus an "
                        + "\n additional finance charge."
                        + "\n\t annual income. An auto loan is significant debt that will be on your credit "
                        + "\n record for  many years, and  you will  still have to  spend money on insurance, car "
                        + "\n maintenance,  and other expenses. You can always trade  up if you can afford a more "
                        + "\n expensive car at a later date. Most  experts would  advise that you go to the deal- "
                        + "\n ership with a budget including financing rates in mind."
                        + "\n\t Another factor to consider with car loans is the length of the term. Often, "
                        + "\n the longer it  takes for you  to pay back the full cost of the loan, the higher the "
                        + "\n interest rate. All in all,  any extra consideration a buyer gives  to  financing  a "
                        + "\n vehicle will often result in a better deal. ";
                case "TWO_WHEELER":
                    return"Two Wheeler Loan"
                        + "\n\t Purchasing a two wheeler gives you a sense of liberty and sets you free to "
                        + "\n commute on your own terms.  A two wheeler loan can help you be the proud owner of a "
                        + "\n new bike. IDFC FIRST Bank  two wheeler finance offers 95% of the vehicle's value as "
                        + "\n a loan, with a flexible tenure of up to 5 years. Our 2 wheeler loan gets you a mot- "
                        + "\n orcycle of  your choice without having worry about bearing the entire cost at once. ";
                case "GOLD":
                    return "Gold Loan"
                        + "\n\t A gold loan is a secured loan that you  can  get by pledging gold ornaments "
                        + "\n as collateral with a lender. The lender will, in turn, give you a  loan amount based "
                        + "\n on the  market value of your gold. And  after  you complete repaying the loan amount "
                        + "\n and  interest  at the  end of your  chosen  tenure, your  gold is returned. "
                        + "\n\t Borrowing money against a  gold deposit is fairly common practice  in India. "
                        + "\n Lenders disburse money against  the  security  of the gold given to them . The funds "
                        + "\n received can be used for your business expenses, medical expenses or any other fina- "
                        + "\n ncial needs without depending on anyone and fulfil your needs on  your  own. While a "
                        + "\n gold loan is relatively easy way to obtain urgent funds, you may have several doubts "
                        + "\n about it. So, here's a list  of common questions and expert answers to help you out. ";
                case "CONSTRUCTION":
                    return "Construction Loan"
                            + "\n\t A construction loan  (also known as  a self-build loan)  is a short-term "
                            + "\n loan used to finance the building of a  home or another real estate project. The "
                            + "\n builder or home buyer takes out a construction loan  to cover  the costs  of the "
                            + "\n project before obtaining long-term funding. Because they  are considered relati- "
                            + "\n vely risky, construction loans usually have higher  interest rates than traditi- "
                            + "\n onal mortgage loans.";
                case "PAY_PER_DAY":
                    return"Pay Per Day Loan"
                        + "\n\t It is an  excellent financing  option to meet  short-term  requirements, but "
                        + "\n people are not aware of them. These Pay Day Loans can be  availed from  Financers or "
                        + "\n Lending Websites. Before applying for  company, if possible, check about the company "
                        + "\n from any existing  borrower. If you do not  have  any such  reference,  start with a "
                        + "\n lower sum first. If you find they are working suitable,  then  you can go for larger "
                        + "\n amounts as well.";
                case "PROPERTY":
                    return "Property Loan"
                        + "\n\t The concept of financing, understood in its broad sense,embraces all sources "
                        + "\n of capital investment and, as such, the definition covers both debt and equity indi- "
                        + "\n scriminately. The  term  financing is indeed taken to  apply to  any form of capital "
                        + "\n which may be used to finance an investment project,ranging from the more traditional "
                        + "\n forms to those which are more innovative, and including both the use of equity capi- "
                        + "\n tal as well as the various forms of debt capital."
                        + "\n\t The procedures for  investment financing are  extremely important since they "
                        + "\n make it possible to improve the investment’s ultimate economic result due to a lower "
                        + "\n cost of the invested capital  when debt is  used. Moreover, in order  to undertake a "
                        + "\n profitable investment, it must also be financially sustainable, e.g. it must be pos- "
                        + "\n sible to secure the necessary resources. Eventually, this must all occur in  a bala- "
                        + "\n nced manner in order to ensure that there is  not an excessive financial risk due to "
                        + "\n the fixed cost of interest payment.Indeed, were the latter to exceed a certain thre- "
                        + "\n shold, it would reduce the economic benefit of lower capital  costs and, at the same "
                        + "\n time, make the investment overly complex  due to  the excessive restrictions imposed "
                        + "\n by lenders.";
                default:
                    JOptionPane.showMessageDialog(null,"Currnnty this type of loan is not accetable");
            }
            return "";
        }
        
    }
    
}
