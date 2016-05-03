package com.az.era.datasource.impl;

import com.az.era.dao.impl.EmployeeDaoImpl;
import com.az.era.datasource.api.DataSource;
import com.az.era.domain.api.Employee;
import com.az.era.domain.impl.EmployeeImpl;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by aziarkash on 26-4-2016.
 */
public class DataSourceImpl implements DataSource {

    private static final Logger LOGGER = Logger.getLogger(DataSourceImpl.class.getName());

    // private static final String CONNECTION_PROPERTIES = "/dbconnection.properties";

    private HikariDataSource dbDataSource;

    public DataSourceImpl() {
        init();
    }

    public Connection getConnection() throws SQLException {
        return dbDataSource.getConnection();
    }

    public static void main(String[] args) {
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
            for (int i = 0; i < 3; i++) {
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
    }

    public void init() {
        LOGGER.log(Level.FINE, "Entering init function");
        // final HikariConfig dbConfig = new HikariConfig(CONNECTION_PROPERTIES);
        final HikariConfig dbConfig = new HikariConfig();
        // jdbcUrl=jdbc:oracle:thin:@localhost:1521/xe
        // driverClassName=oracle.jdbc.OracleDriver
        dbConfig.setDriverClassName("oracle.jdbc.OracleDriver");
        dbConfig.setJdbcUrl("jdbc:oracle:thin:@localhost:1521/xe"); // TODO set jdbc url here
        dbConfig.setUsername("eradev");
        dbConfig.setPassword("eradev"); // more stuff can be set after this
        dbDataSource = new HikariDataSource(dbConfig);
    }

}
