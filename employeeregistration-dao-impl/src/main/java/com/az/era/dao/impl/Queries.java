package com.az.era.dao.impl;

/**
 * Created by aziarkash on 29-4-2016.
 */
public class Queries {

    public static final String GET_EMPLOYEES_QUERY = "SELECT * FROM employees";

    public static final String INSERT_INTO_EMPLOYEES = "INSERT INTO employees VALUES (?,?,?,?,?)";

    public static final String DELETE_FROM_EMPLOYEES_BY_FIRST_NAME = "DELETE FROM employees WHERE firstname=";
}
