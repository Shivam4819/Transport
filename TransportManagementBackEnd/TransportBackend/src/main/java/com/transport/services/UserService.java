package com.transport.services;

import com.transport.dao.UserDao;
import com.transport.entity.UserEntity;
import com.transport.request.RegisterManagerRequest;
import com.transport.response.AllUserDataResponse;
import com.transport.response.RegisterManagerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    UserDao userDao;
    public RegisterManagerResponse insertData(RegisterManagerRequest registerManagerRequest){

            UserEntity userEntity=new UserEntity();
            userEntity.setId(registerManagerRequest.getId());
            userEntity.setUsername(registerManagerRequest.getUsername());
            userEntity.setDesignation(registerManagerRequest.getDesignation());
            userEntity.setName(registerManagerRequest.getName());
            userEntity.setPassword(registerManagerRequest.getPassword());
            userDao.save(userEntity);
            RegisterManagerResponse registerManagerResponse=new RegisterManagerResponse();
            registerManagerResponse.setResponseMsg("done");
            return registerManagerResponse;
    }
    public List<AllUserDataResponse> display(){

        System.out.println("services");
       List<UserEntity> list=userDao.findAll();
       List<AllUserDataResponse> allUserDataResponseList = new ArrayList<>();
        for( UserEntity userEntity: list) {

            AllUserDataResponse allUserDataResponse = new AllUserDataResponse();
            allUserDataResponse.setUsername(userEntity.getUsername());
            allUserDataResponse.setId(userEntity.getId());
            allUserDataResponse.setDesignation(userEntity.getDesignation());
            allUserDataResponse.setName(userEntity.getName());

            allUserDataResponseList.add(allUserDataResponse);
        }
        return allUserDataResponseList;
    }
}
