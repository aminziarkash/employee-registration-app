package com.az.era.dao.impl;

import com.az.era.dao.api.EmployeeDao;
import com.az.era.datasource.impl.DataSourceImpl;
import com.az.era.domain.api.Employee;
import com.az.era.domain.impl.EmployeeImpl;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by aziarkash on 26-4-2016.
 */
public class EmployeeDaoImpl implements EmployeeDao {

    private static final Logger LOGGER = Logger.getLogger(EmployeeDaoImpl.class.getName());

    @Override
    public void createEmployee(Employee employee) throws SQLException {
        Connection conn = null;
        try {
            conn = new DataSourceImpl().getConnection();
            PreparedStatement ps = conn.prepareStatement(Queries.INSERT_INTO_EMPLOYEES);
            ps.setString(1, employee.getFirstName());
            ps.setString(2, employee.getLastName());
            ps.setString(3, employee.getEmailAddress());
            ps.setInt(4, employee.getBsnNumber());
            ps.setDate(5, employee.getDateOfBirth());
            ps.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            conn.close();
        }
    }

    @Override
    public void updateEmployee(Employee employee) throws SQLException {

    }

    @Override
    public void deleteEmployee(String employeeFirstName) throws SQLException {
        Connection conn = null;
        try {
            conn = new DataSourceImpl().getConnection();
            String query = Queries.DELETE_FROM_EMPLOYEES_BY_FIRST_NAME + "'" + employeeFirstName + "'";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            conn.close();
        }
    }

    @Override
    public List<Employee> getEmployee() throws SQLException {
        LOGGER.log(Level.FINE, "Entering getEmployees() function");
        List<Employee> employeeList = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            conn = new DataSourceImpl().getConnection();
            ps = conn.prepareStatement(Queries.GET_EMPLOYEES_QUERY);
            rs = ps.executeQuery();
            while (rs.next()) {
                Employee employee = new EmployeeImpl();
                employee.setFirstName(rs.getString("FIRSTNAME"));
                employee.setLastName(rs.getString("LASTNAME"));
                employee.setEmailAddress(rs.getString("EMAILADDRESS"));
                employee.setBsnNumber(rs.getInt("BSNNUMBER"));
                employee.setDateOfBirth(rs.getDate("DATEOFBIRTH"));
                employeeList.add(employee);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            conn.close();
        }

        return employeeList;
    }
}
