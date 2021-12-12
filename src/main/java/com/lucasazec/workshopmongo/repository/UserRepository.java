package com.lucasazec.workshopmongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.lucasazec.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

	List<User> findAll();

}
