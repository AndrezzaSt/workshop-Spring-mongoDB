package com.andrezzasturm.workshopmongo.repository;

import com.andrezzasturm.workshopmongo.domain.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
