package com.sda.cinema.project.registration.dto;

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
    private String message;

    public boolean validateForm() {

        if(!firstName.matches("[A-Za-złśżźćęąŁŚĄŻŹĆĘ]+")){
            System.out.println("NIEPRAWIDLOWE IMIE\t" + firstName);
            message = "INCORRECT_NAME";
            return false;
        }
        if(!lastName.matches("[A-Za-złśżźćęąŁŚĄŻŹĆĘ]+")){
            System.out.println("nieprawidlowe nazwisko \t" + lastName);
            message = "INCORRECT_SURNAME";
            return false;
        }
        if(!login.matches("[A-Za-z_0-9]{6,}")) {
            System.out.println("nieprawidlowe login\t" + login);
            message = "INCORRECT_LOGIN";
            return false;
        }
        if(!email.matches("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}")) {
            System.out.println("nieprawidlowy email \t" +email);
            message = "INCORRECT_EMAIL";
            return false;
        }
        if(!password.matches("[A-Za-z_0-9.!]{6,}")){
            System.out.println("nieprawidlowe haslo\t" + password);
            message = "INCORRECT_PASSWORD";
            return false;
        }
        if(!password.equals(repeatedPassword)){
            System.out.println("nieprawidlowe powtorzone haslo" + password +"\t" + repeatedPassword);
            message = "INCORRECT_REPEATED_PASSWORD";
            return false;
        }
        return true;
    }
}
