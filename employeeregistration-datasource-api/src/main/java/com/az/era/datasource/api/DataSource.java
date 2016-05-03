package com.az.era.datasource.api;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by aziarkash on 26-4-2016.
 */
public interface DataSource {

    /**
     * Get connection object from the datasource
     *
     * @return db connection object
     * @throws SQLException
     */
    Connection getConnection() throws SQLException;
}
