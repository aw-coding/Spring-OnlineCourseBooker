package com.codeclan.example.OnlineCourseBooker.repositories;

import com.codeclan.example.OnlineCourseBooker.models.Course;
import com.codeclan.example.OnlineCourseBooker.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {
//    Get all courses with a given rating



    List<Course> findCoursesByRating(Double rating);

    List<Course> findCoursesByTown(String town);


    List<Course> findCoursesByName(String name);





//    Get all courses for a given customer

    //List<Course> getCourseByCustomer(Customer customer);



}
