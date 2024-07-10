package org.example.demodesktop.utils;

import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class UIUtils {
    private UIUtils() {}

    // do effect bounce when move page
    public static void show(Stage primaryStage, Scene scene) {
        Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
        primaryStage.setX(screenBounds.getMinX());
        primaryStage.setY(screenBounds.getMinY());
        primaryStage.setWidth(screenBounds.getWidth());
        primaryStage.setHeight(screenBounds.getHeight());
        primaryStage.setTitle("Product Management");
        primaryStage.setScene(scene);

        primaryStage.setMaximized(true);
        primaryStage.show();
    }
}
