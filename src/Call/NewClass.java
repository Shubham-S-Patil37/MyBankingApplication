package Call;

import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class NewClass {
    public static void main(String args[]){
        String path = "E:\\study\\Java\\netbeans\\MyBankingApplication\\src\\CSSServices\\FXML.fxml";
        String path1 = "src/CSSServices/FXML.fxml";
//        SwingUtilities.invokeLater(() ->{
//            JFrame frame = new JFrame("Circle");
//            frame.setBounds(100,100,200,225);
//            JFXPanel fxp = new JFXPanel();
//            frame.add(fxp);
//            frame.setVisible(true);
//            Platform.runLater(() -> {});
//            Group group = new Group(new Circle(100,100,100));
//            
//            Scene scene = new  Scene(group , 200,200);
//            fxp.setScene(scene);
//    } );
        
        SwingUtilities.invokeLater(() ->{
            try {
                JFrame frame = new JFrame("Circle");
                frame.setBounds(200,200,200,225);
                JFXPanel fxp = new JFXPanel();
                frame.add(fxp);
                frame.setVisible(true);
                
                URL url = new File(path1).toURI().toURL();
                Parent root = FXMLLoader.load(url);
                
                Scene scene = new Scene(root, 200, 200);
                fxp.setScene(scene);
//            Group group = new Group(new Circle(100,100,100));
//            Scene scene = new  Scene(group , 200,200);
//            fxp.setScene(scene);
            } catch (MalformedURLException ex) {
                Logger.getLogger(NewClass.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(NewClass.class.getName()).log(Level.SEVERE, null, ex);
            }
    } );

    }
}
