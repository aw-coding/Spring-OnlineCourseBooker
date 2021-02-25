package com.codeclan.example.OnlineCourseBooker.repositories;

import com.codeclan.example.OnlineCourseBooker.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
