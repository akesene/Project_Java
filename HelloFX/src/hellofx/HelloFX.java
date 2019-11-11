

package hellofx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
//public class HelloFX {
//
//
//    public static void main(String[] args) {
//        // TODO code application logic here
//    }
//    
//}

public class HelloFX extends Application {
    
    
    
    @Override  
    public void start(Stage primaStage) throws Exception{
        
        Parent root = FXMLLoader.load(getClass().getResource("hellofx. fxml"));
        primaStage.setTitle("hello World");
        primaStage.setScene(new Scene(root));
        primaStage.show();
    }
    
    
    public static void main(String[] args) {
        launch(args);
    }
    
    
           
    }
    
  



