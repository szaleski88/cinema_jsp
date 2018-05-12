package com.sda.cinema.login.dto;


import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserDto {

    private String login;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private String registerDate;
    private String amountOfPoints;

    public boolean validateForm(){

        if(!login.matches("[A-Za-z_0-9]{6,}")) {
            System.out.println("nieprawidlowe login\t" + login);
            return false;
        }
        if(!password.matches("[A-Za-z_0-9.!]{6,}")){
            System.out.println("nieprawidlowe haslo\t" + password);
            return false;
        }
        return true;
    }
}
