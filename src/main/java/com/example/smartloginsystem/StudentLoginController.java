package com.example.smartloginsystem;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.EventObject;

public class StudentLoginController {

    private Stage stage;
    private Scene scene;
    private Parent root;

@FXML
public void handleLogin(ActionEvent actionEvent) throws IOException {
    FXMLLoader loader = new FXMLLoader(getClass().getResource("dashboard.fxml"));
    Parent root = loader.load();

    Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
    stage.setScene(new Scene(root));
    stage.setTitle("Find Supervisor");
    stage.show();
}

    public void handleRegister(ActionEvent event) throws IOException {
        System.out.println("Register button clicked"); // Debug line
        root = FXMLLoader.load(getClass().getResource("student_register.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }


    public void goBack(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Main.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }


    public void goToLogin(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("student_login.fxml"));
        Parent root = loader.load();

        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Find Supervisor");
        stage.show();
    }
}
