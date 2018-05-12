package com.sda.cinema.login.repository;

import com.sda.cinema.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class LoginRepository {

    private static final String GET_USER = "SELECT first_name, last_name, login, password, email, registered_date FROM users WHERE login = ? AND password = ?;";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Optional<User> getUser(String login, String password) {

        List<User> users = jdbcTemplate.queryForList(GET_USER, new String[]{login, password}, User.class);
        return Optional.of(users.get(0));

    }
}
