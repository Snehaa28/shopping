package com.shopping.repository;

import com.shopping.entity.UserMongo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositoryMongo extends MongoRepository<UserMongo, Long> {
}
