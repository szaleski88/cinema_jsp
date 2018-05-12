package com.sda.cinema.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserDto {

    private String login;
    private String password;
    private String repeatedPassword;
    private String firstName;
    private String lastName;
    private String email;
    private String registerDate;
    private String amountOfPoints;

    public boolean validateForm() {
        System.out.println(firstName);
        return firstName.matches("[A-Za-złśżźćęąŁŚĄŻŹĆĘ]+")
                && lastName.matches("[A-Za-złśżźćęąŁŚĄŻŹĆĘ]+")
                && email.matches("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}")
                && login.matches("[A-Za-z_0-9]{6,}")
                && password.matches("[A-Za-z_0-9.!]{6,}")
                && !password.equals(repeatedPassword);
    }
}