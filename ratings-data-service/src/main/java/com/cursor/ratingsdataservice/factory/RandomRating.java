package com.cursor.ratingsdataservice.factory;

import com.cursor.ratingsdataservice.domain.Rating;
import com.cursor.ratingsdataservice.domain.UserRating;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@NoArgsConstructor
public class RandomRating {
    private static double[] rating = new double[]{1, 2, 3, 4, 5};

    public static Rating getRandomRating(String movieId) {
        int randomRating = new Random().nextInt(rating.length);

        return new Rating(movieId, rating[randomRating]);
    }

    public static UserRating getRandomUserRating(String userId) {
        List<Rating> ratingList = Arrays.asList(
                getRandomRating(userId),
                getRandomRating(userId),
                getRandomRating(userId)
        );

        return new UserRating(userId, ratingList);
    }
}