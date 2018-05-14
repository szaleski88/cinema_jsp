package com.sda.cinema.model;


import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Seance {


    private Integer id;
    private String dataStart;
    private String dataStartTime;
    private double price;
    private Integer movieId;


}
