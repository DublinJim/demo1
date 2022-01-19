package com.example.demo1;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneController {
    @FXML
    private Button btn1;

    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    public void switchToScene2() throws IOException {
        FXMLLoader root = new FXMLLoader(SceneSwitchMain.class.getResource("scene2.fxml"));
        Stage stage = (Stage) btn1.getScene().getWindow();
        stage.setScene(new Scene(root.load()));
    }
}