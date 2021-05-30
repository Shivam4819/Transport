package com.transport.services;

import com.transport.dao.UserRepository;
import com.transport.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    public String insertdata(UserEntity userEntity){
     userRepository.save(userEntity);

        return "done";
    }
    public List<UserEntity> display(){
        System.out.println("services");
        return userRepository.findAll();
    }
}
