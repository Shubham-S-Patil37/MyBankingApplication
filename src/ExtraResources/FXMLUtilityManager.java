package ExtraResources;
import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.animation.TranslateTransition;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;


public class FXMLUtilityManager {
    public static RotateTransition rt;

    public static void getRotation(ImageView image, int delay, int Cycle){
        rt = new RotateTransition(Duration.millis(delay), image);
        rt.setByAngle(360);
        rt.setCycleCount(Cycle);
        rt.setInterpolator(Interpolator.LINEAR);
        rt.play();
        rt.setOnFinished(event -> {});
    }
    
    public static void movetoY(AnchorPane pane, int Y, int delay){
        TranslateTransition slide = new TranslateTransition();
        slide.setDuration(Duration.seconds(delay));
        slide.setNode(pane);
        slide.setToY(Y);
        slide.play();
    }
    
}
