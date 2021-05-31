package com.transport.controller;

import com.transport.entity.LoginEntity;
import com.transport.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Login {

    @Autowired
    LoginService loginService;

    @PostMapping("/loginuser")
    public String checkCredential(@RequestBody LoginEntity loginEntity){
        return loginService.checkLogin(loginEntity);
    }
}
