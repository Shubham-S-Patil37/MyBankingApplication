package MainFramePkg;
import Database.ReLiveData;
import LoginControllerPKG.LogInFrame;
import static MainFramePkg.MainFrame.addUser_btn;
import static MainFramePkg.MainFrame.rd;

public class GenerateUserType {

    public static String getUser(){
        ReLiveData.reliveLoginData("id", LogInFrame.userID);
        if(ReLiveData.userType.equals("ADMIN"))
            return ReLiveData.userType.toLowerCase();
        if(ReLiveData.userType.equals("EMPLOYEE"))
            return ReLiveData.userType.toLowerCase();
        if(ReLiveData.userType.equals("USER"))
            return ReLiveData.userType.toLowerCase();
        else
            return "default";
    }
    
    public static void userSpefication(){
        switch (getUser()){
            case "admin":
                addUser_btn.setVisible(true);
                break;
            case "employee":
                addUser_btn.setVisible(true);
                break;
            case "user":
                addUser_btn.setVisible(false);
                break;
            case "all":
            default:
                System.out.println("MainFramePkg.GenerateUserType.userSpefication() default case");
                break;
        }
    }
}
