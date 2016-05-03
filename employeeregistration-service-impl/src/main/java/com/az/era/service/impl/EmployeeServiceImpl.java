package com.az.era.service.impl;

import com.az.era.dao.api.EmployeeDao;
import com.az.era.dao.impl.EmployeeDaoImpl;
import com.az.era.domain.api.Employee;
import com.az.era.domain.impl.EmployeeImpl;
import com.az.era.service.api.EmployeeService;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by aziarkash on 26-4-2016.
 */
public class EmployeeServiceImpl implements EmployeeService {

    private static EmployeeDao employeeDao = new EmployeeDaoImpl();

    private final Logger LOGGER = Logger.getLogger(EmployeeServiceImpl.class.getName());

    private static void createHardCodedEmployee() {
        Date dob = new Date(12, 12, 12);
        dob.setTime(dob.getDate());
        Employee testEmployee = new EmployeeImpl();
        testEmployee.setFirstName("Hardcoded");
        testEmployee.setLastName("Employee");
        testEmployee.setEmailAddress("h.c@gmail.com");
        testEmployee.setBsnNumber(987456357);
        testEmployee.setDateOfBirth(dob);

        try {
            employeeDao.createEmployee(testEmployee);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Delete the employee with firstname "Hardcoded"
    private static void deleteHardCodedEmployee() throws SQLException {
        try {
            employeeDao.deleteEmployee("Hardcoded");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Employee> getEmployees() throws SQLException {
        return employeeDao.getEmployee();
    }

    public static void main(String[] args) {
        // Get the employee list (for testing)
        EmployeeService employeeService = new EmployeeServiceImpl();
        try {
            // get the list of employees from the database
            employeeService.getEmployees();
            // add an employee to the database
            createHardCodedEmployee();
            // get the employee list again to see the update
            employeeService.getEmployees();
            // delete the hardcoded employee created earlier
            deleteHardCodedEmployee();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
