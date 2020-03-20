package com.cursor.movieinfoservice.controller;

import com.cursor.movieinfoservice.domain.Movie;
import com.cursor.movieinfoservice.factory.RandomMovie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MovieInfoController {

    @GetMapping("/{movieId}")
    public Movie getMovieInfo(@PathVariable("movieId") String movieId) {
        return RandomMovie.createRandomMovie(movieId);
    }
}
