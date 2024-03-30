package com.feereport.feereport2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Button;

import java.io.IOException;

public class AccountantLogin {
 @FXML
 Button addstudent;
 @FXML
    Button viewstudent;
    @FXML
    Button editstudent;
    @FXML
    Button duefee;
    @FXML
    Button logout;
 @FXML
    public void logout(ActionEvent event) throws IOException {
     ((Node)event.getSource()).getScene().setRoot(FXMLLoader.load(getClass().getResource("hello-view.fxml")));

 }
    @FXML
    public void addstudents(ActionEvent event) throws IOException {
        ((Node)event.getSource()).getScene().setRoot(FXMLLoader.load(getClass().getResource("add-student.fxml")));

    }
}
