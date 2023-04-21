package com.pragra.spring.demo.springBasics.RESTApplication;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class CourseController {

    List<Course> courses = Arrays.asList(new Course(1, "java full stack", "john doe"),
            new Course(2, "qa", "emily smith"),
            new Course(3, "devops", "janet jane"));

    @RequestMapping("/courses")
    public List<Course> getAllCourses() {
        return courses;
    }

    @RequestMapping("/courses/{id}")
    public Course getCourse(@PathVariable int id) throws RuntimeException {
        for (Course course : courses) {
            if (course.getId() == id) {
                return course;
            }
        }
        return null;
    }
}

