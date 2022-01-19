package com.example.demo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class Scene2Controller {
    private Stage stage;
    private Scene scene;
    private Parent parent;

    @FXML
    private Label lbl1;
    @FXML
    private Button btn1;

public void switchToScene2(ActionEvent event) throws IOException
{
    FXMLLoader root = new FXMLLoader(SceneSwitchMain.class.getResource("scene.fxml"));
    Scene scene = new Scene(root.load());
    stage.setScene(scene);
    stage.show();
}

}



//stage=((Node)event.getSource()).getScene().getWindow();