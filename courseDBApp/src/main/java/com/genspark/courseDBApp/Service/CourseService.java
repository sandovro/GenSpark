package com.genspark.courseDBApp.Service;

import com.genspark.courseDBApp.Dao.ICourseDao;
import com.genspark.courseDBApp.Entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CourseService implements ICourseService{
    
    @Autowired
    private ICourseDao courseDao;

    @Override
    public List<Course> getAllCourses() {
        return this.courseDao.findAll();
    }

    @Override
    public Course getCourseById(int courseId) {
        Course course = null;
        Optional<Course> c = this.courseDao.findById(courseId);
        if(c.isPresent())
            course = c.get();
        else
            throw new RuntimeException("Course with ID: "+courseId+" could not be found.");
        return course;
    }

    @Override
    public Course addCourse(Course course) {
        return this.courseDao.save(course);
    }

    @Override
    public Course updateCourse(Course course) {
        return this.courseDao.save(course);
    }

    @Override
    public String deleteCourse(int courseId) {
        this.courseDao.deleteById(courseId);
        return "Course successfully deleted";
    }
}

