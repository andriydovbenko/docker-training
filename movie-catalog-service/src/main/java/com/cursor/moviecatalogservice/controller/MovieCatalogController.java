package com.cursor.moviecatalogservice.controller;

import com.cursor.moviecatalogservice.feignclient.MovieInfoFeignClient;
import com.cursor.moviecatalogservice.feignclient.RatingsDataFeignClient;
import com.cursor.moviecatalogservice.domain.CatalogItem;
import com.cursor.moviecatalogservice.domain.Movie;
import com.cursor.moviecatalogservice.domain.UserRating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogController {

    private final RatingsDataFeignClient ratingsClient;
    private final MovieInfoFeignClient movieClient;

    @Autowired
    public MovieCatalogController(RatingsDataFeignClient ratingsClient, MovieInfoFeignClient movieClient) {
        this.ratingsClient = ratingsClient;
        this.movieClient = movieClient;
    }

    @GetMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable String userId) {
        UserRating userRating = ratingsClient.getUserRating(userId);
        return userRating.getUserRating().stream()
                .map(rating -> {
                    Movie movie = movieClient.getMovie(rating.getMovieId());
                    return new CatalogItem(movie.getTitle(), movie.getDescription(), rating.getRating());
                })
                .collect(Collectors.toList());
    }
}