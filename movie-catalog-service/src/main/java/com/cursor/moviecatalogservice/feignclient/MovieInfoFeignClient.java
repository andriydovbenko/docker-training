package com.cursor.moviecatalogservice.feignclient;

import com.cursor.moviecatalogservice.domain.Movie;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "movie-info-service",
        url = "http://localhost:8083/movies/",
        configuration = Movie.class)
public interface MovieInfoFeignClient {

    @GetMapping("/{movieId}")
    Movie getMovie(@PathVariable String movieId);
}