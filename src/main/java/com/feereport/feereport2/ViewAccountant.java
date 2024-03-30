package com.feereport.feereport2;

import javafx.beans.Observable;
import javafx.application.Application;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class ViewAccountant  {
    @FXML
    TableView<Accountant> lists;
    @FXML
    TableColumn<Accountant,Integer> id ;
    @FXML
    TableColumn<Accountant,String> name;
    @FXML
    TableColumn<Accountant,String> password;
    @FXML
    TableColumn<Accountant,String> email ;
    @FXML
    TableColumn<Accountant,String> contactNo ;
    @FXML
    Button backs;

    public void initialize() throws SQLException, ClassNotFoundException {
        id.setCellValueFactory(
                new PropertyValueFactory<Accountant,Integer>("id")
        );
        name.setCellValueFactory(
                new PropertyValueFactory<Accountant,String>("name")
        );
        password.setCellValueFactory(
                new PropertyValueFactory<Accountant,String>("password")
        );
        email.setCellValueFactory(
                new PropertyValueFactory<Accountant,String>("email")
        );
       if(contactNo != null) {
           contactNo.setCellValueFactory(
                   new PropertyValueFactory<Accountant, String>("contactNo")
           ); //contactNo
       }
        lists.setItems(getData());
        //lists.getColumns().addAll(id,name,password,email,contactNo);
    }

    @FXML
    public void backs(ActionEvent event) throws IOException, SQLException, ClassNotFoundException {
         ((Node)event.getSource()).getScene().setRoot(FXMLLoader.load(getClass().getResource("admin-section.fxml")));
       //AccountantDao.viewAllAccounatnt();
    }





    public ObservableList<Accountant>  getData() throws SQLException, ClassNotFoundException {
        ArrayList<Accountant>  arr  = AccountantDao.viewAllAccounatnt();
        ObservableList<Accountant> data = FXCollections.observableArrayList();

        for(int i=0;i<arr.size();i++){
            //System.out.println(arr.get(i));
            data.add(arr.get(i));
        }
        return data;
    }
}
