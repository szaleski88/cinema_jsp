package com.sda.cinema.project.registration.service;


import com.sda.cinema.model.ErrorMessages;
import com.sda.cinema.project.registration.dto.UserDto;
import com.sda.cinema.model.User;
import com.sda.cinema.project.registration.repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

    @Autowired
    private RegistrationRepository repository;

    public void addUser(UserDto userDto){
        if(repository.isLoginExists(userDto.getLogin())){
            throw new RuntimeException(ErrorMessages.LOGIN_EXISTS.name());
        }

        User user = this.getUser(userDto);
        user = repository.save(user);
    }

    private User getUser(UserDto userDto) {
       User user = new User();
       user.setEmail(userDto.getEmail());
       user.setPassword(userDto.getPassword());
       user.setFirstName(userDto.getFirstName());
       user.setLastName(userDto.getLastName());
       user.setLogin(userDto.getLogin());
       user.setAmountOfPoints("0");

       return user;



    }
}
