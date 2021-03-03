package com.intelizest.projectIZ.Model;

import javax.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @Column
    private int id;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private String emailId;
    @Column
    private String phonenumber;
    @Column
    private String username;

    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id =  id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}