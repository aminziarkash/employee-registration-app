package com.az.era.dao.impl;

import com.az.era.dao.api.EmployeeDao;
import com.az.era.datasource.api.DataSource;
import com.az.era.datasource.impl.DataSourceImpl;
import com.az.era.domain.api.Employee;

import com.az.era.domain.impl.EmployeeImpl;
import com.google.inject.Provider;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by aziarkash on 26-4-2016.
 */
public class EmployeeDaoImpl implements EmployeeDao {

    private static final Logger LOGGER = Logger.getLogger(EmployeeDaoImpl.class.getName());

//    private final DataSource dataSource;
//
//    private final Provider<Employee> employeeProvider;

//    public EmployeeDaoImpl(final Provider<Employee> employee, final DataSource dataSource) {
//        employeeProvider = employee;
//        this.dataSource = dataSource;
//    }

    public void createEmployee(Employee employee) throws SQLException {

    }

    @Override
    public boolean insertEmployee(Employee employee) throws SQLException {
        return false;
    }

    public boolean updateEmployee(Employee employee) throws SQLException {
        return true;
    }

    public boolean deleteEmployee(Employee employee) throws SQLException {
        return true;
    }

    @Override
    public int addEmployeeToDatabase(Employee employee) throws SQLException {
//        try (Connection conn = dataSource.getConnection();
//             PreparedStatement stmt = conn.prepareStatement(Queries.GET_EMPLOYEES_QUERY)) {
//            final List<Object> arguments = new ArrayList<>();
//            arguments.add(employee.getFirstName());
//            arguments.add(employee.getLastName());
//            arguments.add(employee.getEmailAddress());
//            arguments.add(employee.getEmailAddress());
//            arguments.add(employee.getDateOfBirth());
//            DataBaseUtil.setArguments(stmt, arguments);
//            return stmt.executeUpdate();
//        }

        return 0;
    }

    @Override
    public List<Employee> getEmployee() throws SQLException {

        List<Employee> employeeList = new ArrayList<>();

        try (Connection conn = new DataSourceImpl().getConnection();
             PreparedStatement stmt = conn.prepareStatement(Queries.GET_EMPLOYEES_QUERY)) {
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                System.out.println("found employee");
            }
        }

//        try (Connection conn = dataSource.getConnection();
//             PreparedStatement stmt = conn.prepareStatement(Queries.GET_EMPLOYEES_QUERY);
//             ResultSet rs = stmt.executeQuery()) {
//            while (rs.next()) {
//                Employee employee = new EmployeeImpl();
//                employee.getFirstName();
//                employeeList.add(employee);
//            }
//        }
        return employeeList;
//        ResultSet rs = null;
//        Employee employee = null;
//        final List<Employee> employeeList = new ArrayList<>();
//        try (Connection conn = dataSource.getConnection();
//             PreparedStatement stmt = conn.prepareStatement(Queries.GET_EMPLOYEES_QUERY)) {
//            rs = stmt.executeQuery();
//
//            while(rs.next()) {
//                final Employee employee1 = new EmployeeImpl();
//                employee.getFirstName();
//                System.out.println("Found employee");
//            }
//        }
//        return employeeList;
//        return null;
    }

//    public Employee getEmployee(String firstName) throws SQLException {
//        ResultSet rs = null;
//
//        Employee employee = null;
//
//        try (Connection conn = dataSource.getConnection();
//             PreparedStatement stmt = conn.prepareStatement(Queries.GET_EMPLOYEES_QUERY)) {
//            final List<Object> arguments = new ArrayList<Object>();
//            arguments.add(firstName);
//            rs = stmt.executeQuery();
//
//            while(rs.next()) {
//                final Employee employee1 = employeeProvider.get();
//                employee.getFirstName();
//                System.out.println("Found employee");
//            }
//        }
//        return null;
//    }
}
