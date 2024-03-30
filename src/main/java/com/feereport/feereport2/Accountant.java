package com.feereport.feereport2;

import javafx.beans.property.SimpleStringProperty;

public class Accountant {
    private int id;
    private String name,password,email,contactNo;

    //private  SimpleStringProperty password1;

    public Accountant(int id, String name, String password, String email, String contactNo) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
        this.contactNo = contactNo;
    }
    public Accountant(String name, String password, String email, String contactNo) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
        this.contactNo = contactNo;
    }



    public Accountant() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }
}
