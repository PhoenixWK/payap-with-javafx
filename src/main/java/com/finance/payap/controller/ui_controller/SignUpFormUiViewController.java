package com.finance.payap.controller.ui_controller;

import com.finance.payap.utils.SceneManager;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class SignUpFormUiViewController implements Initializable {
    
    @FXML
    public Button login_btn;
    public Button signup_btn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        this.login_btn.setOnAction(e -> {
            SceneManager.switchScene("/fxml/login-view.fxml");
            SceneManager.setStageTitle("Payap finance tracker");
        });
    }
}
