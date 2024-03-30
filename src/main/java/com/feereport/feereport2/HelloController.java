package com.feereport.feereport2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

    private Parent root;
    private Stage stage;
    private Scene scene;
    @FXML
    private Button adminlogin;
    @FXML
    private Button accountantlogin;

    @FXML
    public void login(ActionEvent event) throws IOException {
        ((Node)event.getSource()).getScene().setRoot(FXMLLoader.load(getClass().getResource("admin-login.fxml")));

    }
    @FXML
    public void setAccountantlogin(ActionEvent event) throws IOException {
        ((Node)event.getSource()).getScene().setRoot(FXMLLoader.load(getClass().getResource("accountant-login.fxml")));

    }
}