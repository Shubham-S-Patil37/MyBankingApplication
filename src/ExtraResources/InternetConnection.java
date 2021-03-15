
package ExtraResources;

import java.awt.Desktop;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class InternetConnection {
    
    public static Boolean checkConnnection(){
       Socket socket = new Socket();
        InetSocketAddress add = new InetSocketAddress("www.youtube.com",80);
        try{
            socket.connect(add,3000);
            return true;
        }
        catch(Exception e){
            return false;
        } finally{
            try{
                socket.close();
//                return false;
            }catch(Exception e){ return false; }
        }    
        
    }
    
    public static void getBowse(String site){
        try {
            Desktop.getDesktop().browse(new URL(site).toURI());
        } catch (URISyntaxException ex) {
            Logger.getLogger(InternetConnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(InternetConnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(InternetConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void main(String args[]){
//        checkConnnection();
        getBowse("https://www.youtube.com/");
    }
}
