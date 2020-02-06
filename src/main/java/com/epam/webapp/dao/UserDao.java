package com.epam.webapp.dao;

import com.epam.webapp.exception.DaoException;
import com.epam.webapp.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserDao {

    Optional<User> findUserByLoginAndPassword(String login, String password) throws DaoException;

    List<User> findTrainersInterns(Long trainerId) throws DaoException;
}
