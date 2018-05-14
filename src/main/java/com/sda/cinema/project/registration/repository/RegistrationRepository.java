package com.sda.cinema.project.registration.repository;

import com.sda.cinema.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class RegistrationRepository {

    private static final String IS_LOGIN_EXISTS = "SELECT true FROM users WHERE login = ?";
    private static final String INSERT_USER = "INSERT INTO users(first_name, last_name, login, password, email) VALUES(?,?,?,?,?);";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public boolean isLoginExists(String login){
        return !jdbcTemplate.queryForList(IS_LOGIN_EXISTS, new String[]{login}, Boolean.class).isEmpty();
    }

    public User save(User user){
        jdbcTemplate.update(INSERT_USER, new Object[]{user.getFirstName(), user.getLastName(), user.getLogin(), user.getPassword(), user.getEmail()});
        return user;
    }

}
