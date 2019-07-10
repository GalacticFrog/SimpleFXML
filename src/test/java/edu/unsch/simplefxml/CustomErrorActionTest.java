package edu.unsch.simplefxml;

import edu.unsch.jfxtest.SampleIncorrectView;
import edu.unsch.jfxtest.TestApp;
import edu.unsch.jfxtest.SampleView;
import edu.unsch.simplefxml.FxApplication;
import edu.unsch.simplefxml.SplashScreen;
import javafx.scene.image.Image;
import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.*;
import org.testfx.api.FxToolkit;

import java.util.*;

import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.*;

public class CustomErrorActionTest {

    private FxApplication app;

    ErrorAction errorAction;

    @BeforeAll
    public static void beforeClass() {
        System.setProperty("testfx.headless", "true");
    }

    @AfterAll
    public static void afterClass() {
        System.setProperty("testfx.headless", "false");
    }

    @BeforeEach
    public void setup() throws Exception {
        errorAction = mock(ErrorAction.class);
        FxToolkit.registerPrimaryStage();
        app = new TestApp();
        app.savedInitialView = SampleView.class;
        app.splashScreen = new SplashScreen();
        app.setErrorAction(throwable -> errorAction.action());
        FxToolkit.setupApplication(() -> app);
    }

//    @Test
//    @DisplayName ("Custom error action is executed")
//    public void loadDefaultIcons() {
//        FxApplication.showInitialView(SampleIncorrectView.class);
//        verify(errorAction, times(2)).action();
//    }
}

interface ErrorAction {

    void action();
}
