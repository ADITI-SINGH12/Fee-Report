package com.feereport.feereport2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentDao {
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        java.sql.Connection conn;
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/ accountant";
        String username = "root";
        String password = "Aditi@12345";
        conn = DriverManager.getConnection(url,username,password);
        return conn;
    }
    public static int save(Student student) throws SQLException, ClassNotFoundException {
        int status=0;
        Connection connection = getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("Insert into   students(name,email,contactno,address,course,fees,paid,due) values(?,?,?,?,?,?,?,?)");
        preparedStatement.setString(1,student.getName());
        preparedStatement.setString(2, student.getEmail());
        preparedStatement.setString(3, student.getContactno());
        preparedStatement.setString(4, student.getAddress());
        preparedStatement.setString(5, student.getCourse());
        preparedStatement.setInt(6,student.getFees());
        preparedStatement.setInt(7,student.getPaid());
        preparedStatement.setInt(8,student.getDues());
        status = preparedStatement.executeUpdate();
        return status;
    }
}
