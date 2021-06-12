package com.transport.controller;

import com.transport.request.RegisterManagerRequest;
import com.transport.response.AllUserDataResponse;
import com.transport.response.RegisterManagerResponse;
import com.transport.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import lombok.extern.slf4j.Slf4j;


import java.util.List;

import static com.transport.util.RestUrls.*;

@RestController
@CrossOrigin(origins = CROSS_ORIGIN)
@Slf4j
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping(REGISTER_MANAGER)
    public RegisterManagerResponse registerManager(@RequestBody RegisterManagerRequest registerManagerRequest){
        log.info(" Request in registerManager: {}", registerManagerRequest);
        log.info(" Response in registerManager: {}", userService.insertData(registerManagerRequest));
        return  userService.insertData(registerManagerRequest);

    }
    @GetMapping(DISPLAY_USER)
    public List<AllUserDataResponse> allUserData(){
       // return "yo";
      //  System.out.println("controller");
        log.info(" Request in allUserData: gets data for all user");
        log.info(" Response in allUserData: all data is set to response object",userService.display());

        return userService.display();
    }

}
