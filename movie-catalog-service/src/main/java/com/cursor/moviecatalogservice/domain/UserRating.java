package com.cursor.moviecatalogservice.domain;

import lombok.Data;

import java.util.List;

@Data
public class UserRating {

    private List<Rating> userRating;
}