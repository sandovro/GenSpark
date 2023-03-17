package com.genspark.courseDBApp.Service;

import com.genspark.courseDBApp.Entity.Course;

import java.util.List;

public interface ICourseService {

    List<Course> getAllCourses();
    Course getCourseById(int courseId);
    Course addCourse(Course course);
    Course updateCourse(Course course);
    String deleteCourse(int courseId);
}
