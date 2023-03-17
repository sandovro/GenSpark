package com.genspark.courseDBApp.Controller;

import com.genspark.courseDBApp.Entity.Course;
import com.genspark.courseDBApp.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private CourseService courseService;

    @GetMapping("/")
    public String home(){
        return "Welcome to the Course Application";
    }

    @GetMapping("/courses")
    public List<Course> getCourses() {
        return this.courseService.getAllCourses();
    }

    @GetMapping("/courses/{courseId}")
    public Course getCourseById(@PathVariable String courseId) {
        return this.courseService.getCourseById(Integer.parseInt(courseId));
    }

    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course) {
        return this.courseService.addCourse(course);
    }

    @PutMapping("/courses")
    public Course updateCourse(@RequestBody Course course) {
        return this.courseService.updateCourse(course);
    }

    @DeleteMapping("/courses/{courseId}")
    public String deleteCourse(@PathVariable String courseId) {
        return this.courseService.deleteCourse(Integer.parseInt(courseId));
    }

}

