package pl.myapp.SmartSchool.controllers;

import javafx.fxml.FXML;

public class TopMenuButtonsController {


    private MainController mainController;


    @FXML
    public void openStudents() {
        System.out.println("Students");
    }

    @FXML
    public void openTeachers() {
        System.out.println("Teachers");
    }

    @FXML
    public void openCourses() {
        System.out.println("Courses");
    }

    @FXML
    public void openIncomes() {
        System.out.println("Incomes");

    }

    @FXML
    public void openStats() {
        System.out.println("Stats");

    }

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }
}
