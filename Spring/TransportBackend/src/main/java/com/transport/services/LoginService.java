package com.transport.services;

import com.transport.entity.LoginEntity;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    public String checkLogin(LoginEntity loginEntity){
      //  LoginEntity loginEntity = new LoginEntity();
      //  System.out.println(loginEntity.getEmail());
        if(loginEntity.getEmail().equals("s@gmail") ){
            return "right credential";
        }
        return "try again";
    }
}
