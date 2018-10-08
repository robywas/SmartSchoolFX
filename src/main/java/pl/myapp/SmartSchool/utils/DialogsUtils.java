package pl.myapp.SmartSchool.utils;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextArea;

import java.util.Optional;

public class DialogsUtils {


    public static void dialogAboutApplication(){
        Alert informationAlert = new Alert(Alert.AlertType.INFORMATION);
        informationAlert.setTitle("O aplikacji");
        informationAlert.setHeaderText("Smart School v. 1.0");
        informationAlert.setContentText("Aplikacja zarządzająca dla Smart School");
        informationAlert.showAndWait();
    }

    public static Optional<ButtonType> dialogExitCofirmation(){
        Alert exitConfirmation = new Alert(Alert.AlertType.CONFIRMATION);
        exitConfirmation.setTitle("Wyjście");
        exitConfirmation.setHeaderText("Czy na pewno chcesz wyjść z aplikacji?");
        Optional<ButtonType> result = exitConfirmation.showAndWait();
        return result;
    }

    public static void errorDialog(String error){
        Alert errorAlert = new Alert(Alert.AlertType.ERROR);
        errorAlert.setTitle("Bład");
        errorAlert.setHeaderText("Jakiś błąd");
        TextArea textArea = new TextArea(error);
        errorAlert.getDialogPane().setContent(textArea);

        errorAlert.showAndWait();
    }


}
