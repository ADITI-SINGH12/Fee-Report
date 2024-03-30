package com.feereport.feereport2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class AdminLogin {
    @FXML
    Button login;
    @FXML
    TextField username;
    @FXML
    PasswordField password;
    boolean flag = false;
    /* @FXML
     public void initialize() {
         login.setOnAction(this::checkCredentials);
     }*/
    //  ActionEvent event;
    public void checkCredentials(ActionEvent event) throws IOException {
        if(credentials(username.getText(),password.getText())){
            //   check(e)
            ((Node)event.getSource()).getScene().setRoot(FXMLLoader.load(getClass().getResource("admin-section.fxml")));
        }
    }
    public boolean credentials(String str1,String str2) {
        if (str1.toString().equals("admin") && str2.toString().equals("123")) {
            return true;
        }
        return false;
    }
}
