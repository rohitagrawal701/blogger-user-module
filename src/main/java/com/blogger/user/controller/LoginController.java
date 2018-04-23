package com.blogger.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.blogger.user.dto.LoginDto;
import com.blogger.user.response.RESTResponse;
import com.blogger.user.service.LoginService;

@RestController
@RequestMapping("/api")
public class LoginController {

    @Autowired
    LoginService loginService;

    @RequestMapping(value = "/login", method = RequestMethod.POST, produces = {
            MediaType.APPLICATION_JSON_VALUE})
    public RESTResponse login(@RequestBody final LoginDto loginDto) {
        return RESTResponse.ok(loginService.login(loginDto));
    }
}