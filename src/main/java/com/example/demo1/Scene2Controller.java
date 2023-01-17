package com.example.demo1;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class Scene2Controller {

    @FXML
    private Button btn1;




    @FXML
    public void switchToScene2() throws IOException {

        getTheScene("scene.fxml");
    }

    private void getTheScene(String fxmlFile) throws IOException {
        FXMLLoader root = new FXMLLoader(SceneSwitchMain.class.getResource(fxmlFile));
        Stage stage = (Stage) btn1.getScene().getWindow();
        stage.setScene(new Scene(root.load()));
    }

}


//stage=((Node)event.getSource()).getScene().getWindow();