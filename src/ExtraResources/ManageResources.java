package ExtraResources;
import LoginControllerPKG.AddNewUser;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javazoom.jl.player.Player;

public class ManageResources {
    public ManageResources(){
    
    }
    
    public static void createDirectory(String Directorypath){
        try {
            Files.createDirectory(Paths.get(Directorypath));
        } catch (IOException ex) {
            Logger.getLogger(AddNewUser.class.getName()).log(Level.SEVERE, null, ex);  
        }
    }
    
    public static void JMusicPlayer(String path){
        try{
            FileInputStream fis = new FileInputStream(path);
            Player playMP3 = new Player(fis);
            playMP3.play();
        }  catch(Exception e){
            System.out.println(e);
        }        
    }

    public static void JFileRemover(String path) throws IOException{
            Files.delete(Paths.get(path));
    }

    public static void paneSaver(JPanel pane, String path) {
        try {
            int w = pane.getWidth(), h = pane.getHeight();
            BufferedImage image = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
            Graphics g = image.createGraphics();
            pane.setVisible(true);
            pane.paint(g);
            ImageIO.write(image, "png", new File(path));
        } 
        catch (IOException e) {
            System.err.println(e);
        }
    }

    public static void labelSaver(JLabel label, String path) {
        try {
            int w = label.getWidth(), h = label.getHeight();
            BufferedImage image = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
            Graphics g = image.createGraphics();
            label.setVisible(true);
            label.paint(g);
            ImageIO.write(image, "png", new File(path));
        } 
        catch (IOException e) {
            System.err.println(e);
        }
    }
    public static void main(String[] args){
//        JMusicPlayer("D:\\song\\Bam_Bhole__Viruss__ACME_MUZIC__New_Songs_2017.mp3");
    }    
}
/*  
    mucic//errorSound.mp3
*/