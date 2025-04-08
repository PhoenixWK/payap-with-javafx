package com.finance.payap;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import javafx.application.Application;

@SpringBootApplication
public class PayapUiApplication {
    public static void main(String[] args) {
        // Set JavaFX properties to suppress warnings
        System.setProperty("javafx.verbose", "false");
        System.setProperty("prism.verbose", "false");
        System.setProperty("javafx.animation.framerate", "60");
        
        Application.launch(PayapApplication.class, args);
    }
}
