package Controller;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import ExtraResources.FXMLUtilityManager;

public class RewardsController implements Initializable {

    @FXML
    private ImageView reward_coin;
    @FXML
    private Label ammountLeb;
    @FXML
    private AnchorPane movingPane;
    
    FXMLUtilityManager manager = new FXMLUtilityManager();
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        movingPane.setTranslateY(1000);
        manager.movetoY(movingPane, 0, 8);
        manager.getRotation(reward_coin, 1000, 100);
    }    

}