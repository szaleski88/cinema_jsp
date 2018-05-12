package com.sda.cinema.registration.dto;

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

        if(!firstName.matches("[A-Za-złśżźćęąŁŚĄŻŹĆĘ]+")){
            System.out.println("NIEPRAWIDLOWE IMIE\t" + firstName);
            return false;
        }
        if(!lastName.matches("[A-Za-złśżźćęąŁŚĄŻŹĆĘ]+")){
            System.out.println("nieprawidlowe nazwisko \t" + lastName);
            return false;
        }
        if(!email.matches("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}")) {
            System.out.println("nieprawidlowy email \t" +email);
            return false;
        }

        if(!login.matches("[A-Za-z_0-9]{6,}")) {
            System.out.println("nieprawidlowe login\t" + login);
            return false;
        }
        if(!password.matches("[A-Za-z_0-9.!]{6,}")){
            System.out.println("nieprawidlowe haslo\t" + password);
            return false;
        }
        if(!password.equals(repeatedPassword)){
            System.out.println("nieprawidlowe powtorzone haslo" + password +"\t" + repeatedPassword);
            return false;
        }
        return true;
    }
}
