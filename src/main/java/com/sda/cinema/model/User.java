package com.sda.cinema.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public final class User {

    private String login;
    private String password;
    private String repeatedPassword;
    private String firstName;
    private String lastName;

    private String email;
    private String registerDate;
    private String amountOfPoints;
}
