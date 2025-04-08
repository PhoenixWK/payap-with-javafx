package com.finance.payap.controller.ui_controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

public class DashboardUiController implements Initializable {
    @FXML
    private Button budget_btn;

    @FXML
    private Button cards_btn;

    @FXML
    private Button dashboard_btn;

    @FXML
    private Button transactions_btn;

    @FXML
    private BorderPane main_content;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        dashboard_btn.setOnAction(e -> {
            setActiveButton(dashboard_btn);
            loadView("/fxml/dashboard-content-view.fxml");
        });
        transactions_btn.setOnAction(e -> {
            setActiveButton(transactions_btn);
            loadView("/fxml/transactions-view.fxml");
        });
        budget_btn.setOnAction(e -> {
            setActiveButton(budget_btn);
            loadView("/fxml/budget-view.fxml");
        });
        cards_btn.setOnAction(e -> {
            setActiveButton(cards_btn);
            loadView("/fxml/cards-view.fxml");
        });
    }

    private void setActiveButton(Button activeButton) {
        // Reset all buttons to default style
        dashboard_btn.setStyle("-fx-background-color: transparent;");
        transactions_btn.setStyle("-fx-background-color: transparent;");
        budget_btn.setStyle("-fx-background-color: transparent;");
        cards_btn.setStyle("-fx-background-color: transparent;");

        // Set active style for clicked button
        activeButton.setStyle("-fx-background-color: #434343;");
    }

    private void loadView(String fxmlPath) {
        try {
            main_content.setCenter(null);
            main_content.setTop(null);
            main_content.setBottom(null);
            main_content.setLeft(null);
            main_content.setRight(null);
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlPath));
            main_content.setCenter(loader.load());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
