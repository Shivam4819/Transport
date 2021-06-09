package com.transport.services;

import com.transport.dao.UserDao;
import com.transport.entity.UserEntity;
import com.transport.request.RegisterManagerRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserDao userDao;
    public String insertData(RegisterManagerRequest registerManagerRequest){

            UserEntity userEntity=new UserEntity();
            userEntity.setId(registerManagerRequest.getId());
            userEntity.setUsername(registerManagerRequest.getUsername());
            userEntity.setDesignation(registerManagerRequest.getDesignation());
            userEntity.setName(registerManagerRequest.getName());
            userEntity.setPassword(registerManagerRequest.getPassword());
            userDao.save(userEntity);
            return "success";

    }
    public List<UserEntity> display(){
        System.out.println("services");
        return userDao.findAll();
    }
}
