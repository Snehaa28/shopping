package com.shopping.repository;

import com.shopping.entity.ProductMongo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepositoryMongo extends MongoRepository<ProductMongo, Long> {
}
