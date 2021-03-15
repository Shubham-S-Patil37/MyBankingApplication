package Splash;

import LoginControllerPKG.LogInFrame;
import MainFramePkg.MainFrame;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ClassLoader {

    static Thread Loader;

    public ClassLoader(String Condition){
        getIntilizeClass(Condition);
    }
 
    static void getIntilizeClass(String Condition){
        Loader = new Thread(new Runnable() {
            public void run() {
                switch(Condition){
                    case "Load_at_beginning":
                        LogInFrame.lf = new LogInFrame();
                        MainFrame.frame = new MainFrame();
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "NO CLASS FOUND IN LOADER");
                }
            }
        });
    }
    
    static Thread startLoder(){
        return Loader;
    }
}
