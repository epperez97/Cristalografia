package cristografia;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.image.Image;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import org.opencv.core.Core;

import static javafx.application.Application.launch;
import static javafx.scene.input.KeyCode.*;

public class Main extends Application{
    public static Stage stage = null;

    @Override
    public void start(Stage stage) throws Exception {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        FXMLLoader loader=new FXMLLoader(getClass().getResource("Principal.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        PrincipalController rootControler = (PrincipalController)loader.getController();
        stage.setScene (scene);
        stage.setTitle ("Criptolografía");
        stage.setMaximized (true);

        this.stage  = stage;

        stage.show ();
    }



    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {launch(args);
    }
}
