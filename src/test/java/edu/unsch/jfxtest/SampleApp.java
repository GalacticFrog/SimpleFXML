package edu.unsch.jfxtest;

import edu.unsch.simplefxml.AbstractJavaFxApplicationSupport;
import edu.unsch.simplefxml.SplashScreen;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.*;

import javafx.stage.*;

@SpringBootApplication
public class SampleApp extends AbstractJavaFxApplicationSupport {

    public static void main(String args[]) {
        launch(SampleApp.class, SampleView.class, new SplashScreen(), args);
    }

    @Override
    public void beforeInitialView(Stage stage, ConfigurableApplicationContext ctx) {
        stage.setTitle("Sample app");
    }

    @Override
    public void beforeShowingSplash(Stage splashStage) {
        splashStage.setTitle("Sample splash");
    }
}