import org.w3c.dom.Text;

import javafx.fxml.FXMLLoader;
import javafx.application.Application;
import javafx.application.Platform;

import javafx.scene.Scene;



import javafx.scene.layout.BorderPane;

import javafx.stage.Stage;
 

public class Executable extends Application{
    Scene mainScene;
    BorderPane root;
    FXMLLoader loader;

    @Override
    public void init(){    
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
    //--- Chargement du fichier FXML
         try{loader = new FXMLLoader(this.getClass().getResource("/sceneJeu.fxml"));
         root = (BorderPane) loader.load();
         mainScene = new Scene(root);}
         catch(Exception e){System.out.println(e);}

    primaryStage.setScene(mainScene);
    primaryStage.setTitle("SayHello FXML");
    primaryStage.show();
    }

public static void main(String[] args) {
        launch(args);
}  
}