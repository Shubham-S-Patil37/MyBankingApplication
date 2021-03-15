 package ExtraResources;
import static ExtraResources.Imager.webcam;
import LoginControllerPKG.GetLogIn;
import static LoginControllerPKG.GetLogIn.gli;
import MailVarification.ForgetPass;
import Splash.SplashScreen;
import static MainFramePkg.MainFrame.forI;
import NotifocationComponents.CheckInternetConnection;
import static NotifocationComponents.CheckInternetConnection.cic;
import static NotifocationComponents.CheckInternetConnection.jProgressBar1;
import WebCam.TakeShot;
import com.github.sarxos.webcam.Webcam;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import TansectionPKG.ExternallyGiftedMoney;
import javax.swing.JPanel;

public class ThareadUtilities {
    
    int i =0;
    public static JLabel Threadedlabel;
    Image image;
    Webcam webcam;
    public class NoVarification extends Thread{
//        public void OTPCount(JLabel label){
//            run();
//        }
        public void run(){
            for(i = 0 ; i<31 ; i++){
                ForgetPass.step2_counting_leb.setText(""+i);
                try {
                    Thread.sleep(1200);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ThareadUtilities.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public class MoveLabel extends Thread{
        public void run(){
            for(i = 0 ; i<2500 ; i++){
                Threadedlabel.setLocation(i, 500);
                try {
                    Thread.sleep(3);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ThareadUtilities.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }        
    }
   
    public class OpaticyCashBackPane extends Thread{
        public void run(){
            for(int i = 0 ; i < 30; i++){
                ExternallyGiftedMoney.jPanel1.setBackground(new Color(0,0,0,i));
                ExternallyGiftedMoney.jPanel1.repaint();
                try {
                    Thread.sleep(70);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ThareadUtilities.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
    final public class GetProgressBarProgress implements Runnable {
        @Override
        public void run() {
            for(forI = 0 ; forI <= 100 ; forI++){
                ThareadUtilities.getDelayTime(200);
                System.err.println(""+forI);
                jProgressBar1.setValue(forI);
                if(forI == 100){
                    jProgressBar1.setVisible(false);
                    if(InternetConnection.checkConnnection())
                        gli.cic.dispose();
                }
            }
        }
    }

    public static JLabel getLabelInfo(JLabel label){
        Threadedlabel = label;
        return label;
    }    
    
    public static void getDelayTime(int second){
        try {
           Thread.sleep(second);
        } catch (InterruptedException ex) {
           Logger.getLogger(ThareadUtilities.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void main(String args[]){
        
//                          call inner function        
//        ThareadUtilities tu = new ThareadUtilities();
//        ThareadUtilities.OpaticyButton button = tu.new OpaticyButton();
        
        for(int i = 10 ; i >= 0; i--){
            System.err.println(""+i);
        }
    }
}

