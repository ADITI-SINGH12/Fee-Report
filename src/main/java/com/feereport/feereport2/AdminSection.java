package com.feereport.feereport2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Button;

import java.io.IOException;

public class AdminSection {
    @FXML
    Button addAccountant;
    @FXML
    public void addAccountants(ActionEvent event) throws IOException {
        ((Node)event.getSource()).getScene().setRoot(FXMLLoader.load(getClass().getResource("add-accountant.fxml")));
    }
    @FXML
    Button viewAccountant;
    @FXML
    public void viewAccountants(ActionEvent event) throws IOException {
        ((Node)event.getSource()).getScene().setRoot(FXMLLoader.load(getClass().getResource("view-accountant.fxml")));
    }
}
