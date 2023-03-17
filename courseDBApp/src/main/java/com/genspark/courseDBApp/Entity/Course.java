package com.genspark.courseDBApp.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="Courses")
public class Course {

    @Id
    @Column(name="course_id")
    private int courseId;
    @Column(name = "course_title")
    private String title;
    @Column(name = "course_instructor")
    private String instructor;

    public Course() {
    }

    public Course(int courseId, String title, String instructor) {
        this.courseId = courseId;
        this.title = title;
        this.instructor = instructor;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }
}

