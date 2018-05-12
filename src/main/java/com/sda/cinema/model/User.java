package com.sda.cinema.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class User {

    private String login;
    private String firstName;
    private String password;
    private String lastName;
    private String email;
    private String registerDate;
    private String amountOfPoints;

}
