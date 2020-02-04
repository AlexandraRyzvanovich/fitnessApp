package com.epam.webapp.dao.Impl;

import com.epam.webapp.dao.AbstractDao;
import com.epam.webapp.dao.OrderDao;
import com.epam.webapp.entity.Identifiable;
import com.epam.webapp.entity.Order;
import com.epam.webapp.exception.DaoException;

import java.sql.Connection;
import java.util.List;
import java.util.Optional;

public class OrderDaoImpl extends AbstractDao<Order> implements OrderDao {
    private static final String GET_BY_ID_QUERY = "SELECT * FROM order WHERE id = ?";

    public OrderDaoImpl(Connection connection) {
        super(connection);
    }

    @Override
    protected String getTableName() {
        return Order.ORDER_TABLE_NAME;
    }

    @Override
    public Optional getById(Long id) throws DaoException {
        return executeForStringResult(GET_BY_ID_QUERY, id);
    }

    @Override
    public void save(Order item) throws DaoException {

    }

    @Override
    public void update(String query, Object... objects) throws DaoException {

    }

    @Override
    public void removeById(Long id) throws DaoException {
        throw new DaoException("Impossible to execute operation");
    }

    @Override
    public List<Order> getByUserId(Long id) {
        return null;
    }
}