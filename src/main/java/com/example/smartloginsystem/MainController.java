package com.example.smartloginsystem;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class MainController {

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void openStudentPanel(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("student_login.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void openTeacherPanel(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("teacher_login.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
