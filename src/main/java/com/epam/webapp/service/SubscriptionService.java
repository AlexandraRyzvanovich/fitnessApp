package com.epam.webapp.service;

import com.epam.webapp.dao.AbstractDao;
import com.epam.webapp.dao.DaoHelper;
import com.epam.webapp.dao.DaoHelperFactory;
import com.epam.webapp.entity.Subscription;
import com.epam.webapp.exception.DaoException;
import com.epam.webapp.exception.ServiceException;

import java.sql.SQLException;
import java.util.List;

public class SubscriptionService {
    private DaoHelperFactory daoHelperFactory;

    public SubscriptionService(DaoHelperFactory daoHelperFactory) {
        this.daoHelperFactory = daoHelperFactory;
    }

    public List<Subscription> getAvailableSubscriptions() throws ServiceException {
        try (DaoHelper factory = daoHelperFactory.create()) {
            AbstractDao<Subscription> dao = (AbstractDao<Subscription>) factory.createSubscriptionDao();
            return dao.getAll();
        } catch (DaoException | SQLException | ClassNotFoundException e) {
            throw new ServiceException(e.getCause());
        }
    }
}