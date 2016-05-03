package com.az.era.service.impl;

import com.az.era.dao.api.EmployeeDao;
import com.az.era.dao.impl.EmployeeDaoImpl;
import com.az.era.datasource.impl.DataSourceImpl;
import com.az.era.domain.api.Employee;
import com.az.era.domain.impl.EmployeeImpl;
import com.az.era.service.api.EmployeeService;
import com.sun.glass.ui.EventLoop;
import com.sun.org.apache.xpath.internal.operations.Number;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/**
 * Created by aziarkash on 26-4-2016.
 */
public class EmployeeServiceImpl implements EmployeeService {

    private final Logger LOGGER = Logger.getLogger(EmployeeServiceImpl.class.getName());

    private EmployeeDao employeeDao;

    public String getEmployeesCsv() throws SQLException {
        return null;
    }

    @Override
    public List<Employee> getEmployees() throws SQLException {
        Employee employee = new EmployeeImpl();
        employee.setFirstName("Amin");
        employeeDao.createEmployee(employee);
        return employeeDao.getEmployee();
    }

    private Employee createEmployee() {

        java.sql.Date dob = new java.sql.Date(12, 12, 12);
        dob.setTime(dob.getDate());
        Employee testEmployee = new EmployeeImpl();
        testEmployee.setFirstName("Nakib");
        testEmployee.setLastName("Ziarkash");
        testEmployee.setEmailAddress("a.ziarkash@gmail.com");
        testEmployee.setBsnNumber(123456789);
        testEmployee.setDateOfBirth(dob);

        Connection conn = null;
        Statement stmt = null;

        try {
            conn = new DataSourceImpl().getConnection();
            stmt = conn.createStatement();
            for (int i = 0; i < 33; i++) {
                String query = "insert into employees values (?,?,?,?,?)";
                PreparedStatement ps = conn.prepareStatement(query);
                ps.setString(1, testEmployee.getFirstName());
                ps.setString(2, testEmployee.getLastName());
                ps.setString(3, testEmployee.getEmailAddress());
                ps.setInt(4, testEmployee.getBsnNumber());
                ps.setDate(5, testEmployee.getDateOfBirth());
                ps.executeQuery();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return testEmployee;
    }

    public static void main(String[] args) {

        Connection conn = null;
        EmployeeDao employeeDao = new EmployeeDaoImpl();

        try {
            conn = new DataSourceImpl().getConnection();
            List<Employee> employees = employeeDao.getEmployee();

        } catch(SQLException e) {
            e.printStackTrace();
        }

    }
}
