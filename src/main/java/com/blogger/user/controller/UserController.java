package com.blogger.user.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.blogger.user.response.RESTResponse;

@RestController
public class UserController {

    // @Autowired
    // UserService userService;

    // @RequestMapping(value = "/api/user", method = RequestMethod.POST,
    // produces = { MediaType.APPLICATION_JSON_VALUE })
    // public RESTResponse createUser(@RequestBody UserDTO userDTO) {
    // return RESTResponse.ok(userService.insertUser(userDTO));
    // }
    //
    // @RequestMapping(value = "/api/user/{user-id}", method =
    // RequestMethod.GET, produces = {
    // MediaType.APPLICATION_JSON_VALUE })
    // public RESTResponse fetchUserById(@PathVariable("user-id") String userId)
    // {
    // return RESTResponse.ok(userService.getUserById(userId));
    // }
    //
    @RequestMapping(value = "/api/user", method = RequestMethod.GET, produces = {
            MediaType.APPLICATION_JSON_VALUE})
    public RESTResponse fetchAllUsers() {
        return null;
        // return RESTResponse.ok(userService.getAllUsers());
    }
    //
    // @RequestMapping(value = "/api/user/{user-id}", method =
    // RequestMethod.DELETE, produces = {
    // MediaType.APPLICATION_JSON_VALUE })
    // public RESTResponse deleteUser(@PathVariable("user-id") String userId) {
    // return RESTResponse.ok(userService.deleteUser(userId));
    // }
    //
    // @RequestMapping(value = "/api/user", method = RequestMethod.PUT, produces
    // = {
    // MediaType.APPLICATION_JSON_VALUE })
    // public RESTResponse updateUser(@RequestBody UserDTO userDTO) {
    // return RESTResponse.ok(userService.updateUser(userDTO));
    // }
}
