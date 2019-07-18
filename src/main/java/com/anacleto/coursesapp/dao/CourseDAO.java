package com.anacleto.coursesapp.dao;

import com.anacleto.coursesapp.model.Course;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class CourseDAO {

    private static List<Course> coursesDB = new ArrayList<>();
    private static long idCounter = 0;

    static {
        coursesDB.add(new Course(idCounter++, "Instructor Test1", "Learn Fullstack Development"));
        coursesDB.add(new Course(idCounter++, "Instructor Test1", "Java 8 New Features"));
        coursesDB.add(new Course(idCounter++, "Instructor Test1", "Learn Angular 8"));
        coursesDB.add(new Course(idCounter++, "Instructor Test1", "Spring Framework 5"));
    }

    public List<Course> findAll() {
        return coursesDB;
    }
}
