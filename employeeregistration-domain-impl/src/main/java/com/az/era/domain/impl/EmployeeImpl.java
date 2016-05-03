package com.az.era.domain.impl;

import com.az.era.domain.api.Employee;

import java.util.Date;

/**
 * Created by aziarkash on 26-4-2016.
 */
public class EmployeeImpl implements Employee {

    private String firstName;

    private String lastName;

    private String emailAddress;

    private int bsnNumber;

    private java.sql.Date dateOfBirth;

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

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public int getBsnNumber() {
        return bsnNumber;
    }

    public void setBsnNumber(int bsnNumber) {
        this.bsnNumber = bsnNumber;
    }

    public java.sql.Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(java.sql.Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
