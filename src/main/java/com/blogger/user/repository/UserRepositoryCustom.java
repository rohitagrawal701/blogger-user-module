package com.blogger.user.repository;

public interface UserRepositoryCustom extends BaseRepositoryCustom {

    boolean deleteUserWithChildren(String userId);
}
