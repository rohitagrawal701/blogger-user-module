package com.blogger.user.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.blogger.user.dto.UserDto;
import com.blogger.user.service.UserService;

@Service
public class UserServiceImpl implements UserService{

    @Override
    public List<UserDto> fetchAllUsers() {
        return null;
    }

}
