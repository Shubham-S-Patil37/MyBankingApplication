package FXML;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.embed.swing.JFXPanel;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javax.swing.JFrame;

public class OpenFXML {
   static String path = "src/FXML/";
   public OpenFXML(String FILE_NAME){
       path = path+""+FILE_NAME;
   }
   
   public static void getFXML(){
       try {
           JFrame frame = new JFrame("Circle");
           frame.setBounds(200,200,1877,1000);
           frame.setLocationRelativeTo(null);
           JFXPanel fxp = new JFXPanel();
           frame.add(fxp);
           frame.setVisible(true);
           
           URL url = new File(path).toURI().toURL();
           Parent root = FXMLLoader.load(url);
           
           Scene scene = new Scene(root, 200, 200);
           fxp.setScene(scene);
        } catch (IOException ex) {
           Logger.getLogger(OpenFXML.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
   
    public static void main(String args[]){
        new OpenFXML("Rewards.fxml");
//        new OpenFXML("NewFXML.fxml");
//        new OpenFXML("OpenWebView.fxml");
       getFXML();
       System.out.println(path);
    }
}
