package com.codeclan.example.OnlineCourseBooker.controllers;

import com.codeclan.example.OnlineCourseBooker.models.Course;
import com.codeclan.example.OnlineCourseBooker.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    CourseRepository courseRepository;


    @GetMapping(value = "/courses")
    public ResponseEntity<List<Course>> getAllCoursesAndFilters(
            @RequestParam(required = false, name = "town") String town,
            @RequestParam(required = false, name = "rating") Double rating,
            @RequestParam(required = false, name = "name") String name

    ) {

        if (town != null) {
            return new ResponseEntity(courseRepository.findCoursesByTown(town), HttpStatus.OK);
        }


        if (name != null) {
            return new ResponseEntity(courseRepository.findCoursesByName(name), HttpStatus.OK);
        }

        if (rating != null){
            return new ResponseEntity(courseRepository.findCoursesByRating(rating), HttpStatus.OK);
        }

        if (name != null) {
            return new ResponseEntity(courseRepository.findCoursesByName(name), HttpStatus.OK);
        }
        return new ResponseEntity(courseRepository.findAll(), HttpStatus.OK);


    }
}
