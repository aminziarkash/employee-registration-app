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

    private Date dateOfBirth;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public int getBsnNumber() {
        return bsnNumber;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }
}
