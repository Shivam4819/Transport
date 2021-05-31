package com.transport.controller;

import com.transport.entity.Courses;
import com.transport.entity.LoginEntity;
import com.transport.services.LoginService;
import com.transport.services.courseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
public class MyController {

    @Autowired
    public courseService service;
    @Autowired
    public LoginService loginService;

    @PostMapping ("/login")
    public String Login(@RequestBody LoginEntity loginEntity){
         return  this.loginService.checkLogin(loginEntity);

    }


    @GetMapping("/home")
    public String show(){
        return "hi job done";
    }
    //get courses
    @GetMapping("/course")
    public List<Courses> getcourse(){
          return  this.service.getallCourses();
    }

    @GetMapping("/course/{ids}")
    public Courses getSpecific(@PathVariable int ids){
        return this.service.getSpecific(ids);
    }

    @PostMapping("/addc")
    public String add(@RequestBody Courses courses){
        return this.service.addCourses(courses);
    }

}
