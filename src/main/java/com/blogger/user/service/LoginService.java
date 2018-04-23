package com.blogger.user.service;

import com.blogger.user.dto.LoginDto;
import com.blogger.user.dto.UserDto;

public interface LoginService {

    UserDto login(LoginDto loginDto);
}
