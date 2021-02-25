package com.codeclan.example.OnlineCourseBooker.repositories;

import com.codeclan.example.OnlineCourseBooker.models.Booking;
import com.codeclan.example.OnlineCourseBooker.models.Course;
import com.codeclan.example.OnlineCourseBooker.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long> {

    List<Booking> findBookingsByDate(String date);

    List<Booking> findBookingsByCustomer(Customer customer);

    List<Booking> findBookingsByCourse(Course course);


//    Get all bookings for a given date
}
