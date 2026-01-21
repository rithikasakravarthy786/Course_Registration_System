package com.example.Course.Registration.System.Service;

import com.example.Course.Registration.System.Model.Course;
import com.example.Course.Registration.System.Model.course_registry;
import com.example.Course.Registration.System.Repository.courseRepo;
import com.example.Course.Registration.System.Repository.courseregistry_Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class courseservice {

    @Autowired
    courseRepo courseRepo;

    @Autowired
    courseregistry_Repo courseregistry_repo;

    public List<Course> availablecourses() {
        return courseRepo.findAll();

    }

    public List<course_registry> enrolledstudents() {
        return courseregistry_repo.findAll();
    }

    public void enrollcourse(String name, String mailid, String coursename) {
        course_registry course_registry=new course_registry(name,mailid,coursename);
        courseregistry_repo.save(course_registry);
    }
}
