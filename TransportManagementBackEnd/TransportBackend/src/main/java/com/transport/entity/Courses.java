package com.transport.entity;

public class Courses {
    int id;
    String coursename;

    public Courses(int id, String coursename) {
        this.id = id;
        this.coursename = coursename;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }
}
