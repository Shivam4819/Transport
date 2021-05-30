package com.transport.services;

import com.transport.entity.Courses;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class courseService {
    List<Courses> list;

    public courseService(){
        list=new ArrayList<>();
        list.add(new Courses(10,"sie"));
        list.add(new Courses(20,"asdsd"));
    }

    public List<Courses> getallCourses(){
        return list;
    }
    public Courses getSpecific(int ids){
        Courses c=null;
        for(Courses cs:list){
            if (cs.getId()==ids){
                c=cs;
                break;
            }
        }
        return c;
    }
    public String addCourses(Courses courses){
        list.add(courses);
        return "added";
    }
}
