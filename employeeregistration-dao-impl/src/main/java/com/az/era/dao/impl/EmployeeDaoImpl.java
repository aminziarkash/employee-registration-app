package com.az.era.dao.impl;

import com.az.era.dao.api.EmployeeDao;
import com.az.era.datasource.api.DataSource;
import com.az.era.domain.api.Employee;

import java.sql.SQLException;
import java.util.logging.Logger;

/**
 * Created by aziarkash on 26-4-2016.
 */
public class EmployeeDaoImpl implements EmployeeDao {

    private static final Logger LOGGER = Logger.getLogger(EmployeeDaoImpl.class.getName());

    private final DataSource dataSource;

    public EmployeeDaoImpl(final DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void createEmployee(Employee employee) throws SQLException {

    }

    public void updateEmployee(Employee employee) throws SQLException {

    }

    public void deleteEmployee(Employee employee) throws SQLException {

    }
}
