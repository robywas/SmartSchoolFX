package pl.myapp.SmartSchool.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.ToggleGroup;

public class TopMenuButtonsController {


    public static final String STUDENTS_FXML = "/fxml/Students.fxml";
    public static final String TEACHERS_FXML = "/fxml/Teachers.fxml";
    public static final String COURSES_FXML = "/fxml/Courses.fxml";
    public static final String INCOMES_FXML = "/fxml/Incomes.fxml";
    public static final String STATISTICS_FXML = "/fxml/Statistics.fxml";
    public static final String ADD_STUDENT_FXML = "/fxml/AddStudent.fxml";


    private MainController mainController;

    @FXML
    ToggleGroup toggleButtons;

    @FXML
    public void openStudents() {
        mainController.setCenter(STUDENTS_FXML);
    }

    @FXML
    public void openTeachers() {
        mainController.setCenter(TEACHERS_FXML);
    }

    @FXML
    public void openCourses() {
        mainController.setCenter(COURSES_FXML);
    }

    @FXML
    public void openIncomes() {
        mainController.setCenter(INCOMES_FXML);

    }

    @FXML
    public void openStats() {
        mainController.setCenter(STATISTICS_FXML);

    }

    @FXML
    public void addStudent() {
        mainController.setCenter(ADD_STUDENT_FXML);

    }

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }
}
