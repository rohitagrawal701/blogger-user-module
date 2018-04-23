package com.blogger.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.blogger.user.dto.LoginDto;
import com.blogger.user.dto.UserDto;
import com.blogger.user.response.RESTResponse;
import com.blogger.user.service.UserService;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/api/user", method = RequestMethod.POST, produces = {
            MediaType.APPLICATION_JSON_VALUE})
    public RESTResponse createUser(@RequestBody final UserDto userDto) {
        return RESTResponse.ok(userService.insertUser(userDto));
    }

    @RequestMapping(value = "/api/user/{user-id}", method = RequestMethod.GET, produces = {
            MediaType.APPLICATION_JSON_VALUE})
    public RESTResponse fetchUserById(
            @PathVariable("user-id") final String userId) {
        return RESTResponse.ok(userService.fetchUserById(userId));
    }

    @RequestMapping(value = "/api/user", method = RequestMethod.GET, produces = {
            MediaType.APPLICATION_JSON_VALUE})
    public RESTResponse fetchAllUsers() {
        return RESTResponse.ok(userService.fetchAllUsers());
    }

    @RequestMapping(value = "/api/user/{user-id}", method = RequestMethod.DELETE, produces = {
            MediaType.APPLICATION_JSON_VALUE})
    public RESTResponse deleteUser(
            @PathVariable("user-id") final String userId) {
        return RESTResponse.ok(userService.deleteUserById(userId));
    }

    @RequestMapping(value = "/api/user", method = RequestMethod.PUT, produces = {
            MediaType.APPLICATION_JSON_VALUE})
    public RESTResponse updateUser(@RequestBody final UserDto userDto) {
        return RESTResponse.ok(userService.updateUser(userDto));
    }

    @RequestMapping(value = "/api/login", method = RequestMethod.POST, produces = {
            MediaType.APPLICATION_JSON_VALUE})
    public RESTResponse login(@RequestBody final LoginDto loginDto) {
        return RESTResponse.ok(userService.login(loginDto));
    }
}
