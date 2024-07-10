package org.example.demodesktop.view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.example.demodesktop.App;

import java.io.IOException;

import static org.example.demodesktop.utils.UIUtils.show;

public class RegisterPage extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("register-page.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);

        show(primaryStage, scene);
    }
}
