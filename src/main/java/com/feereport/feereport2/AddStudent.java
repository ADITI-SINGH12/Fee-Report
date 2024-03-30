package com.feereport.feereport2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

import java.sql.SQLException;

public class AddStudent {
    @FXML
    TextField name;
    @FXML
    TextField email;
    @FXML
    TextField contact;
    @FXML
    TextField address;
    @FXML
    TextField course;
    @FXML
    TextField fees;
    @FXML
    TextField dues;
    @FXML
    TextField paid;
    public void addstudent(ActionEvent event) throws SQLException, ClassNotFoundException {
        Student student = new Student(name.getText(), email.getText(), contact.getText(), address.getText(),
                course.getText(),Integer.parseInt(fees.getText()),Integer.parseInt(paid.getText())
                ,Integer.parseInt(dues.getText()));
        System.out.println(Integer.parseInt(fees.getText())-Integer.parseInt(paid.getText()));
        int status = StudentDao.save(student);
        System.out.println(status);
        if(status == 1){
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
}
