package com.blogger.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.blogger.user.dto.UserDto;
import com.blogger.user.response.RESTResponse;
import com.blogger.user.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/user", method = RequestMethod.POST, produces = {
            MediaType.APPLICATION_JSON_VALUE})
    public RESTResponse createUser(@RequestBody final UserDto userDto) {
        return RESTResponse.ok(userService.insertUser(userDto));
    }

    @RequestMapping(value = "/user/{user-id}", method = RequestMethod.GET, produces = {
            MediaType.APPLICATION_JSON_VALUE})
    public RESTResponse fetchUserById(
            @PathVariable("user-id") final String userId) {
        return RESTResponse.ok(userService.fetchUserById(userId));
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET, produces = {
            MediaType.APPLICATION_JSON_VALUE})
    public RESTResponse fetchAllUsers() {
        return RESTResponse.ok(userService.fetchAllUsers());
    }

    @RequestMapping(value = "/user/{user-id}", method = RequestMethod.DELETE, produces = {
            MediaType.APPLICATION_JSON_VALUE})
    public RESTResponse deleteUser(
            @PathVariable("user-id") final String userId) {
        return RESTResponse.ok(userService.deleteUserById(userId));
    }

    @RequestMapping(value = "/user", method = RequestMethod.PUT, produces = {
            MediaType.APPLICATION_JSON_VALUE})
    public RESTResponse updateUser(@RequestBody final UserDto userDto) {
        return RESTResponse.ok(userService.updateUser(userDto));
    }

}
