package com.transport.controller;

import com.transport.entity.UserEntity;
import com.transport.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class User {

    @Autowired
    UserService userService;

    @PostMapping("/adduser")
    public String User(@RequestBody UserEntity userEntity){
        return  this.userService.insertdata(userEntity);

    }
    @GetMapping("/alldata")
    public List<UserEntity> dis(){
       // return "yo";
        System.out.println("controller");
        return this.userService.display();
    }
}
