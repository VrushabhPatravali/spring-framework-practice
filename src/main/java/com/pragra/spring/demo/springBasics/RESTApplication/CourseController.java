package com.pragra.spring.demo.springBasics.RESTApplication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> getAllCourses() {
        List<Course> courses = Arrays.asList(new Course(1, "java full stack", "john doe"),
                new Course(2, "qa", "emily smith"),
                new Course(3, "devops", "janet jane"));
        return courses;
    }
}

