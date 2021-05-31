package com.transport.services;

import com.transport.dao.UserDao;
import com.transport.entity.LoginEntity;
import com.transport.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.Optional;

@Service
public class LoginService {

    @Autowired
    UserDao userDao;


    public String checkLogin(LoginEntity loginEntity){
       String email=loginEntity.getUsername();
       // Str
        //String

        Iterable<UserEntity> itr=userDao.findAll();
        Iterator<UserEntity> iterator= itr.iterator();


        while (iterator.hasNext()){
            UserEntity userEntity=iterator.next();
            if(userEntity.getUsername().equals(email)){
                    System.out.println("login done");
                 //   return "login successful";
                 break;
            }
        }

        return "try again";
    }
}
