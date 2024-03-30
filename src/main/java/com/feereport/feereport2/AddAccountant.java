package com.feereport.feereport2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.sql.SQLException;

public class AddAccountant {
    @FXML
    private Button addacc;
    @FXML
    private TextField name;
    @FXML
    private PasswordField password;
    @FXML
    private TextField email;
    @FXML
    private TextField contact;
     @FXML
    Button back;
    @FXML
    public void addAccountants(ActionEvent event) throws SQLException, ClassNotFoundException {
        Accountant accountant = new Accountant();
        accountant.setName(name.getText());
        accountant.setPassword(password.getText());
        accountant.setEmail(email.getText());
        accountant.setContactNo(contact.getText());
        int status = AccountantDao.save(accountant);
        System.out.println(status);
        System.out.println(event.isConsumed());
        if(status == 1) {

            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Submission Result");
            alert.setContentText("Accountant is added successfully!!");
            alert.showAndWait();
        }else{
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Submission Result");
            alert.setContentText("Accountant is not added!!");
            alert.showAndWait();
        }
    }
    @FXML
    public void back(ActionEvent event) throws IOException {
        ((Node)event.getSource()).getScene().setRoot(FXMLLoader.load(getClass().getResource("admin-section.fxml")));
    }
}
