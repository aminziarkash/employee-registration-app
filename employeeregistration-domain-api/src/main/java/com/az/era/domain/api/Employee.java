package com.az.era.domain.api;

import java.sql.Date;

/**
 * Created by aziarkash on 26-4-2016.
 */
public interface Employee {

    /**
     * Get the first name for the employee
     * @return
     */
    String getFirstName();

    void setFirstName(String firstName);

    /**
     * Get the last name for the employee
     * @return
     */
    String getLastName();

    void setLastName(String lastName);

    /**
     * Get employees email address
     * @return
     */
    String getEmailAddress();

    void setEmailAddress(String emailAddress);

    /**
     * Get employees Burger Service Nummer
     * @return
     */
    int getBsnNumber();

    void setBsnNumber(int bsnNumber);

    /**
     * Get the date of birth for the employee
     * @return
     */
    java.sql.Date getDateOfBirth();

    void setDateOfBirth(Date dateOfBirth);
}
