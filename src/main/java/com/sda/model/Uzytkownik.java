package com.sda.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public final class Uzytkownik {

    private String login;
    private String haslo;
    private String imie;
    private String nazwisko;

}
