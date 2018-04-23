package com.blogger.user.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.blogger.user.document.User;

public interface UserRepository
        extends MongoRepository<User, String>, UserRepositoryCustom {

}
