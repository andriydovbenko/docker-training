package com.cursor.ratingsdataservice.controller;

import com.cursor.ratingsdataservice.domain.Rating;
import com.cursor.ratingsdataservice.domain.UserRating;
import com.cursor.ratingsdataservice.factory.RandomRating;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ratings")
public class RatingsController {

    @GetMapping("/movies/{movieId}")
    public Rating getMovieRating(@PathVariable("movieId") String movieId) {
        return RandomRating.getRandomRating(movieId);
    }

    @GetMapping("/user/{userId}")
    public UserRating getUserRating(@PathVariable("userId") String userId) {
        return RandomRating.getRandomUserRating(userId);
    }
}