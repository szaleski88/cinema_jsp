package com.sda.cinema.project.reservation.service;


import com.sda.cinema.model.Movie;
import com.sda.cinema.model.Seance;
import com.sda.cinema.project.reservation.dto.MovieDto;
import com.sda.cinema.project.reservation.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ReservationService {

    @Autowired
    private ReservationRepository repository;

    public List<MovieDto> getMoviesDtosForDate(String date){
        List<Seance> seanceList = repository.getSeancesByDate(date);
        Map<Integer, List<Seance>> mapMoviesSeances = createMapMovieSeances(seanceList);

        List<Movie> moviesForDate = repository.getMoviesByDate(date);
        connectMoviesWithSeances(moviesForDate, mapMoviesSeances);

        return  createMovieDtos(moviesForDate);
    }

    private List<MovieDto> createMovieDtos(List<Movie> moviesForDate) {
        List<MovieDto> moviesDtos = new ArrayList<>();
//        DESIGN PATTERN: BUILDER
        for (Movie movie : moviesForDate) {
            moviesDtos.add( MovieDto.builder()
                                    .id(movie.getId())
                                    .title(movie.getTitle())
                                    .movieGenre(movie.getMovieGenre())
                                    .movieDescription(movie.getMovieDescription())
                                    .yearOfMovieProduction(movie.getYearOfMovieProduction())
                                    .listOfSeance(movie.getListOfSeance())
                                    .actors(movie.getActors())
                                    .build()
            );
        }
        return moviesDtos;
    }

    private void connectMoviesWithSeances(List<Movie> moviesForDate, Map<Integer, List<Seance>> mapMoviesSeances) {
        for (Movie movie :  moviesForDate) {
            movie.setListOfSeance(mapMoviesSeances.get(movie.getId()));
        }
    }

    private Map<Integer, List<Seance>> createMapMovieSeances(List<Seance> seances) {
        Map<Integer, List<Seance>> mapMovieSeances = new HashMap<>();
        for (Seance seance : seances) {
            if (mapMovieSeances.containsKey(seance.getMovieId())) {
                mapMovieSeances.get(seance.getMovieId()).add(seance);
                mapMovieSeances.put(seance.getMovieId(), mapMovieSeances.get(seance.getMovieId()));
            } else {
                List<Seance> seanceList = new ArrayList<>();
                seanceList.add(seance);
                mapMovieSeances.put(seance.getMovieId(), seanceList);
            }
        }
        return mapMovieSeances;
    }
}
