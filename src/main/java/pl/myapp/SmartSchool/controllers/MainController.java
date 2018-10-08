package pl.myapp.SmartSchool.controllers;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import pl.myapp.SmartSchool.utils.DialogsUtils;
import pl.myapp.SmartSchool.utils.FxmlUtils;

import java.io.IOException;
import java.util.Optional;

public class MainController {

    @FXML
    BorderPane borderPane;

    @FXML
    TopMenuButtonsController topMenuButtonsController;

    @FXML
    private void initialize() {
        topMenuButtonsController.setMainController(this);
    }

    public void setCenter(String fxmlPath) {
    borderPane.setCenter(FxmlUtils.fxmlLoader(fxmlPath));
    }


    public void closeApplication() {

        Optional<ButtonType> result = DialogsUtils.dialogExitCofirmation();
        if (result.get() == ButtonType.OK) {
            Platform.exit();
            System.exit(0);
        }
    }

    public void setCaspian() {
        Application.setUserAgentStylesheet(Application.STYLESHEET_CASPIAN);
    }

    public void setModena() {
        Application.setUserAgentStylesheet(Application.STYLESHEET_MODENA);
    }

    public void alwaysOnTop(ActionEvent actionEvent) {
        Stage stage = (Stage) borderPane.getScene().getWindow();
        boolean value = ((CheckMenuItem) actionEvent.getSource()).selectedProperty().get();

        stage.setAlwaysOnTop(value);

    }

    public void about() {
        DialogsUtils.dialogAboutApplication();
    }
}
