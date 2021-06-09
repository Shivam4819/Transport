package com.transport.controller;

import com.transport.entity.UserEntity;
import com.transport.request.RegisterManagerRequest;
import com.transport.response.RegisterManagerResponse;
import com.transport.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import lombok.extern.slf4j.Slf4j;


import java.util.List;

import static com.transport.util.RestUrls.*;

@RestController(value = USER_CONTROLLER)
@CrossOrigin(origins = CROSS_ORIGIN)
@Slf4j
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping(REGISTER_MANAGER)
    public String registerManager(@RequestBody RegisterManagerRequest registerManagerRequest){
        log.info(" Request in registerManager: {}", registerManagerRequest);
        RegisterManagerResponse registerManagerResponse=new RegisterManagerResponse();
        registerManagerResponse.setResponseMsg(userService.insertData(registerManagerRequest).toString());
        log.info(" Response in registerManager: {}", registerManagerRequest);
        return  "have to return response object";

    }
    @GetMapping("/getuser")
    public List<UserEntity> allUserData(){
       // return "yo";
      //  System.out.println("controller");
        return this.userService.display();
    }

}
