package com.feereport.feereport2;

public class Student {
    private String name,email,contactno,address,course;
    private int id,fees,paid,dues;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactno() {
        return contactno;
    }

    public void setContactno(String contactno) {
        this.contactno = contactno;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFees() {
        return fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }

    public int getPaid() {
        return paid;
    }

    public void setPaid(int paid) {
        this.paid = paid;
    }

    public int getDues() {
        return dues;
    }

    public void setDues(int dues) {
        this.dues = dues;
    }

    public Student(String name, String email, String contactno, String address, String course,  int fees, int paid, int dues) {
        this.name = name;
        this.email = email;
        this.contactno = contactno;
        this.address = address;
        this.course = course;
        this.fees = fees;
        this.paid = paid;
        this.dues = dues;
    }

    public Student() {
    }
}
