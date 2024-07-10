package org.example.demodesktop.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.example.demodesktop.view.RegisterPage;

import java.io.IOException;
import java.util.logging.Logger;

public class LoginController {

    private static final Logger log = Logger.getLogger(LoginController.class.getName());

    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Button loginButton;
    @FXML
    private Button registerButton;

    @FXML
    private void handleLogin() {
        // print to log
        log.info("handle login clicked");
        // logic to handle login
    }

    @FXML
    private void handleRegister() throws IOException {
        // print to log
        log.info("handle register clicked");
        // go to register page
        new RegisterPage().start((Stage) registerButton.getScene().getWindow());
    }
}
