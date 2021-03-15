package ExtraResources;
import Database.ReLiveData;
import LoginControllerPKG.LogInFrame;
import MainFramePkg.ServicesManagement;
import TansectionPKG.CardsConfiramation;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.InputStream;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import sun.audio.AudioStream;
import java.awt.datatransfer.StringSelection;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JToggleButton;
import javax.swing.table.TableModel;

public class Utilities {
    public static ImageIcon imageIcon;
    public static Image image;
    public static BufferedImage bimage;
    static InputStream music;
    static AudioStream audio;
    Utilities af;
    public static java.awt.event.KeyEvent KEY;
    public static char character;
    public static JFileChooser jfc;
    public static Thread editT1,editT2,editT3,editT4,editT5,editT6,editT7;
    public static TableModel model;
    public static StringSelection stringSelection;
    public static Clipboard clipboard;

    public Utilities(){
        
    }

    public static void editComponents(){
        editT1 = new Thread(new Runnable() {
            public void run() {
                GraphicsComponents.graphicsButton();
                GraphicsComponents.graphicsField();
            }
        });

        editT2 = new Thread(new Runnable() {
            public void run() {
                GraphicsComponents.graphicsComboBox();
            }
        });

        editT3 = new Thread(new Runnable() {
            public void run() {
                GraphicsComponents.graphicsTable();
            }
        });

        editT4 = new Thread(new Runnable() {
            public void run() {
                GraphicsComponents.getImageButton();
                GraphicsComponents.graphicsLabel();
                
            }
        });
        
        editT1.start();
        editT2.start();
        editT3.start();
        editT4.start();
    }

    public static void editComponent(){
        editButton(CardsConfiramation.nextBtn);
        imageIcon(CardsConfiramation.nextBtn, "src//images//nextbtn.png");
        editComboBox(CardsConfiramation.bankCB);
        editComboBox(CardsConfiramation.cardsCB);
        editTextField(CardsConfiramation.jTextField1, 0, 0, 0);
        editTextField(CardsConfiramation.jTextField2, 0, 0, 0);
    }

    public static void editTextField(JTextField textfield,  int R, int G, int B){
        textfield.setOpaque(false);
        textfield.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(R , G , B)));
        textfield.setBackground(new Color(R,G,B,0));
    }

    public static void imageIcon(JLabel label, String path){
        imageIcon = new ImageIcon(Toolkit.getDefaultToolkit().getImage(path));
        image = imageIcon.getImage();
        image = image.getScaledInstance(label.getWidth(), label.getHeight(),Image.SCALE_SMOOTH);
        label.setIcon(new ImageIcon(image));
    }

    public static void gifPlayer(JLabel label, String path){
        URL url;
        try {
            url = new URL(path);
            bimage = ImageIO.read(url);
            image = bimage.getScaledInstance(label.getWidth(), label.getHeight(),Image.SCALE_SMOOTH);
            label = new JLabel(new ImageIcon(image));
        } catch (MalformedURLException ex) {
            Logger.getLogger(Utilities.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Utilities.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public void getGifIcon(JLabel label , String gif){
        label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/GIF/"+gif)));
    }

    public static String myFileChooser(){
        jfc = new JFileChooser();
        jfc.showOpenDialog(null);
        File f = jfc.getSelectedFile();
        return f.getAbsolutePath();
    }

    public static void imageIcon(JToggleButton button, String path){
        imageIcon = new ImageIcon(Toolkit.getDefaultToolkit().getImage(path));
        image = imageIcon.getImage();
        image = image.getScaledInstance(button.getWidth(), button.getHeight(),Image.SCALE_SMOOTH);
        button.setIcon(new ImageIcon(image));
    }

    public static void imageIcon(JButton button, String path){
        imageIcon = new ImageIcon(Toolkit.getDefaultToolkit().getImage(path));
        image = imageIcon.getImage();
        image = image.getScaledInstance(button.getWidth(), button.getHeight(),Image.SCALE_SMOOTH);
        button.setIcon(new ImageIcon(image));
    }

    public static void editProgressBar(JProgressBar progressbar,int value){
        progressbar.setVisible(true);
        progressbar.setBorder(null);
        progressbar.setBorderPainted(false);
        progressbar.setOpaque(false);
        progressbar.setValue(value);
    }

    public static void editButton(JButton button){
        button.setBorder(null);
        button.setBorderPainted(false);
        button.setContentAreaFilled(false);
        button.setOpaque(false);   
        button.setFocusable(false);// removing border near text , border of text not visible at forever
    }

    public static void editButton(JToggleButton button){
        button.setBorder(null);
        button.setBorderPainted(false);
        button.setContentAreaFilled(false);
        button.setOpaque(false);
    }

    public static void editButton(JRadioButton button){
        button.setContentAreaFilled(false);
        button.setBorderPainted(false);
        button.setOpaque(false);
        button.setContentAreaFilled(false);
        button.setBorderPainted(false);    
    }

    public static void editComboBox(JComboBox combobox){
        combobox.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
        combobox.setOpaque(false);
        combobox.setBackground(new Color(0,0,0,0));
    }

    public static JTable editTable(JTable table, JScrollPane scrollPane,int R,int G,int B){
        table.setBackground(new Color(0,0,0,0));
        table.setGridColor(new Color(R,G,B));
        table.setForeground(new Color(R,G,B));
        
        scrollPane.setBackground(new Color(0,0,0,0));
        scrollPane.setOpaque(false);
        scrollPane.getViewport().setOpaque(false);
        return table;
    }

    public static void isDigit(java.awt.event.KeyEvent KEY){
        character = KEY.getKeyChar();
        if(!Character.isDigit(character))
            KEY.consume();
    }

    public static void isChar(java.awt.event.KeyEvent KEY){
        character = KEY.getKeyChar();
        if(!(Character.isAlphabetic(character)) && !(Character.isWhitespace(character)))
            KEY.consume();
    }

    public static void transferFocus(JTextField textfield, int charLimit){
        if(textfield.getText().length() == charLimit - 1)
            textfield.transferFocus();
//        String str = (textfield.getText().length() == charLimit - 1) ? "" : "" ;
//        int a = 0;
//        a = (a == 2) ? 2 : 3;
    }

    public static String randomNumber(){
        return ""+Math.round(Math.random() * 100000);
    }

    public static void copyText(String Contain){
        stringSelection = new StringSelection(Contain);
        clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
    }

    public static void getDataKeyTyped(JTextField textField, JLabel Label) throws InterruptedException{
        ReLiveData.reLiveCardsData("UserID", "admin");
        Thread.sleep(200);
        if(!textField.getText().toUpperCase().equals(ReLiveData.name.toUpperCase()))
            Utilities.imageIcon(Label, "src/images/wrong.png");
        else
            Utilities.imageIcon(Label, "src/images/correct.png");
    }

    public static void textFocusGain(JLabel label, JTextField textfield, String text){
        label.setText(text);
        textfield.setText("");
    }

    public static void textFocusLost(JLabel label, JTextField textfield, String text){
        if(textfield.getText().equals("")){
            label.setText("");
            textfield.setText(text);
        }
    }

    public static void setLimit(java.awt.event.KeyEvent KEY, JTextField TextField, int Limit){
        if(TextField.getText().length() == Limit)
            KEY.consume();
    }

    public static String getDesktop(){
        return System.getProperty("user.home") + "/Desktop/";
    }

    public static void main(String[] args){    }
}
