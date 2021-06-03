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

    UserEntity userEntity;

    public String checkLogin(LoginEntity loginEntity){
      // int id=loginEntity.getId();
        String username=loginEntity.getUsername();
        userEntity=userDao.getByUsername(username);
       // userEntity=userDao.getById(id);
        if(userEntity.getPassword().equals(loginEntity.getPassword())
            && userEntity.getUsername().equals(username)){
            System.out.println("login done");
            return "login successful";
        }

//        Iterable<UserEntity> itr=userDao.findAll();
//        Iterator<UserEntity> iterator= itr.iterator();
//
//
//        while (iterator.hasNext()){
//            UserEntity userEntity=iterator.next();
//            if(userEntity.getUsername().equals(email)){
//                    System.out.println("login done");
//                 //   return "login successful";
//                 break;
//            }
//        }

        return "try again";
    }
}
