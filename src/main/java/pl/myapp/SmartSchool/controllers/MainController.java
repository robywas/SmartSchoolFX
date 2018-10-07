package pl.myapp.SmartSchool.controllers;

import javafx.fxml.FXML;
import javafx.scene.layout.BorderPane;

public class MainController {

    @FXML
    BorderPane borderPane;

    @FXML
    TopMenuButtonsController topMenuButtonsController;

    @FXML
    private void initialize() {
        topMenuButtonsController.setMainController(this);
    }

}
