package com.example.movies.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mongodb.client.MongoDatabase;

@Repository
public interface ReviewRepository extends MongoRepository<Review,ObjectId>{
    
}
