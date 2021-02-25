package com.codeclan.example.OnlineCourseBooker.controllers;


import com.codeclan.example.OnlineCourseBooker.repositories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookingController {

    @Autowired
    BookingRepository bookingRepository;

//    GET /resources
//    GET /resources/{id}
//    GET /resources?property=value
//    POST /resources
//    PUT /resources/{id}
//    DELETE /resources/{id}


}
