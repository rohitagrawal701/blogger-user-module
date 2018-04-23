package com.blogger.user.service.impl;

import java.util.Calendar;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import com.blogger.user.document.User;
import com.blogger.user.dto.LoginDto;
import com.blogger.user.dto.UserDto;
import com.blogger.user.repository.UserRepository;
import com.blogger.user.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private DozerBeanMapper dozerBeanMapper;

    @Override
    public UserDto login(final LoginDto loginDto) {
        final UserDto userDto = new UserDto();
        final User user = (User) userRepository.findAndModify(
                new Query(Criteria
                        .where("bloggerName").is(loginDto.getBloggerName())
                        .and("password").is(loginDto.getPassword())),
                new Update().set("lastLogin", Calendar.getInstance().getTime()),
                User.class);
        dozerBeanMapper.map(user, userDto, "user");
        return userDto;
    }

    @Override
    public UserDto changePassword(final LoginDto loginDto) {
        final UserDto userDto = new UserDto();
        final User user = (User) userRepository.findAndModify(
                new Query(Criteria.where("bloggerName")
                        .is(loginDto.getBloggerName()).and("password")
                        .is(loginDto.getPassword())),
                new Update().set("password", loginDto.getNewPassword()),
                User.class);
        dozerBeanMapper.map(user, userDto, "user");
        return userDto;
    }
}
