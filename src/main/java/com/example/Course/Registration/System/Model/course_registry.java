package com.example.Course.Registration.System.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class course_registry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id; // no need to give value
    private String name;
    private String mailid;
    private String coursename;

    public course_registry(){

    }

    public course_registry(String name, String mailid, String coursename) {

        this.name = name;
        this.mailid = mailid;
        this.coursename = coursename;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMailid() {
        return mailid;
    }

    public void setMailid(String mailid) {
        this.mailid = mailid;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }
}
