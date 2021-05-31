package com.transport.controller;

import com.transport.entity.UserEntity;
import com.transport.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class User {

    @Autowired
    UserService userService;

    @PostMapping("/register")
    public String registerManager(@RequestBody UserEntity userEntity){
        return  this.userService.insertData(userEntity);

    }
    @GetMapping("/getuser")
    public List<UserEntity> displayAllUser(){
       // return "yo";
      //  System.out.println("controller");
        return this.userService.display();
    }

}
