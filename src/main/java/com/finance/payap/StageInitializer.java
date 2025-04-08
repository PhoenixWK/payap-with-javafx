package com.finance.payap;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationListener;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

@Component
public class StageInitializer implements ApplicationListener<PayapApplication.StageReadyEvent> {
    @Value("classpath:/fxml/hello.fxml")
    private Resource resource;

    @Override
    public void onApplicationEvent(PayapApplication.StageReadyEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(PayapApplication.class.getResource("/fxml/hello.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = event.getStage();
            stage.setTitle("Payap Finance Tracker");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
