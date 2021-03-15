package TansectionPKG;
import Database.ReLiveData;
import static Database.ReLiveData.TotalTransection;
import static ExtraResources.Utilities.randomNumber;
import java.awt.Font;
import javax.swing.JOptionPane;
import static Database.ReLiveData.reLiveStaticTransection;
import static Database.ReLiveData.insertORupdateDataBase;
import LoginControllerPKG.LogInFrame;

public class CalculateRewards {

    static String number,RewardsContain;
    static int getNumber = Integer.parseInt(randomNumber());

    public CalculateRewards() {
    }

    public static void viewRewards(int Ammount, int fontSize){
        new ExternallyGiftedMoney().show();
        ExternallyGiftedMoney.rewardLeb.setFont(new Font("Tahoma", Font.PLAIN, fontSize));
        ExternallyGiftedMoney.rewardLeb.setText(RewardsContain);    
    }
    
    public static void getElse(int Ammount){
        RewardsContain = "better luck next time";
        viewRewards(Ammount,30);
        getNumber = 0;
    } 
    
    public static void getRewards(int Ammount) {
        reLiveStaticTransection("acc_no", LogInFrame.account_no);
//        ReLiveData.flag = "0";
        if(Ammount > 30)
            if(Integer.parseInt(ReLiveData.flag) == 0){
                System.out.println("******** Reward No IS :- "+getNumber);
                if (getNumber % 2 == 0) {
                    RewardsContain = ""+finalRewardNumber(getPercentNumber(getNumber), Ammount);
                    getNumber = finalRewardNumber(getPercentNumber(getNumber), Ammount);
                    insertORupdateDataBase("update staticTransection set TotalRewards = '"+addTwo(Integer.parseInt(ReLiveData.rewards), Integer.parseInt(RewardsContain))+"' where acc_no = '"+LogInFrame.account_no+"'");
                    viewRewards(Ammount,70);
                    updateFlage(addTwo(Integer.parseInt(ReLiveData.flag),1), Ammount);
                } else 
                    getElse(Ammount);
            }
            else{
                if(Integer.parseInt(ReLiveData.flag) >= 5){
                    getElse(Ammount);
                    updateFlage(0 , Ammount);
                }
                else{
                    getElse(Ammount);
                    updateFlage(addTwo(Integer.parseInt(ReLiveData.flag),1), Ammount);
                }
           }
        else
            getElse(Ammount);   
    }

    public static int getPercentNumber(int Number) {
        getNumber = Number / 10;
        number = "" + getNumber % 10;
        return Integer.parseInt(number + "" + Number % 10);
    }

    public static int finalRewardNumber(int PercentNumber, int TotalAmmount) {
        return (PercentNumber * TotalAmmount) / 100;
    }

    public static void updateFlage(int flage , int Ammount){
        insertORupdateDataBase("update staticTransection set RewardsFlage = '"+flage+"' , TotalTransection = '"+addTwo(Integer.parseInt(ReLiveData.TotalTransection), Ammount)+"' where acc_no = '"+LogInFrame.account_no+"'");
    }

    public static int addTwo(int fno, int sno){
        return fno+sno;
    }

    public static void main(String args[]) {
//        getRewards(200);
    }
}
