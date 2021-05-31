package com.transport.services;

import com.transport.dao.UserDao;
import com.transport.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserDao userDao;
    public String insertData(UserEntity userEntity){
     userDao.save(userEntity);

        return "done";
    }
    public List<UserEntity> display(){
        System.out.println("services");
        return userDao.findAll();
    }
}
