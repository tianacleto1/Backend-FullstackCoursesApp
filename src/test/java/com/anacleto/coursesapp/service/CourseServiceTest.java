package com.anacleto.coursesapp.service;

import com.anacleto.coursesapp.dao.CourseDAO;
import com.anacleto.coursesapp.model.Course;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CourseServiceTest {

    @MockBean
    private CourseDAO dao;

    @Autowired
    private CourseService service;

    @Test
    public void whenGetCoursesIsCalled_itShouldReturnListOfCoursesTest() {
        Mockito.when(service.getCourses()).thenReturn(mockList());

        List<Course> coursesTest = service.getCourses();

        Assert.assertEquals("Test", coursesTest.get(0).getInstructor());
    }

    private List<Course> mockList() {
        return Arrays.asList(new Course(1L, "Test", "teste"));
    }
}
