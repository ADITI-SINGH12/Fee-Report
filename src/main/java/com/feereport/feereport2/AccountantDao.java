package com.feereport.feereport2;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.*;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AccountantDao {

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        java.sql.Connection conn;
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/ accountant";
        String username = "root";
        String password = "Aditi@12345";
        conn = DriverManager.getConnection(url,username,password);
        return conn;
    }
    public static int save(Accountant accountant) throws SQLException, ClassNotFoundException {
        int status = 0;
        Connection conn = getConnection();
        PreparedStatement preparedStatement = conn.prepareStatement("Insert into  accountants(name,password,email,contactNo) values(?,?,?,?)");
        preparedStatement.setString(1, accountant.getName());
        preparedStatement.setString(2, accountant.getPassword());
        preparedStatement.setString(3, accountant.getEmail());
        preparedStatement.setString(4, accountant.getContactNo());
        status = preparedStatement.executeUpdate();
        return status;
    }

    public static ArrayList<Accountant> viewAllAccounatnt() throws SQLException, ClassNotFoundException {
        Connection conn = getConnection();
        String sql = "Select * from accountants";
        Statement stmt = conn.createStatement();
        ResultSet resultSet = stmt.executeQuery(sql);
        ArrayList<Accountant> accountantss = new ArrayList<>();
        //ObservableList<Accountant> accountants = FXCollections.observableArrayList();
        while(resultSet.next()){
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String password = resultSet.getString("password");
            String email = resultSet.getString("email");
            String  contactNo = resultSet.getString("contactNo");
            System.out.println(id+name+password+email+contactNo);
            accountantss.add(new Accountant(id,name,password,email,contactNo));
        }
    return accountantss;
    }
}
