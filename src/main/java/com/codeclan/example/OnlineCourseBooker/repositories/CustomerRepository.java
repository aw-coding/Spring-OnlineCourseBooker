package com.codeclan.example.OnlineCourseBooker.repositories;

import com.codeclan.example.OnlineCourseBooker.models.Course;
import com.codeclan.example.OnlineCourseBooker.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    public List<Customer> findCustomerByTown(String town);

    public List<Customer> findCustomerByAge(Integer age);

    public List<Customer> findCustomerByName(String name);

    //public List<Customer> findAllCustomersByCourse(Course course);



//    Get all customers for a given course

}
