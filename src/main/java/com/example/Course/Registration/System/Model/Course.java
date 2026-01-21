package com.example.Course.Registration.System.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {

    @Id
    private  String courseId;
    private String coursename;
    private String trainer;
    private int durationinweeks;

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public String getTrainer() {
        return trainer;
    }

    public void setTrainer(String trainer) {
        this.trainer = trainer;
    }

    public int getDurationinweeks() {
        return durationinweeks;
    }

    public void setDurationinweeks(int durationinweeks) {
        this.durationinweeks = durationinweeks;
    }
}
