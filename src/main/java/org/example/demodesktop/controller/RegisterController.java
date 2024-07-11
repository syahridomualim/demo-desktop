package org.example.demodesktop.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.example.demodesktop.repository.UserRepository;
import org.example.demodesktop.view.LoginPage;

import java.io.IOException;
import java.util.logging.Logger;

public class RegisterController {

    private static final Logger log = Logger.getLogger(RegisterController.class.getName());
    private final UserRepository userRepository = new UserRepository();

    @FXML
    private TextField usernameField;
    @FXML
    private TextField firstNameField;
    @FXML
    private TextField lastNameField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Button registerButton;

    @FXML
    private void handleRegister() {
        // print to log
        log.info("register button clicked");
        // logic to handle register
        try {
            // init all field

            // validate input user, if not valid show error alert

            // validate user in table

            // create user object

            // save data into table

            // back to login page
        } catch (Exception exception) {
            // print the error in console
            log.warning("Error occurred: " + exception);
        }

    }

    @FXML
    private void handleBack() throws IOException {
        // print to log
        log.info("back button clicked");
        // go to previous page
        new LoginPage().start((Stage) registerButton.getScene().getWindow());
    }
}
