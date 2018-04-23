package com.blogger.user.service;

import java.util.List;

import com.blogger.user.dto.LoginDto;
import com.blogger.user.dto.UserDto;

public interface UserService {

    List<UserDto> fetchAllUsers();

    UserDto fetchUserById(String userId);

    boolean deleteUserById(String userId);

    UserDto updateUser(UserDto userDto);

    UserDto insertUser(UserDto userDto);

    UserDto login(LoginDto loginDto);

}
