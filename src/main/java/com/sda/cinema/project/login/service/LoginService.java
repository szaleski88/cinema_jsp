package com.sda.cinema.project.login.service;

import com.sda.cinema.project.login.dto.UserDto;
import com.sda.cinema.project.login.repository.LoginRepository;
import com.sda.cinema.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoginService {
    @Autowired
    private LoginRepository repository;

    public UserDto login(String login, String password) {

        Optional<User> user = repository.getUser(login, password);
        if (user.isPresent()) {return mapUserToDto(user.get());}
        return null;
    }

    private UserDto mapUserToDto(User user) {

        UserDto userDto = new UserDto();
        userDto.setFirstName(user.getFirstName());
        userDto.setLastName(user.getLastName());
        userDto.setEmail(user.getEmail());
        userDto.setLogin(user.getLogin());
        userDto.setPassword(user.getPassword());
        userDto.setRegisterDate(user.getRegisterDate());


        return userDto;
    }
}
