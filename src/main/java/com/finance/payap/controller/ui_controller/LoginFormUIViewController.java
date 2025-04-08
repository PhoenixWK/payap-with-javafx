package com.finance.payap.controller.ui_controller;

import com.finance.payap.utils.SceneManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

public class LoginFormUIViewController {
    
    @FXML
    public BorderPane loginPane;
    public TextField email_field;
    public TextField password_field;
    public Button login_btn;

    public void handleLogin(ActionEvent actionEvent) {
        String email = email_field.getText();
        String password = password_field.getText();

        if (email.equals("johndoe@gmail.com") && password.equals("12345")) {
            SceneManager.switchScene("/fxml/dashboard.fxml");
            SceneManager.setStageTitle("Dashboard");
        }
    }
}
