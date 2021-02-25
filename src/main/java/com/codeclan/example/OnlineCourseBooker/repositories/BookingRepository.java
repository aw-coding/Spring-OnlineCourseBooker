package com.codeclan.example.OnlineCourseBooker.repositories;

import com.codeclan.example.OnlineCourseBooker.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
