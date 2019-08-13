package com.musiclab.repository;

import com.musiclab.model.Roles;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoleRepository extends MongoRepository<Roles, String>{

}
