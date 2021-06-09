package com.transport.controller;

import com.transport.request.CheckCredentialRequest;
import com.transport.response.CheckCredentialResponse;
import com.transport.services.LoginService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import static com.transport.util.RestUrls.*;

@RestController(value = LOGIN_CONTROLLER)
@CrossOrigin(origins = CROSS_ORIGIN)
@Slf4j
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping(LOGIN_USER)
    public CheckCredentialResponse checkCredential(@RequestBody CheckCredentialRequest checkCredentialRequest)
            throws Exception { // TODO:

        log.info(" Request in checkCredential: {}", checkCredentialRequest);
        CheckCredentialResponse checkCredentialResponse=new CheckCredentialResponse();
        checkCredentialResponse.setMsg(loginService.checkLogin(checkCredentialRequest).toString());
        log.info(" Response in checkCredential: {}", checkCredentialResponse);
//        throw new Exception("form login controllle");
        return checkCredentialResponse;

    }
}
