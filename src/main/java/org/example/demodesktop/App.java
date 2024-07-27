package org.example.demodesktop;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.example.demodesktop.config.SessionManager;

import java.io.IOException;

import static org.example.demodesktop.utils.UIUtils.show;

public class App extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        if (SessionManager.isLoggedIn()) {
            FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("product-list-page.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            show(stage, scene);
        } else {
            FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("welcome-page.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            show(stage, scene);
        }
    }

    public static void main(String[] args) {
        launch();
    }
}