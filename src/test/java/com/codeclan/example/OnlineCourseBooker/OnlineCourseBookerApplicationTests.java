package com.codeclan.example.OnlineCourseBooker;

import com.codeclan.example.OnlineCourseBooker.models.Course;
import com.codeclan.example.OnlineCourseBooker.models.Customer;
import com.codeclan.example.OnlineCourseBooker.repositories.CourseRepository;
import com.codeclan.example.OnlineCourseBooker.repositories.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class OnlineCourseBookerApplicationTests {


	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	CourseRepository courseRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canGetCustomerByAge(){
		List<Customer> foundCustomers = customerRepository.findCustomerByAge(41);
		assertEquals("Alex", foundCustomers.get(0).getName());
	}


	@Test
	public void canGetAllCourses(){
		List<Course> foundCourses = courseRepository.findAll();
		assertEquals(4, foundCourses.size());
	}

//	@Test
//	public void canGetCoursesByRating(){
//		List<Course> foundCourses = courseRepository.getByRating(3.50);
//		assertEquals("Beauty 101", foundCourses.get(0).getName());
//
//
//
//	}
//
//	@Test
//	public void canGetCoursesByTown(){
//		List<Course> foundCourses = courseRepository.getByTown("Newington");
//		assertEquals("Health 101", foundCourses.get(0).getName());
//	}

}
