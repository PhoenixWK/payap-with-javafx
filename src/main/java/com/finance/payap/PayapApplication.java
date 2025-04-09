package com.finance.payap;

import java.io.IOException;
import java.util.Objects;

import com.finance.payap.utils.SceneManager;
import javafx.scene.image.Image;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ConfigurableApplicationContext;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PayapApplication extends Application {

	private ConfigurableApplicationContext applicationContext;

	@Override
	public void init() {
		this.applicationContext = new SpringApplicationBuilder(PayapApplication.class).run();
	}

	@Override
	public void start(Stage stage) throws IOException {
		SceneManager.setStage(stage);
		FXMLLoader fxmlLoader = new FXMLLoader(PayapApplication.class.getResource("/fxml/login-view.fxml"));
		Scene scene = new Scene(fxmlLoader.load());
		stage.setTitle("Payap Finance Tracker");
		stage.getIcons().add(new Image(Objects.requireNonNull(PayapApplication.class.getResourceAsStream("/images/Payap.png"))));
		stage.setScene(scene);
		stage.setResizable(false);
		stage.show();
	}

	@Override
	public void stop() {
		applicationContext.close();
		Platform.exit();
	}

	static class StageReadyEvent extends ApplicationEvent {
		public StageReadyEvent(Stage stage) {
			super(stage);
		}

		public Stage getStage() {
			return ((Stage) getSource());
		}
	}
}
