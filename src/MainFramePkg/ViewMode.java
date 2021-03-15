package MainFramePkg;
import static ExtraResources.Utilities.editTextField;
import static ExtraResources.Utilities.editButton;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class ViewMode {
    public static void selectViewMode(JTextField textField){
        if(MainFrame.setting_mode_btn.isSelected()){
            textField.setForeground(Color.WHITE);  
            textField.setBorder(new LineBorder(Color.WHITE));
            textField.setBackground(new Color(51,51,51));
            editTextField(textField, 255, 255, 255);
        }
        else{
            textField.setBorder(new LineBorder(Color.BLACK));
            textField.setBackground(new Color(255,255,255));
            textField.setForeground(Color.BLACK);
            editTextField(textField, 0, 0, 0);
        }
    }

    public static void selectViewMode(JTextArea txtArea){
        if(MainFrame.setting_mode_btn.isSelected()){
            txtArea.setForeground(Color.WHITE);  
            txtArea.setBorder(new LineBorder(Color.WHITE));
            txtArea.setBackground(new Color(51,51,51));
//            editTextField(txtArea, 255, 255, 255);
        }
        else{
            txtArea.setBorder(new LineBorder(Color.BLACK));
            txtArea.setBackground(new Color(255,255,255));
            txtArea.setForeground(Color.BLACK);
//            editTextField(txtArea, 0, 0, 0);
        }
    }

    public static void selectViewMode(JButton button){
        if(MainFrame.setting_mode_btn.isSelected()){
            button.setBorder(new LineBorder(Color.WHITE));
            button.setBackground(new Color(51,51,51));
            button.setForeground(Color.WHITE);
        }
        else{
            button.setBackground(Color.WHITE);
            button.setForeground(Color.BLACK);                      
            button.setBorder(new LineBorder(Color.BLACK));
        }
    }

    public static void selectViewMode(JLabel label){
        if(MainFrame.setting_mode_btn.isSelected())
            label.setForeground(Color.WHITE);
        else
            label.setForeground(Color.BLACK);
    }

    public static void selectViewMode(JPanel pane){
        if(MainFrame.setting_mode_btn.isSelected())
            pane.setBackground(new Color(51,51,51));
        else
            pane.setBackground(Color.WHITE);
    }

    public static void selectViewMode(JComboBox combobox){
        if(MainFrame.setting_mode_btn.isSelected()){
            combobox.setForeground(Color.WHITE);
            combobox.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.WHITE));
            combobox.setOpaque(false);
        }
        else{
            combobox.setForeground(Color.BLACK);
            combobox.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
            combobox.setOpaque(false);            
        }
    }

    static void transectionViewMode(){
        if(MainFrame.setting_mode_btn.isSelected()){
            MainFrame.send_mony_btn.setForeground(Color.BLACK);
            MainFrame.recive_mony_btn.setForeground(Color.BLACK);
            MainFrame.reward_btn.setForeground(Color.BLACK);
            MainFrame.history_btn.setForeground(Color.BLACK);
            MainFrame.tranzection_cancle_btn.setForeground(Color.BLACK);
        }
        else{
            MainFrame.send_mony_btn.setForeground(Color.WHITE);
            MainFrame.recive_mony_btn.setForeground(Color.WHITE);
            MainFrame.reward_btn.setForeground(Color.WHITE);
            MainFrame.history_btn.setForeground(Color.WHITE);
            MainFrame.tranzection_cancle_btn.setForeground(Color.WHITE);        
        }
    }

    public static void selectViewMode(JRadioButton button){
        if(MainFrame.setting_mode_btn.isSelected()){
            button.setForeground(Color.BLACK);
//            button.setBackground(new Color(51,51,51));
            editButton(button);
            
        }
        else{
            button.setForeground(Color.BLACK);
            button.setBackground(Color.WHITE);
        }
    }

    public static void servicesViewMode(){
        if(MainFrame.setting_mode_btn.isSelected()){
            MainFrame.loan_btn.setForeground(Color.WHITE);
            MainFrame.insurance_btn.setForeground(Color.WHITE);
            MainFrame.investment_btn.setForeground(Color.WHITE);
            MainFrame.cards_btn.setForeground(Color.WHITE);
            MainFrame.invite_btn.setForeground(Color.WHITE);
            MainFrame.my_app_sevices_btn.setForeground(Color.WHITE);
            MainFrame.services_pnl_cancle_btn.setForeground(Color.WHITE);        
        }
    }

    public static void event_MouseExit_ViewMode(JButton button){
        if(MainFrame.setting_mode_btn.isSelected())
            button.setForeground(Color.WHITE);
        else
            button.setForeground(Color.BLACK);
    }
}
