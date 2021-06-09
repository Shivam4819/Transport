package com.transport.services;

import com.transport.dao.UserDao;
import com.transport.entity.UserEntity;
import com.transport.request.CheckCredentialRequest;
import com.transport.response.CheckCredentialResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LoginService {

    @Autowired
    private UserDao userDao;
    public CheckCredentialResponse checkLogin(CheckCredentialRequest checkCredentialRequest) {
        String username = checkCredentialRequest.getUsername();
        CheckCredentialResponse checkCredentialResponse=new CheckCredentialResponse();
        UserEntity userEntity = userDao.getByUsername(username);
        if (userEntity.getPassword().equals(checkCredentialRequest.getPassword())) {
            checkCredentialResponse.setMsg("done");
            return checkCredentialResponse;
        }
        checkCredentialResponse.setMsg("wrong credential");
        return checkCredentialResponse;
    }
}
