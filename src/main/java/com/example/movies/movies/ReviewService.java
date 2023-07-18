package com.example.movies.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

public class ReviewService {
    
    @Autowired
    private ReviewRepository reviewRepository;

    private MongoTemplate mongoTemplate;

    public Review getReview(String reviewBody, String imdbId){
        Review review=new Review(reviewBody);
        reviewRepository.insert(review);
    }
}
