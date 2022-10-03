package com.example.demo.repo;

import com.example.demo.entity.User;

public interface MongoRepository extends org.springframework.data.mongodb.repository.MongoRepository<User, String> {

}
