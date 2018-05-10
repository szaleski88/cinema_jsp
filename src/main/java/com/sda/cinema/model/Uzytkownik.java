package com.sda.cinema.model;

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

    private String email;
    private String dataUtworzenia;
    private String iloscPunktow;
}
