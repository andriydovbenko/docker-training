package com.cursor.movieinfoservice.factory;

import com.cursor.movieinfoservice.domain.Movie;
import lombok.NoArgsConstructor;

import java.util.Random;

@NoArgsConstructor
public class RandomMovie {
    private static String[] movies = new String[]{"The Big Country", " Little Big Man", " The Postman"};
    private static String[] description = new String[]{"the epic Western", "he \"revisionistic\" Western",
            "the \"science-fiction\" Western"};

    public static Movie createRandomMovie(String movieId) {
        int randomNumber = new Random().nextInt(movies.length);
        return new Movie(movieId, movies[randomNumber], description[randomNumber]);
    }
}