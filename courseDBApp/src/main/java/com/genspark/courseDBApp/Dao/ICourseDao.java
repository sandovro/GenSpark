package com.genspark.courseDBApp.Dao;

import com.genspark.courseDBApp.Entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICourseDao extends JpaRepository<Course,Integer> {
}
