module com.finance.payap {
    requires javafx.controls;
    requires javafx.fxml;
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.context;
    requires spring.core;
    requires spring.beans;
    requires spring.web;
    requires java.base;
    requires java.desktop;
    requires java.logging;
    requires java.sql;
    requires java.xml;
    
    exports com.finance.payap;
    exports com.finance.payap.controller.ui_controller;

    opens com.finance.payap to spring.beans, spring.context, javafx.fxml;
    opens com.finance.payap.controller.ui_controller to javafx.fxml;
}