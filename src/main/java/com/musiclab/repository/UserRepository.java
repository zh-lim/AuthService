package com.musiclab.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.musiclab.model.Users;

import java.util.Optional;

public interface UserRepository extends MongoRepository<Users, String>{
    Optional<Users> findByUsername(String username);
    Optional<Users> findById(String id);
    Boolean existsByUsername(String username);
}
