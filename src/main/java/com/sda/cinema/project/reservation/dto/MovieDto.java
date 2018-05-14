package com.sda.cinema.project.reservation.dto;

import com.sda.cinema.model.MovieGenre;
import com.sda.cinema.model.Seance;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class MovieDto {

    private Integer id;
    private String title;
    private MovieGenre movieGenre;
    private String movieDescription;
    private String yearOfMovieProduction;
    private String actors;
    private List<Seance> listOfSeance;
}
