package com.az.era.service.api;

import java.sql.SQLException;

/**
 * Created by aziarkash on 26-4-2016.
 */
public interface EmployeeService {

    String getEmployeesCsv() throws SQLException;
}
