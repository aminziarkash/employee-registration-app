package com.az.era.dao.api;

import com.az.era.domain.api.Employee;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by aziarkash on 26-4-2016.
 */
public interface EmployeeDao {

    /**
     * Create the employee in the database
     *
     * @param employee
     * @throws SQLException
     */
    void createEmployee(Employee employee) throws SQLException;


    boolean insertEmployee(Employee employee) throws SQLException;
    boolean updateEmployee(Employee employee) throws SQLException;
    boolean deleteEmployee(Employee employee) throws SQLException;


    /**
     * Update the employee in the database
     *
     * @param employee
     * @throws SQLException
     */
//    void updateEmployee(Employee employee) throws SQLException;

    /**
     * Delete the employee from the database
     *
     * @param employee
     * @throws SQLException
     */
//    void deleteEmployee(Employee employee) throws SQLException;


    int addEmployeeToDatabase(Employee employee) throws SQLException;


    /**
     * Get employee using name
     * @return
     * @throws SQLException
     */
    List<Employee> getEmployee() throws SQLException;

}
