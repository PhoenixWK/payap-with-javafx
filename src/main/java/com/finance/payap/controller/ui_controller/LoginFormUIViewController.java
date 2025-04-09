package com.finance.payap.controller.ui_controller;

import com.finance.payap.utils.SceneManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginFormUIViewController implements Initializable {
    
    @FXML
    public BorderPane loginPane;
    public TextField email_field;
    public TextField password_field;
    public Button login_btn;
    public Button signup_btn;

    public void handleLogin(ActionEvent actionEvent) {
        String email = email_field.getText();
        String password = password_field.getText();

        if (email.equals("johndoe@gmail.com") && password.equals("12345")) {
            SceneManager.switchScene("/fxml/dashboard.fxml");
            SceneManager.setStageTitle("Dashboard");
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        this.signup_btn.setOnAction(e -> {
            SceneManager.switchScene("/fxml/signup-view.fxml");
            SceneManager.setStageTitle("Sign up");
        });
    }
}
