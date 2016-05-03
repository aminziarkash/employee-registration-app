package com.az.era.service.api;

import com.az.era.domain.api.Employee;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by aziarkash on 26-4-2016.
 */
public interface EmployeeService {

    /**
     * @return the list of employees from local database
     */
    List<Employee> getEmployees() throws SQLException;


}
