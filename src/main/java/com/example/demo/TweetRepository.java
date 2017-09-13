package com.example.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by koga on 2017/09/12.
 */
@Repository
public interface TweetRepository extends CrudRepository<Tweet, Integer> {

}
