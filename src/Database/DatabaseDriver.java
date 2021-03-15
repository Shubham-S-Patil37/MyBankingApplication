package Database;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DatabaseDriver {

//public static ArrayList<ReLiveData> list = new ArrayList();
    
    public static ResultSet rs = null;
    public static Statement stmt = null;
    public static Connection con = null;
    public static PreparedStatement pst = null;

    public static Connection Connect(){
// ******************************************** Wampp server *******************************************************
//        try{  
//            Class.forName("com.mysql.jdbc.Driver");  
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_banking_app","root","");  
//            return con;
//        }catch(Exception e){
//        JOptionPane.showMessageDialog( null, e,"Error", JOptionPane.ERROR_MESSAGE);
//         return null;
//        }
// ******************************************** Ucanaccess server *******************************************************
        try{  
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://database//my_banking_app.accdb");  
            return con;
        }catch(Exception e){
            JOptionPane.showMessageDialog( null, e,"Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
// ******************************************** SQLYUG server *******************************************************
//        try {
//                Class.forName("com.mysql.jdbc.Driver");
//                String url = "jdbc:mysql://localhost:3306/mybankingapplication";
//                con = DriverManager.getConnection(url, "root", "root");
//                System.out.println("conn built");
//        } catch (SQLException e) {
//                e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//                e.printStackTrace();
//        }
//        return null;
        
    }
    
    public static ResultSet Resultset(String Querry){
        return null;
    }

}
