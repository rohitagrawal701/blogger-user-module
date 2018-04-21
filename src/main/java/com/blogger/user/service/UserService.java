package com.blogger.user.service;

import java.util.List;

import com.blogger.user.dto.UserDto;

public interface UserService {
    
    List<UserDto> fetchAllUsers();

}
