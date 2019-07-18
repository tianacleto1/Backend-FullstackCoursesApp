package com.anacleto.coursesapp.service;

import com.anacleto.coursesapp.dao.CourseDAO;
import com.anacleto.coursesapp.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseDAO courseDAO;

    public List<Course> getCourses() {
        return courseDAO.findAll();
    }
}
