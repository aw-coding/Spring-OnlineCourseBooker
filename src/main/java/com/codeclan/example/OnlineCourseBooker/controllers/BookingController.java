package com.codeclan.example.OnlineCourseBooker.controllers;


import com.codeclan.example.OnlineCourseBooker.models.Booking;
import com.codeclan.example.OnlineCourseBooker.models.Course;
import com.codeclan.example.OnlineCourseBooker.models.Customer;
import com.codeclan.example.OnlineCourseBooker.repositories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookingController {

    @Autowired
    BookingRepository bookingRepository;

    @GetMapping(value="/bookings")
    public ResponseEntity<List<Booking>> getAllBookingsAndFilters(

    @RequestParam(required = false, name = "date") String date,
    @RequestParam(required = false, name = "customer") Customer customer,
    @RequestParam(required = false, name = "course") Course course

    ) {

        if (date != null) {
            return new ResponseEntity(bookingRepository.findBookingsByDate(date), HttpStatus.OK);
        }


        if (customer != null) {
            return new ResponseEntity(bookingRepository.findBookingsByCustomer(customer), HttpStatus.OK);
        }

        if (course != null){
            return new ResponseEntity(bookingRepository.findBookingsByCourse(course), HttpStatus.OK);
        }

        return new ResponseEntity(bookingRepository.findAll(), HttpStatus.OK);


    }

//    GET /resources
//    GET /resources/{id}
//    GET /resources?property=value
//    POST /resources
//    PUT /resources/{id}
//    DELETE /resources/{id}


}
