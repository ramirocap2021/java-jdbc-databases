package com.pluralsight.order.dao;

import com.pluralsight.order.dto.ParamsDto;
import com.pluralsight.order.util.ExceptionHandler;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * DAO to update an order
 */
public class UpdateOrderDao {
    private String query = "UPDATE orders o SET o.order_status = ? WHERE o.order_id = ?";

    /**
     * Updates the status of an order
     * @param paramsDTO Object with the parameters for the operation
     * @return Number of affected rows
     */
    public int updateOrderStatus(ParamsDto paramsDTO) {
        int numberResults = 0;

        try (Connection con = null;
             PreparedStatement ps = createPreparedStatement(con, paramsDTO)
        ) {

        } catch (SQLException ex) {
            ExceptionHandler.handleException(ex);
        }

        return numberResults;
    }

    /**
     * Creates a PreparedStatement object to update the order
     * @param con Connnection object
     * @param paramsDTO Object with the parameters to set on the PreparedStatement
     * @return A PreparedStatement object
     * @throws SQLException In case of an error
     */
    private PreparedStatement createPreparedStatement(Connection con, ParamsDto paramsDTO) throws SQLException {

        return null;
    }
}