package com.cursor.moviecatalogservice.feignclient;

import com.cursor.moviecatalogservice.domain.UserRating;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "movie-catalog-service",
        url = "http://localhost:8082/ratings/user/",
        configuration = UserRating.class)
public interface RatingsDataFeignClient {

    @GetMapping("/{userId}")
    UserRating getUserRating(@PathVariable String userId);
}