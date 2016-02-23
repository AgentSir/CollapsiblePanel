package ua.sputilov.collapsiblepanel;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;
import ua.sputilov.collapsiblepanel.utils.FontLoader;

/**
 * Created by sergey_putilov on 22.02.2016.
 */
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("panel.fxml"));

        // getting parameters of the primary display
        Rectangle2D primaryScreenBounds = Screen.getPrimary().getVisualBounds();

        Scene scene = new Scene(root, 400, primaryScreenBounds.getWidth());

        // load needed font
        FontLoader fontLoader = new FontLoader();
        fontLoader.loadFestusFont();

        // load custom css file
        scene.getStylesheets().add(getClass().getResource("/css/custom.css").toExternalForm());

        // set panel on the hider right corner of display
        primaryStage.setX(primaryScreenBounds.getMaxX() - scene.getWidth());
        primaryStage.setY(primaryScreenBounds.getMaxY() - primaryScreenBounds.getHeight());

        primaryStage.setTitle("Collapsible panel");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
