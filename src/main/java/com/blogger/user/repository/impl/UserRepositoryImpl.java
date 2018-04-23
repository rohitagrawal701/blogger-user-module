package com.blogger.user.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import com.blogger.user.document.User;
import com.blogger.user.repository.UserRepositoryCustom;

public class UserRepositoryImpl extends BaseRepositoryImpl
        implements UserRepositoryCustom {

    @Autowired
    MongoTemplate mongoTemplate;

    @Override
    public boolean deleteUserWithChildren(final String userId) {
        mongoTemplate.remove(new Query(Criteria.where("id").is(userId)),
                User.class);
        return true;
    }

}
