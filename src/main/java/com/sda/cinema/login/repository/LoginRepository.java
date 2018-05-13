package com.sda.cinema.login.repository;

import com.sda.cinema.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@Repository
public class LoginRepository {

    private static final String GET_USER = "SELECT first_name, last_name, login, password, email, registered_date FROM users WHERE login = ? AND password = ?;";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Optional<User> getUser(String login, String password) {

        List<User> query = jdbcTemplate.query(GET_USER, new String[]{login, password}, new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet resultSet, int i) throws SQLException {
                User user = new User();
                user.setFirstName(resultSet.getString("first_name"));
                user.setLastName(resultSet.getString("last_name"));
                user.setLogin(resultSet.getString("login"));
                user.setPassword(resultSet.getString("password"));
                user.setRegisterDate(resultSet.getString("registered_date"));
                return user;
            }
        });

        return !query.isEmpty() ? Optional.of(query.get(0)) : Optional.empty();

    }
}
