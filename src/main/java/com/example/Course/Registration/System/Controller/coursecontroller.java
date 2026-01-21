package com.example.Course.Registration.System.Controller;


import com.example.Course.Registration.System.Model.Course;
import com.example.Course.Registration.System.Model.course_registry;
import com.example.Course.Registration.System.Service.courseservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class coursecontroller {


    @Autowired
    courseservice service;

    @GetMapping("courses")
    public List<Course> availablecourses() {
        return service.availablecourses();
    }

    @GetMapping("courses/enrolled")
    public List<course_registry> enrolledstudents(){
        return service.enrolledstudents();
    }
    @PostMapping("courses/register")
    public String enrollcourse(@RequestParam("name") String name,
                               @RequestParam("mailid") String mailid,
                               @RequestParam("coursename") String coursename){
        service.enrollcourse(name,mailid,coursename);
        return "congratulations! "+name+" enrollment successful for "+coursename;
    }



}
