package com.blogger.user.service.impl;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blogger.user.document.User;
import com.blogger.user.dto.UserDto;
import com.blogger.user.repository.UserRepository;
import com.blogger.user.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private DozerBeanMapper dozerBeanMapper;

    @Override
    public List<UserDto> fetchAllUsers() {
        final List<UserDto> userDtoList = new ArrayList<>();
        final List<User> userList = userRepository.findAll();
        dozerBeanMapper.map(userList, userDtoList, "user");
        return userDtoList;
    }

    @Override
    public UserDto fetchUserById(final String userId) {
        final UserDto userDto = new UserDto();
        final User user = userRepository.findOne(userId);
        dozerBeanMapper.map(user, userDto, "user");
        return userDto;
    }

    @Override
    public boolean deleteUserById(final String userId) {
        userRepository.delete(userId);
        return true;
    }

    @Override
    public UserDto updateUser(final UserDto userDto) {
        final User user = new User();
        dozerBeanMapper.map(userDto, user, "user");
        user.setUpdatedOn(Calendar.getInstance().getTime());
        userRepository.save(user);
        return userDto;
    }

    @Override
    public UserDto insertUser(final UserDto userDto) {
        final User user = new User();
        dozerBeanMapper.map(userDto, user, "user-create-dto-to-entity");
        user.setCreatedOn(Calendar.getInstance().getTime());
        user.setUpdatedOn(Calendar.getInstance().getTime());
        userRepository.insert(user);
        userDto.setId(user.getId());
        return userDto;
    }

}
