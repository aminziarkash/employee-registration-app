package com.az.era.domain.api;

import java.util.Date;

/**
 * Created by aziarkash on 26-4-2016.
 */
public interface Employee {

    /**
     * Get the first name for the employee
     * @return
     */
    String getFirstName();

    /**
     * Get the last name for the employee
     * @return
     */
    String getLastName();

    /**
     * Get employees email address
     * @return
     */
    String getEmailAddress();

    /**
     * Get employees Burger Service Nummer
     * @return
     */
    int getBsnNumber();

    /**
     * Get the date of birth for the employee
     * @return
     */
    Date getDateOfBirth();

}
