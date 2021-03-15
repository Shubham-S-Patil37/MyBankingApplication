package Controller;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class OpenWebViewController implements Initializable {

    @FXML
    private WebView webview2;
    @FXML
    private VBox box;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Create the WebView
        WebView webView = new WebView();
         
        // Create the WebEngine
//        final WebEngine webEngine = webView.getEngine();
        final WebEngine webEngine = webview2.getEngine();
 
//         LOad the Start-Page
        //webEngine.load("https://www.oracle.com");
//        webEngine.load("https://www.instagram.com");
        webEngine.load("https://web.whatsapp.com");
//        webEngine.load("http://www.imdb.com/title/tt0101414/?ref_=fn_al_tt_1");
        
//        System.out.println("Web View URL = "+ WebViewScreenController.url);
//
//        webEngine.load(WebViewScreenController.url);
        
//        getHostServices().showDocument(url); // To show using Browser
        
        
//        // Update the stage title when a new web page title is available
//        webEngine.getLoadWorker().stateProperty().addListener(new ChangeListener<Worker.State>() 
//        {
//            public void changed(ObservableValue<? extends Worker.State> ov, Worker.State oldState, Worker.State newState) 
//            {
//                if (newState == Worker.State.SUCCEEDED) 
//                {
//                    //stage.setTitle(webEngine.getLocation());
//                    stage.setTitle(webEngine.getTitle());
//                }
//            }
//        });
        box.getChildren().add(webview2);
        
        box.setStyle("-fx-padding: 10;" +
                "-fx-border-style: solid inside;" +
                "-fx-border-width: 2;" +
                "-fx-border-insets: 5;" +
                "-fx-border-radius: 5;" +
                "-fx-border-color: blue;");
        
//        box.setStyle("-fx-background-color: rgba(0, 100, 100, 0.5); -fx-background-radius: 0;");

       
    }    
    
}
